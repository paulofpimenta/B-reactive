/*
 * 
 */
package ecec_cormas.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Ecec_cormasNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem
				&& !isOwnView(((ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup group = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) element;
			return ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem navigatorItem = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.cirad.org/dsl/ecec?Model", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Model_1000); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?VegetationUnit", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Forager", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?LogisticGrowth", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_2003); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Init", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Control", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?CustomProtocol", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_2006); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Class", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Method", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_2008); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Attribute", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Enviromment", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?PoV", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Probe", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?Scheduler", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.cirad.org/dsl/ecec?ModelParameters", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?Init", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?LogisticGrowth", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_3002); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?Method", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_3003); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?Control", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_3004); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?CustomProtocol", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_3005); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.cirad.org/dsl/ecec?Attribute", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_3006); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.cirad.org/dsl/ecec?Enviromment?LoadEnviroment", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.cirad.org/dsl/ecec?Probe?classProbes", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.cirad.org/dsl/ecec?Relation", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004); //$NON-NLS-1$
		case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.cirad.org/dsl/ecec?Probe?attributeProbes", ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& ecec_cormas.diagram.providers.Ecec_cormasElementTypes
						.isKnownElementType(elementType)) {
			image = ecec_cormas.diagram.providers.Ecec_cormasElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup group = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem navigatorItem = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			return getVegetationUnit_2001Text(view);
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			return getForager_2002Text(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			return getLogisticGrowth_2003Text(view);
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			return getInit_2004Text(view);
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			return getControl_2005Text(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			return getCustomProtocol_2006Text(view);
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2007Text(view);
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2008Text(view);
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_2009Text(view);
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			return getEnviromment_2010Text(view);
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			return getPoV_2011Text(view);
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			return getProbe_2012Text(view);
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			return getScheduler_2013Text(view);
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			return getModelParameters_2014Text(view);
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			return getInit_3001Text(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			return getLogisticGrowth_3002Text(view);
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			return getMethod_3003Text(view);
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			return getControl_3004Text(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			return getCustomProtocol_3005Text(view);
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3006Text(view);
		case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID:
			return getEnvirommentLoadEnviroment_4001Text(view);
		case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID:
			return getProbeClassProbes_4003Text(view);
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4004Text(view);
		case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID:
			return getProbeAttributeProbes_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVegetationUnit_2001Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.VegetationUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForager_2002Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ForagerNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogisticGrowth_2003Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_2003,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.LogisticGrowthNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInit_2004Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.InitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControl_2005Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ControlNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomProtocol_2006Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_2006,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2007Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ClassNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_2008Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_2008,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.MethodNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2009Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.AttributeValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnviromment_2010Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.EnvirommentNamePathEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPoV_2011Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.PoVNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProbe_2012Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ProbeProbeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScheduler_2013Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.SchedulerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelParameters_2014Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ModelParametersNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInit_3001Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.InitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogisticGrowth_3002Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_3002,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.LogisticGrowthName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_3003Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_3003,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.MethodName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControl_3004Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_3004,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.ControlName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomProtocol_3005Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_3005,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3006Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_3006,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.AttributeValueName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnvirommentLoadEnviroment_4001Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProbeClassProbes_4003Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelation_4004Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004,
						view.getElement() != null ? view.getElement() : view,
						ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
								.getType(ecec_cormas.diagram.edit.parts.RelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProbeAttributeProbes_4005Text(View view) {
		IParser parser = ecec_cormas.diagram.providers.Ecec_cormasParserProvider
				.getParser(
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
						.getModelID(view));
	}

}
