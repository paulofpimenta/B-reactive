/*
 * 
 */
package ecec_cormas.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Ecec_cormasEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(view)) {

			case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ModelEditPart(view);

			case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.VegetationUnitEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.VegetationUnitNameTypeEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.VegetationUnitNameTypeEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ForagerEditPart(view);

			case ecec_cormas.diagram.edit.parts.ForagerNameTypeEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ForagerNameTypeEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.LogisticGrowthNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.LogisticGrowthNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.InitEditPart(view);

			case ecec_cormas.diagram.edit.parts.InitNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.InitNameEditPart(view);

			case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ControlEditPart(view);

			case ecec_cormas.diagram.edit.parts.ControlNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ControlNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocolEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ClassEditPart(view);

			case ecec_cormas.diagram.edit.parts.ClassNameTypeEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ClassNameTypeEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.MethodEditPart(view);

			case ecec_cormas.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.MethodNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.AttributeEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.AttributeValueNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.AttributeValueNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.EnvirommentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.EnvirommentNamePathEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.EnvirommentNamePathEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.PoVEditPart(view);

			case ecec_cormas.diagram.edit.parts.PoVNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.PoVNameEditPart(view);

			case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeEditPart(view);

			case ecec_cormas.diagram.edit.parts.ProbeProbeNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeProbeNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.SchedulerEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.SchedulerNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.SchedulerNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ModelParametersEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ModelParametersNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ModelParametersNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ModelParametersAuthorEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ModelParametersAuthorEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ModelParametersModelNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ModelParametersModelNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.Init2EditPart(view);

			case ecec_cormas.diagram.edit.parts.InitName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.InitName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.LogisticGrowthName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.LogisticGrowthName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.Method2EditPart(view);

			case ecec_cormas.diagram.edit.parts.MethodName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.MethodName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.Control2EditPart(view);

			case ecec_cormas.diagram.edit.parts.ControlName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ControlName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.Attribute2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.AttributeValueName2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.AttributeValueName2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.RelationEditPart(view);

			case ecec_cormas.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.RelationNameEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentExternalLabelEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentExternalLabelEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ProbeClassProbesExternalLabelEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeClassProbesExternalLabelEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart(
						view);

			case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesExternalLabelEditPart.VISUAL_ID:
				return new ecec_cormas.diagram.edit.parts.ProbeAttributeProbesExternalLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
