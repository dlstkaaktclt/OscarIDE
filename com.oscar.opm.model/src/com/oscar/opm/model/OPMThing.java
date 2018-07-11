/**
 */
package com.oscar.opm.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.oscar.opm.model.OPMThing#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.oscar.opm.model.OPMPackage#getOPMThing()
 * @model
 * @generated
 */
public interface OPMThing extends OPMNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.oscar.opm.model.OPMPackage#getOPMThing_Name()
	 * @model default="&lt;...&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.oscar.opm.model.OPMThing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OPMThing
