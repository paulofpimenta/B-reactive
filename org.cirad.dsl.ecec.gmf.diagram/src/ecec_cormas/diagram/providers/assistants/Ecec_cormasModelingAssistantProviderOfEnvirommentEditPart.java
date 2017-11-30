/*
 * 
 */
package ecec_cormas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ecec_cormasModelingAssistantProviderOfEnvirommentEditPart extends
		ecec_cormas.diagram.providers.Ecec_cormasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ecec_cormas.diagram.edit.parts.EnvirommentEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			ecec_cormas.diagram.edit.parts.EnvirommentEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(ecec_cormas.diagram.edit.parts.EnvirommentEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ecec_cormas.diagram.edit.parts.EnvirommentEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ecec_cormas.diagram.edit.parts.InitEditPart) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001);
		}
		if (targetEditPart instanceof ecec_cormas.diagram.edit.parts.Init2EditPart) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(ecec_cormas.diagram.edit.parts.EnvirommentEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			ecec_cormas.diagram.edit.parts.EnvirommentEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004);
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001);
		}
		return types;
	}

}
