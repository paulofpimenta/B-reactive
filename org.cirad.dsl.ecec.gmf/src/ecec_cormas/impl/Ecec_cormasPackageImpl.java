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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ecec_cormasPackageImpl extends EPackageImpl implements Ecec_cormasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envirommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vegetationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foragerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticGrowthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probeInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cormasClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecec_cormas.Ecec_cormasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ecec_cormasPackageImpl() {
		super(eNS_URI, Ecec_cormasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Ecec_cormasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ecec_cormasPackage init() {
		if (isInited) return (Ecec_cormasPackage)EPackage.Registry.INSTANCE.getEPackage(Ecec_cormasPackage.eNS_URI);

		// Obtain or create and register package
		Ecec_cormasPackageImpl theEcec_cormasPackage = (Ecec_cormasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ecec_cormasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ecec_cormasPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcec_cormasPackage.createPackageContents();

		// Initialize created meta-data
		theEcec_cormasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcec_cormasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ecec_cormasPackage.eNS_URI, theEcec_cormasPackage);
		return theEcec_cormasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElement() {
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpace() {
		return spaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Path() {
		return (EAttribute)spaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Name() {
		return (EAttribute)spaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Protocols() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Type() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_UseAttributes() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_InstanceType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_NotifyObservers() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_SetterAcessor() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_GetterAcessor() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocol_Methods() {
		return (EReference)protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnviromment() {
		return envirommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnviromment_Name() {
		return (EAttribute)envirommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnviromment_Path() {
		return (EAttribute)envirommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnviromment_LoadEnviroment() {
		return (EReference)envirommentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Parameters() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Relations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelParameters() {
		return modelParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelParameters_Author() {
		return (EAttribute)modelParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelParameters_ModelName() {
		return (EAttribute)modelParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVegetationUnit() {
		return vegetationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVegetationUnit_K() {
		return (EAttribute)vegetationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVegetationUnit_R() {
		return (EAttribute)vegetationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVegetationUnit_Biomass() {
		return (EAttribute)vegetationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForager() {
		return foragerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForager_CatabolicRate() {
		return (EAttribute)foragerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForager_FertilityThreshold() {
		return (EAttribute)foragerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForager_HaverstRate() {
		return (EAttribute)foragerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForager_Energy() {
		return (EAttribute)foragerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogisticGrowth() {
		return logisticGrowthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInit() {
		return initEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomProtocol() {
		return customProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProtocol_ProtocolName() {
		return (EAttribute)customProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoV() {
		return poVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoV_Name() {
		return (EAttribute)poVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoV_Pov() {
		return (EReference)poVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbe() {
		return probeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_Name() {
		return (EAttribute)probeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbe_Classes() {
		return (EReference)probeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbe_Attributes() {
		return (EReference)probeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Attributes() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_InitModel() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_To() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_From() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbeInit() {
		return probeInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbeInit_ProbeInitScheduler() {
		return (EReference)probeInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbeInit_ProbeInitAtt() {
		return (EReference)probeInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbeInit_Name() {
		return (EAttribute)probeInitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCormasClassType() {
		return cormasClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanType() {
		return booleanTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecec_cormasFactory getEcec_cormasFactory() {
		return (Ecec_cormasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diagramElementEClass = createEClass(DIAGRAM_ELEMENT);

		spaceEClass = createEClass(SPACE);
		createEAttribute(spaceEClass, SPACE__PATH);
		createEAttribute(spaceEClass, SPACE__NAME);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__PROTOCOLS);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEAttribute(classEClass, CLASS__NAME);
		createEAttribute(classEClass, CLASS__TYPE);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEReference(methodEClass, METHOD__USE_ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__INSTANCE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__NOTIFY_OBSERVERS);
		createEAttribute(attributeEClass, ATTRIBUTE__SETTER_ACESSOR);
		createEAttribute(attributeEClass, ATTRIBUTE__GETTER_ACESSOR);

		protocolEClass = createEClass(PROTOCOL);
		createEReference(protocolEClass, PROTOCOL__METHODS);

		envirommentEClass = createEClass(ENVIROMMENT);
		createEAttribute(envirommentEClass, ENVIROMMENT__NAME);
		createEAttribute(envirommentEClass, ENVIROMMENT__PATH);
		createEReference(envirommentEClass, ENVIROMMENT__LOAD_ENVIROMENT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEReference(modelEClass, MODEL__PARAMETERS);
		createEReference(modelEClass, MODEL__RELATIONS);

		modelParametersEClass = createEClass(MODEL_PARAMETERS);
		createEAttribute(modelParametersEClass, MODEL_PARAMETERS__AUTHOR);
		createEAttribute(modelParametersEClass, MODEL_PARAMETERS__MODEL_NAME);

		vegetationUnitEClass = createEClass(VEGETATION_UNIT);
		createEAttribute(vegetationUnitEClass, VEGETATION_UNIT__K);
		createEAttribute(vegetationUnitEClass, VEGETATION_UNIT__R);
		createEAttribute(vegetationUnitEClass, VEGETATION_UNIT__BIOMASS);

		foragerEClass = createEClass(FORAGER);
		createEAttribute(foragerEClass, FORAGER__CATABOLIC_RATE);
		createEAttribute(foragerEClass, FORAGER__FERTILITY_THRESHOLD);
		createEAttribute(foragerEClass, FORAGER__HAVERST_RATE);
		createEAttribute(foragerEClass, FORAGER__ENERGY);

		logisticGrowthEClass = createEClass(LOGISTIC_GROWTH);

		initEClass = createEClass(INIT);

		controlEClass = createEClass(CONTROL);

		customProtocolEClass = createEClass(CUSTOM_PROTOCOL);
		createEAttribute(customProtocolEClass, CUSTOM_PROTOCOL__PROTOCOL_NAME);

		poVEClass = createEClass(PO_V);
		createEAttribute(poVEClass, PO_V__NAME);
		createEReference(poVEClass, PO_V__POV);

		probeEClass = createEClass(PROBE);
		createEAttribute(probeEClass, PROBE__NAME);
		createEReference(probeEClass, PROBE__CLASSES);
		createEReference(probeEClass, PROBE__ATTRIBUTES);

		schedulerEClass = createEClass(SCHEDULER);
		createEReference(schedulerEClass, SCHEDULER__ATTRIBUTES);
		createEReference(schedulerEClass, SCHEDULER__INIT_MODEL);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__NAME);
		createEReference(relationEClass, RELATION__TO);
		createEReference(relationEClass, RELATION__FROM);

		probeInitEClass = createEClass(PROBE_INIT);
		createEReference(probeInitEClass, PROBE_INIT__PROBE_INIT_SCHEDULER);
		createEReference(probeInitEClass, PROBE_INIT__PROBE_INIT_ATT);
		createEAttribute(probeInitEClass, PROBE_INIT__NAME);

		// Create enums
		cormasClassTypeEEnum = createEEnum(CORMAS_CLASS_TYPE);
		booleanTypeEEnum = createEEnum(BOOLEAN_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spaceEClass.getESuperTypes().add(this.getDiagramElement());
		classEClass.getESuperTypes().add(this.getDiagramElement());
		methodEClass.getESuperTypes().add(this.getDiagramElement());
		attributeEClass.getESuperTypes().add(this.getDiagramElement());
		protocolEClass.getESuperTypes().add(this.getDiagramElement());
		envirommentEClass.getESuperTypes().add(this.getDiagramElement());
		vegetationUnitEClass.getESuperTypes().add(this.getClass_());
		foragerEClass.getESuperTypes().add(this.getClass_());
		logisticGrowthEClass.getESuperTypes().add(this.getMethod());
		initEClass.getESuperTypes().add(this.getProtocol());
		controlEClass.getESuperTypes().add(this.getProtocol());
		customProtocolEClass.getESuperTypes().add(this.getProtocol());
		poVEClass.getESuperTypes().add(this.getDiagramElement());
		probeEClass.getESuperTypes().add(this.getDiagramElement());
		schedulerEClass.getESuperTypes().add(this.getDiagramElement());
		probeInitEClass.getESuperTypes().add(this.getDiagramElement());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceEClass, Space.class, "Space", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpace_Path(), ecorePackage.getEString(), "path", null, 0, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpace_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, ecec_cormas.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Protocols(), this.getProtocol(), null, "protocols", null, 0, -1, ecec_cormas.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ecec_cormas.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ecec_cormas.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Type(), this.getCormasClassType(), "Type", null, 0, 1, ecec_cormas.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_UseAttributes(), this.getAttribute(), null, "useAttributes", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_InstanceType(), this.getBooleanType(), "InstanceType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_NotifyObservers(), this.getBooleanType(), "NotifyObservers", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_SetterAcessor(), this.getBooleanType(), "SetterAcessor", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_GetterAcessor(), this.getBooleanType(), "GetterAcessor", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocol_Methods(), this.getMethod(), null, "methods", null, 0, -1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envirommentEClass, Enviromment.class, "Enviromment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnviromment_Name(), ecorePackage.getEString(), "Name", "", 1, 1, Enviromment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnviromment_Path(), ecorePackage.getEString(), "Path", null, 0, 1, Enviromment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnviromment_LoadEnviroment(), this.getInit(), null, "LoadEnviroment", null, 0, -1, Enviromment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getDiagramElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Parameters(), this.getModelParameters(), null, "parameters", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Relations(), this.getRelation(), null, "relations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelParametersEClass, ModelParameters.class, "ModelParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelParameters_Author(), ecorePackage.getEString(), "Author", null, 0, 1, ModelParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelParameters_ModelName(), ecorePackage.getEString(), "ModelName", null, 0, 1, ModelParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vegetationUnitEClass, VegetationUnit.class, "VegetationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVegetationUnit_K(), ecorePackage.getEFloat(), "k", "10", 0, 1, VegetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVegetationUnit_R(), ecorePackage.getEFloat(), "r", "0.2", 0, 1, VegetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVegetationUnit_Biomass(), ecorePackage.getEFloat(), "Biomass", null, 0, 1, VegetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foragerEClass, Forager.class, "Forager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForager_CatabolicRate(), ecorePackage.getEFloat(), "CatabolicRate", "2", 0, 1, Forager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForager_FertilityThreshold(), ecorePackage.getEFloat(), "FertilityThreshold", "100", 0, 1, Forager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForager_HaverstRate(), ecorePackage.getEFloat(), "HaverstRate", null, 0, 1, Forager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForager_Energy(), ecorePackage.getEFloat(), "Energy", "50", 0, 1, Forager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticGrowthEClass, LogisticGrowth.class, "LogisticGrowth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initEClass, Init.class, "Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customProtocolEClass, CustomProtocol.class, "CustomProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomProtocol_ProtocolName(), ecorePackage.getEString(), "ProtocolName", "", 0, 1, CustomProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poVEClass, PoV.class, "PoV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoV_Name(), ecorePackage.getEString(), "Name", "", 1, 1, PoV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoV_Pov(), this.getClass_(), null, "pov", null, 0, 1, PoV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probeEClass, Probe.class, "Probe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbe_Name(), ecorePackage.getEString(), "Name", "", 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbe_Classes(), this.getClass_(), null, "classes", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbe_Attributes(), this.getAttribute(), null, "attributes", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_Attributes(), this.getAttribute(), null, "Attributes", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_InitModel(), this.getModelParameters(), null, "InitModel", null, 1, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_To(), this.getClass_(), null, "to", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_From(), this.getClass_(), null, "from", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probeInitEClass, ProbeInit.class, "ProbeInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbeInit_ProbeInitScheduler(), this.getScheduler(), null, "probeInitScheduler", null, 0, 1, ProbeInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbeInit_ProbeInitAtt(), this.getAttribute(), null, "probeInitAtt", null, 0, 1, ProbeInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbeInit_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ProbeInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cormasClassTypeEEnum, CormasClassType.class, "CormasClassType");
		addEEnumLiteral(cormasClassTypeEEnum, CormasClassType.AGENT_LOCATION);
		addEEnumLiteral(cormasClassTypeEEnum, CormasClassType.SPATIAL_ENTITY_CELL);
		addEEnumLiteral(cormasClassTypeEEnum, CormasClassType.INITIALIZATOR);

		initEEnum(booleanTypeEEnum, BooleanType.class, "BooleanType");
		addEEnumLiteral(booleanTypeEEnum, BooleanType.YES);
		addEEnumLiteral(booleanTypeEEnum, BooleanType.NO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.node
		createGmfAnnotations();
		// gmf.compartment
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.diagram
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.node";	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (methodEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/attribute.svg",
			 "label.icon", "false",
			 "label", "Name,value",
			 "label.pattern", "{0}:{1}",
			 "label.placement", "external",
			 "size", "40,40",
			 "resizable", "false"
		   });	
		addAnnotation
		  (envirommentEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/environemment3.svg",
			 "label.icon", "false",
			 "label", "Name",
			 "label.placement", "external",
			 "size", "60,60",
			 "resizable", "false"
		   });	
		addAnnotation
		  (modelParametersEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/model_config.svg",
			 "label.icon", "false",
			 "label", "ModelName",
			 "label.placement", "external",
			 "size", "60,60",
			 "resizable", "false"
		   });	
		addAnnotation
		  (vegetationUnitEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (foragerEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (logisticGrowthEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (initEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (controlEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (customProtocolEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (poVEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (probeEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/probes.svg",
			 "label.icon", "false",
			 "label", "Name",
			 "label.placement", "external",
			 "size", "60,60",
			 "resizable", "false"
		   });	
		addAnnotation
		  (schedulerEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getClass_Protocols(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocol_Methods(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getScheduler_Attributes(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getEnviromment_LoadEnviroment(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "label", "Load Enviromment",
			 "source.decoration", "none",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getProbe_Classes(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "label", "aClassProbe"
		   });	
		addAnnotation
		  (getProbe_Attributes(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "label", "aAttributeProbe"
		   });	
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "source", "from",
			 "target", "to",
			 "source.decoration", "none",
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
		   });
	}

} //Ecec_cormasPackageImpl
