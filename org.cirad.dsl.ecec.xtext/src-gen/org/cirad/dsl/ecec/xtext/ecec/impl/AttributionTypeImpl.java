/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.AttributionType;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AttributionTypeImpl#getF <em>F</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributionTypeImpl extends MinimalEObjectImpl.Container implements AttributionType
{
  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected ParameterQualifiedName p;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected FunctionQualifiedName f;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributionTypeImpl()
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
    return EcecPackage.Literals.ATTRIBUTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQualifiedName getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(ParameterQualifiedName newP, NotificationChain msgs)
  {
    ParameterQualifiedName oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.ATTRIBUTION_TYPE__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(ParameterQualifiedName newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ATTRIBUTION_TYPE__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ATTRIBUTION_TYPE__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.ATTRIBUTION_TYPE__P, newP, newP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionQualifiedName getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(FunctionQualifiedName newF, NotificationChain msgs)
  {
    FunctionQualifiedName oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.ATTRIBUTION_TYPE__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(FunctionQualifiedName newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ATTRIBUTION_TYPE__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ATTRIBUTION_TYPE__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.ATTRIBUTION_TYPE__F, newF, newF));
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
      case EcecPackage.ATTRIBUTION_TYPE__P:
        return basicSetP(null, msgs);
      case EcecPackage.ATTRIBUTION_TYPE__F:
        return basicSetF(null, msgs);
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
      case EcecPackage.ATTRIBUTION_TYPE__P:
        return getP();
      case EcecPackage.ATTRIBUTION_TYPE__F:
        return getF();
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
      case EcecPackage.ATTRIBUTION_TYPE__P:
        setP((ParameterQualifiedName)newValue);
        return;
      case EcecPackage.ATTRIBUTION_TYPE__F:
        setF((FunctionQualifiedName)newValue);
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
      case EcecPackage.ATTRIBUTION_TYPE__P:
        setP((ParameterQualifiedName)null);
        return;
      case EcecPackage.ATTRIBUTION_TYPE__F:
        setF((FunctionQualifiedName)null);
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
      case EcecPackage.ATTRIBUTION_TYPE__P:
        return p != null;
      case EcecPackage.ATTRIBUTION_TYPE__F:
        return f != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributionTypeImpl
