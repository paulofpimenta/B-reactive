package org.cirad.dsl.ecec.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.cirad.dsl.ecec.xtext.ecec.AgentEntity;
import org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression;
import org.cirad.dsl.ecec.xtext.ecec.Attribution;
import org.cirad.dsl.ecec.xtext.ecec.AttributionType;
import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.BooleanExpression;
import org.cirad.dsl.ecec.xtext.ecec.Cell;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.DimensionExpression;
import org.cirad.dsl.ecec.xtext.ecec.Dimensions;
import org.cirad.dsl.ecec.xtext.ecec.Div;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.FLOAT;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.InitialLocationType;
import org.cirad.dsl.ecec.xtext.ecec.LenghtsUnits;
import org.cirad.dsl.ecec.xtext.ecec.MassUnits;
import org.cirad.dsl.ecec.xtext.ecec.Minus;
import org.cirad.dsl.ecec.xtext.ecec.Model;
import org.cirad.dsl.ecec.xtext.ecec.MoveExpression;
import org.cirad.dsl.ecec.xtext.ecec.Multi;
import org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression;
import org.cirad.dsl.ecec.xtext.ecec.ParameterExpression;
import org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.Plus;
import org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression;
import org.cirad.dsl.ecec.xtext.ecec.Space;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;
import org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits;
import org.cirad.dsl.ecec.xtext.ecec.TimeUnits;
import org.cirad.dsl.ecec.xtext.services.EcecGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EcecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EcecGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcecPackage.AGENT_ENTITY:
				if(context == grammarAccess.getAgentEntityRule()) {
					sequence_AgentEntity(context, (AgentEntity) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.ALGEBRIC_EXPRESSION:
				if(context == grammarAccess.getAlgebricExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_AlgebricExpression(context, (AlgebricExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.ATTRIBUTION:
				if(context == grammarAccess.getAttributionRule()) {
					sequence_Attribution(context, (Attribution) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.ATTRIBUTION_TYPE:
				if(context == grammarAccess.getAttributionTypeRule()) {
					sequence_AttributionType(context, (AttributionType) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.BEHAVIOUR:
				if(context == grammarAccess.getBehaviourRule()) {
					sequence_Behaviour(context, (Behaviour) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.BEHAVIOUR_QUALIFIED_NAME:
				if(context == grammarAccess.getBehaviourQualifiedNameRule()) {
					sequence_BehaviourQualifiedName(context, (BehaviourQualifiedName) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.CELL:
				if(context == grammarAccess.getCellRule()) {
					sequence_Cell(context, (Cell) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.DIMENSION_EXPRESSION:
				if(context == grammarAccess.getDimensionExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_DimensionExpression(context, (DimensionExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.DIMENSIONS:
				if(context == grammarAccess.getDimensionsRule()) {
					sequence_Dimensions(context, (Dimensions) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.EXECUTION_DECLARATION:
				if(context == grammarAccess.getExecutionDeclarationRule()) {
					sequence_ExecutionDeclaration(context, (ExecutionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.FLOAT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getFLOATRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_FLOAT(context, (FLOAT) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.FINISH_ACTIVITY:
				if(context == grammarAccess.getFinishActivityRule()) {
					sequence_FinishActivity(context, (FinishActivity) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getFunctionExpressionRule()) {
					sequence_FunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.FUNCTION_QUALIFIED_NAME:
				if(context == grammarAccess.getFunctionQualifiedNameRule()) {
					sequence_FunctionQualifiedName(context, (FunctionQualifiedName) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.INITIAL_LOCATION_TYPE:
				if(context == grammarAccess.getInitialLocationTypeRule()) {
					sequence_InitialLocationType(context, (InitialLocationType) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.LENGHTS_UNITS:
				if(context == grammarAccess.getLenghtsUnitsRule()) {
					sequence_LenghtsUnits(context, (LenghtsUnits) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.MASS_UNITS:
				if(context == grammarAccess.getMassUnitsRule()) {
					sequence_MassUnits(context, (MassUnits) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.MOVE_EXPRESSION:
				if(context == grammarAccess.getMoveExpressionRule()) {
					sequence_MoveExpression(context, (MoveExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.NEIGHBORHOOD_EXPRESSION:
				if(context == grammarAccess.getNeighborhoodExpressionRule()) {
					sequence_NeighborhoodExpression(context, (NeighborhoodExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.PARAMETER_EXPRESSION:
				if(context == grammarAccess.getParameterExpressionRule()) {
					sequence_ParameterExpression(context, (ParameterExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.PARAMETER_QUALIFIED_NAME:
				if(context == grammarAccess.getParameterQualifiedNameRule()) {
					sequence_ParameterQualifiedName(context, (ParameterQualifiedName) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.RANDOM_BETWEEN_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getRandomBetweenExpressionRule()) {
					sequence_RandomBetweenExpression(context, (RandomBetweenExpression) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.SPACE:
				if(context == grammarAccess.getSpaceRule()) {
					sequence_Space(context, (Space) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.SPATIAL_ENTITY:
				if(context == grammarAccess.getSpatialEntityRule()) {
					sequence_SpatialEntity(context, (SpatialEntity) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.START_ACTIVITY_DECLARATION:
				if(context == grammarAccess.getStartActivityDeclarationRule()) {
					sequence_StartActivityDeclaration(context, (StartActivityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.TEMPERATURE_UNITS:
				if(context == grammarAccess.getTemperatureUnitsRule()) {
					sequence_TemperatureUnits(context, (TemperatureUnits) semanticObject); 
					return; 
				}
				else break;
			case EcecPackage.TIME_UNITS:
				if(context == grammarAccess.getTimeUnitsRule()) {
					sequence_TimeUnits(context, (TimeUnits) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         agentNumbers=INT 
	 *         initialAgentLocation=InitialLocationType 
	 *         spatialEntity=[SpatialEntity|ID]? 
	 *         (agentparameters+=ParameterExpression | agentparameters+=DimensionExpression | agentparameters+=RandomBetweenExpression)* 
	 *         agentfunction+=FunctionExpression? 
	 *         agentbehaviourdefinition+=Behaviour*
	 *     )
	 */
	protected void sequence_AgentEntity(EObject context, AgentEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=Addition args+=Addition* arg=[ParameterExpression|QualifiedName]?)
	 */
	protected void sequence_AlgebricExpression(EObject context, AlgebricExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     p=ParameterQualifiedName
	 */
	protected void sequence_AttributionType(EObject context, AttributionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (equality=Equality expression=Primary)
	 */
	protected void sequence_Attribution(EObject context, Attribution semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.ATTRIBUTION__EQUALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.ATTRIBUTION__EQUALITY));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.ATTRIBUTION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.ATTRIBUTION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributionAccess().getEqualityEqualityEnumRuleCall_1_0(), semanticObject.getEquality());
		feeder.accept(grammarAccess.getAttributionAccess().getExpressionPrimaryParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name+=[Behaviour|QualifiedName]
	 */
	protected void sequence_BehaviourQualifiedName(EObject context, BehaviourQualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         hasStart+=StartActivityDeclaration 
	 *         hasStart+=StartActivityDeclaration* 
	 *         hasEnd+=FinishActivity 
	 *         hasEnd+=FinishActivity* 
	 *         hasCondition+=Condition 
	 *         hasCondition+=Condition* 
	 *         executes+=ExecutionDeclaration 
	 *         executes+=ExecutionDeclaration*
	 *     )
	 */
	protected void sequence_Behaviour(EObject context, Behaviour semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value?='true'?)
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         occupiedbyspatialEntity+=[SpatialEntity|ID] 
	 *         ocuppied=BooleanExpression? 
	 *         x=INT? 
	 *         y=INT? 
	 *         occupiedbyAgentEntity+=[AgentEntity|ID]? 
	 *         occupiedbyAgentEntity+=[AgentEntity|ID]?
	 *     )
	 */
	protected void sequence_Cell(EObject context, Cell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ce+=ConditionEnum (a+=AttributionType | m=Cell | n=NeighborhoodExpression))
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     d=Dimensions
	 */
	protected void sequence_DimensionExpression(EObject context, DimensionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (dim='lengths' name=FLOAT len=LenghtsUnits) | 
	 *         (dim='lasts' name=FLOAT dur=TimeUnits) | 
	 *         (dim='weights' name=FLOAT ma=MassUnits) | 
	 *         (dim='has temperature' name=FLOAT temp=TemperatureUnits)
	 *     )
	 */
	protected void sequence_Dimensions(EObject context, Dimensions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a+=AttributionType | arg=BehaviourQualifiedName | m=MoveExpression)
	 */
	protected void sequence_ExecutionDeclaration(EObject context, ExecutionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_FLOAT(EObject context, FLOAT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (saef+=StarAndEndExp be2+=BehaviourQualifiedName)
	 */
	protected void sequence_FinishActivity(EObject context, FinishActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID right+=Addition right+=Addition*)
	 */
	protected void sequence_FunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[FunctionExpression|QualifiedName] a=Attribution)
	 */
	protected void sequence_FunctionQualifiedName(EObject context, FunctionQualifiedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.FUNCTION_QUALIFIED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.FUNCTION_QUALIFIED_NAME__NAME));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.FUNCTION_QUALIFIED_NAME__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.FUNCTION_QUALIFIED_NAME__A));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionQualifiedNameAccess().getNameFunctionExpressionQualifiedNameParserRuleCall_2_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionQualifiedNameAccess().getAAttributionParserRuleCall_3_0(), semanticObject.getA());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='Random'
	 */
	protected void sequence_InitialLocationType(EObject context, InitialLocationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.INITIAL_LOCATION_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.INITIAL_LOCATION_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitialLocationTypeAccess().getNameRandomKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (kilometer='km' | meter='m' | miles='miles' | hectare='ha' | squarekilometer='kmÂ²')
	 */
	protected void sequence_LenghtsUnits(EObject context, LenghtsUnits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kilogram='kg' | gram='g' | pounds='lb' | ounces='oz')
	 */
	protected void sequence_MassUnits(EObject context, MassUnits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (agent+=AgentEntity* spatialEntity+=SpatialEntity* space=Space)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='move to ' (move=Cell | move=NeighborhoodExpression))
	 */
	protected void sequence_MoveExpression(EObject context, MoveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=Primary)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=Primary)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (n+=NeighbourhooEnum a=AttributionType)
	 */
	protected void sequence_NeighborhoodExpression(EObject context, NeighborhoodExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ex=Expression)
	 */
	protected void sequence_ParameterExpression(EObject context, ParameterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.PARAMETER_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.PARAMETER_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.PARAMETER_EXPRESSION__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.PARAMETER_EXPRESSION__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterExpressionAccess().getExExpressionParserRuleCall_3_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[ParameterExpression|QualifiedName] a=Attribution)
	 */
	protected void sequence_ParameterQualifiedName(EObject context, ParameterQualifiedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.PARAMETER_QUALIFIED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.PARAMETER_QUALIFIED_NAME__NAME));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.PARAMETER_QUALIFIED_NAME__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.PARAMETER_QUALIFIED_NAME__A));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterQualifiedNameAccess().getNameParameterExpressionQualifiedNameParserRuleCall_2_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterQualifiedNameAccess().getAAttributionParserRuleCall_3_0(), semanticObject.getA());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameters=[ParameterExpression|QualifiedName]
	 */
	protected void sequence_Primary(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.EXPRESSION__PARAMETERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.EXPRESSION__PARAMETERS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getParametersParameterExpressionQualifiedNameParserRuleCall_1_0_1(), semanticObject.getParameters());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (r=MathFunctionsEnum? ((f=FLOAT | f1=[ParameterExpression|QualifiedName]) (f2=FLOAT | f3=[ParameterExpression|QualifiedName]))?)
	 */
	protected void sequence_RandomBetweenExpression(EObject context, RandomBetweenExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID numcells=INT typeneigh=TypeofNeighbourhood)
	 */
	protected void sequence_Space(EObject context, Space semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.SPACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.SPACE__NAME));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.SPACE__NUMCELLS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.SPACE__NUMCELLS));
			if(transientValues.isValueTransient(semanticObject, EcecPackage.Literals.SPACE__TYPENEIGH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcecPackage.Literals.SPACE__TYPENEIGH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSpaceAccess().getNumcellsINTTerminalRuleCall_3_1_0(), semanticObject.getNumcells());
		feeder.accept(grammarAccess.getSpaceAccess().getTypeneighTypeofNeighbourhoodEnumRuleCall_3_4_0(), semanticObject.getTypeneigh());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         number=INT 
	 *         locationtype=InitialLocationType 
	 *         X=INT 
	 *         Y=INT 
	 *         gap=INT 
	 *         (parameters+=ParameterExpression | parameters+=DimensionExpression | parameters+=RandomBetweenExpression)* 
	 *         function+=FunctionExpression? 
	 *         behaviourdefinition+=Behaviour*
	 *     )
	 */
	protected void sequence_SpatialEntity(EObject context, SpatialEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (saef+=StarAndEndExp be2+=BehaviourQualifiedName)
	 */
	protected void sequence_StartActivityDeclaration(EObject context, StartActivityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (celsius='C' | Fahrenheit='F')
	 */
	protected void sequence_TemperatureUnits(EObject context, TemperatureUnits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (hours='h' | minutes='m' | seconds='s')
	 */
	protected void sequence_TimeUnits(EObject context, TimeUnits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
