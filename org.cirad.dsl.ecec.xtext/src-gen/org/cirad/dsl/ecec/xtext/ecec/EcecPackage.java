/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecFactory
 * @model kind="package"
 * @generated
 */
public interface EcecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ecec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cirad.org/dsl/ecec/xtext/Ecec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ecec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EcecPackage eINSTANCE = org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl.init();

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AGENT = 0;

  /**
   * The feature id for the '<em><b>Spatial Entity</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SPATIAL_ENTITY = 1;

  /**
   * The feature id for the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SPACE = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl <em>Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getSpace()
   * @generated
   */
  int SPACE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Numcells</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE__NUMCELLS = 1;

  /**
   * The feature id for the '<em><b>Typeneigh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE__TYPENEIGH = 2;

  /**
   * The number of structural features of the '<em>Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl <em>Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getCell()
   * @generated
   */
  int CELL = 2;

  /**
   * The feature id for the '<em><b>Occupiedbyspatial Entity</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__OCCUPIEDBYSPATIAL_ENTITY = 0;

  /**
   * The feature id for the '<em><b>Ocuppied</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__OCUPPIED = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__X = 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__Y = 3;

  /**
   * The feature id for the '<em><b>Occupiedby Agent Entity</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__OCCUPIEDBY_AGENT_ENTITY = 4;

  /**
   * The number of structural features of the '<em>Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.NeighborhoodExpressionImpl <em>Neighborhood Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.NeighborhoodExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getNeighborhoodExpression()
   * @generated
   */
  int NEIGHBORHOOD_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBORHOOD_EXPRESSION__N = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBORHOOD_EXPRESSION__A = 1;

  /**
   * The number of structural features of the '<em>Neighborhood Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBORHOOD_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl <em>Agent Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAgentEntity()
   * @generated
   */
  int AGENT_ENTITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Agent Numbers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__AGENT_NUMBERS = 1;

  /**
   * The feature id for the '<em><b>Initial Agent Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__INITIAL_AGENT_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Spatial Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__SPATIAL_ENTITY = 3;

  /**
   * The feature id for the '<em><b>Agentparameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__AGENTPARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Agentfunction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__AGENTFUNCTION = 5;

  /**
   * The feature id for the '<em><b>Agentbehaviourdefinition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY__AGENTBEHAVIOURDEFINITION = 6;

  /**
   * The number of structural features of the '<em>Agent Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ENTITY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getSpatialEntity()
   * @generated
   */
  int SPATIAL_ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__NUMBER = 1;

  /**
   * The feature id for the '<em><b>Locationtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__LOCATIONTYPE = 2;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__X = 3;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__Y = 4;

  /**
   * The feature id for the '<em><b>Gap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__GAP = 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__PARAMETERS = 6;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__FUNCTION = 7;

  /**
   * The feature id for the '<em><b>Behaviourdefinition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY__BEHAVIOURDEFINITION = 8;

  /**
   * The number of structural features of the '<em>Spatial Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPATIAL_ENTITY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.InitialLocationTypeImpl <em>Initial Location Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.InitialLocationTypeImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getInitialLocationType()
   * @generated
   */
  int INITIAL_LOCATION_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_LOCATION_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Initial Location Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_LOCATION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl <em>Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBehaviour()
   * @generated
   */
  int BEHAVIOUR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__NAME = 0;

  /**
   * The feature id for the '<em><b>Has Start</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__HAS_START = 1;

  /**
   * The feature id for the '<em><b>Has End</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__HAS_END = 2;

  /**
   * The feature id for the '<em><b>Has Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__HAS_CONDITION = 3;

  /**
   * The feature id for the '<em><b>Executes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__EXECUTES = 4;

  /**
   * The number of structural features of the '<em>Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourQualifiedNameImpl <em>Behaviour Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourQualifiedNameImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBehaviourQualifiedName()
   * @generated
   */
  int BEHAVIOUR_QUALIFIED_NAME = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_QUALIFIED_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Behaviour Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_QUALIFIED_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParameterQualifiedNameImpl <em>Parameter Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ParameterQualifiedNameImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getParameterQualifiedName()
   * @generated
   */
  int PARAMETER_QUALIFIED_NAME = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUALIFIED_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUALIFIED_NAME__A = 1;

  /**
   * The number of structural features of the '<em>Parameter Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUALIFIED_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionQualifiedNameImpl <em>Function Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.FunctionQualifiedNameImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFunctionQualifiedName()
   * @generated
   */
  int FUNCTION_QUALIFIED_NAME = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_QUALIFIED_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_QUALIFIED_NAME__A = 1;

  /**
   * The number of structural features of the '<em>Function Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_QUALIFIED_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionImpl <em>Attribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.AttributionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAttribution()
   * @generated
   */
  int ATTRIBUTION = 11;

  /**
   * The feature id for the '<em><b>Equality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION__EQUALITY = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Attribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl <em>Attribution Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAttributionType()
   * @generated
   */
  int ATTRIBUTION_TYPE = 12;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION_TYPE__P = 0;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION_TYPE__F = 1;

  /**
   * The number of structural features of the '<em>Attribution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityDeclarationImpl <em>Start Activity Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityDeclarationImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStartActivityDeclaration()
   * @generated
   */
  int START_ACTIVITY_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Saef</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_ACTIVITY_DECLARATION__SAEF = 0;

  /**
   * The feature id for the '<em><b>Be2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_ACTIVITY_DECLARATION__BE2 = 1;

  /**
   * The number of structural features of the '<em>Start Activity Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_ACTIVITY_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl <em>Finish Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFinishActivity()
   * @generated
   */
  int FINISH_ACTIVITY = 14;

  /**
   * The feature id for the '<em><b>Saef</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINISH_ACTIVITY__SAEF = 0;

  /**
   * The feature id for the '<em><b>Be2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINISH_ACTIVITY__BE2 = 1;

  /**
   * The number of structural features of the '<em>Finish Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINISH_ACTIVITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 15;

  /**
   * The feature id for the '<em><b>Ce</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CE = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__A = 1;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__M = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__N = 3;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl <em>Execution Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getExecutionDeclaration()
   * @generated
   */
  int EXECUTION_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_DECLARATION__A = 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_DECLARATION__ARG = 1;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_DECLARATION__M = 2;

  /**
   * The number of structural features of the '<em>Execution Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FLOATImpl <em>FLOAT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.FLOATImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFLOAT()
   * @generated
   */
  int FLOAT = 18;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FLOAT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AlgebricExpressionImpl <em>Algebric Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.AlgebricExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAlgebricExpression()
   * @generated
   */
  int ALGEBRIC_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGEBRIC_EXPRESSION__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGEBRIC_EXPRESSION__ARGS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGEBRIC_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Algebric Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGEBRIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl <em>Move Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMoveExpression()
   * @generated
   */
  int MOVE_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Move</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_EXPRESSION__MOVE = 1;

  /**
   * The number of structural features of the '<em>Move Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.BooleanExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DimensionExpressionImpl <em>Dimension Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.DimensionExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDimensionExpression()
   * @generated
   */
  int DIMENSION_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_EXPRESSION__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_EXPRESSION__D = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dimension Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl <em>Random Between Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getRandomBetweenExpression()
   * @generated
   */
  int RANDOM_BETWEEN_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__R = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__F = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>F1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__F1 = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>F2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__F2 = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>F3</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION__F3 = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Random Between Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_BETWEEN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.ParameterExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getParameterExpression()
   * @generated
   */
  int PARAMETER_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__EX = 1;

  /**
   * The number of structural features of the '<em>Parameter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.FunctionExpressionImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DimensionsImpl <em>Dimensions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.DimensionsImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDimensions()
   * @generated
   */
  int DIMENSIONS = 26;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__DIM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__NAME = 1;

  /**
   * The feature id for the '<em><b>Len</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__LEN = 2;

  /**
   * The feature id for the '<em><b>Dur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__DUR = 3;

  /**
   * The feature id for the '<em><b>Ma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__MA = 4;

  /**
   * The feature id for the '<em><b>Temp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS__TEMP = 5;

  /**
   * The number of structural features of the '<em>Dimensions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSIONS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.LenghtsUnitsImpl <em>Lenghts Units</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.LenghtsUnitsImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getLenghtsUnits()
   * @generated
   */
  int LENGHTS_UNITS = 27;

  /**
   * The feature id for the '<em><b>Kilometer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS__KILOMETER = 0;

  /**
   * The feature id for the '<em><b>Meter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS__METER = 1;

  /**
   * The feature id for the '<em><b>Miles</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS__MILES = 2;

  /**
   * The feature id for the '<em><b>Hectare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS__HECTARE = 3;

  /**
   * The feature id for the '<em><b>Squarekilometer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS__SQUAREKILOMETER = 4;

  /**
   * The number of structural features of the '<em>Lenghts Units</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHTS_UNITS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl <em>Time Units</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTimeUnits()
   * @generated
   */
  int TIME_UNITS = 28;

  /**
   * The feature id for the '<em><b>Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_UNITS__HOURS = 0;

  /**
   * The feature id for the '<em><b>Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_UNITS__MINUTES = 1;

  /**
   * The feature id for the '<em><b>Seconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_UNITS__SECONDS = 2;

  /**
   * The number of structural features of the '<em>Time Units</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_UNITS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl <em>Mass Units</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMassUnits()
   * @generated
   */
  int MASS_UNITS = 29;

  /**
   * The feature id for the '<em><b>Kilogram</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_UNITS__KILOGRAM = 0;

  /**
   * The feature id for the '<em><b>Gram</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_UNITS__GRAM = 1;

  /**
   * The feature id for the '<em><b>Pounds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_UNITS__POUNDS = 2;

  /**
   * The feature id for the '<em><b>Ounces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_UNITS__OUNCES = 3;

  /**
   * The number of structural features of the '<em>Mass Units</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_UNITS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.TemperatureUnitsImpl <em>Temperature Units</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.TemperatureUnitsImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTemperatureUnits()
   * @generated
   */
  int TEMPERATURE_UNITS = 30;

  /**
   * The feature id for the '<em><b>Celsius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPERATURE_UNITS__CELSIUS = 0;

  /**
   * The feature id for the '<em><b>Fahrenheit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPERATURE_UNITS__FAHRENHEIT = 1;

  /**
   * The number of structural features of the '<em>Temperature Units</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPERATURE_UNITS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.PlusImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 31;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.MinusImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 32;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.MultiImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 33;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.DivImpl
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDiv()
   * @generated
   */
  int DIV = 34;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__PARAMETERS = EXPRESSION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum <em>Math Functions Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMathFunctionsEnum()
   * @generated
   */
  int MATH_FUNCTIONS_ENUM = 35;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum <em>Boolean Operators Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBooleanOperatorsEnum()
   * @generated
   */
  int BOOLEAN_OPERATORS_ENUM = 36;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp <em>Star And End Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStarAndEndExp()
   * @generated
   */
  int STAR_AND_END_EXP = 37;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp <em>Star And End Redef Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStarAndEndRedefExp()
   * @generated
   */
  int STAR_AND_END_REDEF_EXP = 38;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.ConditionEnum <em>Condition Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.ConditionEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getConditionEnum()
   * @generated
   */
  int CONDITION_ENUM = 39;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.Equality <em>Equality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.Equality
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 40;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum <em>Neighbourhoo Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getNeighbourhooEnum()
   * @generated
   */
  int NEIGHBOURHOO_ENUM = 41;

  /**
   * The meta object id for the '{@link org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood <em>Typeof Neighbourhood</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood
   * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTypeofNeighbourhood()
   * @generated
   */
  int TYPEOF_NEIGHBOURHOOD = 42;


  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Model#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agent</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Model#getAgent()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Agent();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Model#getSpatialEntity <em>Spatial Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Spatial Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Model#getSpatialEntity()
   * @see #getModel()
   * @generated
   */
  EReference getModel_SpatialEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Model#getSpace <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Space</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Model#getSpace()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Space();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Space <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Space</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Space
   * @generated
   */
  EClass getSpace();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Space#getName()
   * @see #getSpace()
   * @generated
   */
  EAttribute getSpace_Name();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getNumcells <em>Numcells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numcells</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Space#getNumcells()
   * @see #getSpace()
   * @generated
   */
  EAttribute getSpace_Numcells();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getTypeneigh <em>Typeneigh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typeneigh</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Space#getTypeneigh()
   * @see #getSpace()
   * @generated
   */
  EAttribute getSpace_Typeneigh();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell
   * @generated
   */
  EClass getCell();

  /**
   * Returns the meta object for the reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyspatialEntity <em>Occupiedbyspatial Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Occupiedbyspatial Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyspatialEntity()
   * @see #getCell()
   * @generated
   */
  EReference getCell_OccupiedbyspatialEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOcuppied <em>Ocuppied</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ocuppied</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell#getOcuppied()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Ocuppied();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell#getX()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_X();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell#getY()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Y();

  /**
   * Returns the meta object for the reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyAgentEntity <em>Occupiedby Agent Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Occupiedby Agent Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyAgentEntity()
   * @see #getCell()
   * @generated
   */
  EReference getCell_OccupiedbyAgentEntity();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression <em>Neighborhood Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neighborhood Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression
   * @generated
   */
  EClass getNeighborhoodExpression();

  /**
   * Returns the meta object for the attribute list '{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>N</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getN()
   * @see #getNeighborhoodExpression()
   * @generated
   */
  EAttribute getNeighborhoodExpression_N();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getA()
   * @see #getNeighborhoodExpression()
   * @generated
   */
  EReference getNeighborhoodExpression_A();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity <em>Agent Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity
   * @generated
   */
  EClass getAgentEntity();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getName()
   * @see #getAgentEntity()
   * @generated
   */
  EAttribute getAgentEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentNumbers <em>Agent Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Agent Numbers</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentNumbers()
   * @see #getAgentEntity()
   * @generated
   */
  EAttribute getAgentEntity_AgentNumbers();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getInitialAgentLocation <em>Initial Agent Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Agent Location</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getInitialAgentLocation()
   * @see #getAgentEntity()
   * @generated
   */
  EReference getAgentEntity_InitialAgentLocation();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getSpatialEntity <em>Spatial Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Spatial Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getSpatialEntity()
   * @see #getAgentEntity()
   * @generated
   */
  EReference getAgentEntity_SpatialEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentparameters <em>Agentparameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agentparameters</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentparameters()
   * @see #getAgentEntity()
   * @generated
   */
  EReference getAgentEntity_Agentparameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentfunction <em>Agentfunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agentfunction</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentfunction()
   * @see #getAgentEntity()
   * @generated
   */
  EReference getAgentEntity_Agentfunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentbehaviourdefinition <em>Agentbehaviourdefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agentbehaviourdefinition</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentbehaviourdefinition()
   * @see #getAgentEntity()
   * @generated
   */
  EReference getAgentEntity_Agentbehaviourdefinition();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity <em>Spatial Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spatial Entity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity
   * @generated
   */
  EClass getSpatialEntity();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getName()
   * @see #getSpatialEntity()
   * @generated
   */
  EAttribute getSpatialEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getNumber()
   * @see #getSpatialEntity()
   * @generated
   */
  EAttribute getSpatialEntity_Number();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getLocationtype <em>Locationtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Locationtype</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getLocationtype()
   * @see #getSpatialEntity()
   * @generated
   */
  EReference getSpatialEntity_Locationtype();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getX()
   * @see #getSpatialEntity()
   * @generated
   */
  EAttribute getSpatialEntity_X();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getY()
   * @see #getSpatialEntity()
   * @generated
   */
  EAttribute getSpatialEntity_Y();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getGap <em>Gap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gap</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getGap()
   * @see #getSpatialEntity()
   * @generated
   */
  EAttribute getSpatialEntity_Gap();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getParameters()
   * @see #getSpatialEntity()
   * @generated
   */
  EReference getSpatialEntity_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getFunction()
   * @see #getSpatialEntity()
   * @generated
   */
  EReference getSpatialEntity_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getBehaviourdefinition <em>Behaviourdefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviourdefinition</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getBehaviourdefinition()
   * @see #getSpatialEntity()
   * @generated
   */
  EReference getSpatialEntity_Behaviourdefinition();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.InitialLocationType <em>Initial Location Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Location Type</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.InitialLocationType
   * @generated
   */
  EClass getInitialLocationType();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.InitialLocationType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.InitialLocationType#getName()
   * @see #getInitialLocationType()
   * @generated
   */
  EAttribute getInitialLocationType_Name();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behaviour</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour
   * @generated
   */
  EClass getBehaviour();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour#getName()
   * @see #getBehaviour()
   * @generated
   */
  EAttribute getBehaviour_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasStart <em>Has Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Start</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasStart()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_HasStart();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasEnd <em>Has End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has End</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasEnd()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_HasEnd();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasCondition <em>Has Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Condition</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasCondition()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_HasCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getExecutes <em>Executes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Executes</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour#getExecutes()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_Executes();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName <em>Behaviour Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behaviour Qualified Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName
   * @generated
   */
  EClass getBehaviourQualifiedName();

  /**
   * Returns the meta object for the reference list '{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName#getName()
   * @see #getBehaviourQualifiedName()
   * @generated
   */
  EReference getBehaviourQualifiedName_Name();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName <em>Parameter Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Qualified Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName
   * @generated
   */
  EClass getParameterQualifiedName();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getName()
   * @see #getParameterQualifiedName()
   * @generated
   */
  EReference getParameterQualifiedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getA()
   * @see #getParameterQualifiedName()
   * @generated
   */
  EReference getParameterQualifiedName_A();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName <em>Function Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Qualified Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName
   * @generated
   */
  EClass getFunctionQualifiedName();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getName()
   * @see #getFunctionQualifiedName()
   * @generated
   */
  EReference getFunctionQualifiedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getA()
   * @see #getFunctionQualifiedName()
   * @generated
   */
  EReference getFunctionQualifiedName_A();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Attribution <em>Attribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribution</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Attribution
   * @generated
   */
  EClass getAttribution();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Attribution#getEquality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equality</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Attribution#getEquality()
   * @see #getAttribution()
   * @generated
   */
  EAttribute getAttribution_Equality();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Attribution#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Attribution#getExpression()
   * @see #getAttribution()
   * @generated
   */
  EReference getAttribution_Expression();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType <em>Attribution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribution Type</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AttributionType
   * @generated
   */
  EClass getAttributionType();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AttributionType#getP()
   * @see #getAttributionType()
   * @generated
   */
  EReference getAttributionType_P();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AttributionType#getF()
   * @see #getAttributionType()
   * @generated
   */
  EReference getAttributionType_F();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration <em>Start Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Activity Declaration</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration
   * @generated
   */
  EClass getStartActivityDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration#getSaef <em>Saef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Saef</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration#getSaef()
   * @see #getStartActivityDeclaration()
   * @generated
   */
  EAttribute getStartActivityDeclaration_Saef();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration#getBe2 <em>Be2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Be2</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration#getBe2()
   * @see #getStartActivityDeclaration()
   * @generated
   */
  EReference getStartActivityDeclaration_Be2();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity <em>Finish Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Finish Activity</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FinishActivity
   * @generated
   */
  EClass getFinishActivity();

  /**
   * Returns the meta object for the attribute list '{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getSaef <em>Saef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Saef</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getSaef()
   * @see #getFinishActivity()
   * @generated
   */
  EAttribute getFinishActivity_Saef();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getBe2 <em>Be2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Be2</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getBe2()
   * @see #getFinishActivity()
   * @generated
   */
  EReference getFinishActivity_Be2();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute list '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ce</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition#getCe()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Ce();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition#getA()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_A();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>M</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition#getM()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_M();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition#getN()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_N();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration <em>Execution Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execution Declaration</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration
   * @generated
   */
  EClass getExecutionDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getA()
   * @see #getExecutionDeclaration()
   * @generated
   */
  EReference getExecutionDeclaration_A();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getArg()
   * @see #getExecutionDeclaration()
   * @generated
   */
  EReference getExecutionDeclaration_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>M</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getM()
   * @see #getExecutionDeclaration()
   * @generated
   */
  EReference getExecutionDeclaration_M();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.Expression#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameters</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Expression#getParameters()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Parameters();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.FLOAT <em>FLOAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FLOAT</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FLOAT
   * @generated
   */
  EClass getFLOAT();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.FLOAT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FLOAT#getValue()
   * @see #getFLOAT()
   * @generated
   */
  EAttribute getFLOAT_Value();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression <em>Algebric Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Algebric Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression
   * @generated
   */
  EClass getAlgebricExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArgs()
   * @see #getAlgebricExpression()
   * @generated
   */
  EReference getAlgebricExpression_Args();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arg</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArg()
   * @see #getAlgebricExpression()
   * @generated
   */
  EReference getAlgebricExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.MoveExpression <em>Move Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MoveExpression
   * @generated
   */
  EClass getMoveExpression();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.MoveExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MoveExpression#getName()
   * @see #getMoveExpression()
   * @generated
   */
  EAttribute getMoveExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.MoveExpression#getMove <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Move</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MoveExpression#getMove()
   * @see #getMoveExpression()
   * @generated
   */
  EReference getMoveExpression_Move();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanExpression#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.BooleanExpression#isValue()
   * @see #getBooleanExpression()
   * @generated
   */
  EAttribute getBooleanExpression_Value();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.DimensionExpression <em>Dimension Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.DimensionExpression
   * @generated
   */
  EClass getDimensionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.DimensionExpression#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.DimensionExpression#getD()
   * @see #getDimensionExpression()
   * @generated
   */
  EReference getDimensionExpression_D();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression <em>Random Between Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Between Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression
   * @generated
   */
  EClass getRandomBetweenExpression();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getR()
   * @see #getRandomBetweenExpression()
   * @generated
   */
  EAttribute getRandomBetweenExpression_R();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF()
   * @see #getRandomBetweenExpression()
   * @generated
   */
  EReference getRandomBetweenExpression_F();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF1 <em>F1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>F1</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF1()
   * @see #getRandomBetweenExpression()
   * @generated
   */
  EReference getRandomBetweenExpression_F1();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF2 <em>F2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F2</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF2()
   * @see #getRandomBetweenExpression()
   * @generated
   */
  EReference getRandomBetweenExpression_F2();

  /**
   * Returns the meta object for the reference '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF3 <em>F3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>F3</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF3()
   * @see #getRandomBetweenExpression()
   * @generated
   */
  EReference getRandomBetweenExpression_F3();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterExpression
   * @generated
   */
  EClass getParameterExpression();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterExpression#getName()
   * @see #getParameterExpression()
   * @generated
   */
  EAttribute getParameterExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterExpression#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterExpression#getEx()
   * @see #getParameterExpression()
   * @generated
   */
  EReference getParameterExpression_Ex();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Expression</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionExpression
   * @generated
   */
  EClass getFunctionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionExpression#getName()
   * @see #getFunctionExpression()
   * @generated
   */
  EAttribute getFunctionExpression_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionExpression#getRight()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Right();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimensions</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions
   * @generated
   */
  EClass getDimensions();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dim</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getDim()
   * @see #getDimensions()
   * @generated
   */
  EAttribute getDimensions_Dim();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getName()
   * @see #getDimensions()
   * @generated
   */
  EReference getDimensions_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getLen <em>Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Len</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getLen()
   * @see #getDimensions()
   * @generated
   */
  EReference getDimensions_Len();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getDur <em>Dur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dur</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getDur()
   * @see #getDimensions()
   * @generated
   */
  EReference getDimensions_Dur();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getMa <em>Ma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ma</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getMa()
   * @see #getDimensions()
   * @generated
   */
  EReference getDimensions_Ma();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions#getTemp <em>Temp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Temp</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions#getTemp()
   * @see #getDimensions()
   * @generated
   */
  EReference getDimensions_Temp();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits <em>Lenghts Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lenghts Units</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits
   * @generated
   */
  EClass getLenghtsUnits();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getKilometer <em>Kilometer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kilometer</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getKilometer()
   * @see #getLenghtsUnits()
   * @generated
   */
  EAttribute getLenghtsUnits_Kilometer();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getMeter <em>Meter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meter</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getMeter()
   * @see #getLenghtsUnits()
   * @generated
   */
  EAttribute getLenghtsUnits_Meter();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getMiles <em>Miles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miles</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getMiles()
   * @see #getLenghtsUnits()
   * @generated
   */
  EAttribute getLenghtsUnits_Miles();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getHectare <em>Hectare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hectare</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getHectare()
   * @see #getLenghtsUnits()
   * @generated
   */
  EAttribute getLenghtsUnits_Hectare();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getSquarekilometer <em>Squarekilometer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Squarekilometer</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits#getSquarekilometer()
   * @see #getLenghtsUnits()
   * @generated
   */
  EAttribute getLenghtsUnits_Squarekilometer();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits <em>Time Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Units</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TimeUnits
   * @generated
   */
  EClass getTimeUnits();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getHours <em>Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hours</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getHours()
   * @see #getTimeUnits()
   * @generated
   */
  EAttribute getTimeUnits_Hours();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getMinutes <em>Minutes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutes</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getMinutes()
   * @see #getTimeUnits()
   * @generated
   */
  EAttribute getTimeUnits_Minutes();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getSeconds <em>Seconds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seconds</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getSeconds()
   * @see #getTimeUnits()
   * @generated
   */
  EAttribute getTimeUnits_Seconds();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits <em>Mass Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mass Units</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits
   * @generated
   */
  EClass getMassUnits();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits#getKilogram <em>Kilogram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kilogram</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits#getKilogram()
   * @see #getMassUnits()
   * @generated
   */
  EAttribute getMassUnits_Kilogram();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits#getGram <em>Gram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gram</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits#getGram()
   * @see #getMassUnits()
   * @generated
   */
  EAttribute getMassUnits_Gram();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits#getPounds <em>Pounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pounds</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits#getPounds()
   * @see #getMassUnits()
   * @generated
   */
  EAttribute getMassUnits_Pounds();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits#getOunces <em>Ounces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ounces</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits#getOunces()
   * @see #getMassUnits()
   * @generated
   */
  EAttribute getMassUnits_Ounces();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits <em>Temperature Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temperature Units</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits
   * @generated
   */
  EClass getTemperatureUnits();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getCelsius <em>Celsius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Celsius</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getCelsius()
   * @see #getTemperatureUnits()
   * @generated
   */
  EAttribute getTemperatureUnits_Celsius();

  /**
   * Returns the meta object for the attribute '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getFahrenheit <em>Fahrenheit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fahrenheit</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getFahrenheit()
   * @see #getTemperatureUnits()
   * @generated
   */
  EAttribute getTemperatureUnits_Fahrenheit();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.cirad.dsl.ecec.xtext.ecec.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cirad.dsl.ecec.xtext.ecec.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum <em>Math Functions Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Math Functions Enum</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum
   * @generated
   */
  EEnum getMathFunctionsEnum();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum <em>Boolean Operators Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Operators Enum</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum
   * @generated
   */
  EEnum getBooleanOperatorsEnum();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp <em>Star And End Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Star And End Exp</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp
   * @generated
   */
  EEnum getStarAndEndExp();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp <em>Star And End Redef Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Star And End Redef Exp</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp
   * @generated
   */
  EEnum getStarAndEndRedefExp();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.ConditionEnum <em>Condition Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Condition Enum</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.ConditionEnum
   * @generated
   */
  EEnum getConditionEnum();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Equality</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.Equality
   * @generated
   */
  EEnum getEquality();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum <em>Neighbourhoo Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Neighbourhoo Enum</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum
   * @generated
   */
  EEnum getNeighbourhooEnum();

  /**
   * Returns the meta object for enum '{@link org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood <em>Typeof Neighbourhood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Typeof Neighbourhood</em>'.
   * @see org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood
   * @generated
   */
  EEnum getTypeofNeighbourhood();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EcecFactory getEcecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AGENT = eINSTANCE.getModel_Agent();

    /**
     * The meta object literal for the '<em><b>Spatial Entity</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SPATIAL_ENTITY = eINSTANCE.getModel_SpatialEntity();

    /**
     * The meta object literal for the '<em><b>Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SPACE = eINSTANCE.getModel_Space();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl <em>Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getSpace()
     * @generated
     */
    EClass SPACE = eINSTANCE.getSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE__NAME = eINSTANCE.getSpace_Name();

    /**
     * The meta object literal for the '<em><b>Numcells</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE__NUMCELLS = eINSTANCE.getSpace_Numcells();

    /**
     * The meta object literal for the '<em><b>Typeneigh</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE__TYPENEIGH = eINSTANCE.getSpace_Typeneigh();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl <em>Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getCell()
     * @generated
     */
    EClass CELL = eINSTANCE.getCell();

    /**
     * The meta object literal for the '<em><b>Occupiedbyspatial Entity</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__OCCUPIEDBYSPATIAL_ENTITY = eINSTANCE.getCell_OccupiedbyspatialEntity();

    /**
     * The meta object literal for the '<em><b>Ocuppied</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__OCUPPIED = eINSTANCE.getCell_Ocuppied();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__X = eINSTANCE.getCell_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__Y = eINSTANCE.getCell_Y();

    /**
     * The meta object literal for the '<em><b>Occupiedby Agent Entity</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__OCCUPIEDBY_AGENT_ENTITY = eINSTANCE.getCell_OccupiedbyAgentEntity();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.NeighborhoodExpressionImpl <em>Neighborhood Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.NeighborhoodExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getNeighborhoodExpression()
     * @generated
     */
    EClass NEIGHBORHOOD_EXPRESSION = eINSTANCE.getNeighborhoodExpression();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEIGHBORHOOD_EXPRESSION__N = eINSTANCE.getNeighborhoodExpression_N();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEIGHBORHOOD_EXPRESSION__A = eINSTANCE.getNeighborhoodExpression_A();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl <em>Agent Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAgentEntity()
     * @generated
     */
    EClass AGENT_ENTITY = eINSTANCE.getAgentEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_ENTITY__NAME = eINSTANCE.getAgentEntity_Name();

    /**
     * The meta object literal for the '<em><b>Agent Numbers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_ENTITY__AGENT_NUMBERS = eINSTANCE.getAgentEntity_AgentNumbers();

    /**
     * The meta object literal for the '<em><b>Initial Agent Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_ENTITY__INITIAL_AGENT_LOCATION = eINSTANCE.getAgentEntity_InitialAgentLocation();

    /**
     * The meta object literal for the '<em><b>Spatial Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_ENTITY__SPATIAL_ENTITY = eINSTANCE.getAgentEntity_SpatialEntity();

    /**
     * The meta object literal for the '<em><b>Agentparameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_ENTITY__AGENTPARAMETERS = eINSTANCE.getAgentEntity_Agentparameters();

    /**
     * The meta object literal for the '<em><b>Agentfunction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_ENTITY__AGENTFUNCTION = eINSTANCE.getAgentEntity_Agentfunction();

    /**
     * The meta object literal for the '<em><b>Agentbehaviourdefinition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_ENTITY__AGENTBEHAVIOURDEFINITION = eINSTANCE.getAgentEntity_Agentbehaviourdefinition();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getSpatialEntity()
     * @generated
     */
    EClass SPATIAL_ENTITY = eINSTANCE.getSpatialEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPATIAL_ENTITY__NAME = eINSTANCE.getSpatialEntity_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPATIAL_ENTITY__NUMBER = eINSTANCE.getSpatialEntity_Number();

    /**
     * The meta object literal for the '<em><b>Locationtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPATIAL_ENTITY__LOCATIONTYPE = eINSTANCE.getSpatialEntity_Locationtype();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPATIAL_ENTITY__X = eINSTANCE.getSpatialEntity_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPATIAL_ENTITY__Y = eINSTANCE.getSpatialEntity_Y();

    /**
     * The meta object literal for the '<em><b>Gap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPATIAL_ENTITY__GAP = eINSTANCE.getSpatialEntity_Gap();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPATIAL_ENTITY__PARAMETERS = eINSTANCE.getSpatialEntity_Parameters();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPATIAL_ENTITY__FUNCTION = eINSTANCE.getSpatialEntity_Function();

    /**
     * The meta object literal for the '<em><b>Behaviourdefinition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPATIAL_ENTITY__BEHAVIOURDEFINITION = eINSTANCE.getSpatialEntity_Behaviourdefinition();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.InitialLocationTypeImpl <em>Initial Location Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.InitialLocationTypeImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getInitialLocationType()
     * @generated
     */
    EClass INITIAL_LOCATION_TYPE = eINSTANCE.getInitialLocationType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL_LOCATION_TYPE__NAME = eINSTANCE.getInitialLocationType_Name();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl <em>Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBehaviour()
     * @generated
     */
    EClass BEHAVIOUR = eINSTANCE.getBehaviour();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOUR__NAME = eINSTANCE.getBehaviour_Name();

    /**
     * The meta object literal for the '<em><b>Has Start</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__HAS_START = eINSTANCE.getBehaviour_HasStart();

    /**
     * The meta object literal for the '<em><b>Has End</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__HAS_END = eINSTANCE.getBehaviour_HasEnd();

    /**
     * The meta object literal for the '<em><b>Has Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__HAS_CONDITION = eINSTANCE.getBehaviour_HasCondition();

    /**
     * The meta object literal for the '<em><b>Executes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__EXECUTES = eINSTANCE.getBehaviour_Executes();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourQualifiedNameImpl <em>Behaviour Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourQualifiedNameImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBehaviourQualifiedName()
     * @generated
     */
    EClass BEHAVIOUR_QUALIFIED_NAME = eINSTANCE.getBehaviourQualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR_QUALIFIED_NAME__NAME = eINSTANCE.getBehaviourQualifiedName_Name();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParameterQualifiedNameImpl <em>Parameter Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ParameterQualifiedNameImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getParameterQualifiedName()
     * @generated
     */
    EClass PARAMETER_QUALIFIED_NAME = eINSTANCE.getParameterQualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_QUALIFIED_NAME__NAME = eINSTANCE.getParameterQualifiedName_Name();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_QUALIFIED_NAME__A = eINSTANCE.getParameterQualifiedName_A();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionQualifiedNameImpl <em>Function Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.FunctionQualifiedNameImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFunctionQualifiedName()
     * @generated
     */
    EClass FUNCTION_QUALIFIED_NAME = eINSTANCE.getFunctionQualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_QUALIFIED_NAME__NAME = eINSTANCE.getFunctionQualifiedName_Name();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_QUALIFIED_NAME__A = eINSTANCE.getFunctionQualifiedName_A();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionImpl <em>Attribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.AttributionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAttribution()
     * @generated
     */
    EClass ATTRIBUTION = eINSTANCE.getAttribution();

    /**
     * The meta object literal for the '<em><b>Equality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTION__EQUALITY = eINSTANCE.getAttribution_Equality();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTION__EXPRESSION = eINSTANCE.getAttribution_Expression();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl <em>Attribution Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAttributionType()
     * @generated
     */
    EClass ATTRIBUTION_TYPE = eINSTANCE.getAttributionType();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTION_TYPE__P = eINSTANCE.getAttributionType_P();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTION_TYPE__F = eINSTANCE.getAttributionType_F();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityDeclarationImpl <em>Start Activity Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityDeclarationImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStartActivityDeclaration()
     * @generated
     */
    EClass START_ACTIVITY_DECLARATION = eINSTANCE.getStartActivityDeclaration();

    /**
     * The meta object literal for the '<em><b>Saef</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_ACTIVITY_DECLARATION__SAEF = eINSTANCE.getStartActivityDeclaration_Saef();

    /**
     * The meta object literal for the '<em><b>Be2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_ACTIVITY_DECLARATION__BE2 = eINSTANCE.getStartActivityDeclaration_Be2();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl <em>Finish Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFinishActivity()
     * @generated
     */
    EClass FINISH_ACTIVITY = eINSTANCE.getFinishActivity();

    /**
     * The meta object literal for the '<em><b>Saef</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FINISH_ACTIVITY__SAEF = eINSTANCE.getFinishActivity_Saef();

    /**
     * The meta object literal for the '<em><b>Be2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINISH_ACTIVITY__BE2 = eINSTANCE.getFinishActivity_Be2();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__CE = eINSTANCE.getCondition_Ce();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__A = eINSTANCE.getCondition_A();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__M = eINSTANCE.getCondition_M();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__N = eINSTANCE.getCondition_N();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl <em>Execution Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getExecutionDeclaration()
     * @generated
     */
    EClass EXECUTION_DECLARATION = eINSTANCE.getExecutionDeclaration();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION_DECLARATION__A = eINSTANCE.getExecutionDeclaration_A();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION_DECLARATION__ARG = eINSTANCE.getExecutionDeclaration_Arg();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION_DECLARATION__M = eINSTANCE.getExecutionDeclaration_M();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PARAMETERS = eINSTANCE.getExpression_Parameters();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FLOATImpl <em>FLOAT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.FLOATImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFLOAT()
     * @generated
     */
    EClass FLOAT = eINSTANCE.getFLOAT();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT__VALUE = eINSTANCE.getFLOAT_Value();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.AlgebricExpressionImpl <em>Algebric Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.AlgebricExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getAlgebricExpression()
     * @generated
     */
    EClass ALGEBRIC_EXPRESSION = eINSTANCE.getAlgebricExpression();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALGEBRIC_EXPRESSION__ARGS = eINSTANCE.getAlgebricExpression_Args();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALGEBRIC_EXPRESSION__ARG = eINSTANCE.getAlgebricExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl <em>Move Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMoveExpression()
     * @generated
     */
    EClass MOVE_EXPRESSION = eINSTANCE.getMoveExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE_EXPRESSION__NAME = eINSTANCE.getMoveExpression_Name();

    /**
     * The meta object literal for the '<em><b>Move</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE_EXPRESSION__MOVE = eINSTANCE.getMoveExpression_Move();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.BooleanExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DimensionExpressionImpl <em>Dimension Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.DimensionExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDimensionExpression()
     * @generated
     */
    EClass DIMENSION_EXPRESSION = eINSTANCE.getDimensionExpression();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION_EXPRESSION__D = eINSTANCE.getDimensionExpression_D();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl <em>Random Between Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getRandomBetweenExpression()
     * @generated
     */
    EClass RANDOM_BETWEEN_EXPRESSION = eINSTANCE.getRandomBetweenExpression();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_BETWEEN_EXPRESSION__R = eINSTANCE.getRandomBetweenExpression_R();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_BETWEEN_EXPRESSION__F = eINSTANCE.getRandomBetweenExpression_F();

    /**
     * The meta object literal for the '<em><b>F1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_BETWEEN_EXPRESSION__F1 = eINSTANCE.getRandomBetweenExpression_F1();

    /**
     * The meta object literal for the '<em><b>F2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_BETWEEN_EXPRESSION__F2 = eINSTANCE.getRandomBetweenExpression_F2();

    /**
     * The meta object literal for the '<em><b>F3</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_BETWEEN_EXPRESSION__F3 = eINSTANCE.getRandomBetweenExpression_F3();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.ParameterExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getParameterExpression()
     * @generated
     */
    EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_EXPRESSION__NAME = eINSTANCE.getParameterExpression_Name();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_EXPRESSION__EX = eINSTANCE.getParameterExpression_Ex();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.FunctionExpressionImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getFunctionExpression()
     * @generated
     */
    EClass FUNCTION_EXPRESSION = eINSTANCE.getFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_EXPRESSION__NAME = eINSTANCE.getFunctionExpression_Name();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__RIGHT = eINSTANCE.getFunctionExpression_Right();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DimensionsImpl <em>Dimensions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.DimensionsImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDimensions()
     * @generated
     */
    EClass DIMENSIONS = eINSTANCE.getDimensions();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSIONS__DIM = eINSTANCE.getDimensions_Dim();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSIONS__NAME = eINSTANCE.getDimensions_Name();

    /**
     * The meta object literal for the '<em><b>Len</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSIONS__LEN = eINSTANCE.getDimensions_Len();

    /**
     * The meta object literal for the '<em><b>Dur</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSIONS__DUR = eINSTANCE.getDimensions_Dur();

    /**
     * The meta object literal for the '<em><b>Ma</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSIONS__MA = eINSTANCE.getDimensions_Ma();

    /**
     * The meta object literal for the '<em><b>Temp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSIONS__TEMP = eINSTANCE.getDimensions_Temp();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.LenghtsUnitsImpl <em>Lenghts Units</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.LenghtsUnitsImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getLenghtsUnits()
     * @generated
     */
    EClass LENGHTS_UNITS = eINSTANCE.getLenghtsUnits();

    /**
     * The meta object literal for the '<em><b>Kilometer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHTS_UNITS__KILOMETER = eINSTANCE.getLenghtsUnits_Kilometer();

    /**
     * The meta object literal for the '<em><b>Meter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHTS_UNITS__METER = eINSTANCE.getLenghtsUnits_Meter();

    /**
     * The meta object literal for the '<em><b>Miles</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHTS_UNITS__MILES = eINSTANCE.getLenghtsUnits_Miles();

    /**
     * The meta object literal for the '<em><b>Hectare</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHTS_UNITS__HECTARE = eINSTANCE.getLenghtsUnits_Hectare();

    /**
     * The meta object literal for the '<em><b>Squarekilometer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHTS_UNITS__SQUAREKILOMETER = eINSTANCE.getLenghtsUnits_Squarekilometer();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl <em>Time Units</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTimeUnits()
     * @generated
     */
    EClass TIME_UNITS = eINSTANCE.getTimeUnits();

    /**
     * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_UNITS__HOURS = eINSTANCE.getTimeUnits_Hours();

    /**
     * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_UNITS__MINUTES = eINSTANCE.getTimeUnits_Minutes();

    /**
     * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_UNITS__SECONDS = eINSTANCE.getTimeUnits_Seconds();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl <em>Mass Units</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMassUnits()
     * @generated
     */
    EClass MASS_UNITS = eINSTANCE.getMassUnits();

    /**
     * The meta object literal for the '<em><b>Kilogram</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS_UNITS__KILOGRAM = eINSTANCE.getMassUnits_Kilogram();

    /**
     * The meta object literal for the '<em><b>Gram</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS_UNITS__GRAM = eINSTANCE.getMassUnits_Gram();

    /**
     * The meta object literal for the '<em><b>Pounds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS_UNITS__POUNDS = eINSTANCE.getMassUnits_Pounds();

    /**
     * The meta object literal for the '<em><b>Ounces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS_UNITS__OUNCES = eINSTANCE.getMassUnits_Ounces();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.TemperatureUnitsImpl <em>Temperature Units</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.TemperatureUnitsImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTemperatureUnits()
     * @generated
     */
    EClass TEMPERATURE_UNITS = eINSTANCE.getTemperatureUnits();

    /**
     * The meta object literal for the '<em><b>Celsius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPERATURE_UNITS__CELSIUS = eINSTANCE.getTemperatureUnits_Celsius();

    /**
     * The meta object literal for the '<em><b>Fahrenheit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPERATURE_UNITS__FAHRENHEIT = eINSTANCE.getTemperatureUnits_Fahrenheit();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.PlusImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.MinusImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.MultiImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.DivImpl
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum <em>Math Functions Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getMathFunctionsEnum()
     * @generated
     */
    EEnum MATH_FUNCTIONS_ENUM = eINSTANCE.getMathFunctionsEnum();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum <em>Boolean Operators Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getBooleanOperatorsEnum()
     * @generated
     */
    EEnum BOOLEAN_OPERATORS_ENUM = eINSTANCE.getBooleanOperatorsEnum();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp <em>Star And End Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStarAndEndExp()
     * @generated
     */
    EEnum STAR_AND_END_EXP = eINSTANCE.getStarAndEndExp();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp <em>Star And End Redef Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getStarAndEndRedefExp()
     * @generated
     */
    EEnum STAR_AND_END_REDEF_EXP = eINSTANCE.getStarAndEndRedefExp();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.ConditionEnum <em>Condition Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.ConditionEnum
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getConditionEnum()
     * @generated
     */
    EEnum CONDITION_ENUM = eINSTANCE.getConditionEnum();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.Equality <em>Equality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.Equality
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getEquality()
     * @generated
     */
    EEnum EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum <em>Neighbourhoo Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getNeighbourhooEnum()
     * @generated
     */
    EEnum NEIGHBOURHOO_ENUM = eINSTANCE.getNeighbourhooEnum();

    /**
     * The meta object literal for the '{@link org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood <em>Typeof Neighbourhood</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood
     * @see org.cirad.dsl.ecec.xtext.ecec.impl.EcecPackageImpl#getTypeofNeighbourhood()
     * @generated
     */
    EEnum TYPEOF_NEIGHBOURHOOD = eINSTANCE.getTypeofNeighbourhood();

  }

} //EcecPackage
