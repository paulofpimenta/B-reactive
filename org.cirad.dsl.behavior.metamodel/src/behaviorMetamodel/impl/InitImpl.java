/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Assignment;
import behaviorMetamodel.Entity;
import behaviorMetamodel.Expression;
import behaviorMetamodel.Init;
import behaviorMetamodel.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.InitImpl#getAssingnments <em>Assingnments</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.InitImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.InitImpl#getInitFunctionCall <em>Init Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitImpl extends MinimalEObjectImpl.Container implements Init
{
	/**
	 * The cached value of the '{@link #getAssingnments() <em>Assingnments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssingnments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assingnments;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getInitFunctionCall() <em>Init Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected Expression initFunctionCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitImpl()
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
		return MetamodelPackage.Literals.INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssingnments()
	{
		if (assingnments == null)
		{
			assingnments = new EObjectContainmentEList<Assignment>(Assignment.class, this, MetamodelPackage.INIT__ASSINGNMENTS);
		}
		return assingnments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity()
	{
		if (entity == null)
		{
			entity = new EObjectResolvingEList<Entity>(Entity.class, this, MetamodelPackage.INIT__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitFunctionCall()
	{
		return initFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitFunctionCall(Expression newInitFunctionCall, NotificationChain msgs)
	{
		Expression oldInitFunctionCall = initFunctionCall;
		initFunctionCall = newInitFunctionCall;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.INIT__INIT_FUNCTION_CALL, oldInitFunctionCall, newInitFunctionCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitFunctionCall(Expression newInitFunctionCall)
	{
		if (newInitFunctionCall != initFunctionCall)
		{
			NotificationChain msgs = null;
			if (initFunctionCall != null)
				msgs = ((InternalEObject)initFunctionCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.INIT__INIT_FUNCTION_CALL, null, msgs);
			if (newInitFunctionCall != null)
				msgs = ((InternalEObject)newInitFunctionCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.INIT__INIT_FUNCTION_CALL, null, msgs);
			msgs = basicSetInitFunctionCall(newInitFunctionCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INIT__INIT_FUNCTION_CALL, newInitFunctionCall, newInitFunctionCall));
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
			case MetamodelPackage.INIT__ASSINGNMENTS:
				return ((InternalEList<?>)getAssingnments()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
				return basicSetInitFunctionCall(null, msgs);
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
			case MetamodelPackage.INIT__ASSINGNMENTS:
				return getAssingnments();
			case MetamodelPackage.INIT__ENTITY:
				return getEntity();
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
				return getInitFunctionCall();
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
			case MetamodelPackage.INIT__ASSINGNMENTS:
				getAssingnments().clear();
				getAssingnments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case MetamodelPackage.INIT__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
				setInitFunctionCall((Expression)newValue);
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
			case MetamodelPackage.INIT__ASSINGNMENTS:
				getAssingnments().clear();
				return;
			case MetamodelPackage.INIT__ENTITY:
				getEntity().clear();
				return;
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
				setInitFunctionCall((Expression)null);
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
			case MetamodelPackage.INIT__ASSINGNMENTS:
				return assingnments != null && !assingnments.isEmpty();
			case MetamodelPackage.INIT__ENTITY:
				return entity != null && !entity.isEmpty();
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
				return initFunctionCall != null;
		}
		return super.eIsSet(featureID);
	}

} //InitImpl
