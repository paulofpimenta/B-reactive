/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.DeclaredLocalVariable;
import behaviorMetamodel.LocalVariable;
import behaviorMetamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.DeclaredLocalVariableImpl#getLocalvariable <em>Localvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaredLocalVariableImpl extends ExpressionImpl implements DeclaredLocalVariable
{
	/**
	 * The cached value of the '{@link #getLocalvariable() <em>Localvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalvariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable localvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredLocalVariableImpl()
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
		return MetamodelPackage.Literals.DECLARED_LOCAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getLocalvariable()
	{
		if (localvariable != null && localvariable.eIsProxy())
		{
			InternalEObject oldLocalvariable = (InternalEObject)localvariable;
			localvariable = (LocalVariable)eResolveProxy(oldLocalvariable);
			if (localvariable != oldLocalvariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE, oldLocalvariable, localvariable));
			}
		}
		return localvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetLocalvariable()
	{
		return localvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalvariable(LocalVariable newLocalvariable)
	{
		LocalVariable oldLocalvariable = localvariable;
		localvariable = newLocalvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE, oldLocalvariable, localvariable));
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
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE:
				if (resolve) return getLocalvariable();
				return basicGetLocalvariable();
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
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE:
				setLocalvariable((LocalVariable)newValue);
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
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE:
				setLocalvariable((LocalVariable)null);
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
			case MetamodelPackage.DECLARED_LOCAL_VARIABLE__LOCALVARIABLE:
				return localvariable != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredLocalVariableImpl
