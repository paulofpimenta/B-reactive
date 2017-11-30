/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ControlControlMethodsCompartment2ItemSemanticEditPolicy extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlControlMethodsCompartment2ItemSemanticEditPolicy() {
		super(
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.LogisticGrowth2CreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_3003 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.Method2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
