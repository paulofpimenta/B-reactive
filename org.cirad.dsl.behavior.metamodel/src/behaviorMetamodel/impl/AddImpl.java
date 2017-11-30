/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Add;
import behaviorMetamodel.DeclaredAttributes;
import behaviorMetamodel.Expression;
import behaviorMetamodel.MetamodelPackage;

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
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.AddImpl#getToAttribute <em>To Attribute</em>}</li>
 *   <li>{@link behaviorMetamodel.impl.AddImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddImpl extends PrimitiveActivitiesImpl implements Add
{
	/**
	 * The cached value of the '{@link #getToAttribute() <em>To Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAttribute()
	 * @generated
	 * @ordered
	 */
	protected DeclaredAttributes toAttribute;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddImpl()
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
		return MetamodelPackage.Literals.ADD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredAttributes getToAttribute()
	{
		return toAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToAttribute(DeclaredAttributes newToAttribute, NotificationChain msgs)
	{
		DeclaredAttributes oldToAttribute = toAttribute;
		toAttribute = newToAttribute;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.ADD__TO_ATTRIBUTE, oldToAttribute, newToAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAttribute(DeclaredAttributes newToAttribute)
	{
		if (newToAttribute != toAttribute)
		{
			NotificationChain msgs = null;
			if (toAttribute != null)
				msgs = ((InternalEObject)toAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.ADD__TO_ATTRIBUTE, null, msgs);
			if (newToAttribute != null)
				msgs = ((InternalEObject)newToAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.ADD__TO_ATTRIBUTE, null, msgs);
			msgs = basicSetToAttribute(newToAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ADD__TO_ATTRIBUTE, newToAttribute, newToAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression()
	{
		if (expression == null)
		{
			expression = new EObjectContainmentEList<Expression>(Expression.class, this, MetamodelPackage.ADD__EXPRESSION);
		}
		return expression;
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
			case MetamodelPackage.ADD__TO_ATTRIBUTE:
				return basicSetToAttribute(null, msgs);
			case MetamodelPackage.ADD__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.ADD__TO_ATTRIBUTE:
				return getToAttribute();
			case MetamodelPackage.ADD__EXPRESSION:
				return getExpression();
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
			case MetamodelPackage.ADD__TO_ATTRIBUTE:
				setToAttribute((DeclaredAttributes)newValue);
				return;
			case MetamodelPackage.ADD__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
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
			case MetamodelPackage.ADD__TO_ATTRIBUTE:
				setToAttribute((DeclaredAttributes)null);
				return;
			case MetamodelPackage.ADD__EXPRESSION:
				getExpression().clear();
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
			case MetamodelPackage.ADD__TO_ATTRIBUTE:
				return toAttribute != null;
			case MetamodelPackage.ADD__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddImpl
