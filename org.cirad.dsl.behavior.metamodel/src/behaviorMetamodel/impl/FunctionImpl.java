/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Function;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Type;

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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.FunctionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.FunctionImpl#getCodomain <em>Codomain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> domain;

	/**
	 * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected Type codomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl()
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
		return MetamodelPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getDomain()
	{
		if (domain == null)
		{
			domain = new EObjectContainmentEList<Type>(Type.class, this, MetamodelPackage.FUNCTION__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getCodomain()
	{
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodomain(Type newCodomain, NotificationChain msgs)
	{
		Type oldCodomain = codomain;
		codomain = newCodomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION__CODOMAIN, oldCodomain, newCodomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomain(Type newCodomain)
	{
		if (newCodomain != codomain)
		{
			NotificationChain msgs = null;
			if (codomain != null)
				msgs = ((InternalEObject)codomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.FUNCTION__CODOMAIN, null, msgs);
			if (newCodomain != null)
				msgs = ((InternalEObject)newCodomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.FUNCTION__CODOMAIN, null, msgs);
			msgs = basicSetCodomain(newCodomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION__CODOMAIN, newCodomain, newCodomain));
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
			case MetamodelPackage.FUNCTION__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.FUNCTION__CODOMAIN:
				return basicSetCodomain(null, msgs);
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
			case MetamodelPackage.FUNCTION__DOMAIN:
				return getDomain();
			case MetamodelPackage.FUNCTION__CODOMAIN:
				return getCodomain();
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
			case MetamodelPackage.FUNCTION__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Type>)newValue);
				return;
			case MetamodelPackage.FUNCTION__CODOMAIN:
				setCodomain((Type)newValue);
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
			case MetamodelPackage.FUNCTION__DOMAIN:
				getDomain().clear();
				return;
			case MetamodelPackage.FUNCTION__CODOMAIN:
				setCodomain((Type)null);
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
			case MetamodelPackage.FUNCTION__DOMAIN:
				return domain != null && !domain.isEmpty();
			case MetamodelPackage.FUNCTION__CODOMAIN:
				return codomain != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
