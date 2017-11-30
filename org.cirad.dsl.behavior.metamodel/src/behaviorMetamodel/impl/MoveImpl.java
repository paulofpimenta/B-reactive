/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Expression;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Move;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.MoveImpl#getLocationexpression <em>Locationexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends PrimitiveActivitiesImpl implements Move
{
	/**
	 * The cached value of the '{@link #getLocationexpression() <em>Locationexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationexpression()
	 * @generated
	 * @ordered
	 */
	protected Expression locationexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl()
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
		return MetamodelPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLocationexpression()
	{
		return locationexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationexpression(Expression newLocationexpression, NotificationChain msgs)
	{
		Expression oldLocationexpression = locationexpression;
		locationexpression = newLocationexpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.MOVE__LOCATIONEXPRESSION, oldLocationexpression, newLocationexpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationexpression(Expression newLocationexpression)
	{
		if (newLocationexpression != locationexpression)
		{
			NotificationChain msgs = null;
			if (locationexpression != null)
				msgs = ((InternalEObject)locationexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MOVE__LOCATIONEXPRESSION, null, msgs);
			if (newLocationexpression != null)
				msgs = ((InternalEObject)newLocationexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MOVE__LOCATIONEXPRESSION, null, msgs);
			msgs = basicSetLocationexpression(newLocationexpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MOVE__LOCATIONEXPRESSION, newLocationexpression, newLocationexpression));
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
			case MetamodelPackage.MOVE__LOCATIONEXPRESSION:
				return basicSetLocationexpression(null, msgs);
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
			case MetamodelPackage.MOVE__LOCATIONEXPRESSION:
				return getLocationexpression();
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
			case MetamodelPackage.MOVE__LOCATIONEXPRESSION:
				setLocationexpression((Expression)newValue);
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
			case MetamodelPackage.MOVE__LOCATIONEXPRESSION:
				setLocationexpression((Expression)null);
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
			case MetamodelPackage.MOVE__LOCATIONEXPRESSION:
				return locationexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveImpl
