/*
 * generated by Xtext
 */
package org.cirad.dsl.xtext.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.cirad.dsl.xtext.services.BehaviordslGrammarAccess.AttributeClassElements
import org.cirad.dsl.xtext.services.BehaviordslGrammarAccess.ParameterClassElements

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class BehaviordslProposalProvider extends AbstractBehaviordslProposalProvider {

	override complete_Assignment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model.class.equals(AttributeClassElements) || model.class.equals(ParameterClassElements)){
			super.complete_Assignment(model, ruleCall, context, acceptor)
		}
          
	} 
}
