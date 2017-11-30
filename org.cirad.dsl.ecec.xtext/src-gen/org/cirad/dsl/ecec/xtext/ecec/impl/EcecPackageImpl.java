/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.AgentEntity;
import org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression;
import org.cirad.dsl.ecec.xtext.ecec.Attribution;
import org.cirad.dsl.ecec.xtext.ecec.AttributionType;
import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.BooleanExpression;
import org.cirad.dsl.ecec.xtext.ecec.BooleanOperatorsEnum;
import org.cirad.dsl.ecec.xtext.ecec.Cell;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.ConditionEnum;
import org.cirad.dsl.ecec.xtext.ecec.DimensionExpression;
import org.cirad.dsl.ecec.xtext.ecec.Dimensions;
import org.cirad.dsl.ecec.xtext.ecec.Div;
import org.cirad.dsl.ecec.xtext.ecec.EcecFactory;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Equality;
import org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.InitialLocationType;
import org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits;
import org.cirad.dsl.ecec.xtext.ecec.MassUnits;
import org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum;
import org.cirad.dsl.ecec.xtext.ecec.Minus;
import org.cirad.dsl.ecec.xtext.ecec.Model;
import org.cirad.dsl.ecec.xtext.ecec.MoveExpression;
import org.cirad.dsl.ecec.xtext.ecec.Multi;
import org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression;
import org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum;
import org.cirad.dsl.ecec.xtext.ecec.ParameterExpression;
import org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.Plus;
import org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression;
import org.cirad.dsl.ecec.xtext.ecec.Space;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;
import org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp;
import org.cirad.dsl.ecec.xtext.ecec.StarAndEndRedefExp;
import org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits;
import org.cirad.dsl.ecec.xtext.ecec.TimeUnits;
import org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcecPackageImpl extends EPackageImpl implements EcecPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neighborhoodExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spatialEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialLocationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviourQualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterQualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionQualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startActivityDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finishActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass algebricExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass randomBetweenExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lenghtsUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass massUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass temperatureUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mathFunctionsEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanOperatorsEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum starAndEndExpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum starAndEndRedefExpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conditionEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum equalityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum neighbourhooEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeofNeighbourhoodEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EcecPackageImpl()
  {
    super(eNS_URI, EcecFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EcecPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EcecPackage init()
  {
    if (isInited) return (EcecPackage)EPackage.Registry.INSTANCE.getEPackage(EcecPackage.eNS_URI);

    // Obtain or create and register package
    EcecPackageImpl theEcecPackage = (EcecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcecPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEcecPackage.createPackageContents();

    // Initialize created meta-data
    theEcecPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEcecPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EcecPackage.eNS_URI, theEcecPackage);
    return theEcecPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Agent()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_SpatialEntity()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Space()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpace()
  {
    return spaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpace_Name()
  {
    return (EAttribute)spaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpace_Numcells()
  {
    return (EAttribute)spaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpace_Typeneigh()
  {
    return (EAttribute)spaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCell()
  {
    return cellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCell_OccupiedbyspatialEntity()
  {
    return (EReference)cellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCell_Ocuppied()
  {
    return (EReference)cellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCell_X()
  {
    return (EAttribute)cellEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCell_Y()
  {
    return (EAttribute)cellEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCell_OccupiedbyAgentEntity()
  {
    return (EReference)cellEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeighborhoodExpression()
  {
    return neighborhoodExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeighborhoodExpression_N()
  {
    return (EAttribute)neighborhoodExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNeighborhoodExpression_A()
  {
    return (EReference)neighborhoodExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAgentEntity()
  {
    return agentEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgentEntity_Name()
  {
    return (EAttribute)agentEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgentEntity_AgentNumbers()
  {
    return (EAttribute)agentEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentEntity_InitialAgentLocation()
  {
    return (EReference)agentEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentEntity_SpatialEntity()
  {
    return (EReference)agentEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentEntity_Agentparameters()
  {
    return (EReference)agentEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentEntity_Agentfunction()
  {
    return (EReference)agentEntityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentEntity_Agentbehaviourdefinition()
  {
    return (EReference)agentEntityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpatialEntity()
  {
    return spatialEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpatialEntity_Name()
  {
    return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpatialEntity_Number()
  {
    return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpatialEntity_Locationtype()
  {
    return (EReference)spatialEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpatialEntity_X()
  {
    return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpatialEntity_Y()
  {
    return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpatialEntity_Gap()
  {
    return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpatialEntity_Parameters()
  {
    return (EReference)spatialEntityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpatialEntity_Function()
  {
    return (EReference)spatialEntityEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpatialEntity_Behaviourdefinition()
  {
    return (EReference)spatialEntityEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialLocationType()
  {
    return initialLocationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitialLocationType_Name()
  {
    return (EAttribute)initialLocationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviour()
  {
    return behaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehaviour_Name()
  {
    return (EAttribute)behaviourEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviour_HasStart()
  {
    return (EReference)behaviourEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviour_HasEnd()
  {
    return (EReference)behaviourEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviour_HasCondition()
  {
    return (EReference)behaviourEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviour_Executes()
  {
    return (EReference)behaviourEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviourQualifiedName()
  {
    return behaviourQualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviourQualifiedName_Name()
  {
    return (EReference)behaviourQualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterQualifiedName()
  {
    return parameterQualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterQualifiedName_Name()
  {
    return (EReference)parameterQualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterQualifiedName_A()
  {
    return (EReference)parameterQualifiedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionQualifiedName()
  {
    return functionQualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionQualifiedName_Name()
  {
    return (EReference)functionQualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionQualifiedName_A()
  {
    return (EReference)functionQualifiedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribution()
  {
    return attributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribution_Equality()
  {
    return (EAttribute)attributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribution_Expression()
  {
    return (EReference)attributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributionType()
  {
    return attributionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributionType_P()
  {
    return (EReference)attributionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributionType_F()
  {
    return (EReference)attributionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartActivityDeclaration()
  {
    return startActivityDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStartActivityDeclaration_Saef()
  {
    return (EAttribute)startActivityDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartActivityDeclaration_Be2()
  {
    return (EReference)startActivityDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinishActivity()
  {
    return finishActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFinishActivity_Saef()
  {
    return (EAttribute)finishActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFinishActivity_Be2()
  {
    return (EReference)finishActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Ce()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_A()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_M()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_N()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecutionDeclaration()
  {
    return executionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutionDeclaration_A()
  {
    return (EReference)executionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutionDeclaration_Arg()
  {
    return (EReference)executionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutionDeclaration_M()
  {
    return (EReference)executionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Parameters()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFLOAT()
  {
    return floatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFLOAT_Value()
  {
    return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlgebricExpression()
  {
    return algebricExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgebricExpression_Args()
  {
    return (EReference)algebricExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgebricExpression_Arg()
  {
    return (EReference)algebricExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoveExpression()
  {
    return moveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoveExpression_Name()
  {
    return (EAttribute)moveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoveExpression_Move()
  {
    return (EReference)moveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpression_Value()
  {
    return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionExpression()
  {
    return dimensionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionExpression_D()
  {
    return (EReference)dimensionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRandomBetweenExpression()
  {
    return randomBetweenExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomBetweenExpression_R()
  {
    return (EAttribute)randomBetweenExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomBetweenExpression_F()
  {
    return (EReference)randomBetweenExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomBetweenExpression_F1()
  {
    return (EReference)randomBetweenExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomBetweenExpression_F2()
  {
    return (EReference)randomBetweenExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomBetweenExpression_F3()
  {
    return (EReference)randomBetweenExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterExpression()
  {
    return parameterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterExpression_Name()
  {
    return (EAttribute)parameterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterExpression_Ex()
  {
    return (EReference)parameterExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionExpression()
  {
    return functionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionExpression_Name()
  {
    return (EAttribute)functionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionExpression_Right()
  {
    return (EReference)functionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensions()
  {
    return dimensionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensions_Dim()
  {
    return (EAttribute)dimensionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensions_Name()
  {
    return (EReference)dimensionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensions_Len()
  {
    return (EReference)dimensionsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensions_Dur()
  {
    return (EReference)dimensionsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensions_Ma()
  {
    return (EReference)dimensionsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensions_Temp()
  {
    return (EReference)dimensionsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLenghtsUnits()
  {
    return lenghtsUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLenghtsUnits_Kilometer()
  {
    return (EAttribute)lenghtsUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLenghtsUnits_Meter()
  {
    return (EAttribute)lenghtsUnitsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLenghtsUnits_Miles()
  {
    return (EAttribute)lenghtsUnitsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLenghtsUnits_Hectare()
  {
    return (EAttribute)lenghtsUnitsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLenghtsUnits_Squarekilometer()
  {
    return (EAttribute)lenghtsUnitsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeUnits()
  {
    return timeUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeUnits_Hours()
  {
    return (EAttribute)timeUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeUnits_Minutes()
  {
    return (EAttribute)timeUnitsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeUnits_Seconds()
  {
    return (EAttribute)timeUnitsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMassUnits()
  {
    return massUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMassUnits_Kilogram()
  {
    return (EAttribute)massUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMassUnits_Gram()
  {
    return (EAttribute)massUnitsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMassUnits_Pounds()
  {
    return (EAttribute)massUnitsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMassUnits_Ounces()
  {
    return (EAttribute)massUnitsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemperatureUnits()
  {
    return temperatureUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemperatureUnits_Celsius()
  {
    return (EAttribute)temperatureUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemperatureUnits_Fahrenheit()
  {
    return (EAttribute)temperatureUnitsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulti()
  {
    return multiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Left()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Right()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Left()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Right()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMathFunctionsEnum()
  {
    return mathFunctionsEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanOperatorsEnum()
  {
    return booleanOperatorsEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStarAndEndExp()
  {
    return starAndEndExpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStarAndEndRedefExp()
  {
    return starAndEndRedefExpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConditionEnum()
  {
    return conditionEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEquality()
  {
    return equalityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNeighbourhooEnum()
  {
    return neighbourhooEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeofNeighbourhood()
  {
    return typeofNeighbourhoodEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcecFactory getEcecFactory()
  {
    return (EcecFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__AGENT);
    createEReference(modelEClass, MODEL__SPATIAL_ENTITY);
    createEReference(modelEClass, MODEL__SPACE);

    spaceEClass = createEClass(SPACE);
    createEAttribute(spaceEClass, SPACE__NAME);
    createEAttribute(spaceEClass, SPACE__NUMCELLS);
    createEAttribute(spaceEClass, SPACE__TYPENEIGH);

    cellEClass = createEClass(CELL);
    createEReference(cellEClass, CELL__OCCUPIEDBYSPATIAL_ENTITY);
    createEReference(cellEClass, CELL__OCUPPIED);
    createEAttribute(cellEClass, CELL__X);
    createEAttribute(cellEClass, CELL__Y);
    createEReference(cellEClass, CELL__OCCUPIEDBY_AGENT_ENTITY);

    neighborhoodExpressionEClass = createEClass(NEIGHBORHOOD_EXPRESSION);
    createEAttribute(neighborhoodExpressionEClass, NEIGHBORHOOD_EXPRESSION__N);
    createEReference(neighborhoodExpressionEClass, NEIGHBORHOOD_EXPRESSION__A);

    agentEntityEClass = createEClass(AGENT_ENTITY);
    createEAttribute(agentEntityEClass, AGENT_ENTITY__NAME);
    createEAttribute(agentEntityEClass, AGENT_ENTITY__AGENT_NUMBERS);
    createEReference(agentEntityEClass, AGENT_ENTITY__INITIAL_AGENT_LOCATION);
    createEReference(agentEntityEClass, AGENT_ENTITY__SPATIAL_ENTITY);
    createEReference(agentEntityEClass, AGENT_ENTITY__AGENTPARAMETERS);
    createEReference(agentEntityEClass, AGENT_ENTITY__AGENTFUNCTION);
    createEReference(agentEntityEClass, AGENT_ENTITY__AGENTBEHAVIOURDEFINITION);

    spatialEntityEClass = createEClass(SPATIAL_ENTITY);
    createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__NAME);
    createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__NUMBER);
    createEReference(spatialEntityEClass, SPATIAL_ENTITY__LOCATIONTYPE);
    createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__X);
    createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__Y);
    createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__GAP);
    createEReference(spatialEntityEClass, SPATIAL_ENTITY__PARAMETERS);
    createEReference(spatialEntityEClass, SPATIAL_ENTITY__FUNCTION);
    createEReference(spatialEntityEClass, SPATIAL_ENTITY__BEHAVIOURDEFINITION);

    initialLocationTypeEClass = createEClass(INITIAL_LOCATION_TYPE);
    createEAttribute(initialLocationTypeEClass, INITIAL_LOCATION_TYPE__NAME);

    behaviourEClass = createEClass(BEHAVIOUR);
    createEAttribute(behaviourEClass, BEHAVIOUR__NAME);
    createEReference(behaviourEClass, BEHAVIOUR__HAS_START);
    createEReference(behaviourEClass, BEHAVIOUR__HAS_END);
    createEReference(behaviourEClass, BEHAVIOUR__HAS_CONDITION);
    createEReference(behaviourEClass, BEHAVIOUR__EXECUTES);

    behaviourQualifiedNameEClass = createEClass(BEHAVIOUR_QUALIFIED_NAME);
    createEReference(behaviourQualifiedNameEClass, BEHAVIOUR_QUALIFIED_NAME__NAME);

    parameterQualifiedNameEClass = createEClass(PARAMETER_QUALIFIED_NAME);
    createEReference(parameterQualifiedNameEClass, PARAMETER_QUALIFIED_NAME__NAME);
    createEReference(parameterQualifiedNameEClass, PARAMETER_QUALIFIED_NAME__A);

    functionQualifiedNameEClass = createEClass(FUNCTION_QUALIFIED_NAME);
    createEReference(functionQualifiedNameEClass, FUNCTION_QUALIFIED_NAME__NAME);
    createEReference(functionQualifiedNameEClass, FUNCTION_QUALIFIED_NAME__A);

    attributionEClass = createEClass(ATTRIBUTION);
    createEAttribute(attributionEClass, ATTRIBUTION__EQUALITY);
    createEReference(attributionEClass, ATTRIBUTION__EXPRESSION);

    attributionTypeEClass = createEClass(ATTRIBUTION_TYPE);
    createEReference(attributionTypeEClass, ATTRIBUTION_TYPE__P);
    createEReference(attributionTypeEClass, ATTRIBUTION_TYPE__F);

    startActivityDeclarationEClass = createEClass(START_ACTIVITY_DECLARATION);
    createEAttribute(startActivityDeclarationEClass, START_ACTIVITY_DECLARATION__SAEF);
    createEReference(startActivityDeclarationEClass, START_ACTIVITY_DECLARATION__BE2);

    finishActivityEClass = createEClass(FINISH_ACTIVITY);
    createEAttribute(finishActivityEClass, FINISH_ACTIVITY__SAEF);
    createEReference(finishActivityEClass, FINISH_ACTIVITY__BE2);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__CE);
    createEReference(conditionEClass, CONDITION__A);
    createEReference(conditionEClass, CONDITION__M);
    createEReference(conditionEClass, CONDITION__N);

    executionDeclarationEClass = createEClass(EXECUTION_DECLARATION);
    createEReference(executionDeclarationEClass, EXECUTION_DECLARATION__A);
    createEReference(executionDeclarationEClass, EXECUTION_DECLARATION__ARG);
    createEReference(executionDeclarationEClass, EXECUTION_DECLARATION__M);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__PARAMETERS);

    floatEClass = createEClass(FLOAT);
    createEAttribute(floatEClass, FLOAT__VALUE);

    algebricExpressionEClass = createEClass(ALGEBRIC_EXPRESSION);
    createEReference(algebricExpressionEClass, ALGEBRIC_EXPRESSION__ARGS);
    createEReference(algebricExpressionEClass, ALGEBRIC_EXPRESSION__ARG);

    moveExpressionEClass = createEClass(MOVE_EXPRESSION);
    createEAttribute(moveExpressionEClass, MOVE_EXPRESSION__NAME);
    createEReference(moveExpressionEClass, MOVE_EXPRESSION__MOVE);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
    createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__VALUE);

    dimensionExpressionEClass = createEClass(DIMENSION_EXPRESSION);
    createEReference(dimensionExpressionEClass, DIMENSION_EXPRESSION__D);

    randomBetweenExpressionEClass = createEClass(RANDOM_BETWEEN_EXPRESSION);
    createEAttribute(randomBetweenExpressionEClass, RANDOM_BETWEEN_EXPRESSION__R);
    createEReference(randomBetweenExpressionEClass, RANDOM_BETWEEN_EXPRESSION__F);
    createEReference(randomBetweenExpressionEClass, RANDOM_BETWEEN_EXPRESSION__F1);
    createEReference(randomBetweenExpressionEClass, RANDOM_BETWEEN_EXPRESSION__F2);
    createEReference(randomBetweenExpressionEClass, RANDOM_BETWEEN_EXPRESSION__F3);

    parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);
    createEAttribute(parameterExpressionEClass, PARAMETER_EXPRESSION__NAME);
    createEReference(parameterExpressionEClass, PARAMETER_EXPRESSION__EX);

    functionExpressionEClass = createEClass(FUNCTION_EXPRESSION);
    createEAttribute(functionExpressionEClass, FUNCTION_EXPRESSION__NAME);
    createEReference(functionExpressionEClass, FUNCTION_EXPRESSION__RIGHT);

    dimensionsEClass = createEClass(DIMENSIONS);
    createEAttribute(dimensionsEClass, DIMENSIONS__DIM);
    createEReference(dimensionsEClass, DIMENSIONS__NAME);
    createEReference(dimensionsEClass, DIMENSIONS__LEN);
    createEReference(dimensionsEClass, DIMENSIONS__DUR);
    createEReference(dimensionsEClass, DIMENSIONS__MA);
    createEReference(dimensionsEClass, DIMENSIONS__TEMP);

    lenghtsUnitsEClass = createEClass(LENGHTS_UNITS);
    createEAttribute(lenghtsUnitsEClass, LENGHTS_UNITS__KILOMETER);
    createEAttribute(lenghtsUnitsEClass, LENGHTS_UNITS__METER);
    createEAttribute(lenghtsUnitsEClass, LENGHTS_UNITS__MILES);
    createEAttribute(lenghtsUnitsEClass, LENGHTS_UNITS__HECTARE);
    createEAttribute(lenghtsUnitsEClass, LENGHTS_UNITS__SQUAREKILOMETER);

    timeUnitsEClass = createEClass(TIME_UNITS);
    createEAttribute(timeUnitsEClass, TIME_UNITS__HOURS);
    createEAttribute(timeUnitsEClass, TIME_UNITS__MINUTES);
    createEAttribute(timeUnitsEClass, TIME_UNITS__SECONDS);

    massUnitsEClass = createEClass(MASS_UNITS);
    createEAttribute(massUnitsEClass, MASS_UNITS__KILOGRAM);
    createEAttribute(massUnitsEClass, MASS_UNITS__GRAM);
    createEAttribute(massUnitsEClass, MASS_UNITS__POUNDS);
    createEAttribute(massUnitsEClass, MASS_UNITS__OUNCES);

    temperatureUnitsEClass = createEClass(TEMPERATURE_UNITS);
    createEAttribute(temperatureUnitsEClass, TEMPERATURE_UNITS__CELSIUS);
    createEAttribute(temperatureUnitsEClass, TEMPERATURE_UNITS__FAHRENHEIT);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    multiEClass = createEClass(MULTI);
    createEReference(multiEClass, MULTI__LEFT);
    createEReference(multiEClass, MULTI__RIGHT);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__LEFT);
    createEReference(divEClass, DIV__RIGHT);

    // Create enums
    mathFunctionsEnumEEnum = createEEnum(MATH_FUNCTIONS_ENUM);
    booleanOperatorsEnumEEnum = createEEnum(BOOLEAN_OPERATORS_ENUM);
    starAndEndExpEEnum = createEEnum(STAR_AND_END_EXP);
    starAndEndRedefExpEEnum = createEEnum(STAR_AND_END_REDEF_EXP);
    conditionEnumEEnum = createEEnum(CONDITION_ENUM);
    equalityEEnum = createEEnum(EQUALITY);
    neighbourhooEnumEEnum = createEEnum(NEIGHBOURHOO_ENUM);
    typeofNeighbourhoodEEnum = createEEnum(TYPEOF_NEIGHBOURHOOD);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    floatEClass.getESuperTypes().add(this.getExpression());
    algebricExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanExpressionEClass.getESuperTypes().add(this.getExpression());
    dimensionExpressionEClass.getESuperTypes().add(this.getExpression());
    randomBetweenExpressionEClass.getESuperTypes().add(this.getExpression());
    plusEClass.getESuperTypes().add(this.getExpression());
    minusEClass.getESuperTypes().add(this.getExpression());
    multiEClass.getESuperTypes().add(this.getExpression());
    divEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Agent(), this.getAgentEntity(), null, "agent", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_SpatialEntity(), this.getSpatialEntity(), null, "spatialEntity", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Space(), this.getSpace(), null, "space", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spaceEClass, Space.class, "Space", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpace_Numcells(), ecorePackage.getEInt(), "numcells", null, 0, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpace_Typeneigh(), this.getTypeofNeighbourhood(), "typeneigh", null, 0, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCell_OccupiedbyspatialEntity(), this.getSpatialEntity(), null, "occupiedbyspatialEntity", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCell_Ocuppied(), this.getBooleanExpression(), null, "ocuppied", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCell_X(), ecorePackage.getEInt(), "x", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCell_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCell_OccupiedbyAgentEntity(), this.getAgentEntity(), null, "occupiedbyAgentEntity", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neighborhoodExpressionEClass, NeighborhoodExpression.class, "NeighborhoodExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNeighborhoodExpression_N(), this.getNeighbourhooEnum(), "n", null, 0, -1, NeighborhoodExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNeighborhoodExpression_A(), this.getAttributionType(), null, "a", null, 0, 1, NeighborhoodExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentEntityEClass, AgentEntity.class, "AgentEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAgentEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAgentEntity_AgentNumbers(), ecorePackage.getEInt(), "agentNumbers", null, 0, 1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentEntity_InitialAgentLocation(), this.getInitialLocationType(), null, "initialAgentLocation", null, 0, 1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentEntity_SpatialEntity(), this.getSpatialEntity(), null, "spatialEntity", null, 0, 1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentEntity_Agentparameters(), ecorePackage.getEObject(), null, "agentparameters", null, 0, -1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentEntity_Agentfunction(), this.getFunctionExpression(), null, "agentfunction", null, 0, -1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentEntity_Agentbehaviourdefinition(), this.getBehaviour(), null, "agentbehaviourdefinition", null, 0, -1, AgentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spatialEntityEClass, SpatialEntity.class, "SpatialEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpatialEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpatialEntity_Number(), ecorePackage.getEInt(), "number", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpatialEntity_Locationtype(), this.getInitialLocationType(), null, "locationtype", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpatialEntity_X(), ecorePackage.getEInt(), "X", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpatialEntity_Y(), ecorePackage.getEInt(), "Y", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpatialEntity_Gap(), ecorePackage.getEInt(), "gap", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpatialEntity_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpatialEntity_Function(), this.getFunctionExpression(), null, "function", null, 0, -1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpatialEntity_Behaviourdefinition(), this.getBehaviour(), null, "behaviourdefinition", null, 0, -1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialLocationTypeEClass, InitialLocationType.class, "InitialLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitialLocationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitialLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviourEClass, Behaviour.class, "Behaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBehaviour_Name(), ecorePackage.getEString(), "name", null, 0, 1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviour_HasStart(), this.getStartActivityDeclaration(), null, "hasStart", null, 0, -1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviour_HasEnd(), this.getFinishActivity(), null, "hasEnd", null, 0, -1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviour_HasCondition(), this.getCondition(), null, "hasCondition", null, 0, -1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviour_Executes(), this.getExecutionDeclaration(), null, "executes", null, 0, -1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviourQualifiedNameEClass, BehaviourQualifiedName.class, "BehaviourQualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehaviourQualifiedName_Name(), this.getBehaviour(), null, "name", null, 0, -1, BehaviourQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterQualifiedNameEClass, ParameterQualifiedName.class, "ParameterQualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterQualifiedName_Name(), this.getParameterExpression(), null, "name", null, 0, 1, ParameterQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterQualifiedName_A(), this.getAttribution(), null, "a", null, 0, 1, ParameterQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionQualifiedNameEClass, FunctionQualifiedName.class, "FunctionQualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionQualifiedName_Name(), this.getFunctionExpression(), null, "name", null, 0, 1, FunctionQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionQualifiedName_A(), this.getAttribution(), null, "a", null, 0, 1, FunctionQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributionEClass, Attribution.class, "Attribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribution_Equality(), this.getEquality(), "equality", null, 0, 1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribution_Expression(), this.getExpression(), null, "expression", null, 0, 1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributionTypeEClass, AttributionType.class, "AttributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributionType_P(), this.getParameterQualifiedName(), null, "p", null, 0, 1, AttributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributionType_F(), this.getFunctionQualifiedName(), null, "f", null, 0, 1, AttributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startActivityDeclarationEClass, StartActivityDeclaration.class, "StartActivityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStartActivityDeclaration_Saef(), this.getStarAndEndExp(), "saef", null, 0, -1, StartActivityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStartActivityDeclaration_Be2(), this.getBehaviourQualifiedName(), null, "be2", null, 0, -1, StartActivityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(finishActivityEClass, FinishActivity.class, "FinishActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFinishActivity_Saef(), this.getStarAndEndExp(), "saef", null, 0, -1, FinishActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinishActivity_Be2(), this.getBehaviourQualifiedName(), null, "be2", null, 0, -1, FinishActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_Ce(), this.getConditionEnum(), "ce", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_A(), this.getAttributionType(), null, "a", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_M(), this.getCell(), null, "m", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_N(), this.getNeighborhoodExpression(), null, "n", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executionDeclarationEClass, ExecutionDeclaration.class, "ExecutionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecutionDeclaration_A(), this.getAttributionType(), null, "a", null, 0, -1, ExecutionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecutionDeclaration_Arg(), this.getBehaviourQualifiedName(), null, "arg", null, 0, 1, ExecutionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecutionDeclaration_M(), this.getMoveExpression(), null, "m", null, 0, 1, ExecutionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Parameters(), this.getParameterExpression(), null, "parameters", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floatEClass, org.cirad.dsl.ecec.xtext.ecec.FLOAT.class, "FLOAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFLOAT_Value(), ecorePackage.getEInt(), "value", null, 0, 1, org.cirad.dsl.ecec.xtext.ecec.FLOAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(algebricExpressionEClass, AlgebricExpression.class, "AlgebricExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlgebricExpression_Args(), this.getExpression(), null, "args", null, 0, -1, AlgebricExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlgebricExpression_Arg(), this.getParameterExpression(), null, "arg", null, 0, 1, AlgebricExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveExpressionEClass, MoveExpression.class, "MoveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoveExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, MoveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMoveExpression_Move(), ecorePackage.getEObject(), null, "move", null, 0, 1, MoveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanExpression_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionExpressionEClass, DimensionExpression.class, "DimensionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimensionExpression_D(), this.getDimensions(), null, "d", null, 0, 1, DimensionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(randomBetweenExpressionEClass, RandomBetweenExpression.class, "RandomBetweenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRandomBetweenExpression_R(), this.getMathFunctionsEnum(), "r", null, 0, 1, RandomBetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRandomBetweenExpression_F(), this.getFLOAT(), null, "f", null, 0, 1, RandomBetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRandomBetweenExpression_F1(), this.getParameterExpression(), null, "f1", null, 0, 1, RandomBetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRandomBetweenExpression_F2(), this.getFLOAT(), null, "f2", null, 0, 1, RandomBetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRandomBetweenExpression_F3(), this.getParameterExpression(), null, "f3", null, 0, 1, RandomBetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterExpressionEClass, ParameterExpression.class, "ParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterExpression_Ex(), this.getExpression(), null, "ex", null, 0, 1, ParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionExpressionEClass, FunctionExpression.class, "FunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionExpression_Right(), this.getExpression(), null, "right", null, 0, -1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionsEClass, Dimensions.class, "Dimensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensions_Dim(), ecorePackage.getEString(), "dim", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensions_Name(), this.getFLOAT(), null, "name", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensions_Len(), this.getLenghtsUnits(), null, "len", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensions_Dur(), this.getTimeUnits(), null, "dur", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensions_Ma(), this.getMassUnits(), null, "ma", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensions_Temp(), this.getTemperatureUnits(), null, "temp", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lenghtsUnitsEClass, LenghtsUnits.class, "LenghtsUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLenghtsUnits_Kilometer(), ecorePackage.getEString(), "kilometer", null, 0, 1, LenghtsUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLenghtsUnits_Meter(), ecorePackage.getEString(), "meter", null, 0, 1, LenghtsUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLenghtsUnits_Miles(), ecorePackage.getEString(), "miles", null, 0, 1, LenghtsUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLenghtsUnits_Hectare(), ecorePackage.getEString(), "hectare", null, 0, 1, LenghtsUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLenghtsUnits_Squarekilometer(), ecorePackage.getEString(), "squarekilometer", null, 0, 1, LenghtsUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeUnitsEClass, TimeUnits.class, "TimeUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeUnits_Hours(), ecorePackage.getEString(), "hours", null, 0, 1, TimeUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeUnits_Minutes(), ecorePackage.getEString(), "minutes", null, 0, 1, TimeUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeUnits_Seconds(), ecorePackage.getEString(), "seconds", null, 0, 1, TimeUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(massUnitsEClass, MassUnits.class, "MassUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMassUnits_Kilogram(), ecorePackage.getEString(), "kilogram", null, 0, 1, MassUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMassUnits_Gram(), ecorePackage.getEString(), "gram", null, 0, 1, MassUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMassUnits_Pounds(), ecorePackage.getEString(), "pounds", null, 0, 1, MassUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMassUnits_Ounces(), ecorePackage.getEString(), "ounces", null, 0, 1, MassUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(temperatureUnitsEClass, TemperatureUnits.class, "TemperatureUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemperatureUnits_Celsius(), ecorePackage.getEString(), "celsius", null, 0, 1, TemperatureUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTemperatureUnits_Fahrenheit(), ecorePackage.getEString(), "Fahrenheit", null, 0, 1, TemperatureUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiEClass, Multi.class, "Multi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulti_Left(), this.getExpression(), null, "left", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulti_Right(), this.getExpression(), null, "right", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiv_Left(), this.getExpression(), null, "left", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiv_Right(), this.getExpression(), null, "right", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(mathFunctionsEnumEEnum, MathFunctionsEnum.class, "MathFunctionsEnum");
    addEEnumLiteral(mathFunctionsEnumEEnum, MathFunctionsEnum.RANDOMINT);
    addEEnumLiteral(mathFunctionsEnumEEnum, MathFunctionsEnum.RANDOMDOUBLE);

    initEEnum(booleanOperatorsEnumEEnum, BooleanOperatorsEnum.class, "BooleanOperatorsEnum");
    addEEnumLiteral(booleanOperatorsEnumEEnum, BooleanOperatorsEnum.TRUE);
    addEEnumLiteral(booleanOperatorsEnumEEnum, BooleanOperatorsEnum.FALSE);

    initEEnum(starAndEndExpEEnum, StarAndEndExp.class, "StarAndEndExp");
    addEEnumLiteral(starAndEndExpEEnum, StarAndEndExp.AFTER);
    addEEnumLiteral(starAndEndExpEEnum, StarAndEndExp.WITHH);

    initEEnum(starAndEndRedefExpEEnum, StarAndEndRedefExp.class, "StarAndEndRedefExp");
    addEEnumLiteral(starAndEndRedefExpEEnum, StarAndEndRedefExp.WHEN);

    initEEnum(conditionEnumEEnum, ConditionEnum.class, "ConditionEnum");
    addEEnumLiteral(conditionEnumEEnum, ConditionEnum.IF);
    addEEnumLiteral(conditionEnumEEnum, ConditionEnum.ELSE);

    initEEnum(equalityEEnum, Equality.class, "Equality");
    addEEnumLiteral(equalityEEnum, Equality.BIGGERTHAN);
    addEEnumLiteral(equalityEEnum, Equality.LESSTHAN);
    addEEnumLiteral(equalityEEnum, Equality.EQUAL);
    addEEnumLiteral(equalityEEnum, Equality.BIGGEROREQUALTHAN);
    addEEnumLiteral(equalityEEnum, Equality.LESSOREQUALTHAN);
    addEEnumLiteral(equalityEEnum, Equality.NOTEQUALTO);
    addEEnumLiteral(equalityEEnum, Equality.SMALLEST);
    addEEnumLiteral(equalityEEnum, Equality.HIGHEST);

    initEEnum(neighbourhooEnumEEnum, NeighbourhooEnum.class, "NeighbourhooEnum");
    addEEnumLiteral(neighbourhooEnumEEnum, NeighbourhooEnum.NEIGHCELL);
    addEEnumLiteral(neighbourhooEnumEEnum, NeighbourhooEnum.CURRENTCELL);
    addEEnumLiteral(neighbourhooEnumEEnum, NeighbourhooEnum.SEARCH);

    initEEnum(typeofNeighbourhoodEEnum, TypeofNeighbourhood.class, "TypeofNeighbourhood");
    addEEnumLiteral(typeofNeighbourhoodEEnum, TypeofNeighbourhood.VONNEUMAN);
    addEEnumLiteral(typeofNeighbourhoodEEnum, TypeofNeighbourhood.MOORE);

    // Create resource
    createResource(eNS_URI);
  }

} //EcecPackageImpl
