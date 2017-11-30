/**
 */
package behaviorMetamodel.util;

import behaviorMetamodel.*;

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
 * @see behaviorMetamodel.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case MetamodelPackage.ENTITY:
			{
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BEHAVIOR:
			{
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EQUATION_BEHAVIOR:
			{
				EquationBehavior equationBehavior = (EquationBehavior)theEObject;
				T result = caseEquationBehavior(equationBehavior);
				if (result == null) result = caseBehavior(equationBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ACTIVITY_DIAGRAM_BEHAVIOR:
			{
				ActivityDiagramBehavior activityDiagramBehavior = (ActivityDiagramBehavior)theEObject;
				T result = caseActivityDiagramBehavior(activityDiagramBehavior);
				if (result == null) result = caseBehavior(activityDiagramBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.VARIABLE_CLASS:
			{
				VariableClass variableClass = (VariableClass)theEObject;
				T result = caseVariableClass(variableClass);
				if (result == null) result = caseExpression(variableClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.INIT_SPACE:
			{
				InitSpace initSpace = (InitSpace)theEObject;
				T result = caseInitSpace(initSpace);
				if (result == null) result = caseInit(initSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TYPE:
			{
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.PARAMETER_CLASS:
			{
				ParameterClass parameterClass = (ParameterClass)theEObject;
				T result = caseParameterClass(parameterClass);
				if (result == null) result = caseVariableClass(parameterClass);
				if (result == null) result = caseExpression(parameterClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ATTRIBUTE_CLASS:
			{
				AttributeClass attributeClass = (AttributeClass)theEObject;
				T result = caseAttributeClass(attributeClass);
				if (result == null) result = caseVariableClass(attributeClass);
				if (result == null) result = caseExpression(attributeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.LOCAL_VARIABLE:
			{
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariableClass(localVariable);
				if (result == null) result = caseExpression(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONSTANT_EXPRESSION:
			{
				ConstantExpression constantExpression = (ConstantExpression)theEObject;
				T result = caseConstantExpression(constantExpression);
				if (result == null) result = caseExpression(constantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FUNCTION_CALL_EXPRESSION:
			{
				FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
				T result = caseFunctionCallExpression(functionCallExpression);
				if (result == null) result = caseExpression(functionCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FUNCTION:
			{
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.NAMED_FUNCTION:
			{
				NamedFunction namedFunction = (NamedFunction)theEObject;
				T result = caseNamedFunction(namedFunction);
				if (result == null) result = caseFunction(namedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ANONYMOUS_FUNCTION:
			{
				AnonymousFunction anonymousFunction = (AnonymousFunction)theEObject;
				T result = caseAnonymousFunction(anonymousFunction);
				if (result == null) result = caseFunction(anonymousFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EQUATION:
			{
				Equation equation = (Equation)theEObject;
				T result = caseEquation(equation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ELEMENT:
			{
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EDGE:
			{
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.UNCONDITIONED_EDGE:
			{
				UnconditionedEdge unconditionedEdge = (UnconditionedEdge)theEObject;
				T result = caseUnconditionedEdge(unconditionedEdge);
				if (result == null) result = caseEdge(unconditionedEdge);
				if (result == null) result = caseElement(unconditionedEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.IF_TRUE_EDGE:
			{
				IfTrueEdge ifTrueEdge = (IfTrueEdge)theEObject;
				T result = caseIfTrueEdge(ifTrueEdge);
				if (result == null) result = caseEdge(ifTrueEdge);
				if (result == null) result = caseElement(ifTrueEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.IF_FALSE_EDGE:
			{
				IfFalseEdge ifFalseEdge = (IfFalseEdge)theEObject;
				T result = caseIfFalseEdge(ifFalseEdge);
				if (result == null) result = caseEdge(ifFalseEdge);
				if (result == null) result = caseElement(ifFalseEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONTROL_NODE:
			{
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseNode(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EXECUTABLE_NODE:
			{
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseNode(executableNode);
				if (result == null) result = caseElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.START:
			{
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseControlNode(start);
				if (result == null) result = caseNode(start);
				if (result == null) result = caseElement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.END:
			{
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseControlNode(end);
				if (result == null) result = caseNode(end);
				if (result == null) result = caseElement(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECISION:
			{
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseControlNode(decision);
				if (result == null) result = caseNode(decision);
				if (result == null) result = caseElement(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FORK:
			{
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = caseControlNode(fork);
				if (result == null) result = caseNode(fork);
				if (result == null) result = caseElement(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.MERGE:
			{
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = caseControlNode(merge);
				if (result == null) result = caseNode(merge);
				if (result == null) result = caseElement(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.JOIN:
			{
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseControlNode(join);
				if (result == null) result = caseNode(join);
				if (result == null) result = caseElement(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.MOVE:
			{
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = casePrimitiveActivities(move);
				if (result == null) result = caseExecutableNode(move);
				if (result == null) result = caseNode(move);
				if (result == null) result = caseElement(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DIE:
			{
				Die die = (Die)theEObject;
				T result = caseDie(die);
				if (result == null) result = casePrimitiveActivities(die);
				if (result == null) result = caseExecutableNode(die);
				if (result == null) result = caseNode(die);
				if (result == null) result = caseElement(die);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.REPRODUCE:
			{
				Reproduce reproduce = (Reproduce)theEObject;
				T result = caseReproduce(reproduce);
				if (result == null) result = casePrimitiveActivities(reproduce);
				if (result == null) result = caseExecutableNode(reproduce);
				if (result == null) result = caseNode(reproduce);
				if (result == null) result = caseElement(reproduce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ADD:
			{
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = casePrimitiveActivities(add);
				if (result == null) result = caseExecutableNode(add);
				if (result == null) result = caseNode(add);
				if (result == null) result = caseElement(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.REMOVE:
			{
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = casePrimitiveActivities(remove);
				if (result == null) result = caseExecutableNode(remove);
				if (result == null) result = caseNode(remove);
				if (result == null) result = caseElement(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ACTIVITY_BEHAVIOR:
			{
				ActivityBehavior activityBehavior = (ActivityBehavior)theEObject;
				T result = caseActivityBehavior(activityBehavior);
				if (result == null) result = caseBehavior(activityBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.PRIMITIVE_ACTIVITIES:
			{
				PrimitiveActivities primitiveActivities = (PrimitiveActivities)theEObject;
				T result = casePrimitiveActivities(primitiveActivities);
				if (result == null) result = caseExecutableNode(primitiveActivities);
				if (result == null) result = caseNode(primitiveActivities);
				if (result == null) result = caseElement(primitiveActivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.MODEL:
			{
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE:
			{
				DeclaredLocalVariable declaredLocalVariable = (DeclaredLocalVariable)theEObject;
				T result = caseDeclaredLocalVariable(declaredLocalVariable);
				if (result == null) result = caseExpression(declaredLocalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_PARAMETER:
			{
				DeclaredParameter declaredParameter = (DeclaredParameter)theEObject;
				T result = caseDeclaredParameter(declaredParameter);
				if (result == null) result = caseExpression(declaredParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_ATTRIBUTES:
			{
				DeclaredAttributes declaredAttributes = (DeclaredAttributes)theEObject;
				T result = caseDeclaredAttributes(declaredAttributes);
				if (result == null) result = caseExpression(declaredAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_ENTITIES:
			{
				DeclaredEntities declaredEntities = (DeclaredEntities)theEObject;
				T result = caseDeclaredEntities(declaredEntities);
				if (result == null) result = caseExpression(declaredEntities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_VARIABLE:
			{
				DeclaredVariable declaredVariable = (DeclaredVariable)theEObject;
				T result = caseDeclaredVariable(declaredVariable);
				if (result == null) result = caseExpression(declaredVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECLARED_BEHAVIOR:
			{
				DeclaredBehavior declaredBehavior = (DeclaredBehavior)theEObject;
				T result = caseDeclaredBehavior(declaredBehavior);
				if (result == null) result = caseNode(declaredBehavior);
				if (result == null) result = caseElement(declaredBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.INIT_ENTITY:
			{
				InitEntity initEntity = (InitEntity)theEObject;
				T result = caseInitEntity(initEntity);
				if (result == null) result = caseInit(initEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ASSIGNMENT:
			{
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.INIT:
			{
				Init init = (Init)theEObject;
				T result = caseInit(init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.SET_VARIABLE:
			{
				SetVariable setVariable = (SetVariable)theEObject;
				T result = caseSetVariable(setVariable);
				if (result == null) result = casePrimitiveActivities(setVariable);
				if (result == null) result = caseExecutableNode(setVariable);
				if (result == null) result = caseNode(setVariable);
				if (result == null) result = caseElement(setVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquationBehavior(EquationBehavior object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Diagram Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Diagram Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDiagramBehavior(ActivityDiagramBehavior object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableClass(VariableClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitSpace(InitSpace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterClass(ParameterClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeClass(AttributeClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExpression(ConstantExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCallExpression(FunctionCallExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedFunction(NamedFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousFunction(AnonymousFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquation(Equation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconditioned Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconditioned Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconditionedEdge(UnconditionedEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If True Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If True Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfTrueEdge(IfTrueEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If False Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If False Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfFalseEdge(IfFalseEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Die</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Die</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDie(Die object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reproduce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reproduce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReproduce(Reproduce object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityBehavior(ActivityBehavior object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveActivities(PrimitiveActivities object)
	{
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Declared Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredLocalVariable(DeclaredLocalVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredParameter(DeclaredParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredAttributes(DeclaredAttributes object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredEntities(DeclaredEntities object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredVariable(DeclaredVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredBehavior(DeclaredBehavior object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitEntity(InitEntity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInit(Init object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariable(SetVariable object)
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

} //MetamodelSwitch
