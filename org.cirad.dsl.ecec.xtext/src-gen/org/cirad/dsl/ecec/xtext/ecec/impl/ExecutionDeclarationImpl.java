/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AttributionType;
import org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.MoveExpression;

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
 * An implementation of the model object '<em><b>Execution Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl#getA <em>A</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ExecutionDeclarationImpl#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionDeclarationImpl extends MinimalEObjectImpl.Container implements ExecutionDeclaration
{
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
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected BehaviourQualifiedName arg;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected MoveExpression m;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionDeclarationImpl()
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
    return EcecPackage.Literals.EXECUTION_DECLARATION;
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
      a = new EObjectContainmentEList<AttributionType>(AttributionType.class, this, EcecPackage.EXECUTION_DECLARATION__A);
    }
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourQualifiedName getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(BehaviourQualifiedName newArg, NotificationChain msgs)
  {
    BehaviourQualifiedName oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.EXECUTION_DECLARATION__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(BehaviourQualifiedName newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EXECUTION_DECLARATION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EXECUTION_DECLARATION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.EXECUTION_DECLARATION__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveExpression getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM(MoveExpression newM, NotificationChain msgs)
  {
    MoveExpression oldM = m;
    m = newM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.EXECUTION_DECLARATION__M, oldM, newM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(MoveExpression newM)
  {
    if (newM != m)
    {
      NotificationChain msgs = null;
      if (m != null)
        msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EXECUTION_DECLARATION__M, null, msgs);
      if (newM != null)
        msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.EXECUTION_DECLARATION__M, null, msgs);
      msgs = basicSetM(newM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.EXECUTION_DECLARATION__M, newM, newM));
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
      case EcecPackage.EXECUTION_DECLARATION__A:
        return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
      case EcecPackage.EXECUTION_DECLARATION__ARG:
        return basicSetArg(null, msgs);
      case EcecPackage.EXECUTION_DECLARATION__M:
        return basicSetM(null, msgs);
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
      case EcecPackage.EXECUTION_DECLARATION__A:
        return getA();
      case EcecPackage.EXECUTION_DECLARATION__ARG:
        return getArg();
      case EcecPackage.EXECUTION_DECLARATION__M:
        return getM();
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
      case EcecPackage.EXECUTION_DECLARATION__A:
        getA().clear();
        getA().addAll((Collection<? extends AttributionType>)newValue);
        return;
      case EcecPackage.EXECUTION_DECLARATION__ARG:
        setArg((BehaviourQualifiedName)newValue);
        return;
      case EcecPackage.EXECUTION_DECLARATION__M:
        setM((MoveExpression)newValue);
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
      case EcecPackage.EXECUTION_DECLARATION__A:
        getA().clear();
        return;
      case EcecPackage.EXECUTION_DECLARATION__ARG:
        setArg((BehaviourQualifiedName)null);
        return;
      case EcecPackage.EXECUTION_DECLARATION__M:
        setM((MoveExpression)null);
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
      case EcecPackage.EXECUTION_DECLARATION__A:
        return a != null && !a.isEmpty();
      case EcecPackage.EXECUTION_DECLARATION__ARG:
        return arg != null;
      case EcecPackage.EXECUTION_DECLARATION__M:
        return m != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecutionDeclarationImpl
