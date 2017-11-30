/**
 */
package org.cirad.dsl.ecec.xtext.ecec.util;

import org.cirad.dsl.ecec.xtext.ecec.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage
 * @generated
 */
public class EcecSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EcecPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcecSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EcecPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EcecPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.SPACE:
      {
        Space space = (Space)theEObject;
        T result = caseSpace(space);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.CELL:
      {
        Cell cell = (Cell)theEObject;
        T result = caseCell(cell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.NEIGHBORHOOD_EXPRESSION:
      {
        NeighborhoodExpression neighborhoodExpression = (NeighborhoodExpression)theEObject;
        T result = caseNeighborhoodExpression(neighborhoodExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.AGENT_ENTITY:
      {
        AgentEntity agentEntity = (AgentEntity)theEObject;
        T result = caseAgentEntity(agentEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.SPATIAL_ENTITY:
      {
        SpatialEntity spatialEntity = (SpatialEntity)theEObject;
        T result = caseSpatialEntity(spatialEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.INITIAL_LOCATION_TYPE:
      {
        InitialLocationType initialLocationType = (InitialLocationType)theEObject;
        T result = caseInitialLocationType(initialLocationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.BEHAVIOUR:
      {
        Behaviour behaviour = (Behaviour)theEObject;
        T result = caseBehaviour(behaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.BEHAVIOUR_QUALIFIED_NAME:
      {
        BehaviourQualifiedName behaviourQualifiedName = (BehaviourQualifiedName)theEObject;
        T result = caseBehaviourQualifiedName(behaviourQualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.PARAMETER_QUALIFIED_NAME:
      {
        ParameterQualifiedName parameterQualifiedName = (ParameterQualifiedName)theEObject;
        T result = caseParameterQualifiedName(parameterQualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.FUNCTION_QUALIFIED_NAME:
      {
        FunctionQualifiedName functionQualifiedName = (FunctionQualifiedName)theEObject;
        T result = caseFunctionQualifiedName(functionQualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.ATTRIBUTION:
      {
        Attribution attribution = (Attribution)theEObject;
        T result = caseAttribution(attribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.ATTRIBUTION_TYPE:
      {
        AttributionType attributionType = (AttributionType)theEObject;
        T result = caseAttributionType(attributionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.START_ACTIVITY_DECLARATION:
      {
        StartActivityDeclaration startActivityDeclaration = (StartActivityDeclaration)theEObject;
        T result = caseStartActivityDeclaration(startActivityDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.FINISH_ACTIVITY:
      {
        FinishActivity finishActivity = (FinishActivity)theEObject;
        T result = caseFinishActivity(finishActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.EXECUTION_DECLARATION:
      {
        ExecutionDeclaration executionDeclaration = (ExecutionDeclaration)theEObject;
        T result = caseExecutionDeclaration(executionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.FLOAT:
      {
        FLOAT float_ = (FLOAT)theEObject;
        T result = caseFLOAT(float_);
        if (result == null) result = caseExpression(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.ALGEBRIC_EXPRESSION:
      {
        AlgebricExpression algebricExpression = (AlgebricExpression)theEObject;
        T result = caseAlgebricExpression(algebricExpression);
        if (result == null) result = caseExpression(algebricExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.MOVE_EXPRESSION:
      {
        MoveExpression moveExpression = (MoveExpression)theEObject;
        T result = caseMoveExpression(moveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.DIMENSION_EXPRESSION:
      {
        DimensionExpression dimensionExpression = (DimensionExpression)theEObject;
        T result = caseDimensionExpression(dimensionExpression);
        if (result == null) result = caseExpression(dimensionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION:
      {
        RandomBetweenExpression randomBetweenExpression = (RandomBetweenExpression)theEObject;
        T result = caseRandomBetweenExpression(randomBetweenExpression);
        if (result == null) result = caseExpression(randomBetweenExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.PARAMETER_EXPRESSION:
      {
        ParameterExpression parameterExpression = (ParameterExpression)theEObject;
        T result = caseParameterExpression(parameterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.FUNCTION_EXPRESSION:
      {
        FunctionExpression functionExpression = (FunctionExpression)theEObject;
        T result = caseFunctionExpression(functionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.DIMENSIONS:
      {
        Dimensions dimensions = (Dimensions)theEObject;
        T result = caseDimensions(dimensions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.LENGHTS_UNITS:
      {
        LenghtsUnits lenghtsUnits = (LenghtsUnits)theEObject;
        T result = caseLenghtsUnits(lenghtsUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.TIME_UNITS:
      {
        TimeUnits timeUnits = (TimeUnits)theEObject;
        T result = caseTimeUnits(timeUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.MASS_UNITS:
      {
        MassUnits massUnits = (MassUnits)theEObject;
        T result = caseMassUnits(massUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.TEMPERATURE_UNITS:
      {
        TemperatureUnits temperatureUnits = (TemperatureUnits)theEObject;
        T result = caseTemperatureUnits(temperatureUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcecPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpace(Space object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCell(Cell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neighborhood Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neighborhood Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeighborhoodExpression(NeighborhoodExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentEntity(AgentEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spatial Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spatial Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpatialEntity(SpatialEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Location Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Location Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialLocationType(InitialLocationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviour(Behaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behaviour Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behaviour Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviourQualifiedName(BehaviourQualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterQualifiedName(ParameterQualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionQualifiedName(FunctionQualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribution(Attribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributionType(AttributionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Activity Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Activity Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartActivityDeclaration(StartActivityDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Finish Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Finish Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinishActivity(FinishActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionDeclaration(ExecutionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFLOAT(FLOAT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algebric Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algebric Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgebricExpression(AlgebricExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveExpression(MoveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionExpression(DimensionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Random Between Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Random Between Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRandomBetweenExpression(RandomBetweenExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterExpression(ParameterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionExpression(FunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimensions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimensions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensions(Dimensions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lenghts Units</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lenghts Units</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLenghtsUnits(LenghtsUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Units</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Units</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeUnits(TimeUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mass Units</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass Units</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMassUnits(MassUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temperature Units</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temperature Units</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemperatureUnits(TemperatureUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EcecSwitch
