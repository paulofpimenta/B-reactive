/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.FinishActivity;
import org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finish Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl#getSaef <em>Saef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FinishActivityImpl#getBe2 <em>Be2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishActivityImpl extends MinimalEObjectImpl.Container implements FinishActivity
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
  protected EList<BehaviourQualifiedName> be2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FinishActivityImpl()
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
    return EcecPackage.Literals.FINISH_ACTIVITY;
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
      saef = new EDataTypeEList<StarAndEndExp>(StarAndEndExp.class, this, EcecPackage.FINISH_ACTIVITY__SAEF);
    }
    return saef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviourQualifiedName> getBe2()
  {
    if (be2 == null)
    {
      be2 = new EObjectContainmentEList<BehaviourQualifiedName>(BehaviourQualifiedName.class, this, EcecPackage.FINISH_ACTIVITY__BE2);
    }
    return be2;
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
      case EcecPackage.FINISH_ACTIVITY__BE2:
        return ((InternalEList<?>)getBe2()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.FINISH_ACTIVITY__SAEF:
        return getSaef();
      case EcecPackage.FINISH_ACTIVITY__BE2:
        return getBe2();
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
      case EcecPackage.FINISH_ACTIVITY__SAEF:
        getSaef().clear();
        getSaef().addAll((Collection<? extends StarAndEndExp>)newValue);
        return;
      case EcecPackage.FINISH_ACTIVITY__BE2:
        getBe2().clear();
        getBe2().addAll((Collection<? extends BehaviourQualifiedName>)newValue);
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
      case EcecPackage.FINISH_ACTIVITY__SAEF:
        getSaef().clear();
        return;
      case EcecPackage.FINISH_ACTIVITY__BE2:
        getBe2().clear();
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
      case EcecPackage.FINISH_ACTIVITY__SAEF:
        return saef != null && !saef.isEmpty();
      case EcecPackage.FINISH_ACTIVITY__BE2:
        return be2 != null && !be2.isEmpty();
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
    result.append(" (saef: ");
    result.append(saef);
    result.append(')');
    return result.toString();
  }

} //FinishActivityImpl
