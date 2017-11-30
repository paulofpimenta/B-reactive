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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecec_cormas.Ecec_cormasPackage
 * @generated
 */
public class Ecec_cormasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ecec_cormasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecec_cormasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ecec_cormasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ecec_cormasSwitch<Adapter> modelSwitch =
		new Ecec_cormasSwitch<Adapter>() {
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseSpace(Space object) {
				return createSpaceAdapter();
			}
			@Override
			public Adapter caseClass(ecec_cormas.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseEnviromment(Enviromment object) {
				return createEnvirommentAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelParameters(ModelParameters object) {
				return createModelParametersAdapter();
			}
			@Override
			public Adapter caseVegetationUnit(VegetationUnit object) {
				return createVegetationUnitAdapter();
			}
			@Override
			public Adapter caseForager(Forager object) {
				return createForagerAdapter();
			}
			@Override
			public Adapter caseLogisticGrowth(LogisticGrowth object) {
				return createLogisticGrowthAdapter();
			}
			@Override
			public Adapter caseInit(Init object) {
				return createInitAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseCustomProtocol(CustomProtocol object) {
				return createCustomProtocolAdapter();
			}
			@Override
			public Adapter casePoV(PoV object) {
				return createPoVAdapter();
			}
			@Override
			public Adapter caseProbe(Probe object) {
				return createProbeAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseProbeInit(ProbeInit object) {
				return createProbeInitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Space
	 * @generated
	 */
	public Adapter createSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Enviromment <em>Enviromment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Enviromment
	 * @generated
	 */
	public Adapter createEnvirommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.ModelParameters <em>Model Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.ModelParameters
	 * @generated
	 */
	public Adapter createModelParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.VegetationUnit <em>Vegetation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.VegetationUnit
	 * @generated
	 */
	public Adapter createVegetationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Forager <em>Forager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Forager
	 * @generated
	 */
	public Adapter createForagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.LogisticGrowth <em>Logistic Growth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.LogisticGrowth
	 * @generated
	 */
	public Adapter createLogisticGrowthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Init
	 * @generated
	 */
	public Adapter createInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.CustomProtocol <em>Custom Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.CustomProtocol
	 * @generated
	 */
	public Adapter createCustomProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.PoV <em>Po V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.PoV
	 * @generated
	 */
	public Adapter createPoVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Probe
	 * @generated
	 */
	public Adapter createProbeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecec_cormas.ProbeInit <em>Probe Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecec_cormas.ProbeInit
	 * @generated
	 */
	public Adapter createProbeInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ecec_cormasAdapterFactory
