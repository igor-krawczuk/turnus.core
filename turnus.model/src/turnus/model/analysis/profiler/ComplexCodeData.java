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
package turnus.model.analysis.profiler;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Code Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.profiler.ComplexCodeData#getActionsData <em>Actions Data</em>}</li>
 *   <li>{@link turnus.model.analysis.profiler.ComplexCodeData#getProceduresData <em>Procedures Data</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.profiler.ProfilerPackage#getComplexCodeData()
 * @model
 * @generated
 */
public interface ComplexCodeData extends CodeData {
	/**
	 * Returns the value of the '<em><b>Actions Data</b></em>' containment reference list.
	 * The list contents are of type {@link turnus.model.analysis.profiler.CodeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Data</em>' containment reference list.
	 * @see turnus.model.analysis.profiler.ProfilerPackage#getComplexCodeData_ActionsData()
	 * @model containment="true"
	 * @generated
	 */
	List<CodeData> getActionsData();

	/**
	 * Returns the value of the '<em><b>Procedures Data</b></em>' reference list.
	 * The list contents are of type {@link turnus.model.analysis.profiler.CodeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures Data</em>' reference list.
	 * @see turnus.model.analysis.profiler.ProfilerPackage#getComplexCodeData_ProceduresData()
	 * @model
	 * @generated
	 */
	List<CodeData> getProceduresData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CodeData getActionData(String action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CodeData getProcedureData(String procedure);

} // ComplexCodeData
