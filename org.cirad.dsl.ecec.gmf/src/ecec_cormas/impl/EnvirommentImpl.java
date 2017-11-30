/**
 */
package ecec_cormas.impl;

import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.Enviromment;
import ecec_cormas.Init;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enviromment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.EnvirommentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.impl.EnvirommentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link ecec_cormas.impl.EnvirommentImpl#getLoadEnviroment <em>Load Enviroment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvirommentImpl extends DiagramElementImpl implements Enviromment {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadEnviroment() <em>Load Enviroment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadEnviroment()
	 * @generated
	 * @ordered
	 */
	protected EList<Init> loadEnviroment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvirommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.ENVIROMMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ENVIROMMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.ENVIROMMENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Init> getLoadEnviroment() {
		if (loadEnviroment == null) {
			loadEnviroment = new EObjectResolvingEList<Init>(Init.class, this, Ecec_cormasPackage.ENVIROMMENT__LOAD_ENVIROMENT);
		}
		return loadEnviroment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.ENVIROMMENT__NAME:
				return getName();
			case Ecec_cormasPackage.ENVIROMMENT__PATH:
				return getPath();
			case Ecec_cormasPackage.ENVIROMMENT__LOAD_ENVIROMENT:
				return getLoadEnviroment();
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
			case Ecec_cormasPackage.ENVIROMMENT__NAME:
				setName((String)newValue);
				return;
			case Ecec_cormasPackage.ENVIROMMENT__PATH:
				setPath((String)newValue);
				return;
			case Ecec_cormasPackage.ENVIROMMENT__LOAD_ENVIROMENT:
				getLoadEnviroment().clear();
				getLoadEnviroment().addAll((Collection<? extends Init>)newValue);
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
			case Ecec_cormasPackage.ENVIROMMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ecec_cormasPackage.ENVIROMMENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case Ecec_cormasPackage.ENVIROMMENT__LOAD_ENVIROMENT:
				getLoadEnviroment().clear();
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
			case Ecec_cormasPackage.ENVIROMMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ecec_cormasPackage.ENVIROMMENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case Ecec_cormasPackage.ENVIROMMENT__LOAD_ENVIROMENT:
				return loadEnviroment != null && !loadEnviroment.isEmpty();
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
		result.append(", Path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //EnvirommentImpl
