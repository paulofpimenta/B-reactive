/*
 * 
 */
package ecec_cormas.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends
		ecec_cormas.diagram.edit.policies.Ecec_cormasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelItemSemanticEditPolicy() {
		super(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Model_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.VegetationUnitCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ForagerCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_2003 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.LogisticGrowthCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.InitCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ControlCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_2006 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.CustomProtocolCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ClassCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_2008 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.MethodCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.AttributeCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.EnvirommentCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.PoVCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ProbeCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.SchedulerCreateCommand(
					req));
		}
		if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014 == req
				.getElementType()) {
			return getGEFWrapper(new ecec_cormas.diagram.edit.commands.ModelParametersCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
