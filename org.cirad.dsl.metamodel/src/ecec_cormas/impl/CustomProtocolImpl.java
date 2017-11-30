/**
 */
package ecec_cormas.impl;

import ecec_cormas.CustomProtocol;
import ecec_cormas.Ecec_cormasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.CustomProtocolImpl#getProtocolName <em>Protocol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomProtocolImpl extends ProtocolImpl implements CustomProtocol {
	/**
	 * The default value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected String protocolName = PROTOCOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.CUSTOM_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolName() {
		return protocolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolName(String newProtocolName) {
		String oldProtocolName = protocolName;
		protocolName = newProtocolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.CUSTOM_PROTOCOL__PROTOCOL_NAME, oldProtocolName, protocolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.CUSTOM_PROTOCOL__PROTOCOL_NAME:
				return getProtocolName();
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
			case Ecec_cormasPackage.CUSTOM_PROTOCOL__PROTOCOL_NAME:
				setProtocolName((String)newValue);
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
			case Ecec_cormasPackage.CUSTOM_PROTOCOL__PROTOCOL_NAME:
				setProtocolName(PROTOCOL_NAME_EDEFAULT);
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
			case Ecec_cormasPackage.CUSTOM_PROTOCOL__PROTOCOL_NAME:
				return PROTOCOL_NAME_EDEFAULT == null ? protocolName != null : !PROTOCOL_NAME_EDEFAULT.equals(protocolName);
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
		result.append(" (ProtocolName: ");
		result.append(protocolName);
		result.append(')');
		return result.toString();
	}

} //CustomProtocolImpl
