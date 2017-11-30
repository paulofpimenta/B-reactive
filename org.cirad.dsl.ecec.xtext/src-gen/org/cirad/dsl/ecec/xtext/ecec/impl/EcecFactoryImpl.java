/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcecFactoryImpl extends EFactoryImpl implements EcecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EcecFactory init()
  {
    try
    {
      EcecFactory theEcecFactory = (EcecFactory)EPackage.Registry.INSTANCE.getEFactory(EcecPackage.eNS_URI);
      if (theEcecFactory != null)
      {
        return theEcecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EcecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EcecPackage.MODEL: return createModel();
      case EcecPackage.SPACE: return createSpace();
      case EcecPackage.CELL: return createCell();
      case EcecPackage.NEIGHBORHOOD_EXPRESSION: return createNeighborhoodExpression();
      case EcecPackage.AGENT_ENTITY: return createAgentEntity();
      case EcecPackage.SPATIAL_ENTITY: return createSpatialEntity();
      case EcecPackage.INITIAL_LOCATION_TYPE: return createInitialLocationType();
      case EcecPackage.BEHAVIOUR: return createBehaviour();
      case EcecPackage.BEHAVIOUR_QUALIFIED_NAME: return createBehaviourQualifiedName();
      case EcecPackage.PARAMETER_QUALIFIED_NAME: return createParameterQualifiedName();
      case EcecPackage.FUNCTION_QUALIFIED_NAME: return createFunctionQualifiedName();
      case EcecPackage.ATTRIBUTION: return createAttribution();
      case EcecPackage.ATTRIBUTION_TYPE: return createAttributionType();
      case EcecPackage.START_ACTIVITY_DECLARATION: return createStartActivityDeclaration();
      case EcecPackage.FINISH_ACTIVITY: return createFinishActivity();
      case EcecPackage.CONDITION: return createCondition();
      case EcecPackage.EXECUTION_DECLARATION: return createExecutionDeclaration();
      case EcecPackage.EXPRESSION: return createExpression();
      case EcecPackage.FLOAT: return createFLOAT();
      case EcecPackage.ALGEBRIC_EXPRESSION: return createAlgebricExpression();
      case EcecPackage.MOVE_EXPRESSION: return createMoveExpression();
      case EcecPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case EcecPackage.DIMENSION_EXPRESSION: return createDimensionExpression();
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION: return createRandomBetweenExpression();
      case EcecPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case EcecPackage.FUNCTION_EXPRESSION: return createFunctionExpression();
      case EcecPackage.DIMENSIONS: return createDimensions();
      case EcecPackage.LENGHTS_UNITS: return createLenghtsUnits();
      case EcecPackage.TIME_UNITS: return createTimeUnits();
      case EcecPackage.MASS_UNITS: return createMassUnits();
      case EcecPackage.TEMPERATURE_UNITS: return createTemperatureUnits();
      case EcecPackage.PLUS: return createPlus();
      case EcecPackage.MINUS: return createMinus();
      case EcecPackage.MULTI: return createMulti();
      case EcecPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EcecPackage.MATH_FUNCTIONS_ENUM:
        return createMathFunctionsEnumFromString(eDataType, initialValue);
      case EcecPackage.BOOLEAN_OPERATORS_ENUM:
        return createBooleanOperatorsEnumFromString(eDataType, initialValue);
      case EcecPackage.STAR_AND_END_EXP:
        return createStarAndEndExpFromString(eDataType, initialValue);
      case EcecPackage.STAR_AND_END_REDEF_EXP:
        return createStarAndEndRedefExpFromString(eDataType, initialValue);
      case EcecPackage.CONDITION_ENUM:
        return createConditionEnumFromString(eDataType, initialValue);
      case EcecPackage.EQUALITY:
        return createEqualityFromString(eDataType, initialValue);
      case EcecPackage.NEIGHBOURHOO_ENUM:
        return createNeighbourhooEnumFromString(eDataType, initialValue);
      case EcecPackage.TYPEOF_NEIGHBOURHOOD:
        return createTypeofNeighbourhoodFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EcecPackage.MATH_FUNCTIONS_ENUM:
        return convertMathFunctionsEnumToString(eDataType, instanceValue);
      case EcecPackage.BOOLEAN_OPERATORS_ENUM:
        return convertBooleanOperatorsEnumToString(eDataType, instanceValue);
      case EcecPackage.STAR_AND_END_EXP:
        return convertStarAndEndExpToString(eDataType, instanceValue);
      case EcecPackage.STAR_AND_END_REDEF_EXP:
        return convertStarAndEndRedefExpToString(eDataType, instanceValue);
      case EcecPackage.CONDITION_ENUM:
        return convertConditionEnumToString(eDataType, instanceValue);
      case EcecPackage.EQUALITY:
        return convertEqualityToString(eDataType, instanceValue);
      case EcecPackage.NEIGHBOURHOO_ENUM:
        return convertNeighbourhooEnumToString(eDataType, instanceValue);
      case EcecPackage.TYPEOF_NEIGHBOURHOOD:
        return convertTypeofNeighbourhoodToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space createSpace()
  {
    SpaceImpl space = new SpaceImpl();
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeighborhoodExpression createNeighborhoodExpression()
  {
    NeighborhoodExpressionImpl neighborhoodExpression = new NeighborhoodExpressionImpl();
    return neighborhoodExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentEntity createAgentEntity()
  {
    AgentEntityImpl agentEntity = new AgentEntityImpl();
    return agentEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpatialEntity createSpatialEntity()
  {
    SpatialEntityImpl spatialEntity = new SpatialEntityImpl();
    return spatialEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialLocationType createInitialLocationType()
  {
    InitialLocationTypeImpl initialLocationType = new InitialLocationTypeImpl();
    return initialLocationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behaviour createBehaviour()
  {
    BehaviourImpl behaviour = new BehaviourImpl();
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourQualifiedName createBehaviourQualifiedName()
  {
    BehaviourQualifiedNameImpl behaviourQualifiedName = new BehaviourQualifiedNameImpl();
    return behaviourQualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQualifiedName createParameterQualifiedName()
  {
    ParameterQualifiedNameImpl parameterQualifiedName = new ParameterQualifiedNameImpl();
    return parameterQualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionQualifiedName createFunctionQualifiedName()
  {
    FunctionQualifiedNameImpl functionQualifiedName = new FunctionQualifiedNameImpl();
    return functionQualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribution createAttribution()
  {
    AttributionImpl attribution = new AttributionImpl();
    return attribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributionType createAttributionType()
  {
    AttributionTypeImpl attributionType = new AttributionTypeImpl();
    return attributionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartActivityDeclaration createStartActivityDeclaration()
  {
    StartActivityDeclarationImpl startActivityDeclaration = new StartActivityDeclarationImpl();
    return startActivityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinishActivity createFinishActivity()
  {
    FinishActivityImpl finishActivity = new FinishActivityImpl();
    return finishActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutionDeclaration createExecutionDeclaration()
  {
    ExecutionDeclarationImpl executionDeclaration = new ExecutionDeclarationImpl();
    return executionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FLOAT createFLOAT()
  {
    FLOATImpl float_ = new FLOATImpl();
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgebricExpression createAlgebricExpression()
  {
    AlgebricExpressionImpl algebricExpression = new AlgebricExpressionImpl();
    return algebricExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveExpression createMoveExpression()
  {
    MoveExpressionImpl moveExpression = new MoveExpressionImpl();
    return moveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionExpression createDimensionExpression()
  {
    DimensionExpressionImpl dimensionExpression = new DimensionExpressionImpl();
    return dimensionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomBetweenExpression createRandomBetweenExpression()
  {
    RandomBetweenExpressionImpl randomBetweenExpression = new RandomBetweenExpressionImpl();
    return randomBetweenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression createParameterExpression()
  {
    ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
    return parameterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression createFunctionExpression()
  {
    FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
    return functionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimensions createDimensions()
  {
    DimensionsImpl dimensions = new DimensionsImpl();
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LenghtsUnits createLenghtsUnits()
  {
    LenghtsUnitsImpl lenghtsUnits = new LenghtsUnitsImpl();
    return lenghtsUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnits createTimeUnits()
  {
    TimeUnitsImpl timeUnits = new TimeUnitsImpl();
    return timeUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MassUnits createMassUnits()
  {
    MassUnitsImpl massUnits = new MassUnitsImpl();
    return massUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemperatureUnits createTemperatureUnits()
  {
    TemperatureUnitsImpl temperatureUnits = new TemperatureUnitsImpl();
    return temperatureUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFunctionsEnum createMathFunctionsEnumFromString(EDataType eDataType, String initialValue)
  {
    MathFunctionsEnum result = MathFunctionsEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMathFunctionsEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperatorsEnum createBooleanOperatorsEnumFromString(EDataType eDataType, String initialValue)
  {
    BooleanOperatorsEnum result = BooleanOperatorsEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanOperatorsEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StarAndEndExp createStarAndEndExpFromString(EDataType eDataType, String initialValue)
  {
    StarAndEndExp result = StarAndEndExp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStarAndEndExpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StarAndEndRedefExp createStarAndEndRedefExpFromString(EDataType eDataType, String initialValue)
  {
    StarAndEndRedefExp result = StarAndEndRedefExp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStarAndEndRedefExpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionEnum createConditionEnumFromString(EDataType eDataType, String initialValue)
  {
    ConditionEnum result = ConditionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConditionEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEqualityFromString(EDataType eDataType, String initialValue)
  {
    Equality result = Equality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEqualityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeighbourhooEnum createNeighbourhooEnumFromString(EDataType eDataType, String initialValue)
  {
    NeighbourhooEnum result = NeighbourhooEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNeighbourhooEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeofNeighbourhood createTypeofNeighbourhoodFromString(EDataType eDataType, String initialValue)
  {
    TypeofNeighbourhood result = TypeofNeighbourhood.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeofNeighbourhoodToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcecPackage getEcecPackage()
  {
    return (EcecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EcecPackage getPackage()
  {
    return EcecPackage.eINSTANCE;
  }

} //EcecFactoryImpl
