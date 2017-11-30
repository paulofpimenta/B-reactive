/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ForagerForagerProtocolsCompartmentItemSemanticEditPolicy extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ForagerForagerProtocolsCompartmentItemSemanticEditPolicy() {
		super(
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.Init2CreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_3004 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.Control2CreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_3005 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.CustomProtocol2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
