/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.Between;
import org.cirad.dsl.ecec.xtext.ecec.Definition;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Between</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BetweenImpl#getParameter1 <em>Parameter1</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BetweenImpl#getParameter2 <em>Parameter2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BetweenImpl extends OperatorBetweenImpl implements Between
{
  /**
   * The cached value of the '{@link #getParameter1() <em>Parameter1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter1()
   * @generated
   * @ordered
   */
  protected Definition parameter1;

  /**
   * The cached value of the '{@link #getParameter2() <em>Parameter2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter2()
   * @generated
   * @ordered
   */
  protected Definition parameter2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BetweenImpl()
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
    return EcecPackage.Literals.BETWEEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getParameter1()
  {
    return parameter1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter1(Definition newParameter1, NotificationChain msgs)
  {
    Definition oldParameter1 = parameter1;
    parameter1 = newParameter1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.BETWEEN__PARAMETER1, oldParameter1, newParameter1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter1(Definition newParameter1)
  {
    if (newParameter1 != parameter1)
    {
      NotificationChain msgs = null;
      if (parameter1 != null)
        msgs = ((InternalEObject)parameter1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.BETWEEN__PARAMETER1, null, msgs);
      if (newParameter1 != null)
        msgs = ((InternalEObject)newParameter1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.BETWEEN__PARAMETER1, null, msgs);
      msgs = basicSetParameter1(newParameter1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.BETWEEN__PARAMETER1, newParameter1, newParameter1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getParameter2()
  {
    return parameter2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter2(Definition newParameter2, NotificationChain msgs)
  {
    Definition oldParameter2 = parameter2;
    parameter2 = newParameter2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.BETWEEN__PARAMETER2, oldParameter2, newParameter2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter2(Definition newParameter2)
  {
    if (newParameter2 != parameter2)
    {
      NotificationChain msgs = null;
      if (parameter2 != null)
        msgs = ((InternalEObject)parameter2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.BETWEEN__PARAMETER2, null, msgs);
      if (newParameter2 != null)
        msgs = ((InternalEObject)newParameter2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.BETWEEN__PARAMETER2, null, msgs);
      msgs = basicSetParameter2(newParameter2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.BETWEEN__PARAMETER2, newParameter2, newParameter2));
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
      case EcecPackage.BETWEEN__PARAMETER1:
        return basicSetParameter1(null, msgs);
      case EcecPackage.BETWEEN__PARAMETER2:
        return basicSetParameter2(null, msgs);
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
      case EcecPackage.BETWEEN__PARAMETER1:
        return getParameter1();
      case EcecPackage.BETWEEN__PARAMETER2:
        return getParameter2();
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
      case EcecPackage.BETWEEN__PARAMETER1:
        setParameter1((Definition)newValue);
        return;
      case EcecPackage.BETWEEN__PARAMETER2:
        setParameter2((Definition)newValue);
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
      case EcecPackage.BETWEEN__PARAMETER1:
        setParameter1((Definition)null);
        return;
      case EcecPackage.BETWEEN__PARAMETER2:
        setParameter2((Definition)null);
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
      case EcecPackage.BETWEEN__PARAMETER1:
        return parameter1 != null;
      case EcecPackage.BETWEEN__PARAMETER2:
        return parameter2 != null;
    }
    return super.eIsSet(featureID);
  }

} //BetweenImpl
