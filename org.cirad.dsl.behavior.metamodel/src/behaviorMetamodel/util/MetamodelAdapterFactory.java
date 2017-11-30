/**
 */
package behaviorMetamodel.util;

import behaviorMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behaviorMetamodel.MetamodelPackage
 * @generated
 */
public class MetamodelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = MetamodelPackage.eINSTANCE;
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
	protected MetamodelSwitch<Adapter> modelSwitch =
		new MetamodelSwitch<Adapter>()
		{
			@Override
			public Adapter caseEntity(Entity object)
			{
				return createEntityAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object)
			{
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseEquationBehavior(EquationBehavior object)
			{
				return createEquationBehaviorAdapter();
			}
			@Override
			public Adapter caseActivityDiagramBehavior(ActivityDiagramBehavior object)
			{
				return createActivityDiagramBehaviorAdapter();
			}
			@Override
			public Adapter caseVariableClass(VariableClass object)
			{
				return createVariableClassAdapter();
			}
			@Override
			public Adapter caseInitSpace(InitSpace object)
			{
				return createInitSpaceAdapter();
			}
			@Override
			public Adapter caseType(Type object)
			{
				return createTypeAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseParameterClass(ParameterClass object)
			{
				return createParameterClassAdapter();
			}
			@Override
			public Adapter caseAttributeClass(AttributeClass object)
			{
				return createAttributeClassAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object)
			{
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseConstantExpression(ConstantExpression object)
			{
				return createConstantExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionCallExpression(FunctionCallExpression object)
			{
				return createFunctionCallExpressionAdapter();
			}
			@Override
			public Adapter caseFunction(Function object)
			{
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseNamedFunction(NamedFunction object)
			{
				return createNamedFunctionAdapter();
			}
			@Override
			public Adapter caseAnonymousFunction(AnonymousFunction object)
			{
				return createAnonymousFunctionAdapter();
			}
			@Override
			public Adapter caseEquation(Equation object)
			{
				return createEquationAdapter();
			}
			@Override
			public Adapter caseElement(Element object)
			{
				return createElementAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object)
			{
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter caseUnconditionedEdge(UnconditionedEdge object)
			{
				return createUnconditionedEdgeAdapter();
			}
			@Override
			public Adapter caseIfTrueEdge(IfTrueEdge object)
			{
				return createIfTrueEdgeAdapter();
			}
			@Override
			public Adapter caseIfFalseEdge(IfFalseEdge object)
			{
				return createIfFalseEdgeAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object)
			{
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object)
			{
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseStart(Start object)
			{
				return createStartAdapter();
			}
			@Override
			public Adapter caseEnd(End object)
			{
				return createEndAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object)
			{
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseFork(Fork object)
			{
				return createForkAdapter();
			}
			@Override
			public Adapter caseMerge(Merge object)
			{
				return createMergeAdapter();
			}
			@Override
			public Adapter caseJoin(Join object)
			{
				return createJoinAdapter();
			}
			@Override
			public Adapter caseMove(Move object)
			{
				return createMoveAdapter();
			}
			@Override
			public Adapter caseDie(Die object)
			{
				return createDieAdapter();
			}
			@Override
			public Adapter caseReproduce(Reproduce object)
			{
				return createReproduceAdapter();
			}
			@Override
			public Adapter caseAdd(Add object)
			{
				return createAddAdapter();
			}
			@Override
			public Adapter caseRemove(Remove object)
			{
				return createRemoveAdapter();
			}
			@Override
			public Adapter caseActivityBehavior(ActivityBehavior object)
			{
				return createActivityBehaviorAdapter();
			}
			@Override
			public Adapter casePrimitiveActivities(PrimitiveActivities object)
			{
				return createPrimitiveActivitiesAdapter();
			}
			@Override
			public Adapter caseModel(Model object)
			{
				return createModelAdapter();
			}
			@Override
			public Adapter caseDeclaredLocalVariable(DeclaredLocalVariable object)
			{
				return createDeclaredLocalVariableAdapter();
			}
			@Override
			public Adapter caseDeclaredParameter(DeclaredParameter object)
			{
				return createDeclaredParameterAdapter();
			}
			@Override
			public Adapter caseDeclaredAttributes(DeclaredAttributes object)
			{
				return createDeclaredAttributesAdapter();
			}
			@Override
			public Adapter caseDeclaredEntities(DeclaredEntities object)
			{
				return createDeclaredEntitiesAdapter();
			}
			@Override
			public Adapter caseDeclaredVariable(DeclaredVariable object)
			{
				return createDeclaredVariableAdapter();
			}
			@Override
			public Adapter caseDeclaredBehavior(DeclaredBehavior object)
			{
				return createDeclaredBehaviorAdapter();
			}
			@Override
			public Adapter caseInitEntity(InitEntity object)
			{
				return createInitEntityAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object)
			{
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseInit(Init object)
			{
				return createInitAdapter();
			}
			@Override
			public Adapter caseSetVariable(SetVariable object)
			{
				return createSetVariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.EquationBehavior <em>Equation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.EquationBehavior
	 * @generated
	 */
	public Adapter createEquationBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ActivityDiagramBehavior <em>Activity Diagram Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ActivityDiagramBehavior
	 * @generated
	 */
	public Adapter createActivityDiagramBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.VariableClass <em>Variable Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.VariableClass
	 * @generated
	 */
	public Adapter createVariableClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.InitSpace <em>Init Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.InitSpace
	 * @generated
	 */
	public Adapter createInitSpaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ParameterClass <em>Parameter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ParameterClass
	 * @generated
	 */
	public Adapter createParameterClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.AttributeClass <em>Attribute Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.AttributeClass
	 * @generated
	 */
	public Adapter createAttributeClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ConstantExpression
	 * @generated
	 */
	public Adapter createConstantExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.FunctionCallExpression
	 * @generated
	 */
	public Adapter createFunctionCallExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.NamedFunction <em>Named Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.NamedFunction
	 * @generated
	 */
	public Adapter createNamedFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.AnonymousFunction <em>Anonymous Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.AnonymousFunction
	 * @generated
	 */
	public Adapter createAnonymousFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Equation
	 * @generated
	 */
	public Adapter createEquationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Element
	 * @generated
	 */
	public Adapter createElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.UnconditionedEdge <em>Unconditioned Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.UnconditionedEdge
	 * @generated
	 */
	public Adapter createUnconditionedEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.IfTrueEdge <em>If True Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.IfTrueEdge
	 * @generated
	 */
	public Adapter createIfTrueEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.IfFalseEdge <em>If False Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.IfFalseEdge
	 * @generated
	 */
	public Adapter createIfFalseEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Start
	 * @generated
	 */
	public Adapter createStartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.End
	 * @generated
	 */
	public Adapter createEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Fork
	 * @generated
	 */
	public Adapter createForkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Join
	 * @generated
	 */
	public Adapter createJoinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Move
	 * @generated
	 */
	public Adapter createMoveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Die <em>Die</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Die
	 * @generated
	 */
	public Adapter createDieAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Reproduce <em>Reproduce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Reproduce
	 * @generated
	 */
	public Adapter createReproduceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Add
	 * @generated
	 */
	public Adapter createAddAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.ActivityBehavior <em>Activity Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.ActivityBehavior
	 * @generated
	 */
	public Adapter createActivityBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.PrimitiveActivities <em>Primitive Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.PrimitiveActivities
	 * @generated
	 */
	public Adapter createPrimitiveActivitiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Model
	 * @generated
	 */
	public Adapter createModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredLocalVariable <em>Declared Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredLocalVariable
	 * @generated
	 */
	public Adapter createDeclaredLocalVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredParameter
	 * @generated
	 */
	public Adapter createDeclaredParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredAttributes <em>Declared Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredAttributes
	 * @generated
	 */
	public Adapter createDeclaredAttributesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredEntities <em>Declared Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredEntities
	 * @generated
	 */
	public Adapter createDeclaredEntitiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredVariable <em>Declared Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredVariable
	 * @generated
	 */
	public Adapter createDeclaredVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.DeclaredBehavior <em>Declared Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.DeclaredBehavior
	 * @generated
	 */
	public Adapter createDeclaredBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.InitEntity <em>Init Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.InitEntity
	 * @generated
	 */
	public Adapter createInitEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.Init
	 * @generated
	 */
	public Adapter createInitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviorMetamodel.SetVariable <em>Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviorMetamodel.SetVariable
	 * @generated
	 */
	public Adapter createSetVariableAdapter()
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

} //MetamodelAdapterFactory
