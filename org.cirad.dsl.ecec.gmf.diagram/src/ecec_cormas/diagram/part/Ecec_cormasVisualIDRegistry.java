/*
 * 
 */
package ecec_cormas.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Ecec_cormasVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.cirad.dsl.ecec.gmf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ecec_cormas.Model) domainElement)) {
			return ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getModelID(containerView);
		if (!ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"ecec_cormas".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getVegetationUnit()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getForager()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getInit()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getControl()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getCustomProtocol()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getEnviromment()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getPoV()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getProbe()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getScheduler()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getModelParameters()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getInit()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getControl()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getCustomProtocol()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getInit()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getControl()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getCustomProtocol()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getLogisticGrowth()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getInit()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getControl()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID;
			}
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getCustomProtocol()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID;
			}
			break;
		case ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getModelID(containerView);
		if (!ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"ecec_cormas".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.VegetationUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ForagerNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowthNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.InitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ControlNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ClassNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.MethodNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.AttributeValueNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.EnvirommentNamePathEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.PoVNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ProbeProbeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.SchedulerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ModelParametersNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ModelParametersAuthorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ModelParametersModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.InitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowthName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.MethodName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ControlName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.AttributeValueName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.RelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ProbeClassProbesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID:
			if (ecec_cormas.diagram.edit.parts.ProbeAttributeProbesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ecec_cormas.Ecec_cormasPackage.eINSTANCE.getRelation()
				.isSuperTypeOf(domainElement.eClass())) {
			return ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ecec_cormas.Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return false;
		case ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID:
		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
