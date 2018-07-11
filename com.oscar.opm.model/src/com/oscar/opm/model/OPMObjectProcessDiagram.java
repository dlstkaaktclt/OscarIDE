/**
 */
package com.oscar.opm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.oscar.opm.model.OPMObjectProcessDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.oscar.opm.model.OPMObjectProcessDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see com.oscar.opm.model.OPMPackage#getOPMObjectProcessDiagram()
 * @model
 * @generated
 */
public interface OPMObjectProcessDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.oscar.opm.model.OPMNode}.
	 * It is bidirectional and its opposite is '{@link com.oscar.opm.model.OPMNode#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see com.oscar.opm.model.OPMPackage#getOPMObjectProcessDiagram_Nodes()
	 * @see com.oscar.opm.model.OPMNode#getOpd
	 * @model opposite="opd" containment="true"
	 * @generated
	 */
	EList<OPMNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.oscar.opm.model.OPMLink}.
	 * It is bidirectional and its opposite is '{@link com.oscar.opm.model.OPMLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see com.oscar.opm.model.OPMPackage#getOPMObjectProcessDiagram_Links()
	 * @see com.oscar.opm.model.OPMLink#getOpd
	 * @model opposite="opd" containment="true"
	 * @generated
	 */
	EList<OPMLink> getLinks();

} // OPMObjectProcessDiagram
