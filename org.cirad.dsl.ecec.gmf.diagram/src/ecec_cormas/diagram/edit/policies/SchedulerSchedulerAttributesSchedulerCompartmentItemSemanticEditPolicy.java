/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SchedulerSchedulerAttributesSchedulerCompartmentItemSemanticEditPolicy
		extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SchedulerSchedulerAttributesSchedulerCompartmentItemSemanticEditPolicy() {
		super(
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_3006 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.Attribute2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
