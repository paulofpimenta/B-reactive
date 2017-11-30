/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.Condition;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration;

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
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl#getHasStart <em>Has Start</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl#getHasEnd <em>Has End</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourImpl#getExecutes <em>Executes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourImpl extends MinimalEObjectImpl.Container implements Behaviour
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasStart() <em>Has Start</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasStart()
   * @generated
   * @ordered
   */
  protected EList<StartActivityDeclaration> hasStart;

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
  protected BehaviourImpl()
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
    return EcecPackage.Literals.BEHAVIOUR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.BEHAVIOUR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartActivityDeclaration> getHasStart()
  {
    if (hasStart == null)
    {
      hasStart = new EObjectContainmentEList<StartActivityDeclaration>(StartActivityDeclaration.class, this, EcecPackage.BEHAVIOUR__HAS_START);
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
      hasEnd = new EObjectContainmentEList<FinishActivity>(FinishActivity.class, this, EcecPackage.BEHAVIOUR__HAS_END);
    }
    return hasEnd;
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
      hasCondition = new EObjectContainmentEList<Condition>(Condition.class, this, EcecPackage.BEHAVIOUR__HAS_CONDITION);
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
      executes = new EObjectContainmentEList<ExecutionDeclaration>(ExecutionDeclaration.class, this, EcecPackage.BEHAVIOUR__EXECUTES);
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
      case EcecPackage.BEHAVIOUR__HAS_START:
        return ((InternalEList<?>)getHasStart()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR__HAS_END:
        return ((InternalEList<?>)getHasEnd()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR__HAS_CONDITION:
        return ((InternalEList<?>)getHasCondition()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR__EXECUTES:
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
      case EcecPackage.BEHAVIOUR__NAME:
        return getName();
      case EcecPackage.BEHAVIOUR__HAS_START:
        return getHasStart();
      case EcecPackage.BEHAVIOUR__HAS_END:
        return getHasEnd();
      case EcecPackage.BEHAVIOUR__HAS_CONDITION:
        return getHasCondition();
      case EcecPackage.BEHAVIOUR__EXECUTES:
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
      case EcecPackage.BEHAVIOUR__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.BEHAVIOUR__HAS_START:
        getHasStart().clear();
        getHasStart().addAll((Collection<? extends StartActivityDeclaration>)newValue);
        return;
      case EcecPackage.BEHAVIOUR__HAS_END:
        getHasEnd().clear();
        getHasEnd().addAll((Collection<? extends FinishActivity>)newValue);
        return;
      case EcecPackage.BEHAVIOUR__HAS_CONDITION:
        getHasCondition().clear();
        getHasCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case EcecPackage.BEHAVIOUR__EXECUTES:
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
      case EcecPackage.BEHAVIOUR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.BEHAVIOUR__HAS_START:
        getHasStart().clear();
        return;
      case EcecPackage.BEHAVIOUR__HAS_END:
        getHasEnd().clear();
        return;
      case EcecPackage.BEHAVIOUR__HAS_CONDITION:
        getHasCondition().clear();
        return;
      case EcecPackage.BEHAVIOUR__EXECUTES:
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
      case EcecPackage.BEHAVIOUR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.BEHAVIOUR__HAS_START:
        return hasStart != null && !hasStart.isEmpty();
      case EcecPackage.BEHAVIOUR__HAS_END:
        return hasEnd != null && !hasEnd.isEmpty();
      case EcecPackage.BEHAVIOUR__HAS_CONDITION:
        return hasCondition != null && !hasCondition.isEmpty();
      case EcecPackage.BEHAVIOUR__EXECUTES:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BehaviourImpl
