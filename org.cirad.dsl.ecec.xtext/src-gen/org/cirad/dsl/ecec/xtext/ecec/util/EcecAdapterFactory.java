/**
 */
package org.cirad.dsl.ecec.xtext.ecec.util;

import org.cirad.dsl.ecec.xtext.ecec.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage
 * @generated
 */
public class EcecAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EcecPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcecAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EcecPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcecSwitch<Adapter> modelSwitch =
    new EcecSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSpace(Space object)
      {
        return createSpaceAdapter();
      }
      @Override
      public Adapter caseCell(Cell object)
      {
        return createCellAdapter();
      }
      @Override
      public Adapter caseNeighborhoodExpression(NeighborhoodExpression object)
      {
        return createNeighborhoodExpressionAdapter();
      }
      @Override
      public Adapter caseAgentEntity(AgentEntity object)
      {
        return createAgentEntityAdapter();
      }
      @Override
      public Adapter caseSpatialEntity(SpatialEntity object)
      {
        return createSpatialEntityAdapter();
      }
      @Override
      public Adapter caseInitialLocationType(InitialLocationType object)
      {
        return createInitialLocationTypeAdapter();
      }
      @Override
      public Adapter caseBehaviour(Behaviour object)
      {
        return createBehaviourAdapter();
      }
      @Override
      public Adapter caseBehaviourQualifiedName(BehaviourQualifiedName object)
      {
        return createBehaviourQualifiedNameAdapter();
      }
      @Override
      public Adapter caseParameterQualifiedName(ParameterQualifiedName object)
      {
        return createParameterQualifiedNameAdapter();
      }
      @Override
      public Adapter caseFunctionQualifiedName(FunctionQualifiedName object)
      {
        return createFunctionQualifiedNameAdapter();
      }
      @Override
      public Adapter caseAttribution(Attribution object)
      {
        return createAttributionAdapter();
      }
      @Override
      public Adapter caseAttributionType(AttributionType object)
      {
        return createAttributionTypeAdapter();
      }
      @Override
      public Adapter caseStartActivityDeclaration(StartActivityDeclaration object)
      {
        return createStartActivityDeclarationAdapter();
      }
      @Override
      public Adapter caseFinishActivity(FinishActivity object)
      {
        return createFinishActivityAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseExecutionDeclaration(ExecutionDeclaration object)
      {
        return createExecutionDeclarationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFLOAT(FLOAT object)
      {
        return createFLOATAdapter();
      }
      @Override
      public Adapter caseAlgebricExpression(AlgebricExpression object)
      {
        return createAlgebricExpressionAdapter();
      }
      @Override
      public Adapter caseMoveExpression(MoveExpression object)
      {
        return createMoveExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseDimensionExpression(DimensionExpression object)
      {
        return createDimensionExpressionAdapter();
      }
      @Override
      public Adapter caseRandomBetweenExpression(RandomBetweenExpression object)
      {
        return createRandomBetweenExpressionAdapter();
      }
      @Override
      public Adapter caseParameterExpression(ParameterExpression object)
      {
        return createParameterExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionExpression(FunctionExpression object)
      {
        return createFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseDimensions(Dimensions object)
      {
        return createDimensionsAdapter();
      }
      @Override
      public Adapter caseLenghtsUnits(LenghtsUnits object)
      {
        return createLenghtsUnitsAdapter();
      }
      @Override
      public Adapter caseTimeUnits(TimeUnits object)
      {
        return createTimeUnitsAdapter();
      }
      @Override
      public Adapter caseMassUnits(MassUnits object)
      {
        return createMassUnitsAdapter();
      }
      @Override
      public Adapter caseTemperatureUnits(TemperatureUnits object)
      {
        return createTemperatureUnitsAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Space <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Space
   * @generated
   */
  public Adapter createSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Cell
   * @generated
   */
  public Adapter createCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression <em>Neighborhood Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression
   * @generated
   */
  public Adapter createNeighborhoodExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity <em>Agent Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.AgentEntity
   * @generated
   */
  public Adapter createAgentEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity <em>Spatial Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.SpatialEntity
   * @generated
   */
  public Adapter createSpatialEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.InitialLocationType <em>Initial Location Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.InitialLocationType
   * @generated
   */
  public Adapter createInitialLocationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Behaviour
   * @generated
   */
  public Adapter createBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName <em>Behaviour Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName
   * @generated
   */
  public Adapter createBehaviourQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName <em>Parameter Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName
   * @generated
   */
  public Adapter createParameterQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName <em>Function Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName
   * @generated
   */
  public Adapter createFunctionQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Attribution <em>Attribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Attribution
   * @generated
   */
  public Adapter createAttributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType <em>Attribution Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.AttributionType
   * @generated
   */
  public Adapter createAttributionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration <em>Start Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration
   * @generated
   */
  public Adapter createStartActivityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity <em>Finish Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.FinishActivity
   * @generated
   */
  public Adapter createFinishActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration <em>Execution Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration
   * @generated
   */
  public Adapter createExecutionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.FLOAT <em>FLOAT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.FLOAT
   * @generated
   */
  public Adapter createFLOATAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression <em>Algebric Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression
   * @generated
   */
  public Adapter createAlgebricExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.MoveExpression <em>Move Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.MoveExpression
   * @generated
   */
  public Adapter createMoveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.DimensionExpression <em>Dimension Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.DimensionExpression
   * @generated
   */
  public Adapter createDimensionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression <em>Random Between Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression
   * @generated
   */
  public Adapter createRandomBetweenExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.ParameterExpression
   * @generated
   */
  public Adapter createParameterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.FunctionExpression
   * @generated
   */
  public Adapter createFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Dimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Dimensions
   * @generated
   */
  public Adapter createDimensionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits <em>Lenghts Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits
   * @generated
   */
  public Adapter createLenghtsUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits <em>Time Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.TimeUnits
   * @generated
   */
  public Adapter createTimeUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.MassUnits <em>Mass Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.MassUnits
   * @generated
   */
  public Adapter createMassUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits <em>Temperature Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits
   * @generated
   */
  public Adapter createTemperatureUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cirad.dsl.ecec.xtext.ecec.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cirad.dsl.ecec.xtext.ecec.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EcecAdapterFactory
