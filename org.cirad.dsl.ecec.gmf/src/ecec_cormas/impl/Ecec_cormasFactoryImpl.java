/**
 */
package ecec_cormas.impl;

import ecec_cormas.Attribute;
import ecec_cormas.BooleanType;
import ecec_cormas.Control;
import ecec_cormas.CormasClassType;
import ecec_cormas.CustomProtocol;
import ecec_cormas.DiagramElement;
import ecec_cormas.Ecec_cormasFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ecec_cormasFactoryImpl extends EFactoryImpl implements Ecec_cormasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ecec_cormasFactory init() {
		try {
			Ecec_cormasFactory theEcec_cormasFactory = (Ecec_cormasFactory)EPackage.Registry.INSTANCE.getEFactory(Ecec_cormasPackage.eNS_URI);
			if (theEcec_cormasFactory != null) {
				return theEcec_cormasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ecec_cormasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecec_cormasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ecec_cormasPackage.DIAGRAM_ELEMENT: return createDiagramElement();
			case Ecec_cormasPackage.SPACE: return createSpace();
			case Ecec_cormasPackage.CLASS: return createClass();
			case Ecec_cormasPackage.METHOD: return createMethod();
			case Ecec_cormasPackage.ATTRIBUTE: return createAttribute();
			case Ecec_cormasPackage.PROTOCOL: return createProtocol();
			case Ecec_cormasPackage.ENVIROMMENT: return createEnviromment();
			case Ecec_cormasPackage.MODEL: return createModel();
			case Ecec_cormasPackage.MODEL_PARAMETERS: return createModelParameters();
			case Ecec_cormasPackage.VEGETATION_UNIT: return createVegetationUnit();
			case Ecec_cormasPackage.FORAGER: return createForager();
			case Ecec_cormasPackage.LOGISTIC_GROWTH: return createLogisticGrowth();
			case Ecec_cormasPackage.INIT: return createInit();
			case Ecec_cormasPackage.CONTROL: return createControl();
			case Ecec_cormasPackage.CUSTOM_PROTOCOL: return createCustomProtocol();
			case Ecec_cormasPackage.PO_V: return createPoV();
			case Ecec_cormasPackage.PROBE: return createProbe();
			case Ecec_cormasPackage.SCHEDULER: return createScheduler();
			case Ecec_cormasPackage.RELATION: return createRelation();
			case Ecec_cormasPackage.PROBE_INIT: return createProbeInit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Ecec_cormasPackage.CORMAS_CLASS_TYPE:
				return createCormasClassTypeFromString(eDataType, initialValue);
			case Ecec_cormasPackage.BOOLEAN_TYPE:
				return createBooleanTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Ecec_cormasPackage.CORMAS_CLASS_TYPE:
				return convertCormasClassTypeToString(eDataType, instanceValue);
			case Ecec_cormasPackage.BOOLEAN_TYPE:
				return convertBooleanTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement createDiagramElement() {
		DiagramElementImpl diagramElement = new DiagramElementImpl();
		return diagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space createSpace() {
		SpaceImpl space = new SpaceImpl();
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecec_cormas.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enviromment createEnviromment() {
		EnvirommentImpl enviromment = new EnvirommentImpl();
		return enviromment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameters createModelParameters() {
		ModelParametersImpl modelParameters = new ModelParametersImpl();
		return modelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VegetationUnit createVegetationUnit() {
		VegetationUnitImpl vegetationUnit = new VegetationUnitImpl();
		return vegetationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forager createForager() {
		ForagerImpl forager = new ForagerImpl();
		return forager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticGrowth createLogisticGrowth() {
		LogisticGrowthImpl logisticGrowth = new LogisticGrowthImpl();
		return logisticGrowth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init createInit() {
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomProtocol createCustomProtocol() {
		CustomProtocolImpl customProtocol = new CustomProtocolImpl();
		return customProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoV createPoV() {
		PoVImpl poV = new PoVImpl();
		return poV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe createProbe() {
		ProbeImpl probe = new ProbeImpl();
		return probe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbeInit createProbeInit() {
		ProbeInitImpl probeInit = new ProbeInitImpl();
		return probeInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CormasClassType createCormasClassTypeFromString(EDataType eDataType, String initialValue) {
		CormasClassType result = CormasClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCormasClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanTypeFromString(EDataType eDataType, String initialValue) {
		BooleanType result = BooleanType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecec_cormasPackage getEcec_cormasPackage() {
		return (Ecec_cormasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ecec_cormasPackage getPackage() {
		return Ecec_cormasPackage.eINSTANCE;
	}

} //Ecec_cormasFactoryImpl
