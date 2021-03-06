/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ProbeItemSemanticEditPolicy extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProbeItemSemanticEditPolicy() {
		super(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(outgoingLink) == ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(outgoingLink) == ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ProbeClassProbesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ProbeAttributeProbesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003 == req
				.getElementType()) {
			return null;
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID:
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ProbeClassProbesReorientCommand(
					req));
		case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID:
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ProbeAttributeProbesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
