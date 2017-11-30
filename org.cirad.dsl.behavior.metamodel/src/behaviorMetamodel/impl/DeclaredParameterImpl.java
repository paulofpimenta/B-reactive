/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.DeclaredParameter;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.ParameterClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.DeclaredParameterImpl#getParameterclass <em>Parameterclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaredParameterImpl extends ExpressionImpl implements DeclaredParameter
{
	/**
	 * The cached value of the '{@link #getParameterclass() <em>Parameterclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterclass()
	 * @generated
	 * @ordered
	 */
	protected ParameterClass parameterclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredParameterImpl()
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
		return MetamodelPackage.Literals.DECLARED_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterClass getParameterclass()
	{
		if (parameterclass != null && parameterclass.eIsProxy())
		{
			InternalEObject oldParameterclass = (InternalEObject)parameterclass;
			parameterclass = (ParameterClass)eResolveProxy(oldParameterclass);
			if (parameterclass != oldParameterclass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS, oldParameterclass, parameterclass));
			}
		}
		return parameterclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterClass basicGetParameterclass()
	{
		return parameterclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterclass(ParameterClass newParameterclass)
	{
		ParameterClass oldParameterclass = parameterclass;
		parameterclass = newParameterclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS, oldParameterclass, parameterclass));
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
			case MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS:
				if (resolve) return getParameterclass();
				return basicGetParameterclass();
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
			case MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS:
				setParameterclass((ParameterClass)newValue);
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
			case MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS:
				setParameterclass((ParameterClass)null);
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
			case MetamodelPackage.DECLARED_PARAMETER__PARAMETERCLASS:
				return parameterclass != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredParameterImpl
