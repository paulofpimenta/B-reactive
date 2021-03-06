/*
 * generated by Xtext 2.10.0
 */
package org.cirad.dsl.xtext.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.cirad.dsl.xtext.validation.BreactiveValidator
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class BreactiveQuickfixProvider extends DefaultQuickfixProvider {

@Fix(BreactiveValidator::INVALID_ATTR_NAME)
	def uncaptalizeAttributeNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
		"Attribute\'s name should start with lower case",
		 "Uncaptalize first letter of '" 
			+ issue.data.get(0) + "'",
		"Attribute.gif", [
			context | 
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
		]
	)
	}
	@Fix(BreactiveValidator::INVALID_MODEL_NAME)
	def capitalizeModelName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,  "Capitalize model\'s name", "Capitalize the model\'s name", 
		'upcase.png') [	context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toFirstUpper)
		]
	}
}
