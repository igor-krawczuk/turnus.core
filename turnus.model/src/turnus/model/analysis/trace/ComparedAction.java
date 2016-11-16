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
package turnus.model.analysis.trace;

import org.eclipse.emf.ecore.EObject;

import turnus.model.dataflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compared Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.trace.ComparedAction#getAction <em>Action</em>}</li>
 *   <li>{@link turnus.model.analysis.trace.ComparedAction#isFound <em>Found</em>}</li>
 *   <li>{@link turnus.model.analysis.trace.ComparedAction#getDSteps <em>DSteps</em>}</li>
 *   <li>{@link turnus.model.analysis.trace.ComparedAction#getDIncomings <em>DIncomings</em>}</li>
 *   <li>{@link turnus.model.analysis.trace.ComparedAction#getDOutgoings <em>DOutgoings</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.trace.TracePackage#getComparedAction()
 * @model
 * @generated
 */
public interface ComparedAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see turnus.model.analysis.trace.TracePackage#getComparedAction_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.trace.ComparedAction#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Found</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found</em>' attribute.
	 * @see #setFound(boolean)
	 * @see turnus.model.analysis.trace.TracePackage#getComparedAction_Found()
	 * @model
	 * @generated
	 */
	boolean isFound();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.trace.ComparedAction#isFound <em>Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Found</em>' attribute.
	 * @see #isFound()
	 * @generated
	 */
	void setFound(boolean value);

	/**
	 * Returns the value of the '<em><b>DSteps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSteps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSteps</em>' attribute.
	 * @see #setDSteps(long)
	 * @see turnus.model.analysis.trace.TracePackage#getComparedAction_DSteps()
	 * @model
	 * @generated
	 */
	long getDSteps();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.trace.ComparedAction#getDSteps <em>DSteps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSteps</em>' attribute.
	 * @see #getDSteps()
	 * @generated
	 */
	void setDSteps(long value);

	/**
	 * Returns the value of the '<em><b>DIncomings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIncomings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIncomings</em>' attribute.
	 * @see #setDIncomings(long)
	 * @see turnus.model.analysis.trace.TracePackage#getComparedAction_DIncomings()
	 * @model
	 * @generated
	 */
	long getDIncomings();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.trace.ComparedAction#getDIncomings <em>DIncomings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIncomings</em>' attribute.
	 * @see #getDIncomings()
	 * @generated
	 */
	void setDIncomings(long value);

	/**
	 * Returns the value of the '<em><b>DOutgoings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DOutgoings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DOutgoings</em>' attribute.
	 * @see #setDOutgoings(long)
	 * @see turnus.model.analysis.trace.TracePackage#getComparedAction_DOutgoings()
	 * @model
	 * @generated
	 */
	long getDOutgoings();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.trace.ComparedAction#getDOutgoings <em>DOutgoings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DOutgoings</em>' attribute.
	 * @see #getDOutgoings()
	 * @generated
	 */
	void setDOutgoings(long value);

} // ComparedAction
