/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationItemSemanticEditPolicy extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationItemSemanticEditPolicy() {
		super(
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
