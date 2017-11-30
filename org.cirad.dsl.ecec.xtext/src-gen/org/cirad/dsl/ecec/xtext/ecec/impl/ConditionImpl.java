/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AttributionType;
import org.cirad.dsl.ecec.xtext.ecec.Cell;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.ConditionEnum;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl#getCe <em>Ce</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl#getA <em>A</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl#getM <em>M</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ConditionImpl#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getCe() <em>Ce</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCe()
   * @generated
   * @ordered
   */
  protected EList<ConditionEnum> ce;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected EList<AttributionType> a;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected Cell m;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected NeighborhoodExpression n;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return EcecPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionEnum> getCe()
  {
    if (ce == null)
    {
      ce = new EDataTypeEList<ConditionEnum>(ConditionEnum.class, this, EcecPackage.CONDITION__CE);
    }
    return ce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributionType> getA()
  {
    if (a == null)
    {
      a = new EObjectContainmentEList<AttributionType>(AttributionType.class, this, EcecPackage.CONDITION__A);
    }
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cell getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM(Cell newM, NotificationChain msgs)
  {
    Cell oldM = m;
    m = newM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.CONDITION__M, oldM, newM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(Cell newM)
  {
    if (newM != m)
    {
      NotificationChain msgs = null;
      if (m != null)
        msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CONDITION__M, null, msgs);
      if (newM != null)
        msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CONDITION__M, null, msgs);
      msgs = basicSetM(newM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.CONDITION__M, newM, newM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeighborhoodExpression getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN(NeighborhoodExpression newN, NotificationChain msgs)
  {
    NeighborhoodExpression oldN = n;
    n = newN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.CONDITION__N, oldN, newN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(NeighborhoodExpression newN)
  {
    if (newN != n)
    {
      NotificationChain msgs = null;
      if (n != null)
        msgs = ((InternalEObject)n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CONDITION__N, null, msgs);
      if (newN != null)
        msgs = ((InternalEObject)newN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CONDITION__N, null, msgs);
      msgs = basicSetN(newN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.CONDITION__N, newN, newN));
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
      case EcecPackage.CONDITION__A:
        return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
      case EcecPackage.CONDITION__M:
        return basicSetM(null, msgs);
      case EcecPackage.CONDITION__N:
        return basicSetN(null, msgs);
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
      case EcecPackage.CONDITION__CE:
        return getCe();
      case EcecPackage.CONDITION__A:
        return getA();
      case EcecPackage.CONDITION__M:
        return getM();
      case EcecPackage.CONDITION__N:
        return getN();
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
      case EcecPackage.CONDITION__CE:
        getCe().clear();
        getCe().addAll((Collection<? extends ConditionEnum>)newValue);
        return;
      case EcecPackage.CONDITION__A:
        getA().clear();
        getA().addAll((Collection<? extends AttributionType>)newValue);
        return;
      case EcecPackage.CONDITION__M:
        setM((Cell)newValue);
        return;
      case EcecPackage.CONDITION__N:
        setN((NeighborhoodExpression)newValue);
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
      case EcecPackage.CONDITION__CE:
        getCe().clear();
        return;
      case EcecPackage.CONDITION__A:
        getA().clear();
        return;
      case EcecPackage.CONDITION__M:
        setM((Cell)null);
        return;
      case EcecPackage.CONDITION__N:
        setN((NeighborhoodExpression)null);
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
      case EcecPackage.CONDITION__CE:
        return ce != null && !ce.isEmpty();
      case EcecPackage.CONDITION__A:
        return a != null && !a.isEmpty();
      case EcecPackage.CONDITION__M:
        return m != null;
      case EcecPackage.CONDITION__N:
        return n != null;
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
    result.append(" (ce: ");
    result.append(ce);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
