/**
 */
package behaviorMetamodel;

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
 * @see behaviorMetamodel.MetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 * @generated
 */
public interface MetamodelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviorMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cirad.org/dsl/BehaviorMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviorMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = behaviorMetamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.EntityImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.BehaviorImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Localvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__LOCALVARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.EquationBehaviorImpl <em>Equation Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.EquationBehaviorImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEquationBehavior()
	 * @generated
	 */
	int EQUATION_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR__PARAMETERS = BEHAVIOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Localvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR__LOCALVARIABLE = BEHAVIOR__LOCALVARIABLE;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR__EQUATION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equation Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equation Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ActivityDiagramBehaviorImpl <em>Activity Diagram Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ActivityDiagramBehaviorImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getActivityDiagramBehavior()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR__PARAMETERS = BEHAVIOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Localvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR__LOCALVARIABLE = BEHAVIOR__LOCALVARIABLE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR__START = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Diagram Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Diagram Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ExpressionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.VariableClassImpl <em>Variable Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.VariableClassImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getVariableClass()
	 * @generated
	 */
	int VARIABLE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CLASS__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CLASS__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CLASS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CLASS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.InitImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 47;

	/**
	 * The feature id for the '<em><b>Assingnments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__ASSINGNMENTS = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Init Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__INIT_FUNCTION_CALL = 2;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.InitSpaceImpl <em>Init Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.InitSpaceImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInitSpace()
	 * @generated
	 */
	int INIT_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Assingnments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_SPACE__ASSINGNMENTS = INIT__ASSINGNMENTS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_SPACE__ENTITY = INIT__ENTITY;

	/**
	 * The feature id for the '<em><b>Init Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_SPACE__INIT_FUNCTION_CALL = INIT__INIT_FUNCTION_CALL;

	/**
	 * The number of structural features of the '<em>Init Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_SPACE_FEATURE_COUNT = INIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Init Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_SPACE_OPERATION_COUNT = INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.TypeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ParameterClassImpl <em>Parameter Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ParameterClassImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getParameterClass()
	 * @generated
	 */
	int PARAMETER_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CLASS__NAME = VARIABLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CLASS__TYPE = VARIABLE_CLASS__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CLASS_FEATURE_COUNT = VARIABLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CLASS_OPERATION_COUNT = VARIABLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.AttributeClassImpl <em>Attribute Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.AttributeClassImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAttributeClass()
	 * @generated
	 */
	int ATTRIBUTE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CLASS__NAME = VARIABLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CLASS__TYPE = VARIABLE_CLASS__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CLASS_FEATURE_COUNT = VARIABLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CLASS_OPERATION_COUNT = VARIABLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.LocalVariableImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = VARIABLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = VARIABLE_CLASS__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__EXPRESSION = VARIABLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ConstantExpressionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getConstantExpression()
	 * @generated
	 */
	int CONSTANT_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.FunctionCallExpressionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFunctionCallExpression()
	 * @generated
	 */
	int FUNCTION_CALL_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.FunctionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CODOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.NamedFunctionImpl <em>Named Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.NamedFunctionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getNamedFunction()
	 * @generated
	 */
	int NAMED_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FUNCTION__DOMAIN = FUNCTION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FUNCTION__CODOMAIN = FUNCTION__CODOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FUNCTION__NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.AnonymousFunctionImpl <em>Anonymous Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.AnonymousFunctionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAnonymousFunction()
	 * @generated
	 */
	int ANONYMOUS_FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION__DOMAIN = FUNCTION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION__CODOMAIN = FUNCTION__CODOMAIN;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION__EXPRESSION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION__PARAMETERS = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anonymous Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.EquationImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ElementImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.EdgeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET_NODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.NodeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTCOME_EDGE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.UnconditionedEdgeImpl <em>Unconditioned Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.UnconditionedEdgeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getUnconditionedEdge()
	 * @generated
	 */
	int UNCONDITIONED_EDGE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONED_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Target node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONED_EDGE__TARGET_NODE = EDGE__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Unconditioned Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONED_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unconditioned Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONED_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.IfTrueEdgeImpl <em>If True Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.IfTrueEdgeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getIfTrueEdge()
	 * @generated
	 */
	int IF_TRUE_EDGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TRUE_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Target node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TRUE_EDGE__TARGET_NODE = EDGE__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>If True Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TRUE_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If True Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TRUE_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.IfFalseEdgeImpl <em>If False Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.IfFalseEdgeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getIfFalseEdge()
	 * @generated
	 */
	int IF_FALSE_EDGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FALSE_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Target node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FALSE_EDGE__TARGET_NODE = EDGE__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>If False Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FALSE_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If False Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FALSE_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ControlNodeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTCOME_EDGE = NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ExecutableNodeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTCOME_EDGE = NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.StartImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getStart()
	 * @generated
	 */
	int START = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.EndImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEnd()
	 * @generated
	 */
	int END = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DecisionImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__BOOLEANEXPRESSION = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ForkImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.MergeImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.JoinImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTCOME_EDGE = CONTROL_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.PrimitiveActivitiesImpl <em>Primitive Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.PrimitiveActivitiesImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getPrimitiveActivities()
	 * @generated
	 */
	int PRIMITIVE_ACTIVITIES = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACTIVITIES__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACTIVITIES__OUTCOME_EDGE = EXECUTABLE_NODE__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Primitive Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACTIVITIES_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACTIVITIES_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.MoveImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>Locationexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LOCATIONEXPRESSION = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DieImpl <em>Die</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DieImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDie()
	 * @generated
	 */
	int DIE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIE__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIE__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The number of structural features of the '<em>Die</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIE_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Die</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIE_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ReproduceImpl <em>Reproduce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ReproduceImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getReproduce()
	 * @generated
	 */
	int REPRODUCE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>Offspring quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__OFFSPRING_QUANTITY = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__INITIAL_LOCATION = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaredattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__DECLAREDATTRIBUTES = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occupied Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE__OCCUPIED_EXPRESSION = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reproduce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reproduce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRODUCE_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.AddImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>To Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TO_ATTRIBUTE = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__EXPRESSION = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.RemoveImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__FROM = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__EXPRESSION = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ActivityBehaviorImpl <em>Activity Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ActivityBehaviorImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getActivityBehavior()
	 * @generated
	 */
	int ACTIVITY_BEHAVIOR = 36;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR__PARAMETERS = BEHAVIOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Localvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR__LOCALVARIABLE = BEHAVIOR__LOCALVARIABLE;

	/**
	 * The feature id for the '<em><b>Primitiveaactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR__PRIMITIVEAACTIVITIES = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.ModelImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 38;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INIT = 2;

	/**
	 * The feature id for the '<em><b>Main Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAIN_BEHAVIOR = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredLocalVariableImpl <em>Declared Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredLocalVariableImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredLocalVariable()
	 * @generated
	 */
	int DECLARED_LOCAL_VARIABLE = 39;

	/**
	 * The feature id for the '<em><b>Localvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_LOCAL_VARIABLE__LOCALVARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_LOCAL_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_LOCAL_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredParameterImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredParameter()
	 * @generated
	 */
	int DECLARED_PARAMETER = 40;

	/**
	 * The feature id for the '<em><b>Parameterclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__PARAMETERCLASS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredAttributesImpl <em>Declared Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredAttributesImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredAttributes()
	 * @generated
	 */
	int DECLARED_ATTRIBUTES = 41;

	/**
	 * The feature id for the '<em><b>Attributeclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ATTRIBUTES__ATTRIBUTECLASS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ATTRIBUTES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ATTRIBUTES_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredEntitiesImpl <em>Declared Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredEntitiesImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredEntities()
	 * @generated
	 */
	int DECLARED_ENTITIES = 42;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ENTITIES__ENTITY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ENTITIES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ENTITIES_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredVariableImpl <em>Declared Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredVariableImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredVariable()
	 * @generated
	 */
	int DECLARED_VARIABLE = 43;

	/**
	 * The feature id for the '<em><b>Variableclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VARIABLE__VARIABLECLASS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.DeclaredBehaviorImpl <em>Declared Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.DeclaredBehaviorImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredBehavior()
	 * @generated
	 */
	int DECLARED_BEHAVIOR = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_BEHAVIOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_BEHAVIOR__OUTCOME_EDGE = NODE__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_BEHAVIOR__BEHAVIOR = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_BEHAVIOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declared Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_BEHAVIOR_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.InitEntityImpl <em>Init Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.InitEntityImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInitEntity()
	 * @generated
	 */
	int INIT_ENTITY = 45;

	/**
	 * The feature id for the '<em><b>Assingnments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY__ASSINGNMENTS = INIT__ASSINGNMENTS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY__ENTITY = INIT__ENTITY;

	/**
	 * The feature id for the '<em><b>Init Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY__INIT_FUNCTION_CALL = INIT__INIT_FUNCTION_CALL;

	/**
	 * The feature id for the '<em><b>Initial Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY__INITIAL_LOCATION = INIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY__INIT_NAME = INIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Init Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY_FEATURE_COUNT = INIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Init Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_ENTITY_OPERATION_COUNT = INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.AssignmentImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 46;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.impl.SetVariableImpl <em>Set Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.impl.SetVariableImpl
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getSetVariable()
	 * @generated
	 */
	int SET_VARIABLE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__NAME = PRIMITIVE_ACTIVITIES__NAME;

	/**
	 * The feature id for the '<em><b>Outcome edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__OUTCOME_EDGE = PRIMITIVE_ACTIVITIES__OUTCOME_EDGE;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__ASSIGNMENT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_FEATURE_COUNT = PRIMITIVE_ACTIVITIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_OPERATION_COUNT = PRIMITIVE_ACTIVITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviorMetamodel.TypeEnum <em>Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorMetamodel.TypeEnum
	 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getTypeEnum()
	 * @generated
	 */
	int TYPE_ENUM = 49;


	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see behaviorMetamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Entity#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see behaviorMetamodel.Entity#getBehavior()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see behaviorMetamodel.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see behaviorMetamodel.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Behavior#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see behaviorMetamodel.Behavior#getParameters()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.Behavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.Behavior#getName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Behavior#getLocalvariable <em>Localvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localvariable</em>'.
	 * @see behaviorMetamodel.Behavior#getLocalvariable()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Localvariable();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.EquationBehavior <em>Equation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation Behavior</em>'.
	 * @see behaviorMetamodel.EquationBehavior
	 * @generated
	 */
	EClass getEquationBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.EquationBehavior#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equation</em>'.
	 * @see behaviorMetamodel.EquationBehavior#getEquation()
	 * @see #getEquationBehavior()
	 * @generated
	 */
	EReference getEquationBehavior_Equation();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ActivityDiagramBehavior <em>Activity Diagram Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram Behavior</em>'.
	 * @see behaviorMetamodel.ActivityDiagramBehavior
	 * @generated
	 */
	EClass getActivityDiagramBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.ActivityDiagramBehavior#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see behaviorMetamodel.ActivityDiagramBehavior#getStart()
	 * @see #getActivityDiagramBehavior()
	 * @generated
	 */
	EReference getActivityDiagramBehavior_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.ActivityDiagramBehavior#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see behaviorMetamodel.ActivityDiagramBehavior#getElements()
	 * @see #getActivityDiagramBehavior()
	 * @generated
	 */
	EReference getActivityDiagramBehavior_Elements();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.VariableClass <em>Variable Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Class</em>'.
	 * @see behaviorMetamodel.VariableClass
	 * @generated
	 */
	EClass getVariableClass();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.VariableClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.VariableClass#getName()
	 * @see #getVariableClass()
	 * @generated
	 */
	EAttribute getVariableClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.VariableClass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviorMetamodel.VariableClass#getType()
	 * @see #getVariableClass()
	 * @generated
	 */
	EAttribute getVariableClass_Type();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.InitSpace <em>Init Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Space</em>'.
	 * @see behaviorMetamodel.InitSpace
	 * @generated
	 */
	EClass getInitSpace();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see behaviorMetamodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviorMetamodel.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see behaviorMetamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ParameterClass <em>Parameter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Class</em>'.
	 * @see behaviorMetamodel.ParameterClass
	 * @generated
	 */
	EClass getParameterClass();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.AttributeClass <em>Attribute Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Class</em>'.
	 * @see behaviorMetamodel.AttributeClass
	 * @generated
	 */
	EClass getAttributeClass();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see behaviorMetamodel.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.LocalVariable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see behaviorMetamodel.LocalVariable#getExpression()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Expression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see behaviorMetamodel.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.ConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see behaviorMetamodel.ConstantExpression#getValue()
	 * @see #getConstantExpression()
	 * @generated
	 */
	EAttribute getConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Expression</em>'.
	 * @see behaviorMetamodel.FunctionCallExpression
	 * @generated
	 */
	EClass getFunctionCallExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.FunctionCallExpression#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see behaviorMetamodel.FunctionCallExpression#getArguments()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.FunctionCallExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see behaviorMetamodel.FunctionCallExpression#getFunction()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Function();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see behaviorMetamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Function#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see behaviorMetamodel.Function#getDomain()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Function#getCodomain <em>Codomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codomain</em>'.
	 * @see behaviorMetamodel.Function#getCodomain()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Codomain();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.NamedFunction <em>Named Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Function</em>'.
	 * @see behaviorMetamodel.NamedFunction
	 * @generated
	 */
	EClass getNamedFunction();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.NamedFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.NamedFunction#getName()
	 * @see #getNamedFunction()
	 * @generated
	 */
	EAttribute getNamedFunction_Name();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.AnonymousFunction <em>Anonymous Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Function</em>'.
	 * @see behaviorMetamodel.AnonymousFunction
	 * @generated
	 */
	EClass getAnonymousFunction();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.AnonymousFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see behaviorMetamodel.AnonymousFunction#getExpression()
	 * @see #getAnonymousFunction()
	 * @generated
	 */
	EReference getAnonymousFunction_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.AnonymousFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see behaviorMetamodel.AnonymousFunction#getParameters()
	 * @see #getAnonymousFunction()
	 * @generated
	 */
	EReference getAnonymousFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see behaviorMetamodel.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Equation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see behaviorMetamodel.Equation#getLeft()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Equation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see behaviorMetamodel.Equation#getRight()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Right();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see behaviorMetamodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see behaviorMetamodel.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Edge#getTarget_node <em>Target node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target node</em>'.
	 * @see behaviorMetamodel.Edge#getTarget_node()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target_node();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see behaviorMetamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Node#getOutcome_edge <em>Outcome edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outcome edge</em>'.
	 * @see behaviorMetamodel.Node#getOutcome_edge()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outcome_edge();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.UnconditionedEdge <em>Unconditioned Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unconditioned Edge</em>'.
	 * @see behaviorMetamodel.UnconditionedEdge
	 * @generated
	 */
	EClass getUnconditionedEdge();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.IfTrueEdge <em>If True Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If True Edge</em>'.
	 * @see behaviorMetamodel.IfTrueEdge
	 * @generated
	 */
	EClass getIfTrueEdge();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.IfFalseEdge <em>If False Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If False Edge</em>'.
	 * @see behaviorMetamodel.IfFalseEdge
	 * @generated
	 */
	EClass getIfFalseEdge();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see behaviorMetamodel.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see behaviorMetamodel.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see behaviorMetamodel.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see behaviorMetamodel.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see behaviorMetamodel.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Decision#getBooleanexpression <em>Booleanexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booleanexpression</em>'.
	 * @see behaviorMetamodel.Decision#getBooleanexpression()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Booleanexpression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see behaviorMetamodel.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see behaviorMetamodel.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see behaviorMetamodel.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see behaviorMetamodel.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Move#getLocationexpression <em>Locationexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locationexpression</em>'.
	 * @see behaviorMetamodel.Move#getLocationexpression()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Locationexpression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Die <em>Die</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Die</em>'.
	 * @see behaviorMetamodel.Die
	 * @generated
	 */
	EClass getDie();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Reproduce <em>Reproduce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reproduce</em>'.
	 * @see behaviorMetamodel.Reproduce
	 * @generated
	 */
	EClass getReproduce();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Reproduce#getOffspring_quantity <em>Offspring quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offspring quantity</em>'.
	 * @see behaviorMetamodel.Reproduce#getOffspring_quantity()
	 * @see #getReproduce()
	 * @generated
	 */
	EReference getReproduce_Offspring_quantity();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Reproduce#getInitial_location <em>Initial location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial location</em>'.
	 * @see behaviorMetamodel.Reproduce#getInitial_location()
	 * @see #getReproduce()
	 * @generated
	 */
	EReference getReproduce_Initial_location();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Reproduce#getDeclaredattributes <em>Declaredattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaredattributes</em>'.
	 * @see behaviorMetamodel.Reproduce#getDeclaredattributes()
	 * @see #getReproduce()
	 * @generated
	 */
	EReference getReproduce_Declaredattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Reproduce#getOccupiedExpression <em>Occupied Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occupied Expression</em>'.
	 * @see behaviorMetamodel.Reproduce#getOccupiedExpression()
	 * @see #getReproduce()
	 * @generated
	 */
	EReference getReproduce_OccupiedExpression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see behaviorMetamodel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Add#getToAttribute <em>To Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Attribute</em>'.
	 * @see behaviorMetamodel.Add#getToAttribute()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_ToAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Add#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see behaviorMetamodel.Add#getExpression()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Expression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see behaviorMetamodel.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Remove#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see behaviorMetamodel.Remove#getFrom()
	 * @see #getRemove()
	 * @generated
	 */
	EReference getRemove_From();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Remove#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see behaviorMetamodel.Remove#getExpression()
	 * @see #getRemove()
	 * @generated
	 */
	EReference getRemove_Expression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.ActivityBehavior <em>Activity Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Behavior</em>'.
	 * @see behaviorMetamodel.ActivityBehavior
	 * @generated
	 */
	EClass getActivityBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.ActivityBehavior#getPrimitiveaactivities <em>Primitiveaactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitiveaactivities</em>'.
	 * @see behaviorMetamodel.ActivityBehavior#getPrimitiveaactivities()
	 * @see #getActivityBehavior()
	 * @generated
	 */
	EReference getActivityBehavior_Primitiveaactivities();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.PrimitiveActivities <em>Primitive Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Activities</em>'.
	 * @see behaviorMetamodel.PrimitiveActivities
	 * @generated
	 */
	EClass getPrimitiveActivities();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see behaviorMetamodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Model#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see behaviorMetamodel.Model#getEntities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Entities();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviorMetamodel.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Model#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init</em>'.
	 * @see behaviorMetamodel.Model#getInit()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Init();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Model#getMainBehavior <em>Main Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Behavior</em>'.
	 * @see behaviorMetamodel.Model#getMainBehavior()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MainBehavior();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredLocalVariable <em>Declared Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Local Variable</em>'.
	 * @see behaviorMetamodel.DeclaredLocalVariable
	 * @generated
	 */
	EClass getDeclaredLocalVariable();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredLocalVariable#getLocalvariable <em>Localvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localvariable</em>'.
	 * @see behaviorMetamodel.DeclaredLocalVariable#getLocalvariable()
	 * @see #getDeclaredLocalVariable()
	 * @generated
	 */
	EReference getDeclaredLocalVariable_Localvariable();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter</em>'.
	 * @see behaviorMetamodel.DeclaredParameter
	 * @generated
	 */
	EClass getDeclaredParameter();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredParameter#getParameterclass <em>Parameterclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameterclass</em>'.
	 * @see behaviorMetamodel.DeclaredParameter#getParameterclass()
	 * @see #getDeclaredParameter()
	 * @generated
	 */
	EReference getDeclaredParameter_Parameterclass();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredAttributes <em>Declared Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Attributes</em>'.
	 * @see behaviorMetamodel.DeclaredAttributes
	 * @generated
	 */
	EClass getDeclaredAttributes();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredAttributes#getAttributeclass <em>Attributeclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributeclass</em>'.
	 * @see behaviorMetamodel.DeclaredAttributes#getAttributeclass()
	 * @see #getDeclaredAttributes()
	 * @generated
	 */
	EReference getDeclaredAttributes_Attributeclass();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredEntities <em>Declared Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Entities</em>'.
	 * @see behaviorMetamodel.DeclaredEntities
	 * @generated
	 */
	EClass getDeclaredEntities();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredEntities#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see behaviorMetamodel.DeclaredEntities#getEntity()
	 * @see #getDeclaredEntities()
	 * @generated
	 */
	EReference getDeclaredEntities_Entity();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredVariable <em>Declared Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Variable</em>'.
	 * @see behaviorMetamodel.DeclaredVariable
	 * @generated
	 */
	EClass getDeclaredVariable();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredVariable#getVariableclass <em>Variableclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variableclass</em>'.
	 * @see behaviorMetamodel.DeclaredVariable#getVariableclass()
	 * @see #getDeclaredVariable()
	 * @generated
	 */
	EReference getDeclaredVariable_Variableclass();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.DeclaredBehavior <em>Declared Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Behavior</em>'.
	 * @see behaviorMetamodel.DeclaredBehavior
	 * @generated
	 */
	EClass getDeclaredBehavior();

	/**
	 * Returns the meta object for the reference '{@link behaviorMetamodel.DeclaredBehavior#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see behaviorMetamodel.DeclaredBehavior#getBehavior()
	 * @see #getDeclaredBehavior()
	 * @generated
	 */
	EReference getDeclaredBehavior_Behavior();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.InitEntity <em>Init Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Entity</em>'.
	 * @see behaviorMetamodel.InitEntity
	 * @generated
	 */
	EClass getInitEntity();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.InitEntity#getInitialLocation <em>Initial Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Location</em>'.
	 * @see behaviorMetamodel.InitEntity#getInitialLocation()
	 * @see #getInitEntity()
	 * @generated
	 */
	EReference getInitEntity_InitialLocation();

	/**
	 * Returns the meta object for the attribute '{@link behaviorMetamodel.InitEntity#getInitName <em>Init Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Name</em>'.
	 * @see behaviorMetamodel.InitEntity#getInitName()
	 * @see #getInitEntity()
	 * @generated
	 */
	EAttribute getInitEntity_InitName();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see behaviorMetamodel.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see behaviorMetamodel.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see behaviorMetamodel.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see behaviorMetamodel.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorMetamodel.Init#getAssingnments <em>Assingnments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assingnments</em>'.
	 * @see behaviorMetamodel.Init#getAssingnments()
	 * @see #getInit()
	 * @generated
	 */
	EReference getInit_Assingnments();

	/**
	 * Returns the meta object for the reference list '{@link behaviorMetamodel.Init#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity</em>'.
	 * @see behaviorMetamodel.Init#getEntity()
	 * @see #getInit()
	 * @generated
	 */
	EReference getInit_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.Init#getInitFunctionCall <em>Init Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Function Call</em>'.
	 * @see behaviorMetamodel.Init#getInitFunctionCall()
	 * @see #getInit()
	 * @generated
	 */
	EReference getInit_InitFunctionCall();

	/**
	 * Returns the meta object for class '{@link behaviorMetamodel.SetVariable <em>Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Variable</em>'.
	 * @see behaviorMetamodel.SetVariable
	 * @generated
	 */
	EClass getSetVariable();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorMetamodel.SetVariable#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see behaviorMetamodel.SetVariable#getAssignment()
	 * @see #getSetVariable()
	 * @generated
	 */
	EReference getSetVariable_Assignment();

	/**
	 * Returns the meta object for enum '{@link behaviorMetamodel.TypeEnum <em>Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Enum</em>'.
	 * @see behaviorMetamodel.TypeEnum
	 * @generated
	 */
	EEnum getTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.EntityImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BEHAVIOR = eINSTANCE.getEntity_Behavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.BehaviorImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__PARAMETERS = eINSTANCE.getBehavior_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

		/**
		 * The meta object literal for the '<em><b>Localvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__LOCALVARIABLE = eINSTANCE.getBehavior_Localvariable();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.EquationBehaviorImpl <em>Equation Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.EquationBehaviorImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEquationBehavior()
		 * @generated
		 */
		EClass EQUATION_BEHAVIOR = eINSTANCE.getEquationBehavior();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_BEHAVIOR__EQUATION = eINSTANCE.getEquationBehavior_Equation();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ActivityDiagramBehaviorImpl <em>Activity Diagram Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ActivityDiagramBehaviorImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getActivityDiagramBehavior()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM_BEHAVIOR = eINSTANCE.getActivityDiagramBehavior();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM_BEHAVIOR__START = eINSTANCE.getActivityDiagramBehavior_Start();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS = eINSTANCE.getActivityDiagramBehavior_Elements();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.VariableClassImpl <em>Variable Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.VariableClassImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getVariableClass()
		 * @generated
		 */
		EClass VARIABLE_CLASS = eINSTANCE.getVariableClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CLASS__NAME = eINSTANCE.getVariableClass_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CLASS__TYPE = eINSTANCE.getVariableClass_Type();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.InitSpaceImpl <em>Init Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.InitSpaceImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInitSpace()
		 * @generated
		 */
		EClass INIT_SPACE = eINSTANCE.getInitSpace();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.TypeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ExpressionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ParameterClassImpl <em>Parameter Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ParameterClassImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getParameterClass()
		 * @generated
		 */
		EClass PARAMETER_CLASS = eINSTANCE.getParameterClass();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.AttributeClassImpl <em>Attribute Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.AttributeClassImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAttributeClass()
		 * @generated
		 */
		EClass ATTRIBUTE_CLASS = eINSTANCE.getAttributeClass();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.LocalVariableImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__EXPRESSION = eINSTANCE.getLocalVariable_Expression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ConstantExpressionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_EXPRESSION__VALUE = eINSTANCE.getConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.FunctionCallExpressionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFunctionCallExpression()
		 * @generated
		 */
		EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__ARGUMENTS = eINSTANCE.getFunctionCallExpression_Arguments();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getFunctionCallExpression_Function();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.FunctionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DOMAIN = eINSTANCE.getFunction_Domain();

		/**
		 * The meta object literal for the '<em><b>Codomain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CODOMAIN = eINSTANCE.getFunction_Codomain();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.NamedFunctionImpl <em>Named Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.NamedFunctionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getNamedFunction()
		 * @generated
		 */
		EClass NAMED_FUNCTION = eINSTANCE.getNamedFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_FUNCTION__NAME = eINSTANCE.getNamedFunction_Name();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.AnonymousFunctionImpl <em>Anonymous Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.AnonymousFunctionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAnonymousFunction()
		 * @generated
		 */
		EClass ANONYMOUS_FUNCTION = eINSTANCE.getAnonymousFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_FUNCTION__EXPRESSION = eINSTANCE.getAnonymousFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_FUNCTION__PARAMETERS = eINSTANCE.getAnonymousFunction_Parameters();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.EquationImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__LEFT = eINSTANCE.getEquation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__RIGHT = eINSTANCE.getEquation_Right();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ElementImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.EdgeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Target node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET_NODE = eINSTANCE.getEdge_Target_node();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.NodeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outcome edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTCOME_EDGE = eINSTANCE.getNode_Outcome_edge();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.UnconditionedEdgeImpl <em>Unconditioned Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.UnconditionedEdgeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getUnconditionedEdge()
		 * @generated
		 */
		EClass UNCONDITIONED_EDGE = eINSTANCE.getUnconditionedEdge();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.IfTrueEdgeImpl <em>If True Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.IfTrueEdgeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getIfTrueEdge()
		 * @generated
		 */
		EClass IF_TRUE_EDGE = eINSTANCE.getIfTrueEdge();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.IfFalseEdgeImpl <em>If False Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.IfFalseEdgeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getIfFalseEdge()
		 * @generated
		 */
		EClass IF_FALSE_EDGE = eINSTANCE.getIfFalseEdge();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ControlNodeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ExecutableNodeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.StartImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.EndImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DecisionImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Booleanexpression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__BOOLEANEXPRESSION = eINSTANCE.getDecision_Booleanexpression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ForkImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.MergeImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.JoinImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.MoveImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Locationexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__LOCATIONEXPRESSION = eINSTANCE.getMove_Locationexpression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DieImpl <em>Die</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DieImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDie()
		 * @generated
		 */
		EClass DIE = eINSTANCE.getDie();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ReproduceImpl <em>Reproduce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ReproduceImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getReproduce()
		 * @generated
		 */
		EClass REPRODUCE = eINSTANCE.getReproduce();

		/**
		 * The meta object literal for the '<em><b>Offspring quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRODUCE__OFFSPRING_QUANTITY = eINSTANCE.getReproduce_Offspring_quantity();

		/**
		 * The meta object literal for the '<em><b>Initial location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRODUCE__INITIAL_LOCATION = eINSTANCE.getReproduce_Initial_location();

		/**
		 * The meta object literal for the '<em><b>Declaredattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRODUCE__DECLAREDATTRIBUTES = eINSTANCE.getReproduce_Declaredattributes();

		/**
		 * The meta object literal for the '<em><b>Occupied Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRODUCE__OCCUPIED_EXPRESSION = eINSTANCE.getReproduce_OccupiedExpression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.AddImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>To Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__TO_ATTRIBUTE = eINSTANCE.getAdd_ToAttribute();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__EXPRESSION = eINSTANCE.getAdd_Expression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.RemoveImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE__FROM = eINSTANCE.getRemove_From();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE__EXPRESSION = eINSTANCE.getRemove_Expression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ActivityBehaviorImpl <em>Activity Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ActivityBehaviorImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getActivityBehavior()
		 * @generated
		 */
		EClass ACTIVITY_BEHAVIOR = eINSTANCE.getActivityBehavior();

		/**
		 * The meta object literal for the '<em><b>Primitiveaactivities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_BEHAVIOR__PRIMITIVEAACTIVITIES = eINSTANCE.getActivityBehavior_Primitiveaactivities();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.PrimitiveActivitiesImpl <em>Primitive Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.PrimitiveActivitiesImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getPrimitiveActivities()
		 * @generated
		 */
		EClass PRIMITIVE_ACTIVITIES = eINSTANCE.getPrimitiveActivities();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.ModelImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INIT = eINSTANCE.getModel_Init();

		/**
		 * The meta object literal for the '<em><b>Main Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MAIN_BEHAVIOR = eINSTANCE.getModel_MainBehavior();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredLocalVariableImpl <em>Declared Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredLocalVariableImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredLocalVariable()
		 * @generated
		 */
		EClass DECLARED_LOCAL_VARIABLE = eINSTANCE.getDeclaredLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Localvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_LOCAL_VARIABLE__LOCALVARIABLE = eINSTANCE.getDeclaredLocalVariable_Localvariable();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredParameterImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredParameter()
		 * @generated
		 */
		EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

		/**
		 * The meta object literal for the '<em><b>Parameterclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER__PARAMETERCLASS = eINSTANCE.getDeclaredParameter_Parameterclass();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredAttributesImpl <em>Declared Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredAttributesImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredAttributes()
		 * @generated
		 */
		EClass DECLARED_ATTRIBUTES = eINSTANCE.getDeclaredAttributes();

		/**
		 * The meta object literal for the '<em><b>Attributeclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_ATTRIBUTES__ATTRIBUTECLASS = eINSTANCE.getDeclaredAttributes_Attributeclass();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredEntitiesImpl <em>Declared Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredEntitiesImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredEntities()
		 * @generated
		 */
		EClass DECLARED_ENTITIES = eINSTANCE.getDeclaredEntities();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_ENTITIES__ENTITY = eINSTANCE.getDeclaredEntities_Entity();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredVariableImpl <em>Declared Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredVariableImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredVariable()
		 * @generated
		 */
		EClass DECLARED_VARIABLE = eINSTANCE.getDeclaredVariable();

		/**
		 * The meta object literal for the '<em><b>Variableclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_VARIABLE__VARIABLECLASS = eINSTANCE.getDeclaredVariable_Variableclass();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.DeclaredBehaviorImpl <em>Declared Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.DeclaredBehaviorImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getDeclaredBehavior()
		 * @generated
		 */
		EClass DECLARED_BEHAVIOR = eINSTANCE.getDeclaredBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_BEHAVIOR__BEHAVIOR = eINSTANCE.getDeclaredBehavior_Behavior();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.InitEntityImpl <em>Init Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.InitEntityImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInitEntity()
		 * @generated
		 */
		EClass INIT_ENTITY = eINSTANCE.getInitEntity();

		/**
		 * The meta object literal for the '<em><b>Initial Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_ENTITY__INITIAL_LOCATION = eINSTANCE.getInitEntity_InitialLocation();

		/**
		 * The meta object literal for the '<em><b>Init Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_ENTITY__INIT_NAME = eINSTANCE.getInitEntity_InitName();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.AssignmentImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.InitImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '<em><b>Assingnments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT__ASSINGNMENTS = eINSTANCE.getInit_Assingnments();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT__ENTITY = eINSTANCE.getInit_Entity();

		/**
		 * The meta object literal for the '<em><b>Init Function Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT__INIT_FUNCTION_CALL = eINSTANCE.getInit_InitFunctionCall();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.impl.SetVariableImpl <em>Set Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.impl.SetVariableImpl
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getSetVariable()
		 * @generated
		 */
		EClass SET_VARIABLE = eINSTANCE.getSetVariable();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VARIABLE__ASSIGNMENT = eINSTANCE.getSetVariable_Assignment();

		/**
		 * The meta object literal for the '{@link behaviorMetamodel.TypeEnum <em>Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorMetamodel.TypeEnum
		 * @see behaviorMetamodel.impl.MetamodelPackageImpl#getTypeEnum()
		 * @generated
		 */
		EEnum TYPE_ENUM = eINSTANCE.getTypeEnum();

	}

} //MetamodelPackage
