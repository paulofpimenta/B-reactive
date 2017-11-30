/**
 */
package ecec_cormas.impl;

import ecec_cormas.Attribute;
import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.ModelParameters;
import ecec_cormas.Scheduler;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.SchedulerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ecec_cormas.impl.SchedulerImpl#getInitModel <em>Init Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulerImpl extends DiagramElementImpl implements Scheduler {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getInitModel() <em>Init Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModel()
	 * @generated
	 * @ordered
	 */
	protected ModelParameters initModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, Ecec_cormasPackage.SCHEDULER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameters getInitModel() {
		if (initModel != null && initModel.eIsProxy()) {
			InternalEObject oldInitModel = (InternalEObject)initModel;
			initModel = (ModelParameters)eResolveProxy(oldInitModel);
			if (initModel != oldInitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecec_cormasPackage.SCHEDULER__INIT_MODEL, oldInitModel, initModel));
			}
		}
		return initModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameters basicGetInitModel() {
		return initModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModel(ModelParameters newInitModel) {
		ModelParameters oldInitModel = initModel;
		initModel = newInitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.SCHEDULER__INIT_MODEL, oldInitModel, initModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ecec_cormasPackage.SCHEDULER__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.SCHEDULER__ATTRIBUTES:
				return getAttributes();
			case Ecec_cormasPackage.SCHEDULER__INIT_MODEL:
				if (resolve) return getInitModel();
				return basicGetInitModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ecec_cormasPackage.SCHEDULER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Ecec_cormasPackage.SCHEDULER__INIT_MODEL:
				setInitModel((ModelParameters)newValue);
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
			case Ecec_cormasPackage.SCHEDULER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case Ecec_cormasPackage.SCHEDULER__INIT_MODEL:
				setInitModel((ModelParameters)null);
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
			case Ecec_cormasPackage.SCHEDULER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case Ecec_cormasPackage.SCHEDULER__INIT_MODEL:
				return initModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulerImpl
