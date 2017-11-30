/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.FLOAT;
import org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum;
import org.cirad.dsl.ecec.xtext.ecec.ParameterExpression;
import org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Between Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl#getR <em>R</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl#getF <em>F</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl#getF1 <em>F1</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl#getF2 <em>F2</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.RandomBetweenExpressionImpl#getF3 <em>F3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RandomBetweenExpressionImpl extends ExpressionImpl implements RandomBetweenExpression
{
  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final MathFunctionsEnum R_EDEFAULT = MathFunctionsEnum.RANDOMINT;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected MathFunctionsEnum r = R_EDEFAULT;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected FLOAT f;

  /**
   * The cached value of the '{@link #getF1() <em>F1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF1()
   * @generated
   * @ordered
   */
  protected ParameterExpression f1;

  /**
   * The cached value of the '{@link #getF2() <em>F2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF2()
   * @generated
   * @ordered
   */
  protected FLOAT f2;

  /**
   * The cached value of the '{@link #getF3() <em>F3</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF3()
   * @generated
   * @ordered
   */
  protected ParameterExpression f3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RandomBetweenExpressionImpl()
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
    return EcecPackage.Literals.RANDOM_BETWEEN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFunctionsEnum getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(MathFunctionsEnum newR)
  {
    MathFunctionsEnum oldR = r;
    r = newR == null ? R_EDEFAULT : newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FLOAT getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(FLOAT newF, NotificationChain msgs)
  {
    FLOAT oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(FLOAT newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.RANDOM_BETWEEN_EXPRESSION__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.RANDOM_BETWEEN_EXPRESSION__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression getF1()
  {
    if (f1 != null && f1.eIsProxy())
    {
      InternalEObject oldF1 = (InternalEObject)f1;
      f1 = (ParameterExpression)eResolveProxy(oldF1);
      if (f1 != oldF1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1, oldF1, f1));
      }
    }
    return f1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression basicGetF1()
  {
    return f1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF1(ParameterExpression newF1)
  {
    ParameterExpression oldF1 = f1;
    f1 = newF1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1, oldF1, f1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FLOAT getF2()
  {
    return f2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF2(FLOAT newF2, NotificationChain msgs)
  {
    FLOAT oldF2 = f2;
    f2 = newF2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2, oldF2, newF2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF2(FLOAT newF2)
  {
    if (newF2 != f2)
    {
      NotificationChain msgs = null;
      if (f2 != null)
        msgs = ((InternalEObject)f2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2, null, msgs);
      if (newF2 != null)
        msgs = ((InternalEObject)newF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2, null, msgs);
      msgs = basicSetF2(newF2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2, newF2, newF2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression getF3()
  {
    if (f3 != null && f3.eIsProxy())
    {
      InternalEObject oldF3 = (InternalEObject)f3;
      f3 = (ParameterExpression)eResolveProxy(oldF3);
      if (f3 != oldF3)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3, oldF3, f3));
      }
    }
    return f3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression basicGetF3()
  {
    return f3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF3(ParameterExpression newF3)
  {
    ParameterExpression oldF3 = f3;
    f3 = newF3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3, oldF3, f3));
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
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F:
        return basicSetF(null, msgs);
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2:
        return basicSetF2(null, msgs);
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
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__R:
        return getR();
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F:
        return getF();
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1:
        if (resolve) return getF1();
        return basicGetF1();
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2:
        return getF2();
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3:
        if (resolve) return getF3();
        return basicGetF3();
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
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__R:
        setR((MathFunctionsEnum)newValue);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F:
        setF((FLOAT)newValue);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1:
        setF1((ParameterExpression)newValue);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2:
        setF2((FLOAT)newValue);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3:
        setF3((ParameterExpression)newValue);
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
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__R:
        setR(R_EDEFAULT);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F:
        setF((FLOAT)null);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1:
        setF1((ParameterExpression)null);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2:
        setF2((FLOAT)null);
        return;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3:
        setF3((ParameterExpression)null);
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
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__R:
        return r != R_EDEFAULT;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F:
        return f != null;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F1:
        return f1 != null;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F2:
        return f2 != null;
      case EcecPackage.RANDOM_BETWEEN_EXPRESSION__F3:
        return f3 != null;
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
    result.append(" (r: ");
    result.append(r);
    result.append(')');
    return result.toString();
  }

} //RandomBetweenExpressionImpl
