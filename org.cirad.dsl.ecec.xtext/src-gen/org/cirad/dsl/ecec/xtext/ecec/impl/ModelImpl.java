/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AgentEntity;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Model;
import org.cirad.dsl.ecec.xtext.ecec.Space;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl#getSpatialEntity <em>Spatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ModelImpl#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected EList<AgentEntity> agent;

  /**
   * The cached value of the '{@link #getSpatialEntity() <em>Spatial Entity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpatialEntity()
   * @generated
   * @ordered
   */
  protected EList<SpatialEntity> spatialEntity;

  /**
   * The cached value of the '{@link #getSpace() <em>Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected Space space;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return EcecPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AgentEntity> getAgent()
  {
    if (agent == null)
    {
      agent = new EObjectContainmentEList<AgentEntity>(AgentEntity.class, this, EcecPackage.MODEL__AGENT);
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpatialEntity> getSpatialEntity()
  {
    if (spatialEntity == null)
    {
      spatialEntity = new EObjectContainmentEList<SpatialEntity>(SpatialEntity.class, this, EcecPackage.MODEL__SPATIAL_ENTITY);
    }
    return spatialEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space getSpace()
  {
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs)
  {
    Space oldSpace = space;
    space = newSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.MODEL__SPACE, oldSpace, newSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpace(Space newSpace)
  {
    if (newSpace != space)
    {
      NotificationChain msgs = null;
      if (space != null)
        msgs = ((InternalEObject)space).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.MODEL__SPACE, null, msgs);
      if (newSpace != null)
        msgs = ((InternalEObject)newSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.MODEL__SPACE, null, msgs);
      msgs = basicSetSpace(newSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MODEL__SPACE, newSpace, newSpace));
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
      case EcecPackage.MODEL__AGENT:
        return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
      case EcecPackage.MODEL__SPATIAL_ENTITY:
        return ((InternalEList<?>)getSpatialEntity()).basicRemove(otherEnd, msgs);
      case EcecPackage.MODEL__SPACE:
        return basicSetSpace(null, msgs);
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
      case EcecPackage.MODEL__AGENT:
        return getAgent();
      case EcecPackage.MODEL__SPATIAL_ENTITY:
        return getSpatialEntity();
      case EcecPackage.MODEL__SPACE:
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
      case EcecPackage.MODEL__AGENT:
        getAgent().clear();
        getAgent().addAll((Collection<? extends AgentEntity>)newValue);
        return;
      case EcecPackage.MODEL__SPATIAL_ENTITY:
        getSpatialEntity().clear();
        getSpatialEntity().addAll((Collection<? extends SpatialEntity>)newValue);
        return;
      case EcecPackage.MODEL__SPACE:
        setSpace((Space)newValue);
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
      case EcecPackage.MODEL__AGENT:
        getAgent().clear();
        return;
      case EcecPackage.MODEL__SPATIAL_ENTITY:
        getSpatialEntity().clear();
        return;
      case EcecPackage.MODEL__SPACE:
        setSpace((Space)null);
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
      case EcecPackage.MODEL__AGENT:
        return agent != null && !agent.isEmpty();
      case EcecPackage.MODEL__SPATIAL_ENTITY:
        return spatialEntity != null && !spatialEntity.isEmpty();
      case EcecPackage.MODEL__SPACE:
        return space != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
