/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Equality;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.ParameterExpression;
import org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Re Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersReDefinitionImpl#getParamredef <em>Paramredef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersReDefinitionImpl#getEquality <em>Equality</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersReDefinitionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersReDefinitionImpl extends MinimalEObjectImpl.Container implements ParametersReDefinition
{
  /**
   * The cached value of the '{@link #getParamredef() <em>Paramredef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamredef()
   * @generated
   * @ordered
   */
  protected ParameterExpression paramredef;

  /**
   * The default value of the '{@link #getEquality() <em>Equality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality()
   * @generated
   * @ordered
   */
  protected static final Equality EQUALITY_EDEFAULT = Equality.BIGGERTHAN;

  /**
   * The cached value of the '{@link #getEquality() <em>Equality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality()
   * @generated
   * @ordered
   */
  protected Equality equality = EQUALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParametersReDefinitionImpl()
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
    return EcecPackage.Literals.PARAMETERS_RE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression getParamredef()
  {
    if (paramredef != null && paramredef.eIsProxy())
    {
      InternalEObject oldParamredef = (InternalEObject)paramredef;
      paramredef = (ParameterExpression)eResolveProxy(oldParamredef);
      if (paramredef != oldParamredef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF, oldParamredef, paramredef));
      }
    }
    return paramredef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression basicGetParamredef()
  {
    return paramredef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamredef(ParameterExpression newParamredef)
  {
    ParameterExpression oldParamredef = paramredef;
    paramredef = newParamredef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF, oldParamredef, paramredef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality getEquality()
  {
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquality(Equality newEquality)
  {
    Equality oldEquality = equality;
    equality = newEquality == null ? EQUALITY_EDEFAULT : newEquality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.PARAMETERS_RE_DEFINITION__EQUALITY, oldEquality, equality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION, newExpression, newExpression));
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
      case EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF:
        if (resolve) return getParamredef();
        return basicGetParamredef();
      case EcecPackage.PARAMETERS_RE_DEFINITION__EQUALITY:
        return getEquality();
      case EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION:
        return getExpression();
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
      case EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF:
        setParamredef((ParameterExpression)newValue);
        return;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EQUALITY:
        setEquality((Equality)newValue);
        return;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF:
        setParamredef((ParameterExpression)null);
        return;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EQUALITY:
        setEquality(EQUALITY_EDEFAULT);
        return;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION:
        setExpression((Expression)null);
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
      case EcecPackage.PARAMETERS_RE_DEFINITION__PARAMREDEF:
        return paramredef != null;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EQUALITY:
        return equality != EQUALITY_EDEFAULT;
      case EcecPackage.PARAMETERS_RE_DEFINITION__EXPRESSION:
        return expression != null;
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
    result.append(" (equality: ");
    result.append(equality);
    result.append(')');
    return result.toString();
  }

} //ParametersReDefinitionImpl
