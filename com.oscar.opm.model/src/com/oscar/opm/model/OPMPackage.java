/**
 */
package com.oscar.opm.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.oscar.opm.model.OPMFactory
 * @model kind="package"
 * @generated
 */
public interface OPMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.rubis.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OPMPackage eINSTANCE = com.oscar.opm.model.impl.OPMPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl <em>Object Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMObjectProcessDiagram()
	 * @generated
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMNodeImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMNode()
	 * @generated
	 */
	int OPM_NODE = 7;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__OPD = 1;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__INCOMING_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__OUTGOING_LINKS = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS = 0;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMThingImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMThing()
	 * @generated
	 */
	int OPM_THING = 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__CONSTRAINTS = OPM_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__OPD = OPM_NODE__OPD;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__INCOMING_LINKS = OPM_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__OUTGOING_LINKS = OPM_NODE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__NAME = OPM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_FEATURE_COUNT = OPM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS = OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING___GET_INCOMING_STRUCTURAL_LINKS = OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_OPERATION_COUNT = OPM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMObjectImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMObject()
	 * @generated
	 */
	int OPM_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__CONSTRAINTS = OPM_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__OPD = OPM_THING__OPD;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__NAME = OPM_THING__NAME;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT___GET_OUTGOING_STRUCTURAL_LINKS = OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT___GET_INCOMING_STRUCTURAL_LINKS = OPM_THING___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMProcessImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProcess()
	 * @generated
	 */
	int OPM_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__CONSTRAINTS = OPM_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__OPD = OPM_THING__OPD;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__NAME = OPM_THING__NAME;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS___GET_OUTGOING_STRUCTURAL_LINKS = OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS___GET_INCOMING_STRUCTURAL_LINKS = OPM_THING___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMLinkImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMLink()
	 * @generated
	 */
	int OPM_LINK = 3;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__OPD = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__BENDPOINTS = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMStructuralLinkAggregatorImpl <em>Structural Link Aggregator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMStructuralLinkAggregatorImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMStructuralLinkAggregator()
	 * @generated
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR__CONSTRAINTS = OPM_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR__OPD = OPM_NODE__OPD;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR__INCOMING_LINKS = OPM_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR__OUTGOING_LINKS = OPM_NODE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR__KIND = OPM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Link Aggregator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR_FEATURE_COUNT = OPM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR___GET_OUTGOING_STRUCTURAL_LINKS = OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR___GET_INCOMING_STRUCTURAL_LINKS = OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The number of operations of the '<em>Structural Link Aggregator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR_OPERATION_COUNT = OPM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.impl.OPMProceduralLinkImpl <em>Procedural Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.impl.OPMProceduralLinkImpl
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProceduralLink()
	 * @generated
	 */
	int OPM_PROCEDURAL_LINK = 6;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__OPD = OPM_LINK__OPD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__SOURCE = OPM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__TARGET = OPM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__BENDPOINTS = OPM_LINK__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__KIND = OPM_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK_FEATURE_COUNT = OPM_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK_OPERATION_COUNT = OPM_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.OPMStructuralLinkAggregatorKind <em>Structural Link Aggregator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.OPMStructuralLinkAggregatorKind
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMStructuralLinkAggregatorKind()
	 * @generated
	 */
	int OPM_STRUCTURAL_LINK_AGGREGATOR_KIND = 8;

	/**
	 * The meta object id for the '{@link com.oscar.opm.model.OPMProceduralLinkKind <em>Procedural Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.oscar.opm.model.OPMProceduralLinkKind
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProceduralLinkKind()
	 * @generated
	 */
	int OPM_PROCEDURAL_LINK_KIND = 9;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 10;


	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see com.oscar.opm.model.impl.OPMPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 11;


	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMObjectProcessDiagram <em>Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Process Diagram</em>'.
	 * @see com.oscar.opm.model.OPMObjectProcessDiagram
	 * @generated
	 */
	EClass getOPMObjectProcessDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.oscar.opm.model.OPMObjectProcessDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.oscar.opm.model.OPMObjectProcessDiagram#getNodes()
	 * @see #getOPMObjectProcessDiagram()
	 * @generated
	 */
	EReference getOPMObjectProcessDiagram_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.oscar.opm.model.OPMObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see com.oscar.opm.model.OPMObjectProcessDiagram#getLinks()
	 * @see #getOPMObjectProcessDiagram()
	 * @generated
	 */
	EReference getOPMObjectProcessDiagram_Links();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.oscar.opm.model.OPMObject
	 * @generated
	 */
	EClass getOPMObject();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see com.oscar.opm.model.OPMProcess
	 * @generated
	 */
	EClass getOPMProcess();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see com.oscar.opm.model.OPMLink
	 * @generated
	 */
	EClass getOPMLink();

	/**
	 * Returns the meta object for the container reference '{@link com.oscar.opm.model.OPMLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see com.oscar.opm.model.OPMLink#getOpd()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Opd();

	/**
	 * Returns the meta object for the reference '{@link com.oscar.opm.model.OPMLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.oscar.opm.model.OPMLink#getSource()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Source();

	/**
	 * Returns the meta object for the reference '{@link com.oscar.opm.model.OPMLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.oscar.opm.model.OPMLink#getTarget()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link com.oscar.opm.model.OPMLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see com.oscar.opm.model.OPMLink#getBendpoints()
	 * @see #getOPMLink()
	 * @generated
	 */
	EAttribute getOPMLink_Bendpoints();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see com.oscar.opm.model.OPMThing
	 * @generated
	 */
	EClass getOPMThing();

	/**
	 * Returns the meta object for the attribute '{@link com.oscar.opm.model.OPMThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.oscar.opm.model.OPMThing#getName()
	 * @see #getOPMThing()
	 * @generated
	 */
	EAttribute getOPMThing_Name();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMStructuralLinkAggregator <em>Structural Link Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Link Aggregator</em>'.
	 * @see com.oscar.opm.model.OPMStructuralLinkAggregator
	 * @generated
	 */
	EClass getOPMStructuralLinkAggregator();

	/**
	 * Returns the meta object for the attribute '{@link com.oscar.opm.model.OPMStructuralLinkAggregator#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.oscar.opm.model.OPMStructuralLinkAggregator#getKind()
	 * @see #getOPMStructuralLinkAggregator()
	 * @generated
	 */
	EAttribute getOPMStructuralLinkAggregator_Kind();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMProceduralLink <em>Procedural Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedural Link</em>'.
	 * @see com.oscar.opm.model.OPMProceduralLink
	 * @generated
	 */
	EClass getOPMProceduralLink();

	/**
	 * Returns the meta object for the attribute '{@link com.oscar.opm.model.OPMProceduralLink#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.oscar.opm.model.OPMProceduralLink#getKind()
	 * @see #getOPMProceduralLink()
	 * @generated
	 */
	EAttribute getOPMProceduralLink_Kind();

	/**
	 * Returns the meta object for class '{@link com.oscar.opm.model.OPMNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.oscar.opm.model.OPMNode
	 * @generated
	 */
	EClass getOPMNode();

	/**
	 * Returns the meta object for the attribute '{@link com.oscar.opm.model.OPMNode#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.oscar.opm.model.OPMNode#getConstraints()
	 * @see #getOPMNode()
	 * @generated
	 */
	EAttribute getOPMNode_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link com.oscar.opm.model.OPMNode#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see com.oscar.opm.model.OPMNode#getOpd()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_Opd();

	/**
	 * Returns the meta object for the reference list '{@link com.oscar.opm.model.OPMNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.oscar.opm.model.OPMNode#getIncomingLinks()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link com.oscar.opm.model.OPMNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see com.oscar.opm.model.OPMNode#getOutgoingLinks()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_OutgoingLinks();

	/**
	 * Returns the meta object for the '{@link com.oscar.opm.model.OPMNode#getOutgoingStructuralLinks() <em>Get Outgoing Structural Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Structural Links</em>' operation.
	 * @see com.oscar.opm.model.OPMNode#getOutgoingStructuralLinks()
	 * @generated
	 */
	EOperation getOPMNode__GetOutgoingStructuralLinks();

	/**
	 * Returns the meta object for the '{@link com.oscar.opm.model.OPMNode#getIncomingStructuralLinks() <em>Get Incoming Structural Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Structural Links</em>' operation.
	 * @see com.oscar.opm.model.OPMNode#getIncomingStructuralLinks()
	 * @generated
	 */
	EOperation getOPMNode__GetIncomingStructuralLinks();

	/**
	 * Returns the meta object for enum '{@link com.oscar.opm.model.OPMStructuralLinkAggregatorKind <em>Structural Link Aggregator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structural Link Aggregator Kind</em>'.
	 * @see com.oscar.opm.model.OPMStructuralLinkAggregatorKind
	 * @generated
	 */
	EEnum getOPMStructuralLinkAggregatorKind();

	/**
	 * Returns the meta object for enum '{@link com.oscar.opm.model.OPMProceduralLinkKind <em>Procedural Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedural Link Kind</em>'.
	 * @see com.oscar.opm.model.OPMProceduralLinkKind
	 * @generated
	 */
	EEnum getOPMProceduralLinkKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OPMFactory getOPMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl <em>Object Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMObjectProcessDiagramImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMObjectProcessDiagram()
		 * @generated
		 */
		EClass OPM_OBJECT_PROCESS_DIAGRAM = eINSTANCE.getOPMObjectProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_OBJECT_PROCESS_DIAGRAM__NODES = eINSTANCE.getOPMObjectProcessDiagram_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_OBJECT_PROCESS_DIAGRAM__LINKS = eINSTANCE.getOPMObjectProcessDiagram_Links();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMObjectImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMObject()
		 * @generated
		 */
		EClass OPM_OBJECT = eINSTANCE.getOPMObject();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMProcessImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProcess()
		 * @generated
		 */
		EClass OPM_PROCESS = eINSTANCE.getOPMProcess();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMLinkImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMLink()
		 * @generated
		 */
		EClass OPM_LINK = eINSTANCE.getOPMLink();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__OPD = eINSTANCE.getOPMLink_Opd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__SOURCE = eINSTANCE.getOPMLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__TARGET = eINSTANCE.getOPMLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_LINK__BENDPOINTS = eINSTANCE.getOPMLink_Bendpoints();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMThingImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMThing()
		 * @generated
		 */
		EClass OPM_THING = eINSTANCE.getOPMThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_THING__NAME = eINSTANCE.getOPMThing_Name();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMStructuralLinkAggregatorImpl <em>Structural Link Aggregator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMStructuralLinkAggregatorImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMStructuralLinkAggregator()
		 * @generated
		 */
		EClass OPM_STRUCTURAL_LINK_AGGREGATOR = eINSTANCE.getOPMStructuralLinkAggregator();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_STRUCTURAL_LINK_AGGREGATOR__KIND = eINSTANCE.getOPMStructuralLinkAggregator_Kind();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMProceduralLinkImpl <em>Procedural Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMProceduralLinkImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProceduralLink()
		 * @generated
		 */
		EClass OPM_PROCEDURAL_LINK = eINSTANCE.getOPMProceduralLink();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_PROCEDURAL_LINK__KIND = eINSTANCE.getOPMProceduralLink_Kind();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.impl.OPMNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.impl.OPMNodeImpl
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMNode()
		 * @generated
		 */
		EClass OPM_NODE = eINSTANCE.getOPMNode();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_NODE__CONSTRAINTS = eINSTANCE.getOPMNode_Constraints();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__OPD = eINSTANCE.getOPMNode_Opd();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__INCOMING_LINKS = eINSTANCE.getOPMNode_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__OUTGOING_LINKS = eINSTANCE.getOPMNode_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Structural Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS = eINSTANCE.getOPMNode__GetOutgoingStructuralLinks();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Structural Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS = eINSTANCE.getOPMNode__GetIncomingStructuralLinks();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.OPMStructuralLinkAggregatorKind <em>Structural Link Aggregator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.OPMStructuralLinkAggregatorKind
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMStructuralLinkAggregatorKind()
		 * @generated
		 */
		EEnum OPM_STRUCTURAL_LINK_AGGREGATOR_KIND = eINSTANCE.getOPMStructuralLinkAggregatorKind();

		/**
		 * The meta object literal for the '{@link com.oscar.opm.model.OPMProceduralLinkKind <em>Procedural Link Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.oscar.opm.model.OPMProceduralLinkKind
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getOPMProceduralLinkKind()
		 * @generated
		 */
		EEnum OPM_PROCEDURAL_LINK_KIND = eINSTANCE.getOPMProceduralLinkKind();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see com.oscar.opm.model.impl.OPMPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

	}

} //OPMPackage
