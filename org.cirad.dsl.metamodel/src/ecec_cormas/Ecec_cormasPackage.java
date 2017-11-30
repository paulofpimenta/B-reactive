/**
 */
package ecec_cormas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ecec_cormas.Ecec_cormasFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Ecec_cormasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecec_cormas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cirad.org/dsl/ecec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecec_cormas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecec_cormasPackage eINSTANCE = ecec_cormas.impl.Ecec_cormasPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.DiagramElementImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.SpaceImpl <em>Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.SpaceImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getSpace()
	 * @generated
	 */
	int SPACE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__PATH = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ClassImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROTOCOLS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.MethodImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__USE_ATTRIBUTES = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.AttributeImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INSTANCE_TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notify Observers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NOTIFY_OBSERVERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Setter Acessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SETTER_ACESSOR = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Getter Acessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GETTER_ACESSOR = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ProtocolImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__METHODS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.EnvirommentImpl <em>Enviromment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.EnvirommentImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getEnviromment()
	 * @generated
	 */
	int ENVIROMMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMMENT__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMMENT__PATH = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load Enviroment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMMENT__LOAD_ENVIROMENT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enviromment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Enviromment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMMENT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ModelImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ModelParametersImpl <em>Model Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ModelParametersImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getModelParameters()
	 * @generated
	 */
	int MODEL_PARAMETERS = 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS__MODEL_NAME = 1;

	/**
	 * The number of structural features of the '<em>Model Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.VegetationUnitImpl <em>Vegetation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.VegetationUnitImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getVegetationUnit()
	 * @generated
	 */
	int VEGETATION_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__PROTOCOLS = CLASS__PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__TYPE = CLASS__TYPE;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__K = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__R = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Biomass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT__BIOMASS = CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vegetation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT_FEATURE_COUNT = CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vegetation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEGETATION_UNIT_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ForagerImpl <em>Forager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ForagerImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getForager()
	 * @generated
	 */
	int FORAGER = 10;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__PROTOCOLS = CLASS__PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__TYPE = CLASS__TYPE;

	/**
	 * The feature id for the '<em><b>Catabolic Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__CATABOLIC_RATE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fertility Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__FERTILITY_THRESHOLD = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Haverst Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__HAVERST_RATE = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER__ENERGY = CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Forager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER_FEATURE_COUNT = CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Forager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORAGER_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.LogisticGrowthImpl <em>Logistic Growth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.LogisticGrowthImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getLogisticGrowth()
	 * @generated
	 */
	int LOGISTIC_GROWTH = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_GROWTH__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Use Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_GROWTH__USE_ATTRIBUTES = METHOD__USE_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Logistic Growth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_GROWTH_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logistic Growth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_GROWTH_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.InitImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 12;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__METHODS = PROTOCOL__METHODS;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_OPERATION_COUNT = PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ControlImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 13;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__METHODS = PROTOCOL__METHODS;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.CustomProtocolImpl <em>Custom Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.CustomProtocolImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getCustomProtocol()
	 * @generated
	 */
	int CUSTOM_PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROTOCOL__METHODS = PROTOCOL__METHODS;

	/**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROTOCOL__PROTOCOL_NAME = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROTOCOL_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROTOCOL_OPERATION_COUNT = PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.PoVImpl <em>Po V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.PoVImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getPoV()
	 * @generated
	 */
	int PO_V = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_V__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_V__POV = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Po V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_V_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Po V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_V_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ProbeImpl <em>Probe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ProbeImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProbe()
	 * @generated
	 */
	int PROBE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__CLASSES = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__ATTRIBUTES = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.SchedulerImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 17;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__ATTRIBUTES = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__INIT_MODEL = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.RelationImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TO = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FROM = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.impl.ProbeInitImpl <em>Probe Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.impl.ProbeInitImpl
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProbeInit()
	 * @generated
	 */
	int PROBE_INIT = 19;

	/**
	 * The feature id for the '<em><b>Probe Init Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_INIT__PROBE_INIT_SCHEDULER = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probe Init Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_INIT__PROBE_INIT_ATT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_INIT__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Probe Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_INIT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Probe Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_INIT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecec_cormas.CormasClassType <em>Cormas Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.CormasClassType
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getCormasClassType()
	 * @generated
	 */
	int CORMAS_CLASS_TYPE = 20;

	/**
	 * The meta object id for the '{@link ecec_cormas.BooleanType <em>Boolean Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecec_cormas.BooleanType
	 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link ecec_cormas.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see ecec_cormas.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space</em>'.
	 * @see ecec_cormas.Space
	 * @generated
	 */
	EClass getSpace();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Space#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ecec_cormas.Space#getPath()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Path();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Space#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Space#getName()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Name();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ecec_cormas.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Class#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see ecec_cormas.Class#getProtocols()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ecec_cormas.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Class#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ecec_cormas.Class#getType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Type();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ecec_cormas.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the reference list '{@link ecec_cormas.Method#getUseAttributes <em>Use Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Attributes</em>'.
	 * @see ecec_cormas.Method#getUseAttributes()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_UseAttributes();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ecec_cormas.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecec_cormas.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see ecec_cormas.Attribute#getInstanceType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getNotifyObservers <em>Notify Observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notify Observers</em>'.
	 * @see ecec_cormas.Attribute#getNotifyObservers()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_NotifyObservers();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getSetterAcessor <em>Setter Acessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter Acessor</em>'.
	 * @see ecec_cormas.Attribute#getSetterAcessor()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_SetterAcessor();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Attribute#getGetterAcessor <em>Getter Acessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Acessor</em>'.
	 * @see ecec_cormas.Attribute#getGetterAcessor()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_GetterAcessor();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see ecec_cormas.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Protocol#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see ecec_cormas.Protocol#getMethods()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Methods();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Enviromment <em>Enviromment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enviromment</em>'.
	 * @see ecec_cormas.Enviromment
	 * @generated
	 */
	EClass getEnviromment();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Enviromment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Enviromment#getName()
	 * @see #getEnviromment()
	 * @generated
	 */
	EAttribute getEnviromment_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Enviromment#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ecec_cormas.Enviromment#getPath()
	 * @see #getEnviromment()
	 * @generated
	 */
	EAttribute getEnviromment_Path();

	/**
	 * Returns the meta object for the reference list '{@link ecec_cormas.Enviromment#getLoadEnviroment <em>Load Enviroment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Enviroment</em>'.
	 * @see ecec_cormas.Enviromment#getLoadEnviroment()
	 * @see #getEnviromment()
	 * @generated
	 */
	EReference getEnviromment_LoadEnviroment();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ecec_cormas.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ecec_cormas.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link ecec_cormas.Model#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see ecec_cormas.Model#getParameters()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Model#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see ecec_cormas.Model#getRelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relations();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.ModelParameters <em>Model Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Parameters</em>'.
	 * @see ecec_cormas.ModelParameters
	 * @generated
	 */
	EClass getModelParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.ModelParameters#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see ecec_cormas.ModelParameters#getAuthor()
	 * @see #getModelParameters()
	 * @generated
	 */
	EAttribute getModelParameters_Author();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.ModelParameters#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see ecec_cormas.ModelParameters#getModelName()
	 * @see #getModelParameters()
	 * @generated
	 */
	EAttribute getModelParameters_ModelName();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.VegetationUnit <em>Vegetation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vegetation Unit</em>'.
	 * @see ecec_cormas.VegetationUnit
	 * @generated
	 */
	EClass getVegetationUnit();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.VegetationUnit#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see ecec_cormas.VegetationUnit#getK()
	 * @see #getVegetationUnit()
	 * @generated
	 */
	EAttribute getVegetationUnit_K();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.VegetationUnit#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see ecec_cormas.VegetationUnit#getR()
	 * @see #getVegetationUnit()
	 * @generated
	 */
	EAttribute getVegetationUnit_R();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.VegetationUnit#getBiomass <em>Biomass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biomass</em>'.
	 * @see ecec_cormas.VegetationUnit#getBiomass()
	 * @see #getVegetationUnit()
	 * @generated
	 */
	EAttribute getVegetationUnit_Biomass();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Forager <em>Forager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forager</em>'.
	 * @see ecec_cormas.Forager
	 * @generated
	 */
	EClass getForager();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Forager#getCatabolicRate <em>Catabolic Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catabolic Rate</em>'.
	 * @see ecec_cormas.Forager#getCatabolicRate()
	 * @see #getForager()
	 * @generated
	 */
	EAttribute getForager_CatabolicRate();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Forager#getFertilityThreshold <em>Fertility Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fertility Threshold</em>'.
	 * @see ecec_cormas.Forager#getFertilityThreshold()
	 * @see #getForager()
	 * @generated
	 */
	EAttribute getForager_FertilityThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Forager#getHaverstRate <em>Haverst Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Haverst Rate</em>'.
	 * @see ecec_cormas.Forager#getHaverstRate()
	 * @see #getForager()
	 * @generated
	 */
	EAttribute getForager_HaverstRate();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Forager#getEnergy <em>Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy</em>'.
	 * @see ecec_cormas.Forager#getEnergy()
	 * @see #getForager()
	 * @generated
	 */
	EAttribute getForager_Energy();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.LogisticGrowth <em>Logistic Growth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Growth</em>'.
	 * @see ecec_cormas.LogisticGrowth
	 * @generated
	 */
	EClass getLogisticGrowth();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see ecec_cormas.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see ecec_cormas.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.CustomProtocol <em>Custom Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Protocol</em>'.
	 * @see ecec_cormas.CustomProtocol
	 * @generated
	 */
	EClass getCustomProtocol();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.CustomProtocol#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see ecec_cormas.CustomProtocol#getProtocolName()
	 * @see #getCustomProtocol()
	 * @generated
	 */
	EAttribute getCustomProtocol_ProtocolName();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.PoV <em>Po V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po V</em>'.
	 * @see ecec_cormas.PoV
	 * @generated
	 */
	EClass getPoV();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.PoV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.PoV#getName()
	 * @see #getPoV()
	 * @generated
	 */
	EAttribute getPoV_Name();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.PoV#getPov <em>Pov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pov</em>'.
	 * @see ecec_cormas.PoV#getPov()
	 * @see #getPoV()
	 * @generated
	 */
	EReference getPoV_Pov();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe</em>'.
	 * @see ecec_cormas.Probe
	 * @generated
	 */
	EClass getProbe();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Probe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Probe#getName()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_Name();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.Probe#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes</em>'.
	 * @see ecec_cormas.Probe#getClasses()
	 * @see #getProbe()
	 * @generated
	 */
	EReference getProbe_Classes();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.Probe#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see ecec_cormas.Probe#getAttributes()
	 * @see #getProbe()
	 * @generated
	 */
	EReference getProbe_Attributes();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see ecec_cormas.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link ecec_cormas.Scheduler#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ecec_cormas.Scheduler#getAttributes()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Attributes();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.Scheduler#getInitModel <em>Init Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Model</em>'.
	 * @see ecec_cormas.Scheduler#getInitModel()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_InitModel();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see ecec_cormas.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the reference list '{@link ecec_cormas.Relation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see ecec_cormas.Relation#getTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_To();

	/**
	 * Returns the meta object for the reference list '{@link ecec_cormas.Relation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see ecec_cormas.Relation#getFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_From();

	/**
	 * Returns the meta object for class '{@link ecec_cormas.ProbeInit <em>Probe Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe Init</em>'.
	 * @see ecec_cormas.ProbeInit
	 * @generated
	 */
	EClass getProbeInit();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.ProbeInit#getProbeInitScheduler <em>Probe Init Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Probe Init Scheduler</em>'.
	 * @see ecec_cormas.ProbeInit#getProbeInitScheduler()
	 * @see #getProbeInit()
	 * @generated
	 */
	EReference getProbeInit_ProbeInitScheduler();

	/**
	 * Returns the meta object for the reference '{@link ecec_cormas.ProbeInit#getProbeInitAtt <em>Probe Init Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Probe Init Att</em>'.
	 * @see ecec_cormas.ProbeInit#getProbeInitAtt()
	 * @see #getProbeInit()
	 * @generated
	 */
	EReference getProbeInit_ProbeInitAtt();

	/**
	 * Returns the meta object for the attribute '{@link ecec_cormas.ProbeInit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecec_cormas.ProbeInit#getName()
	 * @see #getProbeInit()
	 * @generated
	 */
	EAttribute getProbeInit_Name();

	/**
	 * Returns the meta object for enum '{@link ecec_cormas.CormasClassType <em>Cormas Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cormas Class Type</em>'.
	 * @see ecec_cormas.CormasClassType
	 * @generated
	 */
	EEnum getCormasClassType();

	/**
	 * Returns the meta object for enum '{@link ecec_cormas.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Type</em>'.
	 * @see ecec_cormas.BooleanType
	 * @generated
	 */
	EEnum getBooleanType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ecec_cormasFactory getEcec_cormasFactory();

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
		 * The meta object literal for the '{@link ecec_cormas.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.DiagramElementImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.SpaceImpl <em>Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.SpaceImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getSpace()
		 * @generated
		 */
		EClass SPACE = eINSTANCE.getSpace();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__PATH = eINSTANCE.getSpace_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__NAME = eINSTANCE.getSpace_Name();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ClassImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROTOCOLS = eINSTANCE.getClass_Protocols();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TYPE = eINSTANCE.getClass_Type();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.MethodImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Use Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__USE_ATTRIBUTES = eINSTANCE.getMethod_UseAttributes();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.AttributeImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__INSTANCE_TYPE = eINSTANCE.getAttribute_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Notify Observers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NOTIFY_OBSERVERS = eINSTANCE.getAttribute_NotifyObservers();

		/**
		 * The meta object literal for the '<em><b>Setter Acessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SETTER_ACESSOR = eINSTANCE.getAttribute_SetterAcessor();

		/**
		 * The meta object literal for the '<em><b>Getter Acessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__GETTER_ACESSOR = eINSTANCE.getAttribute_GetterAcessor();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ProtocolImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__METHODS = eINSTANCE.getProtocol_Methods();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.EnvirommentImpl <em>Enviromment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.EnvirommentImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getEnviromment()
		 * @generated
		 */
		EClass ENVIROMMENT = eINSTANCE.getEnviromment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMMENT__NAME = eINSTANCE.getEnviromment_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMMENT__PATH = eINSTANCE.getEnviromment_Path();

		/**
		 * The meta object literal for the '<em><b>Load Enviroment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIROMMENT__LOAD_ENVIROMENT = eINSTANCE.getEnviromment_LoadEnviroment();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ModelImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARAMETERS = eINSTANCE.getModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ModelParametersImpl <em>Model Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ModelParametersImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getModelParameters()
		 * @generated
		 */
		EClass MODEL_PARAMETERS = eINSTANCE.getModelParameters();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAMETERS__AUTHOR = eINSTANCE.getModelParameters_Author();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAMETERS__MODEL_NAME = eINSTANCE.getModelParameters_ModelName();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.VegetationUnitImpl <em>Vegetation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.VegetationUnitImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getVegetationUnit()
		 * @generated
		 */
		EClass VEGETATION_UNIT = eINSTANCE.getVegetationUnit();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEGETATION_UNIT__K = eINSTANCE.getVegetationUnit_K();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEGETATION_UNIT__R = eINSTANCE.getVegetationUnit_R();

		/**
		 * The meta object literal for the '<em><b>Biomass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEGETATION_UNIT__BIOMASS = eINSTANCE.getVegetationUnit_Biomass();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ForagerImpl <em>Forager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ForagerImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getForager()
		 * @generated
		 */
		EClass FORAGER = eINSTANCE.getForager();

		/**
		 * The meta object literal for the '<em><b>Catabolic Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORAGER__CATABOLIC_RATE = eINSTANCE.getForager_CatabolicRate();

		/**
		 * The meta object literal for the '<em><b>Fertility Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORAGER__FERTILITY_THRESHOLD = eINSTANCE.getForager_FertilityThreshold();

		/**
		 * The meta object literal for the '<em><b>Haverst Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORAGER__HAVERST_RATE = eINSTANCE.getForager_HaverstRate();

		/**
		 * The meta object literal for the '<em><b>Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORAGER__ENERGY = eINSTANCE.getForager_Energy();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.LogisticGrowthImpl <em>Logistic Growth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.LogisticGrowthImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getLogisticGrowth()
		 * @generated
		 */
		EClass LOGISTIC_GROWTH = eINSTANCE.getLogisticGrowth();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.InitImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ControlImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.CustomProtocolImpl <em>Custom Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.CustomProtocolImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getCustomProtocol()
		 * @generated
		 */
		EClass CUSTOM_PROTOCOL = eINSTANCE.getCustomProtocol();

		/**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROTOCOL__PROTOCOL_NAME = eINSTANCE.getCustomProtocol_ProtocolName();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.PoVImpl <em>Po V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.PoVImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getPoV()
		 * @generated
		 */
		EClass PO_V = eINSTANCE.getPoV();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_V__NAME = eINSTANCE.getPoV_Name();

		/**
		 * The meta object literal for the '<em><b>Pov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PO_V__POV = eINSTANCE.getPoV_Pov();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ProbeImpl <em>Probe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ProbeImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProbe()
		 * @generated
		 */
		EClass PROBE = eINSTANCE.getProbe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__NAME = eINSTANCE.getProbe_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE__CLASSES = eINSTANCE.getProbe_Classes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE__ATTRIBUTES = eINSTANCE.getProbe_Attributes();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.SchedulerImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__ATTRIBUTES = eINSTANCE.getScheduler_Attributes();

		/**
		 * The meta object literal for the '<em><b>Init Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__INIT_MODEL = eINSTANCE.getScheduler_InitModel();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.RelationImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TO = eINSTANCE.getRelation_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FROM = eINSTANCE.getRelation_From();

		/**
		 * The meta object literal for the '{@link ecec_cormas.impl.ProbeInitImpl <em>Probe Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.impl.ProbeInitImpl
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getProbeInit()
		 * @generated
		 */
		EClass PROBE_INIT = eINSTANCE.getProbeInit();

		/**
		 * The meta object literal for the '<em><b>Probe Init Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE_INIT__PROBE_INIT_SCHEDULER = eINSTANCE.getProbeInit_ProbeInitScheduler();

		/**
		 * The meta object literal for the '<em><b>Probe Init Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE_INIT__PROBE_INIT_ATT = eINSTANCE.getProbeInit_ProbeInitAtt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE_INIT__NAME = eINSTANCE.getProbeInit_Name();

		/**
		 * The meta object literal for the '{@link ecec_cormas.CormasClassType <em>Cormas Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.CormasClassType
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getCormasClassType()
		 * @generated
		 */
		EEnum CORMAS_CLASS_TYPE = eINSTANCE.getCormasClassType();

		/**
		 * The meta object literal for the '{@link ecec_cormas.BooleanType <em>Boolean Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecec_cormas.BooleanType
		 * @see ecec_cormas.impl.Ecec_cormasPackageImpl#getBooleanType()
		 * @generated
		 */
		EEnum BOOLEAN_TYPE = eINSTANCE.getBooleanType();

	}

} //Ecec_cormasPackage
