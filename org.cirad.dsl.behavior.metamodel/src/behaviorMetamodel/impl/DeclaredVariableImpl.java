/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.DeclaredVariable;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.VariableClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.DeclaredVariableImpl#getVariableclass <em>Variableclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaredVariableImpl extends ExpressionImpl implements DeclaredVariable
{
	/**
	 * The cached value of the '{@link #getVariableclass() <em>Variableclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableclass()
	 * @generated
	 * @ordered
	 */
	protected VariableClass variableclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredVariableImpl()
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
		return MetamodelPackage.Literals.DECLARED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableClass getVariableclass()
	{
		if (variableclass != null && variableclass.eIsProxy())
		{
			InternalEObject oldVariableclass = (InternalEObject)variableclass;
			variableclass = (VariableClass)eResolveProxy(oldVariableclass);
			if (variableclass != oldVariableclass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS, oldVariableclass, variableclass));
			}
		}
		return variableclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableClass basicGetVariableclass()
	{
		return variableclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableclass(VariableClass newVariableclass)
	{
		VariableClass oldVariableclass = variableclass;
		variableclass = newVariableclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS, oldVariableclass, variableclass));
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
			case MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS:
				if (resolve) return getVariableclass();
				return basicGetVariableclass();
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
			case MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS:
				setVariableclass((VariableClass)newValue);
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
			case MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS:
				setVariableclass((VariableClass)null);
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
			case MetamodelPackage.DECLARED_VARIABLE__VARIABLECLASS:
				return variableclass != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredVariableImpl
