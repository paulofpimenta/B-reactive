/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.EqualityNumber;
import org.cirad.dsl.ecec.xtext.ecec.Evalutation;
import org.cirad.dsl.ecec.xtext.ecec.Parameter;
import org.cirad.dsl.ecec.xtext.ecec.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evalutation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EvalutationImpl#getEqnum <em>Eqnum</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EvalutationImpl#getPar <em>Par</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EvalutationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvalutationImpl extends MinimalEObjectImpl.Container implements Evalutation
{
  /**
   * The cached value of the '{@link #getEqnum() <em>Eqnum</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqnum()
   * @generated
   * @ordered
   */
  protected EList<EqualityNumber> eqnum;

  /**
   * The cached value of the '{@link #getPar() <em>Par</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected EList<Parameter> par;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvalutationImpl()
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
    return EcecPackage.Literals.EVALUTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqualityNumber> getEqnum()
  {
    if (eqnum == null)
    {
      eqnum = new EDataTypeEList<EqualityNumber>(EqualityNumber.class, this, EcecPackage.EVALUTATION__EQNUM);
    }
    return eqnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getPar()
  {
    if (par == null)
    {
      par = new EObjectResolvingEList<Parameter>(Parameter.class, this, EcecPackage.EVALUTATION__PAR);
    }
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.EVALUTATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EVALUTATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EVALUTATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.EVALUTATION__VALUE, newValue, newValue));
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
      case EcecPackage.EVALUTATION__VALUE:
        return basicSetValue(null, msgs);
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
      case EcecPackage.EVALUTATION__EQNUM:
        return getEqnum();
      case EcecPackage.EVALUTATION__PAR:
        return getPar();
      case EcecPackage.EVALUTATION__VALUE:
        return getValue();
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
      case EcecPackage.EVALUTATION__EQNUM:
        getEqnum().clear();
        getEqnum().addAll((Collection<? extends EqualityNumber>)newValue);
        return;
      case EcecPackage.EVALUTATION__PAR:
        getPar().clear();
        getPar().addAll((Collection<? extends Parameter>)newValue);
        return;
      case EcecPackage.EVALUTATION__VALUE:
        setValue((Value)newValue);
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
      case EcecPackage.EVALUTATION__EQNUM:
        getEqnum().clear();
        return;
      case EcecPackage.EVALUTATION__PAR:
        getPar().clear();
        return;
      case EcecPackage.EVALUTATION__VALUE:
        setValue((Value)null);
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
      case EcecPackage.EVALUTATION__EQNUM:
        return eqnum != null && !eqnum.isEmpty();
      case EcecPackage.EVALUTATION__PAR:
        return par != null && !par.isEmpty();
      case EcecPackage.EVALUTATION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (eqnum: ");
    result.append(eqnum);
    result.append(')');
    return result.toString();
  }

} //EvalutationImpl
