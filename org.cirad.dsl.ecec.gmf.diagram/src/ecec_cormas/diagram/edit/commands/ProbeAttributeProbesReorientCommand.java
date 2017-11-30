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
public class ProbeAttributeProbesReorientCommand extends EditElementCommand {

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
	public ProbeAttributeProbesReorientCommand(
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
		if (false == referenceOwner instanceof ecec_cormas.Probe) {
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
		if (!(oldEnd instanceof ecec_cormas.Attribute && newEnd instanceof ecec_cormas.Probe)) {
			return false;
		}
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProbeAttributeProbes_4005(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ecec_cormas.Attribute && newEnd instanceof ecec_cormas.Attribute)) {
			return false;
		}
		return ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProbeAttributeProbes_4005(
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
		getOldSource().setAttributeProbes(null);
		getNewSource().setAttributeProbes(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setAttributeProbes(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Probe getOldSource() {
		return (ecec_cormas.Probe) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Probe getNewSource() {
		return (ecec_cormas.Probe) newEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Attribute getOldTarget() {
		return (ecec_cormas.Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ecec_cormas.Attribute getNewTarget() {
		return (ecec_cormas.Attribute) newEnd;
	}
}
