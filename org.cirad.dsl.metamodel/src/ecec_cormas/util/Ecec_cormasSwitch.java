/**
 */
package ecec_cormas.util;

import ecec_cormas.Attribute;
import ecec_cormas.Control;
import ecec_cormas.CustomProtocol;
import ecec_cormas.DiagramElement;
import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.Enviromment;
import ecec_cormas.Forager;
import ecec_cormas.Init;
import ecec_cormas.LogisticGrowth;
import ecec_cormas.Method;
import ecec_cormas.Model;
import ecec_cormas.ModelParameters;
import ecec_cormas.PoV;
import ecec_cormas.Probe;
import ecec_cormas.ProbeInit;
import ecec_cormas.Protocol;
import ecec_cormas.Relation;
import ecec_cormas.Scheduler;
import ecec_cormas.Space;
import ecec_cormas.VegetationUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecec_cormas.Ecec_cormasPackage
 * @generated
 */
public class Ecec_cormasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ecec_cormasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecec_cormasSwitch() {
		if (modelPackage == null) {
			modelPackage = Ecec_cormasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ecec_cormasPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.SPACE: {
				Space space = (Space)theEObject;
				T result = caseSpace(space);
				if (result == null) result = caseDiagramElement(space);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.CLASS: {
				ecec_cormas.Class class_ = (ecec_cormas.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseDiagramElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseDiagramElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseDiagramElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = caseDiagramElement(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.ENVIROMMENT: {
				Enviromment enviromment = (Enviromment)theEObject;
				T result = caseEnviromment(enviromment);
				if (result == null) result = caseDiagramElement(enviromment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.MODEL_PARAMETERS: {
				ModelParameters modelParameters = (ModelParameters)theEObject;
				T result = caseModelParameters(modelParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.VEGETATION_UNIT: {
				VegetationUnit vegetationUnit = (VegetationUnit)theEObject;
				T result = caseVegetationUnit(vegetationUnit);
				if (result == null) result = caseClass(vegetationUnit);
				if (result == null) result = caseDiagramElement(vegetationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.FORAGER: {
				Forager forager = (Forager)theEObject;
				T result = caseForager(forager);
				if (result == null) result = caseClass(forager);
				if (result == null) result = caseDiagramElement(forager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.LOGISTIC_GROWTH: {
				LogisticGrowth logisticGrowth = (LogisticGrowth)theEObject;
				T result = caseLogisticGrowth(logisticGrowth);
				if (result == null) result = caseMethod(logisticGrowth);
				if (result == null) result = caseDiagramElement(logisticGrowth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.INIT: {
				Init init = (Init)theEObject;
				T result = caseInit(init);
				if (result == null) result = caseProtocol(init);
				if (result == null) result = caseDiagramElement(init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseProtocol(control);
				if (result == null) result = caseDiagramElement(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.CUSTOM_PROTOCOL: {
				CustomProtocol customProtocol = (CustomProtocol)theEObject;
				T result = caseCustomProtocol(customProtocol);
				if (result == null) result = caseProtocol(customProtocol);
				if (result == null) result = caseDiagramElement(customProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.PO_V: {
				PoV poV = (PoV)theEObject;
				T result = casePoV(poV);
				if (result == null) result = caseDiagramElement(poV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.PROBE: {
				Probe probe = (Probe)theEObject;
				T result = caseProbe(probe);
				if (result == null) result = caseDiagramElement(probe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseDiagramElement(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecec_cormasPackage.PROBE_INIT: {
				ProbeInit probeInit = (ProbeInit)theEObject;
				T result = caseProbeInit(probeInit);
				if (result == null) result = caseDiagramElement(probeInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpace(Space object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(ecec_cormas.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enviromment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enviromment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnviromment(Enviromment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelParameters(ModelParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vegetation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vegetation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVegetationUnit(VegetationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForager(Forager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Growth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Growth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticGrowth(LogisticGrowth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInit(Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomProtocol(CustomProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Po V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Po V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoV(PoV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbe(Probe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probe Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probe Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbeInit(ProbeInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ecec_cormasSwitch
