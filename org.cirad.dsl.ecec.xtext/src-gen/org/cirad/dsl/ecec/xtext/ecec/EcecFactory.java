/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage
 * @generated
 */
public interface EcecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EcecFactory eINSTANCE = org.cirad.dsl.ecec.xtext.ecec.impl.EcecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Space</em>'.
   * @generated
   */
  Space createSpace();

  /**
   * Returns a new object of class '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell</em>'.
   * @generated
   */
  Cell createCell();

  /**
   * Returns a new object of class '<em>Neighborhood Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neighborhood Expression</em>'.
   * @generated
   */
  NeighborhoodExpression createNeighborhoodExpression();

  /**
   * Returns a new object of class '<em>Agent Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent Entity</em>'.
   * @generated
   */
  AgentEntity createAgentEntity();

  /**
   * Returns a new object of class '<em>Spatial Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spatial Entity</em>'.
   * @generated
   */
  SpatialEntity createSpatialEntity();

  /**
   * Returns a new object of class '<em>Initial Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Location Type</em>'.
   * @generated
   */
  InitialLocationType createInitialLocationType();

  /**
   * Returns a new object of class '<em>Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behaviour</em>'.
   * @generated
   */
  Behaviour createBehaviour();

  /**
   * Returns a new object of class '<em>Behaviour Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behaviour Qualified Name</em>'.
   * @generated
   */
  BehaviourQualifiedName createBehaviourQualifiedName();

  /**
   * Returns a new object of class '<em>Parameter Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Qualified Name</em>'.
   * @generated
   */
  ParameterQualifiedName createParameterQualifiedName();

  /**
   * Returns a new object of class '<em>Function Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Qualified Name</em>'.
   * @generated
   */
  FunctionQualifiedName createFunctionQualifiedName();

  /**
   * Returns a new object of class '<em>Attribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribution</em>'.
   * @generated
   */
  Attribution createAttribution();

  /**
   * Returns a new object of class '<em>Attribution Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribution Type</em>'.
   * @generated
   */
  AttributionType createAttributionType();

  /**
   * Returns a new object of class '<em>Start Activity Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Activity Declaration</em>'.
   * @generated
   */
  StartActivityDeclaration createStartActivityDeclaration();

  /**
   * Returns a new object of class '<em>Finish Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Finish Activity</em>'.
   * @generated
   */
  FinishActivity createFinishActivity();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Execution Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execution Declaration</em>'.
   * @generated
   */
  ExecutionDeclaration createExecutionDeclaration();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>FLOAT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FLOAT</em>'.
   * @generated
   */
  FLOAT createFLOAT();

  /**
   * Returns a new object of class '<em>Algebric Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algebric Expression</em>'.
   * @generated
   */
  AlgebricExpression createAlgebricExpression();

  /**
   * Returns a new object of class '<em>Move Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Expression</em>'.
   * @generated
   */
  MoveExpression createMoveExpression();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Dimension Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Expression</em>'.
   * @generated
   */
  DimensionExpression createDimensionExpression();

  /**
   * Returns a new object of class '<em>Random Between Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Random Between Expression</em>'.
   * @generated
   */
  RandomBetweenExpression createRandomBetweenExpression();

  /**
   * Returns a new object of class '<em>Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Expression</em>'.
   * @generated
   */
  ParameterExpression createParameterExpression();

  /**
   * Returns a new object of class '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Expression</em>'.
   * @generated
   */
  FunctionExpression createFunctionExpression();

  /**
   * Returns a new object of class '<em>Dimensions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimensions</em>'.
   * @generated
   */
  Dimensions createDimensions();

  /**
   * Returns a new object of class '<em>Lenghts Units</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lenghts Units</em>'.
   * @generated
   */
  LenghtsUnits createLenghtsUnits();

  /**
   * Returns a new object of class '<em>Time Units</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Units</em>'.
   * @generated
   */
  TimeUnits createTimeUnits();

  /**
   * Returns a new object of class '<em>Mass Units</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mass Units</em>'.
   * @generated
   */
  MassUnits createMassUnits();

  /**
   * Returns a new object of class '<em>Temperature Units</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temperature Units</em>'.
   * @generated
   */
  TemperatureUnits createTemperatureUnits();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EcecPackage getEcecPackage();

} //EcecFactory
