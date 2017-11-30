/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.EcecModel;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Entity;
import org.cirad.dsl.ecec.xtext.ecec.Space;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EcecModelImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EcecModelImpl#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcecModelImpl extends MinimalEObjectImpl.Container implements EcecModel
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EList<Entity> entity;

  /**
   * The cached value of the '{@link #getSpace() <em>Space</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected EList<Space> space;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcecModelImpl()
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
    return EcecPackage.Literals.ECEC_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntity()
  {
    if (entity == null)
    {
      entity = new EObjectContainmentEList<Entity>(Entity.class, this, EcecPackage.ECEC_MODEL__ENTITY);
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Space> getSpace()
  {
    if (space == null)
    {
      space = new EObjectContainmentEList<Space>(Space.class, this, EcecPackage.ECEC_MODEL__SPACE);
    }
    return space;
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
      case EcecPackage.ECEC_MODEL__ENTITY:
        return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
      case EcecPackage.ECEC_MODEL__SPACE:
        return ((InternalEList<?>)getSpace()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.ECEC_MODEL__ENTITY:
        return getEntity();
      case EcecPackage.ECEC_MODEL__SPACE:
        return getSpace();
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
      case EcecPackage.ECEC_MODEL__ENTITY:
        getEntity().clear();
        getEntity().addAll((Collection<? extends Entity>)newValue);
        return;
      case EcecPackage.ECEC_MODEL__SPACE:
        getSpace().clear();
        getSpace().addAll((Collection<? extends Space>)newValue);
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
      case EcecPackage.ECEC_MODEL__ENTITY:
        getEntity().clear();
        return;
      case EcecPackage.ECEC_MODEL__SPACE:
        getSpace().clear();
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
      case EcecPackage.ECEC_MODEL__ENTITY:
        return entity != null && !entity.isEmpty();
      case EcecPackage.ECEC_MODEL__SPACE:
        return space != null && !space.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EcecModelImpl
