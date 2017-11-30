package org.cirad.dsl.ecec.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.cirad.dsl.ecec.xtext.services.EcecGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EcecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EcecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FLOAT___FullStopKeyword_1_0_INTTerminalRuleCall_1_1__q;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EcecGrammarAccess) access;
		match_FLOAT___FullStopKeyword_1_0_INTTerminalRuleCall_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1()));
		match_Primary_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
		match_Primary_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_FLOAT___FullStopKeyword_1_0_INTTerminalRuleCall_1_1__q.equals(syntax))
				emit_FLOAT___FullStopKeyword_1_0_INTTerminalRuleCall_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('.' INT)?
	 */
	protected void emit_FLOAT___FullStopKeyword_1_0_INTTerminalRuleCall_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
