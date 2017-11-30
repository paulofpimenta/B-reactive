/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.Duration;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.StartActivity;

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
 * An implementation of the model object '<em><b>Behaviour Definion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getHasStart <em>Has Start</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getHasEnd <em>Has End</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getHasDuration <em>Has Duration</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDefinionImpl#getExecutes <em>Executes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourDefinionImpl extends MinimalEObjectImpl.Container implements BehaviourDefinion
{
  /**
   * The default value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected String behaviour = BEHAVIOUR_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasStart() <em>Has Start</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasStart()
   * @generated
   * @ordered
   */
  protected EList<StartActivity> hasStart;

  /**
   * The cached value of the '{@link #getHasEnd() <em>Has End</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasEnd()
   * @generated
   * @ordered
   */
  protected EList<FinishActivity> hasEnd;

  /**
   * The cached value of the '{@link #getHasDuration() <em>Has Duration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasDuration()
   * @generated
   * @ordered
   */
  protected EList<Duration> hasDuration;

  /**
   * The cached value of the '{@link #getHasCondition() <em>Has Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> hasCondition;

  /**
   * The cached value of the '{@link #getExecutes() <em>Executes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutes()
   * @generated
   * @ordered
   */
  protected EList<ExecutionDeclaration> executes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviourDefinionImpl()
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
    return EcecPackage.Literals.BEHAVIOUR_DEFINION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehaviour()
  {
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviour(String newBehaviour)
  {
    String oldBehaviour = behaviour;
    behaviour = newBehaviour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.BEHAVIOUR_DEFINION__BEHAVIOUR, oldBehaviour, behaviour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartActivity> getHasStart()
  {
    if (hasStart == null)
    {
      hasStart = new EObjectContainmentEList<StartActivity>(StartActivity.class, this, EcecPackage.BEHAVIOUR_DEFINION__HAS_START);
    }
    return hasStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FinishActivity> getHasEnd()
  {
    if (hasEnd == null)
    {
      hasEnd = new EObjectContainmentEList<FinishActivity>(FinishActivity.class, this, EcecPackage.BEHAVIOUR_DEFINION__HAS_END);
    }
    return hasEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Duration> getHasDuration()
  {
    if (hasDuration == null)
    {
      hasDuration = new EObjectContainmentEList<Duration>(Duration.class, this, EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION);
    }
    return hasDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getHasCondition()
  {
    if (hasCondition == null)
    {
      hasCondition = new EObjectContainmentEList<Condition>(Condition.class, this, EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION);
    }
    return hasCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecutionDeclaration> getExecutes()
  {
    if (executes == null)
    {
      executes = new EObjectContainmentEList<ExecutionDeclaration>(ExecutionDeclaration.class, this, EcecPackage.BEHAVIOUR_DEFINION__EXECUTES);
    }
    return executes;
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
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_START:
        return ((InternalEList<?>)getHasStart()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_END:
        return ((InternalEList<?>)getHasEnd()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION:
        return ((InternalEList<?>)getHasDuration()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION:
        return ((InternalEList<?>)getHasCondition()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR_DEFINION__EXECUTES:
        return ((InternalEList<?>)getExecutes()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.BEHAVIOUR_DEFINION__BEHAVIOUR:
        return getBehaviour();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_START:
        return getHasStart();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_END:
        return getHasEnd();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION:
        return getHasDuration();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION:
        return getHasCondition();
      case EcecPackage.BEHAVIOUR_DEFINION__EXECUTES:
        return getExecutes();
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
      case EcecPackage.BEHAVIOUR_DEFINION__BEHAVIOUR:
        setBehaviour((String)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_START:
        getHasStart().clear();
        getHasStart().addAll((Collection<? extends StartActivity>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_END:
        getHasEnd().clear();
        getHasEnd().addAll((Collection<? extends FinishActivity>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION:
        getHasDuration().clear();
        getHasDuration().addAll((Collection<? extends Duration>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION:
        getHasCondition().clear();
        getHasCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__EXECUTES:
        getExecutes().clear();
        getExecutes().addAll((Collection<? extends ExecutionDeclaration>)newValue);
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
      case EcecPackage.BEHAVIOUR_DEFINION__BEHAVIOUR:
        setBehaviour(BEHAVIOUR_EDEFAULT);
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_START:
        getHasStart().clear();
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_END:
        getHasEnd().clear();
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION:
        getHasDuration().clear();
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION:
        getHasCondition().clear();
        return;
      case EcecPackage.BEHAVIOUR_DEFINION__EXECUTES:
        getExecutes().clear();
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
      case EcecPackage.BEHAVIOUR_DEFINION__BEHAVIOUR:
        return BEHAVIOUR_EDEFAULT == null ? behaviour != null : !BEHAVIOUR_EDEFAULT.equals(behaviour);
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_START:
        return hasStart != null && !hasStart.isEmpty();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_END:
        return hasEnd != null && !hasEnd.isEmpty();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_DURATION:
        return hasDuration != null && !hasDuration.isEmpty();
      case EcecPackage.BEHAVIOUR_DEFINION__HAS_CONDITION:
        return hasCondition != null && !hasCondition.isEmpty();
      case EcecPackage.BEHAVIOUR_DEFINION__EXECUTES:
        return executes != null && !executes.isEmpty();
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
    result.append(" (Behaviour: ");
    result.append(behaviour);
    result.append(')');
    return result.toString();
  }

} //BehaviourDefinionImpl
