/*
 * 
 */
package ecec_cormas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ecec_cormasModelingAssistantProviderOfAttributeEditPart extends
		ecec_cormas.diagram.providers.Ecec_cormasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ecec_cormas.diagram.edit.parts.AttributeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ecec_cormas.diagram.edit.parts.AttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(ecec_cormas.diagram.edit.parts.AttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ecec_cormas.diagram.edit.parts.AttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012);
		}
		return types;
	}

}
