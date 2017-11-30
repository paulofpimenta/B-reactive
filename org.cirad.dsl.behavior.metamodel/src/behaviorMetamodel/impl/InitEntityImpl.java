/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Expression;
import behaviorMetamodel.InitEntity;
import behaviorMetamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.InitEntityImpl#getInitialLocation <em>Initial Location</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.InitEntityImpl#getInitName <em>Init Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitEntityImpl extends InitImpl implements InitEntity
{
	/**
	 * The cached value of the '{@link #getInitialLocation() <em>Initial Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLocation()
	 * @generated
	 * @ordered
	 */
	protected Expression initialLocation;

	/**
	 * The default value of the '{@link #getInitName() <em>Init Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitName()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitName() <em>Init Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitName()
	 * @generated
	 * @ordered
	 */
	protected String initName = INIT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitEntityImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MetamodelPackage.Literals.INIT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialLocation()
	{
		return initialLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialLocation(Expression newInitialLocation, NotificationChain msgs)
	{
		Expression oldInitialLocation = initialLocation;
		initialLocation = newInitialLocation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION, oldInitialLocation, newInitialLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLocation(Expression newInitialLocation)
	{
		if (newInitialLocation != initialLocation)
		{
			NotificationChain msgs = null;
			if (initialLocation != null)
				msgs = ((InternalEObject)initialLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION, null, msgs);
			if (newInitialLocation != null)
				msgs = ((InternalEObject)newInitialLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION, null, msgs);
			msgs = basicSetInitialLocation(newInitialLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION, newInitialLocation, newInitialLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitName()
	{
		return initName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitName(String newInitName)
	{
		String oldInitName = initName;
		initName = newInitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INIT_ENTITY__INIT_NAME, oldInitName, initName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION:
				return basicSetInitialLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION:
				return getInitialLocation();
			case MetamodelPackage.INIT_ENTITY__INIT_NAME:
				return getInitName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION:
				setInitialLocation((Expression)newValue);
				return;
			case MetamodelPackage.INIT_ENTITY__INIT_NAME:
				setInitName((String)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION:
				setInitialLocation((Expression)null);
				return;
			case MetamodelPackage.INIT_ENTITY__INIT_NAME:
				setInitName(INIT_NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MetamodelPackage.INIT_ENTITY__INITIAL_LOCATION:
				return initialLocation != null;
			case MetamodelPackage.INIT_ENTITY__INIT_NAME:
				return INIT_NAME_EDEFAULT == null ? initName != null : !INIT_NAME_EDEFAULT.equals(initName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initName: ");
		result.append(initName);
		result.append(')');
		return result.toString();
	}

} //InitEntityImpl
