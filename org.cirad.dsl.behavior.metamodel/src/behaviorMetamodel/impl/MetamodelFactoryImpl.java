/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.*;

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
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init()
	{
		try
		{
			MetamodelFactory theMetamodelFactory = (MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null)
			{
				return theMetamodelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl()
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
			case MetamodelPackage.ENTITY: return createEntity();
			case MetamodelPackage.BEHAVIOR: return createBehavior();
			case MetamodelPackage.EQUATION_BEHAVIOR: return createEquationBehavior();
			case MetamodelPackage.ACTIVITY_DIAGRAM_BEHAVIOR: return createActivityDiagramBehavior();
			case MetamodelPackage.VARIABLE_CLASS: return createVariableClass();
			case MetamodelPackage.INIT_SPACE: return createInitSpace();
			case MetamodelPackage.TYPE: return createType();
			case MetamodelPackage.EXPRESSION: return createExpression();
			case MetamodelPackage.PARAMETER_CLASS: return createParameterClass();
			case MetamodelPackage.ATTRIBUTE_CLASS: return createAttributeClass();
			case MetamodelPackage.LOCAL_VARIABLE: return createLocalVariable();
			case MetamodelPackage.CONSTANT_EXPRESSION: return createConstantExpression();
			case MetamodelPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
			case MetamodelPackage.FUNCTION: return createFunction();
			case MetamodelPackage.NAMED_FUNCTION: return createNamedFunction();
			case MetamodelPackage.ANONYMOUS_FUNCTION: return createAnonymousFunction();
			case MetamodelPackage.EQUATION: return createEquation();
			case MetamodelPackage.ELEMENT: return createElement();
			case MetamodelPackage.EDGE: return createEdge();
			case MetamodelPackage.NODE: return createNode();
			case MetamodelPackage.UNCONDITIONED_EDGE: return createUnconditionedEdge();
			case MetamodelPackage.IF_TRUE_EDGE: return createIfTrueEdge();
			case MetamodelPackage.IF_FALSE_EDGE: return createIfFalseEdge();
			case MetamodelPackage.CONTROL_NODE: return createControlNode();
			case MetamodelPackage.EXECUTABLE_NODE: return createExecutableNode();
			case MetamodelPackage.START: return createStart();
			case MetamodelPackage.END: return createEnd();
			case MetamodelPackage.DECISION: return createDecision();
			case MetamodelPackage.FORK: return createFork();
			case MetamodelPackage.MERGE: return createMerge();
			case MetamodelPackage.JOIN: return createJoin();
			case MetamodelPackage.MOVE: return createMove();
			case MetamodelPackage.DIE: return createDie();
			case MetamodelPackage.REPRODUCE: return createReproduce();
			case MetamodelPackage.ADD: return createAdd();
			case MetamodelPackage.REMOVE: return createRemove();
			case MetamodelPackage.ACTIVITY_BEHAVIOR: return createActivityBehavior();
			case MetamodelPackage.PRIMITIVE_ACTIVITIES: return createPrimitiveActivities();
			case MetamodelPackage.MODEL: return createModel();
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE: return createDeclaredLocalVariable();
			case MetamodelPackage.DECLARED_PARAMETER: return createDeclaredParameter();
			case MetamodelPackage.DECLARED_ATTRIBUTES: return createDeclaredAttributes();
			case MetamodelPackage.DECLARED_ENTITIES: return createDeclaredEntities();
			case MetamodelPackage.DECLARED_VARIABLE: return createDeclaredVariable();
			case MetamodelPackage.DECLARED_BEHAVIOR: return createDeclaredBehavior();
			case MetamodelPackage.INIT_ENTITY: return createInitEntity();
			case MetamodelPackage.ASSIGNMENT: return createAssignment();
			case MetamodelPackage.INIT: return createInit();
			case MetamodelPackage.SET_VARIABLE: return createSetVariable();
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
			case MetamodelPackage.TYPE_ENUM:
				return createTypeEnumFromString(eDataType, initialValue);
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
			case MetamodelPackage.TYPE_ENUM:
				return convertTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity()
	{
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior()
	{
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationBehavior createEquationBehavior()
	{
		EquationBehaviorImpl equationBehavior = new EquationBehaviorImpl();
		return equationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramBehavior createActivityDiagramBehavior()
	{
		ActivityDiagramBehaviorImpl activityDiagramBehavior = new ActivityDiagramBehaviorImpl();
		return activityDiagramBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableClass createVariableClass()
	{
		VariableClassImpl variableClass = new VariableClassImpl();
		return variableClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitSpace createInitSpace()
	{
		InitSpaceImpl initSpace = new InitSpaceImpl();
		return initSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType()
	{
		TypeImpl type = new TypeImpl();
		return type;
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
	public ParameterClass createParameterClass()
	{
		ParameterClassImpl parameterClass = new ParameterClassImpl();
		return parameterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeClass createAttributeClass()
	{
		AttributeClassImpl attributeClass = new AttributeClassImpl();
		return attributeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable()
	{
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression createConstantExpression()
	{
		ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
		return constantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCallExpression createFunctionCallExpression()
	{
		FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
		return functionCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction()
	{
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedFunction createNamedFunction()
	{
		NamedFunctionImpl namedFunction = new NamedFunctionImpl();
		return namedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousFunction createAnonymousFunction()
	{
		AnonymousFunctionImpl anonymousFunction = new AnonymousFunctionImpl();
		return anonymousFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation createEquation()
	{
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement()
	{
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge()
	{
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionedEdge createUnconditionedEdge()
	{
		UnconditionedEdgeImpl unconditionedEdge = new UnconditionedEdgeImpl();
		return unconditionedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfTrueEdge createIfTrueEdge()
	{
		IfTrueEdgeImpl ifTrueEdge = new IfTrueEdgeImpl();
		return ifTrueEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfFalseEdge createIfFalseEdge()
	{
		IfFalseEdgeImpl ifFalseEdge = new IfFalseEdgeImpl();
		return ifFalseEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode createControlNode()
	{
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode createExecutableNode()
	{
		ExecutableNodeImpl executableNode = new ExecutableNodeImpl();
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart()
	{
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd()
	{
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision()
	{
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork()
	{
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge createMerge()
	{
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin()
	{
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove()
	{
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Die createDie()
	{
		DieImpl die = new DieImpl();
		return die;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reproduce createReproduce()
	{
		ReproduceImpl reproduce = new ReproduceImpl();
		return reproduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd()
	{
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remove createRemove()
	{
		RemoveImpl remove = new RemoveImpl();
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityBehavior createActivityBehavior()
	{
		ActivityBehaviorImpl activityBehavior = new ActivityBehaviorImpl();
		return activityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveActivities createPrimitiveActivities()
	{
		PrimitiveActivitiesImpl primitiveActivities = new PrimitiveActivitiesImpl();
		return primitiveActivities;
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
	public DeclaredLocalVariable createDeclaredLocalVariable()
	{
		DeclaredLocalVariableImpl declaredLocalVariable = new DeclaredLocalVariableImpl();
		return declaredLocalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter createDeclaredParameter()
	{
		DeclaredParameterImpl declaredParameter = new DeclaredParameterImpl();
		return declaredParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredAttributes createDeclaredAttributes()
	{
		DeclaredAttributesImpl declaredAttributes = new DeclaredAttributesImpl();
		return declaredAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredEntities createDeclaredEntities()
	{
		DeclaredEntitiesImpl declaredEntities = new DeclaredEntitiesImpl();
		return declaredEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredVariable createDeclaredVariable()
	{
		DeclaredVariableImpl declaredVariable = new DeclaredVariableImpl();
		return declaredVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredBehavior createDeclaredBehavior()
	{
		DeclaredBehaviorImpl declaredBehavior = new DeclaredBehaviorImpl();
		return declaredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitEntity createInitEntity()
	{
		InitEntityImpl initEntity = new InitEntityImpl();
		return initEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment()
	{
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init createInit()
	{
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetVariable createSetVariable()
	{
		SetVariableImpl setVariable = new SetVariableImpl();
		return setVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum createTypeEnumFromString(EDataType eDataType, String initialValue)
	{
		TypeEnum result = TypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeEnumToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage()
	{
		return (MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage()
	{
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
