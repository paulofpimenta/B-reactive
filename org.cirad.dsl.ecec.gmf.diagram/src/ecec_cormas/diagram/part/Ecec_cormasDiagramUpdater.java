/*
 * 
 */
package ecec_cormas.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Ecec_cormasDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID:
			return getVegetationUnitVegetationUnitProtocolsCompartment_7001SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID:
			return getInitInitMethodsCompartment_7002SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID:
			return getControlControlMethodsCompartment_7003SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID:
			return getCustomProtocolCustomProtocolMethodsCompartment_7004SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID:
			return getForagerForagerProtocolsCompartment_7005SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID:
			return getInitInitMethodsCompartment_7006SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID:
			return getControlControlMethodsCompartment_7007SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID:
			return getCustomProtocolCustomProtocolMethodsCompartment_7008SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID:
			return getClassClassProtocolsCompartment_7009SemanticChildren(view);
		case ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID:
			return getSchedulerSchedulerAttributesSchedulerCompartment_7010SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Model modelElement = (ecec_cormas.Model) view.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			ecec_cormas.DiagramElement childElement = (ecec_cormas.DiagramElement) it
					.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			ecec_cormas.ModelParameters childElement = modelElement
					.getParameters();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getVegetationUnitVegetationUnitProtocolsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.VegetationUnit modelElement = (ecec_cormas.VegetationUnit) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it
				.hasNext();) {
			ecec_cormas.Protocol childElement = (ecec_cormas.Protocol) it
					.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getInitInitMethodsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Init modelElement = (ecec_cormas.Init) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getControlControlMethodsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Control modelElement = (ecec_cormas.Control) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getCustomProtocolCustomProtocolMethodsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.CustomProtocol modelElement = (ecec_cormas.CustomProtocol) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getForagerForagerProtocolsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Forager modelElement = (ecec_cormas.Forager) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it
				.hasNext();) {
			ecec_cormas.Protocol childElement = (ecec_cormas.Protocol) it
					.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getInitInitMethodsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Init modelElement = (ecec_cormas.Init) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getControlControlMethodsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Control modelElement = (ecec_cormas.Control) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getCustomProtocolCustomProtocolMethodsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.CustomProtocol modelElement = (ecec_cormas.CustomProtocol) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it
				.hasNext();) {
			ecec_cormas.Method childElement = (ecec_cormas.Method) it.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getClassClassProtocolsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Class modelElement = (ecec_cormas.Class) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it
				.hasNext();) {
			ecec_cormas.Protocol childElement = (ecec_cormas.Protocol) it
					.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getSchedulerSchedulerAttributesSchedulerCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ecec_cormas.Scheduler modelElement = (ecec_cormas.Scheduler) containerView
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributesScheduler().iterator(); it
				.hasNext();) {
			ecec_cormas.Attribute childElement = (ecec_cormas.Attribute) it
					.next();
			int visualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getContainedLinks(
			View view) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			return getVegetationUnit_2001ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			return getForager_2002ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			return getLogisticGrowth_2003ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			return getInit_2004ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			return getControl_2005ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			return getCustomProtocol_2006ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2007ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2008ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_2009ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			return getEnviromment_2010ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			return getPoV_2011ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			return getProbe_2012ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			return getScheduler_2013ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			return getModelParameters_2014ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			return getInit_3001ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			return getLogisticGrowth_3002ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			return getMethod_3003ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			return getControl_3004ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			return getCustomProtocol_3005ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3006ContainedLinks(view);
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingLinks(
			View view) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			return getVegetationUnit_2001IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			return getForager_2002IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			return getLogisticGrowth_2003IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			return getInit_2004IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			return getControl_2005IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			return getCustomProtocol_2006IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2007IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2008IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_2009IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			return getEnviromment_2010IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			return getPoV_2011IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			return getProbe_2012IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			return getScheduler_2013IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			return getModelParameters_2014IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			return getInit_3001IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			return getLogisticGrowth_3002IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			return getMethod_3003IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			return getControl_3004IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			return getCustomProtocol_3005IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3006IncomingLinks(view);
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			return getVegetationUnit_2001OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			return getForager_2002OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			return getLogisticGrowth_2003OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			return getInit_2004OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			return getControl_2005OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			return getCustomProtocol_2006OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2007OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2008OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_2009OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			return getEnviromment_2010OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			return getPoV_2011OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			return getProbe_2012OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			return getScheduler_2013OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			return getModelParameters_2014OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			return getInit_3001OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			return getLogisticGrowth_3002OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			return getMethod_3003OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			return getControl_3004OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			return getCustomProtocol_3005OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3006OutgoingLinks(view);
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		ecec_cormas.Model modelElement = (ecec_cormas.Model) view.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getVegetationUnit_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getForager_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getClass_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getEnviromment_2010ContainedLinks(
			View view) {
		ecec_cormas.Enviromment modelElement = (ecec_cormas.Enviromment) view
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getPoV_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getProbe_2012ContainedLinks(
			View view) {
		ecec_cormas.Probe modelElement = (ecec_cormas.Probe) view.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Probe_ClassProbes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Probe_AttributeProbes_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getScheduler_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getModelParameters_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getRelation_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getVegetationUnit_2001IncomingLinks(
			View view) {
		ecec_cormas.VegetationUnit modelElement = (ecec_cormas.VegetationUnit) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Probe_ClassProbes_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getForager_2002IncomingLinks(
			View view) {
		ecec_cormas.Forager modelElement = (ecec_cormas.Forager) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Probe_ClassProbes_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_2004IncomingLinks(
			View view) {
		ecec_cormas.Init modelElement = (ecec_cormas.Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getClass_2007IncomingLinks(
			View view) {
		ecec_cormas.Class modelElement = (ecec_cormas.Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Probe_ClassProbes_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_2009IncomingLinks(
			View view) {
		ecec_cormas.Attribute modelElement = (ecec_cormas.Attribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Probe_AttributeProbes_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getEnviromment_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getPoV_2011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getProbe_2012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getScheduler_2013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getModelParameters_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_3001IncomingLinks(
			View view) {
		ecec_cormas.Init modelElement = (ecec_cormas.Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_3006IncomingLinks(
			View view) {
		ecec_cormas.Attribute modelElement = (ecec_cormas.Attribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Probe_AttributeProbes_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getRelation_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getVegetationUnit_2001OutgoingLinks(
			View view) {
		ecec_cormas.VegetationUnit modelElement = (ecec_cormas.VegetationUnit) view
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getForager_2002OutgoingLinks(
			View view) {
		ecec_cormas.Forager modelElement = (ecec_cormas.Forager) view
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getClass_2007OutgoingLinks(
			View view) {
		ecec_cormas.Class modelElement = (ecec_cormas.Class) view.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getEnviromment_2010OutgoingLinks(
			View view) {
		ecec_cormas.Enviromment modelElement = (ecec_cormas.Enviromment) view
				.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getPoV_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getProbe_2012OutgoingLinks(
			View view) {
		ecec_cormas.Probe modelElement = (ecec_cormas.Probe) view.getElement();
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Probe_ClassProbes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Probe_AttributeProbes_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getScheduler_2013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getModelParameters_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getInit_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getLogisticGrowth_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getMethod_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getControl_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getCustomProtocol_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getAttribute_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getRelation_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4004(
			ecec_cormas.Model container) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ecec_cormas.Relation) {
				continue;
			}
			ecec_cormas.Relation link = (ecec_cormas.Relation) linkObject;
			if (ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID != ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ecec_cormas.Class) {
				continue;
			}
			ecec_cormas.Class dst = (ecec_cormas.Class) theTarget;
			List sources = link.getFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ecec_cormas.Class) {
				continue;
			}
			ecec_cormas.Class src = (ecec_cormas.Class) theSource;
			result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
					src,
					dst,
					link,
					ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004,
					ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4004(
			ecec_cormas.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getRelation_To()
					|| false == setting.getEObject() instanceof ecec_cormas.Relation) {
				continue;
			}
			ecec_cormas.Relation link = (ecec_cormas.Relation) setting
					.getEObject();
			if (ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID != ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ecec_cormas.Class) {
				continue;
			}
			ecec_cormas.Class src = (ecec_cormas.Class) theSource;
			result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
					src,
					target,
					link,
					ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004,
					ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(
			ecec_cormas.Init target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getEnviromment_LoadEnviroment()) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
						setting.getEObject(),
						target,
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001,
						ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingFeatureModelFacetLinks_Probe_ClassProbes_4003(
			ecec_cormas.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getProbe_ClassProbes()) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
						setting.getEObject(),
						target,
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003,
						ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingFeatureModelFacetLinks_Probe_AttributeProbes_4005(
			ecec_cormas.Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getProbe_AttributeProbes()) {
				result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
						setting.getEObject(),
						target,
						ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005,
						ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_4004(
			ecec_cormas.Class source) {
		ecec_cormas.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ecec_cormas.Model) {
				container = (ecec_cormas.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ecec_cormas.Relation) {
				continue;
			}
			ecec_cormas.Relation link = (ecec_cormas.Relation) linkObject;
			if (ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID != ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ecec_cormas.Class) {
				continue;
			}
			ecec_cormas.Class dst = (ecec_cormas.Class) theTarget;
			List sources = link.getFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ecec_cormas.Class) {
				continue;
			}
			ecec_cormas.Class src = (ecec_cormas.Class) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
					src,
					dst,
					link,
					ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004,
					ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingFeatureModelFacetLinks_Enviromment_LoadEnviroment_4001(
			ecec_cormas.Enviromment source) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		for (Iterator<?> destinations = source.getLoadEnviroment().iterator(); destinations
				.hasNext();) {
			ecec_cormas.Init destination = (ecec_cormas.Init) destinations
					.next();
			result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
					source,
					destination,
					ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001,
					ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingFeatureModelFacetLinks_Probe_ClassProbes_4003(
			ecec_cormas.Probe source) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		ecec_cormas.Class destination = source.getClassProbes();
		if (destination == null) {
			return result;
		}
		result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
				source,
				destination,
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003,
				ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingFeatureModelFacetLinks_Probe_AttributeProbes_4005(
			ecec_cormas.Probe source) {
		LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> result = new LinkedList<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor>();
		ecec_cormas.Attribute destination = source.getAttributeProbes();
		if (destination == null) {
			return result;
		}
		result.add(new ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor(
				source,
				destination,
				ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005,
				ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ecec_cormas.diagram.part.Ecec_cormasNodeDescriptor> getSemanticChildren(
				View view) {
			return Ecec_cormasDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getContainedLinks(
				View view) {
			return Ecec_cormasDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getIncomingLinks(
				View view) {
			return Ecec_cormasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ecec_cormas.diagram.part.Ecec_cormasLinkDescriptor> getOutgoingLinks(
				View view) {
			return Ecec_cormasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
