/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Equation;
import behaviorMetamodel.EquationBehavior;
import behaviorMetamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.EquationBehaviorImpl#getEquation <em>Equation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquationBehaviorImpl extends BehaviorImpl implements EquationBehavior
{
	/**
	 * The cached value of the '{@link #getEquation() <em>Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquation()
	 * @generated
	 * @ordered
	 */
	protected Equation equation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationBehaviorImpl()
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
		return MetamodelPackage.Literals.EQUATION_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation getEquation()
	{
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquation(Equation newEquation, NotificationChain msgs)
	{
		Equation oldEquation = equation;
		equation = newEquation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.EQUATION_BEHAVIOR__EQUATION, oldEquation, newEquation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquation(Equation newEquation)
	{
		if (newEquation != equation)
		{
			NotificationChain msgs = null;
			if (equation != null)
				msgs = ((InternalEObject)equation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.EQUATION_BEHAVIOR__EQUATION, null, msgs);
			if (newEquation != null)
				msgs = ((InternalEObject)newEquation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.EQUATION_BEHAVIOR__EQUATION, null, msgs);
			msgs = basicSetEquation(newEquation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EQUATION_BEHAVIOR__EQUATION, newEquation, newEquation));
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
			case MetamodelPackage.EQUATION_BEHAVIOR__EQUATION:
				return basicSetEquation(null, msgs);
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
			case MetamodelPackage.EQUATION_BEHAVIOR__EQUATION:
				return getEquation();
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
			case MetamodelPackage.EQUATION_BEHAVIOR__EQUATION:
				setEquation((Equation)newValue);
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
			case MetamodelPackage.EQUATION_BEHAVIOR__EQUATION:
				setEquation((Equation)null);
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
			case MetamodelPackage.EQUATION_BEHAVIOR__EQUATION:
				return equation != null;
		}
		return super.eIsSet(featureID);
	}

} //EquationBehaviorImpl
