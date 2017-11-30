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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EnvirommentLoadEnviromentReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public EnvirommentLoadEnviromentReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ecec_cormas.Enviromment) {
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
		if (!(oldEnd instanceof ecec_cormas.Init && newEnd instanceof ecec_cormas.Enviromment)) {
			return false;
		}
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEnvirommentLoadEnviroment_4001(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ecec_cormas.Init && newEnd instanceof ecec_cormas.Init)) {
			return false;
		}
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEnvirommentLoadEnviroment_4001(
						getOldSource(), getNewTarget());
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
		getOldSource().getLoadEnviroment().remove(getOldTarget());
		getNewSource().getLoadEnviroment().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getLoadEnviroment().remove(getOldTarget());
		getOldSource().getLoadEnviroment().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Enviromment getOldSource() {
		return (ecec_cormas.Enviromment) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Enviromment getNewSource() {
		return (ecec_cormas.Enviromment) newEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Init getOldTarget() {
		return (ecec_cormas.Init) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Init getNewTarget() {
		return (ecec_cormas.Init) newEnd;
	}
}
