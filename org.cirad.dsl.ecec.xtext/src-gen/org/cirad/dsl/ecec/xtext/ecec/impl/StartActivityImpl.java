/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.BehaviourName;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Parameter;
import org.cirad.dsl.ecec.xtext.ecec.StartActivity;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityImpl#getBehaviourname <em>Behaviourname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.StartActivityImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartActivityImpl extends MinimalEObjectImpl.Container implements StartActivity
{
  /**
   * The cached value of the '{@link #getBehaviourname() <em>Behaviourname</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourname()
   * @generated
   * @ordered
   */
  protected EList<BehaviourName> behaviourname;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Parameter> param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartActivityImpl()
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
    return EcecPackage.Literals.START_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviourName> getBehaviourname()
  {
    if (behaviourname == null)
    {
      behaviourname = new EObjectContainmentEList<BehaviourName>(BehaviourName.class, this, EcecPackage.START_ACTIVITY__BEHAVIOURNAME);
    }
    return behaviourname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParam()
  {
    if (param == null)
    {
      param = new EObjectResolvingEList<Parameter>(Parameter.class, this, EcecPackage.START_ACTIVITY__PARAM);
    }
    return param;
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
      case EcecPackage.START_ACTIVITY__BEHAVIOURNAME:
        return ((InternalEList<?>)getBehaviourname()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.START_ACTIVITY__BEHAVIOURNAME:
        return getBehaviourname();
      case EcecPackage.START_ACTIVITY__PARAM:
        return getParam();
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
      case EcecPackage.START_ACTIVITY__BEHAVIOURNAME:
        getBehaviourname().clear();
        getBehaviourname().addAll((Collection<? extends BehaviourName>)newValue);
        return;
      case EcecPackage.START_ACTIVITY__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Parameter>)newValue);
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
      case EcecPackage.START_ACTIVITY__BEHAVIOURNAME:
        getBehaviourname().clear();
        return;
      case EcecPackage.START_ACTIVITY__PARAM:
        getParam().clear();
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
      case EcecPackage.START_ACTIVITY__BEHAVIOURNAME:
        return behaviourname != null && !behaviourname.isEmpty();
      case EcecPackage.START_ACTIVITY__PARAM:
        return param != null && !param.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StartActivityImpl
