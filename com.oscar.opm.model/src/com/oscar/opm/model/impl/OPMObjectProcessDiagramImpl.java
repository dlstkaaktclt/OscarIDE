/**
 */
package com.oscar.opm.model.impl;

import com.oscar.opm.model.OPMLink;
import com.oscar.opm.model.OPMNode;
import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPMObjectProcessDiagramImpl extends EObjectImpl implements OPMObjectProcessDiagram {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMNode> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMObjectProcessDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_OBJECT_PROCESS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<OPMNode>(OPMNode.class, this, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES, OPMPackage.OPM_NODE__OPD);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS, OPMPackage.OPM_LINK__OPD);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				return getNodes();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends OPMNode>)newValue);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OPMObjectProcessDiagramImpl
