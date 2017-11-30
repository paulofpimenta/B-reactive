/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Behavior;
import behaviorMetamodel.LocalVariable;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.ParameterClass;

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
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.BehaviorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.BehaviorImpl#getName <em>Name</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.BehaviorImpl#getLocalvariable <em>Localvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends MinimalEObjectImpl.Container implements Behavior
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterClass> parameters;

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
	 * The cached value of the '{@link #getLocalvariable() <em>Localvariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> localvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl()
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
		return MetamodelPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterClass> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<ParameterClass>(ParameterClass.class, this, MetamodelPackage.BEHAVIOR__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getLocalvariable()
	{
		if (localvariable == null)
		{
			localvariable = new EObjectContainmentEList<LocalVariable>(LocalVariable.class, this, MetamodelPackage.BEHAVIOR__LOCALVARIABLE);
		}
		return localvariable;
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
			case MetamodelPackage.BEHAVIOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.BEHAVIOR__LOCALVARIABLE:
				return ((InternalEList<?>)getLocalvariable()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.BEHAVIOR__PARAMETERS:
				return getParameters();
			case MetamodelPackage.BEHAVIOR__NAME:
				return getName();
			case MetamodelPackage.BEHAVIOR__LOCALVARIABLE:
				return getLocalvariable();
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
			case MetamodelPackage.BEHAVIOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterClass>)newValue);
				return;
			case MetamodelPackage.BEHAVIOR__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.BEHAVIOR__LOCALVARIABLE:
				getLocalvariable().clear();
				getLocalvariable().addAll((Collection<? extends LocalVariable>)newValue);
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
			case MetamodelPackage.BEHAVIOR__PARAMETERS:
				getParameters().clear();
				return;
			case MetamodelPackage.BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.BEHAVIOR__LOCALVARIABLE:
				getLocalvariable().clear();
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
			case MetamodelPackage.BEHAVIOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case MetamodelPackage.BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.BEHAVIOR__LOCALVARIABLE:
				return localvariable != null && !localvariable.isEmpty();
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

} //BehaviorImpl
