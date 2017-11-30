/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Behavior;
import behaviorMetamodel.Entity;
import behaviorMetamodel.Init;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.ModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ModelImpl#getInit <em>Init</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ModelImpl#getMainBehavior <em>Main Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

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
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected EList<Init> init;

	/**
	 * The cached value of the '{@link #getMainBehavior() <em>Main Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior mainBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl()
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
		return MetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities()
	{
		if (entities == null)
		{
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, MetamodelPackage.MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Init> getInit()
	{
		if (init == null)
		{
			init = new EObjectContainmentEList<Init>(Init.class, this, MetamodelPackage.MODEL__INIT);
		}
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMainBehavior()
	{
		return mainBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainBehavior(Behavior newMainBehavior, NotificationChain msgs)
	{
		Behavior oldMainBehavior = mainBehavior;
		mainBehavior = newMainBehavior;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__MAIN_BEHAVIOR, oldMainBehavior, newMainBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainBehavior(Behavior newMainBehavior)
	{
		if (newMainBehavior != mainBehavior)
		{
			NotificationChain msgs = null;
			if (mainBehavior != null)
				msgs = ((InternalEObject)mainBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__MAIN_BEHAVIOR, null, msgs);
			if (newMainBehavior != null)
				msgs = ((InternalEObject)newMainBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__MAIN_BEHAVIOR, null, msgs);
			msgs = basicSetMainBehavior(newMainBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__MAIN_BEHAVIOR, newMainBehavior, newMainBehavior));
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
			case MetamodelPackage.MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL__INIT:
				return ((InternalEList<?>)getInit()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL__MAIN_BEHAVIOR:
				return basicSetMainBehavior(null, msgs);
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
			case MetamodelPackage.MODEL__ENTITIES:
				return getEntities();
			case MetamodelPackage.MODEL__NAME:
				return getName();
			case MetamodelPackage.MODEL__INIT:
				return getInit();
			case MetamodelPackage.MODEL__MAIN_BEHAVIOR:
				return getMainBehavior();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MetamodelPackage.MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case MetamodelPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.MODEL__INIT:
				getInit().clear();
				getInit().addAll((Collection<? extends Init>)newValue);
				return;
			case MetamodelPackage.MODEL__MAIN_BEHAVIOR:
				setMainBehavior((Behavior)newValue);
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
			case MetamodelPackage.MODEL__ENTITIES:
				getEntities().clear();
				return;
			case MetamodelPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.MODEL__INIT:
				getInit().clear();
				return;
			case MetamodelPackage.MODEL__MAIN_BEHAVIOR:
				setMainBehavior((Behavior)null);
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
			case MetamodelPackage.MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case MetamodelPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.MODEL__INIT:
				return init != null && !init.isEmpty();
			case MetamodelPackage.MODEL__MAIN_BEHAVIOR:
				return mainBehavior != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
