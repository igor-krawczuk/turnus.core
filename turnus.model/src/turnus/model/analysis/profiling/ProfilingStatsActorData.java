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
package turnus.model.analysis.profiling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats Actor Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActorName <em>Actor Name</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActionsWeight <em>Actions Weight</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getSchedulerWeight <em>Scheduler Weight</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActionsWeightPercent <em>Actions Weight Percent</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getSchedulerWeightPercent <em>Scheduler Weight Percent</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData()
 * @model
 * @generated
 */
public interface ProfilingStatsActorData extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Name</em>' attribute.
	 * @see #setActorName(String)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData_ActorName()
	 * @model
	 * @generated
	 */
	String getActorName();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActorName <em>Actor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Name</em>' attribute.
	 * @see #getActorName()
	 * @generated
	 */
	void setActorName(String value);

	/**
	 * Returns the value of the '<em><b>Actions Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Weight</em>' attribute.
	 * @see #setActionsWeight(double)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData_ActionsWeight()
	 * @model
	 * @generated
	 */
	double getActionsWeight();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActionsWeight <em>Actions Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Weight</em>' attribute.
	 * @see #getActionsWeight()
	 * @generated
	 */
	void setActionsWeight(double value);

	/**
	 * Returns the value of the '<em><b>Scheduler Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Weight</em>' attribute.
	 * @see #setSchedulerWeight(double)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData_SchedulerWeight()
	 * @model
	 * @generated
	 */
	double getSchedulerWeight();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getSchedulerWeight <em>Scheduler Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Weight</em>' attribute.
	 * @see #getSchedulerWeight()
	 * @generated
	 */
	void setSchedulerWeight(double value);

	/**
	 * Returns the value of the '<em><b>Actions Weight Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Weight Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Weight Percent</em>' attribute.
	 * @see #setActionsWeightPercent(double)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData_ActionsWeightPercent()
	 * @model
	 * @generated
	 */
	double getActionsWeightPercent();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getActionsWeightPercent <em>Actions Weight Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Weight Percent</em>' attribute.
	 * @see #getActionsWeightPercent()
	 * @generated
	 */
	void setActionsWeightPercent(double value);

	/**
	 * Returns the value of the '<em><b>Scheduler Weight Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Weight Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Weight Percent</em>' attribute.
	 * @see #setSchedulerWeightPercent(double)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getProfilingStatsActorData_SchedulerWeightPercent()
	 * @model
	 * @generated
	 */
	double getSchedulerWeightPercent();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.ProfilingStatsActorData#getSchedulerWeightPercent <em>Scheduler Weight Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Weight Percent</em>' attribute.
	 * @see #getSchedulerWeightPercent()
	 * @generated
	 */
	void setSchedulerWeightPercent(double value);

} // ProfilingStatsActorData
