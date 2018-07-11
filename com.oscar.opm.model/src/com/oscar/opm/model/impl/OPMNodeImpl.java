/**
 */
package com.oscar.opm.model.impl;

import com.oscar.opm.model.OPMFactory;
import com.oscar.opm.model.OPMLink;
import com.oscar.opm.model.OPMNode;
import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMPackage;
import com.oscar.opm.model.OPMStructuralLinkAggregator;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPMNodeImpl extends EObjectImpl implements OPMNode {
	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = (Rectangle)OPMFactory.eINSTANCE.createFromString(OPMPackage.eINSTANCE.getRectangle(), "");

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> outgoingLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_NODE__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram getOpd() {
		if (eContainerFeatureID() != OPMPackage.OPM_NODE__OPD) return null;
		return (OPMObjectProcessDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpd(OPMObjectProcessDiagram newOpd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOpd, OPMPackage.OPM_NODE__OPD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpd(OPMObjectProcessDiagram newOpd) {
		if (newOpd != eInternalContainer() || (eContainerFeatureID() != OPMPackage.OPM_NODE__OPD && newOpd != null)) {
			if (EcoreUtil.isAncestor(this, newOpd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOpd != null)
				msgs = ((InternalEObject)newOpd).eInverseAdd(this, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES, OPMObjectProcessDiagram.class, msgs);
			msgs = basicSetOpd(newOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_NODE__OPD, newOpd, newOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_NODE__INCOMING_LINKS, OPMPackage.OPM_LINK__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_NODE__OUTGOING_LINKS, OPMPackage.OPM_LINK__SOURCE);
		}
		return outgoingLinks;
	}

	/**
     * <!-- begin-user-doc -->
     * Return a list of outgoing links that start at this node and end
     * in a {@link OPMStructuralLinkAggregator}.
     * The current implementation calculates this list by calling 
     * {@link OPMNodeImpl#getOutgoingLinks()} and filtering the result.
     * <!-- end-user-doc -->
     * @generated NOT
     */
	public EList<OPMLink> getOutgoingStructuralLinks() {
		EList<OPMLink> outgoingStructuralLinks = new BasicEList<OPMLink>();
		for(OPMLink link : getOutgoingLinks()) {
			if(link.getTarget() instanceof OPMStructuralLinkAggregator) {
				outgoingStructuralLinks.add(link);
			}
		}
		return outgoingStructuralLinks;
	}

	/**
     * <!-- begin-user-doc -->
     * Return a list of incoming links that start at a {@link OPMStructuralLinkAggregator} 
     * and end at this node.
     * The current implementation calculates this list by calling 
     * {@link OPMNodeImpl#getIncomingLinks()} and filtering the results.
     * <!-- end-user-doc -->
     * @generated NOT
     */
	public EList<OPMLink> getIncomingStructuralLinks() {
		EList<OPMLink> incomingStructuralLinks = new BasicEList<OPMLink>();
		for(OPMLink link : getIncomingLinks()) {
			if(link.getSource() instanceof OPMStructuralLinkAggregator) {
				incomingStructuralLinks.add(link);
			}
		}
		return incomingStructuralLinks;
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
			case OPMPackage.OPM_NODE__OPD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOpd((OPMObjectProcessDiagram)otherEnd, msgs);
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
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
			case OPMPackage.OPM_NODE__OPD:
				return basicSetOpd(null, msgs);
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OPMPackage.OPM_NODE__OPD:
				return eInternalContainer().eInverseRemove(this, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NODES, OPMObjectProcessDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				return getConstraints();
			case OPMPackage.OPM_NODE__OPD:
				return getOpd();
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return getIncomingLinks();
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return getOutgoingLinks();
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
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case OPMPackage.OPM_NODE__OPD:
				setOpd((OPMObjectProcessDiagram)newValue);
				return;
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends OPMLink>)newValue);
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
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case OPMPackage.OPM_NODE__OPD:
				setOpd((OPMObjectProcessDiagram)null);
				return;
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
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
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case OPMPackage.OPM_NODE__OPD:
				return getOpd() != null;
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OPMPackage.OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS:
				return getOutgoingStructuralLinks();
			case OPMPackage.OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS:
				return getIncomingStructuralLinks();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //OPMNodeImpl
