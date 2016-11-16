/* 
 * TURNUS - www.turnus.co
 * 
 * Copyright (C) 2010-2016 EPFL SCI STI MM
 *
 * This file is part of TURNUS.
 *
 * TURNUS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TURNUS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TURNUS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining it
 * with Eclipse (or a modified version of Eclipse or an Eclipse plugin or 
 * an Eclipse library), containing parts covered by the terms of the 
 * Eclipse Public License (EPL), the licensors of this Program grant you 
 * additional permission to convey the resulting work.  Corresponding Source 
 * for a non-source form of such a combination shall include the source code 
 * for the parts of Eclipse libraries used as well as that of the  covered work.
 * 
 */
package turnus.analysis.trace.compressor;

import static turnus.common.TurnusOptions.OUTPUT_DIRECTORY;
import static turnus.common.TurnusOptions.TRACE_FILE;
import static turnus.common.util.FileUtils.createDirectory;
import static turnus.common.util.FileUtils.createFileWithTimeStamp;
import static turnus.common.util.FileUtils.createOutputDirectory;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import turnus.common.TurnusException;
import turnus.common.TurnusExtensions;
import turnus.common.configuration.Configuration;
import turnus.common.configuration.Configuration.CliParser;
import turnus.common.io.Logger;
import turnus.common.util.EcoreUtils;
import turnus.model.ModelsRegister;
import turnus.model.analysis.trace.CompressedTraceReport;
import turnus.model.trace.TraceProject;

/**
 * 
 * @author Simone Casale-Brunet
 *
 */
public class CompressedTraceAnalysisCli implements IApplication {

	private Configuration configuration;
	private IProgressMonitor monitor = new NullProgressMonitor();
	private CompressedTraceAnalysis analysis;

	@Override
	public Object start(IApplicationContext context) throws Exception {
		try {
			parse((String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS));
		} catch (TurnusException e) {
			Logger.error("Command line argument parsing error: see the help");
			return IApplication.EXIT_RELAUNCH;
		}

		try {
			run();
		} catch (Exception e) {
			Logger.error("Application error: %s", e.getMessage());
			return IApplication.EXIT_RELAUNCH;
		}

		return IApplication.EXIT_OK;
	}

	private void run() throws TurnusException {
		monitor.beginTask("Trace comrpession analysis", IProgressMonitor.UNKNOWN);

		TraceProject project = null;
		CompressedTraceReport report = null;
		
		{ // STEP 1 : parse the configuration
			monitor.subTask("Parsing the configuration");
			try {
				File traceFile = configuration.getValue(TRACE_FILE);
				project = TraceProject.open(traceFile);
			} catch (Exception e) {
				throw new TurnusException("The trace project cannot be loaded", e);
			}
		}

		{ // STEP 2 : Run the analysis
			monitor.subTask("Running the analysis");
			try {
				monitor.setTaskName("Running the analysis");
				analysis = new CompressedTraceAnalysis(project);
				analysis.setConfiguration(configuration);
				report = analysis.run();
				Logger.infoRaw(report.toString());
			} catch (Exception e) {
				throw new TurnusException("The analysis cannot be completed", e);
			}
		}

		{ // STEP 3 : Store the results
			monitor.subTask("Storing the results");
			try {
				File outputPath = null;
				if (configuration.hasValue(OUTPUT_DIRECTORY)) {
					outputPath = configuration.getValue(OUTPUT_DIRECTORY);
					createDirectory(outputPath);
				} else {
					outputPath = createOutputDirectory("trace", configuration);
				}

				File reportFile = createFileWithTimeStamp(outputPath, TurnusExtensions.TRACE_COMPRESS_ANALYSIS);
				EcoreUtils.storeEObject(report, project.getResourceSet(), reportFile);
				Logger.info("Trace compression analysis report stored in \"%s\"", reportFile);

			} catch (Exception e) {
				Logger.error("The report file cannot be stored");
				String message = e.getLocalizedMessage();
				if (message != null) {
					Logger.error(" cause: %s", message);
				}
			}
		}

		monitor.done();

	}

	@Override
	public void stop() {
		if (analysis != null) {
			analysis.cancel();
		}
	}

	public void start(Configuration configuration, IProgressMonitor monitor) throws TurnusException {
		this.configuration = configuration;
		this.monitor = monitor;
		run();
	}

	public static void main(String[] args) {
		ModelsRegister.init();

		CompressedTraceAnalysisCli cliApp = null;

		try {
			cliApp = new CompressedTraceAnalysisCli();
			cliApp.parse(args);
		} catch (TurnusException e) {
			return;
		}

		try {
			cliApp.run();
		} catch (Exception e) {
			Logger.error("Application error: %s", e.getMessage());
		}
	}

	private void parse(String[] args) throws TurnusException {
		CliParser cliParser = new CliParser()//
				.setOption(TRACE_FILE, true);

		configuration = cliParser.parse(args);
	}

}
