/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.ConstantExpression;
import behaviorMetamodel.Expression;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Reproduce;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reproduce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.ReproduceImpl#getOffspring_quantity <em>Offspring quantity</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ReproduceImpl#getInitial_location <em>Initial location</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ReproduceImpl#getDeclaredattributes <em>Declaredattributes</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.ReproduceImpl#getOccupiedExpression <em>Occupied Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReproduceImpl extends PrimitiveActivitiesImpl implements Reproduce
{
	/**
	 * The cached value of the '{@link #getOffspring_quantity() <em>Offspring quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffspring_quantity()
	 * @generated
	 * @ordered
	 */
	protected ConstantExpression offspring_quantity;

	/**
	 * The cached value of the '{@link #getInitial_location() <em>Initial location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_location()
	 * @generated
	 * @ordered
	 */
	protected Expression initial_location;

	/**
	 * The cached value of the '{@link #getDeclaredattributes() <em>Declaredattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> declaredattributes;

	/**
	 * The cached value of the '{@link #getOccupiedExpression() <em>Occupied Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupiedExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> occupiedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReproduceImpl()
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
		return MetamodelPackage.Literals.REPRODUCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression getOffspring_quantity()
	{
		return offspring_quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffspring_quantity(ConstantExpression newOffspring_quantity, NotificationChain msgs)
	{
		ConstantExpression oldOffspring_quantity = offspring_quantity;
		offspring_quantity = newOffspring_quantity;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY, oldOffspring_quantity, newOffspring_quantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffspring_quantity(ConstantExpression newOffspring_quantity)
	{
		if (newOffspring_quantity != offspring_quantity)
		{
			NotificationChain msgs = null;
			if (offspring_quantity != null)
				msgs = ((InternalEObject)offspring_quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY, null, msgs);
			if (newOffspring_quantity != null)
				msgs = ((InternalEObject)newOffspring_quantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY, null, msgs);
			msgs = basicSetOffspring_quantity(newOffspring_quantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY, newOffspring_quantity, newOffspring_quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitial_location()
	{
		return initial_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial_location(Expression newInitial_location, NotificationChain msgs)
	{
		Expression oldInitial_location = initial_location;
		initial_location = newInitial_location;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.REPRODUCE__INITIAL_LOCATION, oldInitial_location, newInitial_location);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_location(Expression newInitial_location)
	{
		if (newInitial_location != initial_location)
		{
			NotificationChain msgs = null;
			if (initial_location != null)
				msgs = ((InternalEObject)initial_location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.REPRODUCE__INITIAL_LOCATION, null, msgs);
			if (newInitial_location != null)
				msgs = ((InternalEObject)newInitial_location).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.REPRODUCE__INITIAL_LOCATION, null, msgs);
			msgs = basicSetInitial_location(newInitial_location, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.REPRODUCE__INITIAL_LOCATION, newInitial_location, newInitial_location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getDeclaredattributes()
	{
		if (declaredattributes == null)
		{
			declaredattributes = new EObjectContainmentEList<Expression>(Expression.class, this, MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES);
		}
		return declaredattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getOccupiedExpression()
	{
		if (occupiedExpression == null)
		{
			occupiedExpression = new EObjectContainmentEList<Expression>(Expression.class, this, MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION);
		}
		return occupiedExpression;
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
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
				return basicSetOffspring_quantity(null, msgs);
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
				return basicSetInitial_location(null, msgs);
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
				return ((InternalEList<?>)getDeclaredattributes()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
				return ((InternalEList<?>)getOccupiedExpression()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
				return getOffspring_quantity();
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
				return getInitial_location();
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
				return getDeclaredattributes();
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
				return getOccupiedExpression();
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
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
				setOffspring_quantity((ConstantExpression)newValue);
				return;
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
				setInitial_location((Expression)newValue);
				return;
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
				getDeclaredattributes().clear();
				getDeclaredattributes().addAll((Collection<? extends Expression>)newValue);
				return;
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
				getOccupiedExpression().clear();
				getOccupiedExpression().addAll((Collection<? extends Expression>)newValue);
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
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
				setOffspring_quantity((ConstantExpression)null);
				return;
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
				setInitial_location((Expression)null);
				return;
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
				getDeclaredattributes().clear();
				return;
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
				getOccupiedExpression().clear();
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
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
				return offspring_quantity != null;
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
				return initial_location != null;
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
				return declaredattributes != null && !declaredattributes.isEmpty();
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
				return occupiedExpression != null && !occupiedExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReproduceImpl
