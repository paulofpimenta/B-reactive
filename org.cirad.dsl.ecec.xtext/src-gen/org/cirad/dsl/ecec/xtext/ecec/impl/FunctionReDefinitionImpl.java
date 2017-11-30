/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.BehaviourName;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.ConditionEnum;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Equality;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition;
import org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition;
import org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Re Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getSaef <em>Saef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getBe2 <em>Be2</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getRedeff <em>Redeff</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getCe <em>Ce</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getFunctionredef <em>Functionredef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getEquality <em>Equality</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionReDefinitionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionReDefinitionImpl extends StartActivityDeclarationImpl implements FunctionReDefinition
{
  /**
   * The cached value of the '{@link #getSaef() <em>Saef</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaef()
   * @generated
   * @ordered
   */
  protected EList<StarAndEndExp> saef;

  /**
   * The cached value of the '{@link #getBe2() <em>Be2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBe2()
   * @generated
   * @ordered
   */
  protected EList<BehaviourName> be2;

  /**
   * The cached value of the '{@link #getRedeff() <em>Redeff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRedeff()
   * @generated
   * @ordered
   */
  protected ParametersReDefinition redeff;

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
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected EList<ParametersReDefinition> if_;

  /**
   * The cached value of the '{@link #getFunctionredef() <em>Functionredef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionredef()
   * @generated
   * @ordered
   */
  protected FunctionExpression functionredef;

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
  protected FunctionReDefinitionImpl()
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
    return EcecPackage.Literals.FUNCTION_RE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StarAndEndExp> getSaef()
  {
    if (saef == null)
    {
      saef = new EDataTypeEList<StarAndEndExp>(StarAndEndExp.class, this, EcecPackage.FUNCTION_RE_DEFINITION__SAEF);
    }
    return saef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviourName> getBe2()
  {
    if (be2 == null)
    {
      be2 = new EObjectContainmentEList<BehaviourName>(BehaviourName.class, this, EcecPackage.FUNCTION_RE_DEFINITION__BE2);
    }
    return be2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersReDefinition getRedeff()
  {
    return redeff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRedeff(ParametersReDefinition newRedeff, NotificationChain msgs)
  {
    ParametersReDefinition oldRedeff = redeff;
    redeff = newRedeff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__REDEFF, oldRedeff, newRedeff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRedeff(ParametersReDefinition newRedeff)
  {
    if (newRedeff != redeff)
    {
      NotificationChain msgs = null;
      if (redeff != null)
        msgs = ((InternalEObject)redeff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.FUNCTION_RE_DEFINITION__REDEFF, null, msgs);
      if (newRedeff != null)
        msgs = ((InternalEObject)newRedeff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.FUNCTION_RE_DEFINITION__REDEFF, null, msgs);
      msgs = basicSetRedeff(newRedeff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__REDEFF, newRedeff, newRedeff));
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
      ce = new EDataTypeEList<ConditionEnum>(ConditionEnum.class, this, EcecPackage.FUNCTION_RE_DEFINITION__CE);
    }
    return ce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParametersReDefinition> getIf()
  {
    if (if_ == null)
    {
      if_ = new EObjectContainmentEList<ParametersReDefinition>(ParametersReDefinition.class, this, EcecPackage.FUNCTION_RE_DEFINITION__IF);
    }
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression getFunctionredef()
  {
    if (functionredef != null && functionredef.eIsProxy())
    {
      InternalEObject oldFunctionredef = (InternalEObject)functionredef;
      functionredef = (FunctionExpression)eResolveProxy(oldFunctionredef);
      if (functionredef != oldFunctionredef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF, oldFunctionredef, functionredef));
      }
    }
    return functionredef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression basicGetFunctionredef()
  {
    return functionredef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionredef(FunctionExpression newFunctionredef)
  {
    FunctionExpression oldFunctionredef = functionredef;
    functionredef = newFunctionredef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF, oldFunctionredef, functionredef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__EQUALITY, oldEquality, equality));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION, newExpression, newExpression));
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
      case EcecPackage.FUNCTION_RE_DEFINITION__BE2:
        return ((InternalEList<?>)getBe2()).basicRemove(otherEnd, msgs);
      case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF:
        return basicSetRedeff(null, msgs);
      case EcecPackage.FUNCTION_RE_DEFINITION__IF:
        return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
      case EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION:
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
      case EcecPackage.FUNCTION_RE_DEFINITION__SAEF:
        return getSaef();
      case EcecPackage.FUNCTION_RE_DEFINITION__BE2:
        return getBe2();
      case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF:
        return getRedeff();
      case EcecPackage.FUNCTION_RE_DEFINITION__CE:
        return getCe();
      case EcecPackage.FUNCTION_RE_DEFINITION__IF:
        return getIf();
      case EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF:
        if (resolve) return getFunctionredef();
        return basicGetFunctionredef();
      case EcecPackage.FUNCTION_RE_DEFINITION__EQUALITY:
        return getEquality();
      case EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION:
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
      case EcecPackage.FUNCTION_RE_DEFINITION__SAEF:
        getSaef().clear();
        getSaef().addAll((Collection<? extends StarAndEndExp>)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__BE2:
        getBe2().clear();
        getBe2().addAll((Collection<? extends BehaviourName>)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF:
        setRedeff((ParametersReDefinition)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__CE:
        getCe().clear();
        getCe().addAll((Collection<? extends ConditionEnum>)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__IF:
        getIf().clear();
        getIf().addAll((Collection<? extends ParametersReDefinition>)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF:
        setFunctionredef((FunctionExpression)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__EQUALITY:
        setEquality((Equality)newValue);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION:
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
      case EcecPackage.FUNCTION_RE_DEFINITION__SAEF:
        getSaef().clear();
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__BE2:
        getBe2().clear();
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF:
        setRedeff((ParametersReDefinition)null);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__CE:
        getCe().clear();
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__IF:
        getIf().clear();
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF:
        setFunctionredef((FunctionExpression)null);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__EQUALITY:
        setEquality(EQUALITY_EDEFAULT);
        return;
      case EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION:
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
      case EcecPackage.FUNCTION_RE_DEFINITION__SAEF:
        return saef != null && !saef.isEmpty();
      case EcecPackage.FUNCTION_RE_DEFINITION__BE2:
        return be2 != null && !be2.isEmpty();
      case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF:
        return redeff != null;
      case EcecPackage.FUNCTION_RE_DEFINITION__CE:
        return ce != null && !ce.isEmpty();
      case EcecPackage.FUNCTION_RE_DEFINITION__IF:
        return if_ != null && !if_.isEmpty();
      case EcecPackage.FUNCTION_RE_DEFINITION__FUNCTIONREDEF:
        return functionredef != null;
      case EcecPackage.FUNCTION_RE_DEFINITION__EQUALITY:
        return equality != EQUALITY_EDEFAULT;
      case EcecPackage.FUNCTION_RE_DEFINITION__EXPRESSION:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == FinishActivity.class)
    {
      switch (derivedFeatureID)
      {
        case EcecPackage.FUNCTION_RE_DEFINITION__SAEF: return EcecPackage.FINISH_ACTIVITY__SAEF;
        case EcecPackage.FUNCTION_RE_DEFINITION__BE2: return EcecPackage.FINISH_ACTIVITY__BE2;
        case EcecPackage.FUNCTION_RE_DEFINITION__REDEFF: return EcecPackage.FINISH_ACTIVITY__REDEFF;
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (derivedFeatureID)
      {
        case EcecPackage.FUNCTION_RE_DEFINITION__CE: return EcecPackage.CONDITION__CE;
        case EcecPackage.FUNCTION_RE_DEFINITION__IF: return EcecPackage.CONDITION__IF;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == FinishActivity.class)
    {
      switch (baseFeatureID)
      {
        case EcecPackage.FINISH_ACTIVITY__SAEF: return EcecPackage.FUNCTION_RE_DEFINITION__SAEF;
        case EcecPackage.FINISH_ACTIVITY__BE2: return EcecPackage.FUNCTION_RE_DEFINITION__BE2;
        case EcecPackage.FINISH_ACTIVITY__REDEFF: return EcecPackage.FUNCTION_RE_DEFINITION__REDEFF;
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (baseFeatureID)
      {
        case EcecPackage.CONDITION__CE: return EcecPackage.FUNCTION_RE_DEFINITION__CE;
        case EcecPackage.CONDITION__IF: return EcecPackage.FUNCTION_RE_DEFINITION__IF;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (saef: ");
    result.append(saef);
    result.append(", ce: ");
    result.append(ce);
    result.append(", equality: ");
    result.append(equality);
    result.append(')');
    return result.toString();
  }

} //FunctionReDefinitionImpl
