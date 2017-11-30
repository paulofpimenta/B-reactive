/**
 */
package behaviorMetamodel.util;

import behaviorMetamodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see behaviorMetamodel.MetamodelPackage
 * @generated
 */
public class MetamodelValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetamodelValidator INSTANCE = new MetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "behaviorMetamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return MetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case MetamodelPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case MetamodelPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case MetamodelPackage.EQUATION_BEHAVIOR:
				return validateEquationBehavior((EquationBehavior)value, diagnostics, context);
			case MetamodelPackage.ACTIVITY_DIAGRAM_BEHAVIOR:
				return validateActivityDiagramBehavior((ActivityDiagramBehavior)value, diagnostics, context);
			case MetamodelPackage.VARIABLE_CLASS:
				return validateVariableClass((VariableClass)value, diagnostics, context);
			case MetamodelPackage.INIT_SPACE:
				return validateInitSpace((InitSpace)value, diagnostics, context);
			case MetamodelPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case MetamodelPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case MetamodelPackage.PARAMETER_CLASS:
				return validateParameterClass((ParameterClass)value, diagnostics, context);
			case MetamodelPackage.ATTRIBUTE_CLASS:
				return validateAttributeClass((AttributeClass)value, diagnostics, context);
			case MetamodelPackage.LOCAL_VARIABLE:
				return validateLocalVariable((LocalVariable)value, diagnostics, context);
			case MetamodelPackage.CONSTANT_EXPRESSION:
				return validateConstantExpression((ConstantExpression)value, diagnostics, context);
			case MetamodelPackage.FUNCTION_CALL_EXPRESSION:
				return validateFunctionCallExpression((FunctionCallExpression)value, diagnostics, context);
			case MetamodelPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case MetamodelPackage.NAMED_FUNCTION:
				return validateNamedFunction((NamedFunction)value, diagnostics, context);
			case MetamodelPackage.ANONYMOUS_FUNCTION:
				return validateAnonymousFunction((AnonymousFunction)value, diagnostics, context);
			case MetamodelPackage.EQUATION:
				return validateEquation((Equation)value, diagnostics, context);
			case MetamodelPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case MetamodelPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case MetamodelPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case MetamodelPackage.UNCONDITIONED_EDGE:
				return validateUnconditionedEdge((UnconditionedEdge)value, diagnostics, context);
			case MetamodelPackage.IF_TRUE_EDGE:
				return validateIfTrueEdge((IfTrueEdge)value, diagnostics, context);
			case MetamodelPackage.IF_FALSE_EDGE:
				return validateIfFalseEdge((IfFalseEdge)value, diagnostics, context);
			case MetamodelPackage.CONTROL_NODE:
				return validateControlNode((ControlNode)value, diagnostics, context);
			case MetamodelPackage.EXECUTABLE_NODE:
				return validateExecutableNode((ExecutableNode)value, diagnostics, context);
			case MetamodelPackage.START:
				return validateStart((Start)value, diagnostics, context);
			case MetamodelPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case MetamodelPackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case MetamodelPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case MetamodelPackage.MERGE:
				return validateMerge((Merge)value, diagnostics, context);
			case MetamodelPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case MetamodelPackage.MOVE:
				return validateMove((Move)value, diagnostics, context);
			case MetamodelPackage.DIE:
				return validateDie((Die)value, diagnostics, context);
			case MetamodelPackage.REPRODUCE:
				return validateReproduce((Reproduce)value, diagnostics, context);
			case MetamodelPackage.ADD:
				return validateAdd((Add)value, diagnostics, context);
			case MetamodelPackage.REMOVE:
				return validateRemove((Remove)value, diagnostics, context);
			case MetamodelPackage.ACTIVITY_BEHAVIOR:
				return validateActivityBehavior((ActivityBehavior)value, diagnostics, context);
			case MetamodelPackage.PRIMITIVE_ACTIVITIES:
				return validatePrimitiveActivities((PrimitiveActivities)value, diagnostics, context);
			case MetamodelPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE:
				return validateDeclaredLocalVariable((DeclaredLocalVariable)value, diagnostics, context);
			case MetamodelPackage.DECLARED_PARAMETER:
				return validateDeclaredParameter((DeclaredParameter)value, diagnostics, context);
			case MetamodelPackage.DECLARED_ATTRIBUTES:
				return validateDeclaredAttributes((DeclaredAttributes)value, diagnostics, context);
			case MetamodelPackage.DECLARED_ENTITIES:
				return validateDeclaredEntities((DeclaredEntities)value, diagnostics, context);
			case MetamodelPackage.DECLARED_VARIABLE:
				return validateDeclaredVariable((DeclaredVariable)value, diagnostics, context);
			case MetamodelPackage.DECLARED_BEHAVIOR:
				return validateDeclaredBehavior((DeclaredBehavior)value, diagnostics, context);
			case MetamodelPackage.INIT_ENTITY:
				return validateInitEntity((InitEntity)value, diagnostics, context);
			case MetamodelPackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case MetamodelPackage.INIT:
				return validateInit((Init)value, diagnostics, context);
			case MetamodelPackage.SET_VARIABLE:
				return validateSetVariable((SetVariable)value, diagnostics, context);
			case MetamodelPackage.TYPE_ENUM:
				return validateTypeEnum((TypeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(behavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_uniqueBehavior(behavior, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueBehavior constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOR__UNIQUE_BEHAVIOR__EEXPRESSION = "\n" +
		"\t\tBehavior.allInstances() -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the uniqueBehavior constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_uniqueBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(MetamodelPackage.Literals.BEHAVIOR,
				 behavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueBehavior",
				 BEHAVIOR__UNIQUE_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquationBehavior(EquationBehavior equationBehavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(equationBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equationBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_uniqueBehavior(equationBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDiagramBehavior(ActivityDiagramBehavior activityDiagramBehavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(activityDiagramBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityDiagramBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_uniqueBehavior(activityDiagramBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableClass(VariableClass variableClass, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(variableClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitSpace(InitSpace initSpace, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(initSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterClass(ParameterClass parameterClass, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(parameterClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeClass(AttributeClass attributeClass, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(attributeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalVariable(LocalVariable localVariable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(localVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantExpression(ConstantExpression constantExpression, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(constantExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionCallExpression(FunctionCallExpression functionCallExpression, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(functionCallExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedFunction(NamedFunction namedFunction, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(namedFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnonymousFunction(AnonymousFunction anonymousFunction, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(anonymousFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquation(Equation equation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(equation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnconditionedEdge(UnconditionedEdge unconditionedEdge, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(unconditionedEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfTrueEdge(IfTrueEdge ifTrueEdge, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(ifTrueEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfFalseEdge(IfFalseEdge ifFalseEdge, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(ifFalseEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlNode(ControlNode controlNode, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(controlNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNode(ExecutableNode executableNode, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(executableNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(start, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(end, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(decision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(fork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(merge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(join, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(move, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDie(Die die, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(die, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReproduce(Reproduce reproduce, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(reproduce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdd(Add add, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(add, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemove(Remove remove, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(remove, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityBehavior(ActivityBehavior activityBehavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(activityBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_uniqueBehavior(activityBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveActivities(PrimitiveActivities primitiveActivities, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(primitiveActivities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredLocalVariable(DeclaredLocalVariable declaredLocalVariable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredLocalVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredParameter(DeclaredParameter declaredParameter, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredAttributes(DeclaredAttributes declaredAttributes, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredAttributes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredEntities(DeclaredEntities declaredEntities, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredEntities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredVariable(DeclaredVariable declaredVariable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredBehavior(DeclaredBehavior declaredBehavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(declaredBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitEntity(InitEntity initEntity, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(initEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInit(Init init, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(init, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetVariable(SetVariable setVariable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(setVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeEnum(TypeEnum typeEnum, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetamodelValidator
