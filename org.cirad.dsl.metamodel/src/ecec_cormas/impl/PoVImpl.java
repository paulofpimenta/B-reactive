/**
 */
package ecec_cormas.impl;

import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.PoV;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Po V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.PoVImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.impl.PoVImpl#getPov <em>Pov</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoVImpl extends DiagramElementImpl implements PoV {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getPov() <em>Pov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPov()
	 * @generated
	 * @ordered
	 */
	protected ecec_cormas.Class pov;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.PO_V;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.PO_V__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecec_cormas.Class getPov() {
		if (pov != null && pov.eIsProxy()) {
			InternalEObject oldPov = (InternalEObject)pov;
			pov = (ecec_cormas.Class)eResolveProxy(oldPov);
			if (pov != oldPov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecec_cormasPackage.PO_V__POV, oldPov, pov));
			}
		}
		return pov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecec_cormas.Class basicGetPov() {
		return pov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPov(ecec_cormas.Class newPov) {
		ecec_cormas.Class oldPov = pov;
		pov = newPov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.PO_V__POV, oldPov, pov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.PO_V__NAME:
				return getName();
			case Ecec_cormasPackage.PO_V__POV:
				if (resolve) return getPov();
				return basicGetPov();
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
			case Ecec_cormasPackage.PO_V__NAME:
				setName((String)newValue);
				return;
			case Ecec_cormasPackage.PO_V__POV:
				setPov((ecec_cormas.Class)newValue);
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
			case Ecec_cormasPackage.PO_V__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ecec_cormasPackage.PO_V__POV:
				setPov((ecec_cormas.Class)null);
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
			case Ecec_cormasPackage.PO_V__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ecec_cormasPackage.PO_V__POV:
				return pov != null;
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

} //PoVImpl
