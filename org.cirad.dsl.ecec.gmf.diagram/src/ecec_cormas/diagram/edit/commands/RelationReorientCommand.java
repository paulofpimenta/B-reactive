/*
 * 
 */
package ecec_cormas.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RelationReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ecec_cormas.Relation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ecec_cormas.Class && newEnd instanceof ecec_cormas.Class)) {
			return false;
		}
		if (getLink().getTo().size() != 1) {
			return false;
		}
		ecec_cormas.Class target = (ecec_cormas.Class) getLink().getTo().get(0);
		if (!(getLink().eContainer() instanceof ecec_cormas.Model)) {
			return false;
		}
		ecec_cormas.Model container = (ecec_cormas.Model) getLink()
				.eContainer();
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ecec_cormas.Class && newEnd instanceof ecec_cormas.Class)) {
			return false;
		}
		if (getLink().getFrom().size() != 1) {
			return false;
		}
		ecec_cormas.Class source = (ecec_cormas.Class) getLink().getFrom().get(
				0);
		if (!(getLink().eContainer() instanceof ecec_cormas.Model)) {
			return false;
		}
		ecec_cormas.Model container = (ecec_cormas.Model) getLink()
				.eContainer();
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_4004(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getFrom().remove(getOldSource());
		getLink().getFrom().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTo().remove(getOldTarget());
		getLink().getTo().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Relation getLink() {
		return (ecec_cormas.Relation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Class getOldSource() {
		return (ecec_cormas.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Class getNewSource() {
		return (ecec_cormas.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Class getOldTarget() {
		return (ecec_cormas.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Class getNewTarget() {
		return (ecec_cormas.Class) newEnd;
	}
}
