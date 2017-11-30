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
public class Ecec_cormasModelingAssistantProviderOfClassEditPart extends
		ecec_cormas.diagram.providers.Ecec_cormasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ecec_cormas.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			ecec_cormas.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
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
				(ecec_cormas.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ecec_cormas.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ecec_cormas.diagram.edit.parts.VegetationUnitEditPart) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
		}
		if (targetEditPart instanceof ecec_cormas.diagram.edit.parts.ForagerEditPart) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
		}
		if (targetEditPart instanceof ecec_cormas.diagram.edit.parts.ClassEditPart) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
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
				(ecec_cormas.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			ecec_cormas.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001);
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002);
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ecec_cormas.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ecec_cormas.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003);
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
				(ecec_cormas.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ecec_cormas.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001);
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002);
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007);
		} else if (relationshipType == ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003) {
			types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012);
		}
		return types;
	}

}
