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
public class Ecec_cormasModelingAssistantProviderOfInit2EditPart extends
		ecec_cormas.diagram.providers.Ecec_cormasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ecec_cormas.diagram.edit.parts.Init2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ecec_cormas.diagram.edit.parts.Init2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001);
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
				(ecec_cormas.diagram.edit.parts.Init2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ecec_cormas.diagram.edit.parts.Init2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010);
		}
		return types;
	}

}
