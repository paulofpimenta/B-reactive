/**
 */
package ecec_cormas.impl;

import ecec_cormas.Attribute;
import ecec_cormas.BooleanType;
import ecec_cormas.Ecec_cormasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getNotifyObservers <em>Notify Observers</em>}</li>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getSetterAcessor <em>Setter Acessor</em>}</li>
 *   <li>{@link ecec_cormas.impl.AttributeImpl#getGetterAcessor <em>Getter Acessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends DiagramElementImpl implements Attribute {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType INSTANCE_TYPE_EDEFAULT = BooleanType.YES;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected BooleanType instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotifyObservers() <em>Notify Observers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyObservers()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType NOTIFY_OBSERVERS_EDEFAULT = BooleanType.YES;

	/**
	 * The cached value of the '{@link #getNotifyObservers() <em>Notify Observers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyObservers()
	 * @generated
	 * @ordered
	 */
	protected BooleanType notifyObservers = NOTIFY_OBSERVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetterAcessor() <em>Setter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterAcessor()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType SETTER_ACESSOR_EDEFAULT = BooleanType.YES;

	/**
	 * The cached value of the '{@link #getSetterAcessor() <em>Setter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterAcessor()
	 * @generated
	 * @ordered
	 */
	protected BooleanType setterAcessor = SETTER_ACESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetterAcessor() <em>Getter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterAcessor()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType GETTER_ACESSOR_EDEFAULT = BooleanType.YES;

	/**
	 * The cached value of the '{@link #getGetterAcessor() <em>Getter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterAcessor()
	 * @generated
	 * @ordered
	 */
	protected BooleanType getterAcessor = GETTER_ACESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(BooleanType newInstanceType) {
		BooleanType oldInstanceType = instanceType;
		instanceType = newInstanceType == null ? INSTANCE_TYPE_EDEFAULT : newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__INSTANCE_TYPE, oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getNotifyObservers() {
		return notifyObservers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifyObservers(BooleanType newNotifyObservers) {
		BooleanType oldNotifyObservers = notifyObservers;
		notifyObservers = newNotifyObservers == null ? NOTIFY_OBSERVERS_EDEFAULT : newNotifyObservers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__NOTIFY_OBSERVERS, oldNotifyObservers, notifyObservers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getSetterAcessor() {
		return setterAcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetterAcessor(BooleanType newSetterAcessor) {
		BooleanType oldSetterAcessor = setterAcessor;
		setterAcessor = newSetterAcessor == null ? SETTER_ACESSOR_EDEFAULT : newSetterAcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__SETTER_ACESSOR, oldSetterAcessor, setterAcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getGetterAcessor() {
		return getterAcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterAcessor(BooleanType newGetterAcessor) {
		BooleanType oldGetterAcessor = getterAcessor;
		getterAcessor = newGetterAcessor == null ? GETTER_ACESSOR_EDEFAULT : newGetterAcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ATTRIBUTE__GETTER_ACESSOR, oldGetterAcessor, getterAcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.ATTRIBUTE__VALUE:
				return getValue();
			case Ecec_cormasPackage.ATTRIBUTE__NAME:
				return getName();
			case Ecec_cormasPackage.ATTRIBUTE__INSTANCE_TYPE:
				return getInstanceType();
			case Ecec_cormasPackage.ATTRIBUTE__NOTIFY_OBSERVERS:
				return getNotifyObservers();
			case Ecec_cormasPackage.ATTRIBUTE__SETTER_ACESSOR:
				return getSetterAcessor();
			case Ecec_cormasPackage.ATTRIBUTE__GETTER_ACESSOR:
				return getGetterAcessor();
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
			case Ecec_cormasPackage.ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__INSTANCE_TYPE:
				setInstanceType((BooleanType)newValue);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__NOTIFY_OBSERVERS:
				setNotifyObservers((BooleanType)newValue);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__SETTER_ACESSOR:
				setSetterAcessor((BooleanType)newValue);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__GETTER_ACESSOR:
				setGetterAcessor((BooleanType)newValue);
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
			case Ecec_cormasPackage.ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__NOTIFY_OBSERVERS:
				setNotifyObservers(NOTIFY_OBSERVERS_EDEFAULT);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__SETTER_ACESSOR:
				setSetterAcessor(SETTER_ACESSOR_EDEFAULT);
				return;
			case Ecec_cormasPackage.ATTRIBUTE__GETTER_ACESSOR:
				setGetterAcessor(GETTER_ACESSOR_EDEFAULT);
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
			case Ecec_cormasPackage.ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Ecec_cormasPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ecec_cormasPackage.ATTRIBUTE__INSTANCE_TYPE:
				return instanceType != INSTANCE_TYPE_EDEFAULT;
			case Ecec_cormasPackage.ATTRIBUTE__NOTIFY_OBSERVERS:
				return notifyObservers != NOTIFY_OBSERVERS_EDEFAULT;
			case Ecec_cormasPackage.ATTRIBUTE__SETTER_ACESSOR:
				return setterAcessor != SETTER_ACESSOR_EDEFAULT;
			case Ecec_cormasPackage.ATTRIBUTE__GETTER_ACESSOR:
				return getterAcessor != GETTER_ACESSOR_EDEFAULT;
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
		result.append(" (Value: ");
		result.append(value);
		result.append(", Name: ");
		result.append(name);
		result.append(", InstanceType: ");
		result.append(instanceType);
		result.append(", NotifyObservers: ");
		result.append(notifyObservers);
		result.append(", SetterAcessor: ");
		result.append(setterAcessor);
		result.append(", GetterAcessor: ");
		result.append(getterAcessor);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
