/**
 */
package ecec_cormas.impl;

import ecec_cormas.Attribute;
import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.ProbeInit;
import ecec_cormas.Scheduler;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.ProbeInitImpl#getProbeInitScheduler <em>Probe Init Scheduler</em>}</li>
 *   <li>{@link ecec_cormas.impl.ProbeInitImpl#getProbeInitAtt <em>Probe Init Att</em>}</li>
 *   <li>{@link ecec_cormas.impl.ProbeInitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbeInitImpl extends DiagramElementImpl implements ProbeInit {
	/**
	 * The cached value of the '{@link #getProbeInitScheduler() <em>Probe Init Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeInitScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler probeInitScheduler;

	/**
	 * The cached value of the '{@link #getProbeInitAtt() <em>Probe Init Att</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeInitAtt()
	 * @generated
	 * @ordered
	 */
	protected Attribute probeInitAtt;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbeInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.PROBE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getProbeInitScheduler() {
		if (probeInitScheduler != null && probeInitScheduler.eIsProxy()) {
			InternalEObject oldProbeInitScheduler = (InternalEObject)probeInitScheduler;
			probeInitScheduler = (Scheduler)eResolveProxy(oldProbeInitScheduler);
			if (probeInitScheduler != oldProbeInitScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER, oldProbeInitScheduler, probeInitScheduler));
			}
		}
		return probeInitScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetProbeInitScheduler() {
		return probeInitScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeInitScheduler(Scheduler newProbeInitScheduler) {
		Scheduler oldProbeInitScheduler = probeInitScheduler;
		probeInitScheduler = newProbeInitScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER, oldProbeInitScheduler, probeInitScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getProbeInitAtt() {
		if (probeInitAtt != null && probeInitAtt.eIsProxy()) {
			InternalEObject oldProbeInitAtt = (InternalEObject)probeInitAtt;
			probeInitAtt = (Attribute)eResolveProxy(oldProbeInitAtt);
			if (probeInitAtt != oldProbeInitAtt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT, oldProbeInitAtt, probeInitAtt));
			}
		}
		return probeInitAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetProbeInitAtt() {
		return probeInitAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeInitAtt(Attribute newProbeInitAtt) {
		Attribute oldProbeInitAtt = probeInitAtt;
		probeInitAtt = newProbeInitAtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT, oldProbeInitAtt, probeInitAtt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.PROBE_INIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER:
				if (resolve) return getProbeInitScheduler();
				return basicGetProbeInitScheduler();
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT:
				if (resolve) return getProbeInitAtt();
				return basicGetProbeInitAtt();
			case Ecec_cormasPackage.PROBE_INIT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER:
				setProbeInitScheduler((Scheduler)newValue);
				return;
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT:
				setProbeInitAtt((Attribute)newValue);
				return;
			case Ecec_cormasPackage.PROBE_INIT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER:
				setProbeInitScheduler((Scheduler)null);
				return;
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT:
				setProbeInitAtt((Attribute)null);
				return;
			case Ecec_cormasPackage.PROBE_INIT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_SCHEDULER:
				return probeInitScheduler != null;
			case Ecec_cormasPackage.PROBE_INIT__PROBE_INIT_ATT:
				return probeInitAtt != null;
			case Ecec_cormasPackage.PROBE_INIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProbeInitImpl
