/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AgentEntity;
import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.InitialLocationType;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getAgentNumbers <em>Agent Numbers</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getInitialAgentLocation <em>Initial Agent Location</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getSpatialEntity <em>Spatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getAgentparameters <em>Agentparameters</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getAgentfunction <em>Agentfunction</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.AgentEntityImpl#getAgentbehaviourdefinition <em>Agentbehaviourdefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentEntityImpl extends MinimalEObjectImpl.Container implements AgentEntity
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
   * The default value of the '{@link #getAgentNumbers() <em>Agent Numbers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentNumbers()
   * @generated
   * @ordered
   */
  protected static final int AGENT_NUMBERS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAgentNumbers() <em>Agent Numbers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentNumbers()
   * @generated
   * @ordered
   */
  protected int agentNumbers = AGENT_NUMBERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitialAgentLocation() <em>Initial Agent Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialAgentLocation()
   * @generated
   * @ordered
   */
  protected InitialLocationType initialAgentLocation;

  /**
   * The cached value of the '{@link #getSpatialEntity() <em>Spatial Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpatialEntity()
   * @generated
   * @ordered
   */
  protected SpatialEntity spatialEntity;

  /**
   * The cached value of the '{@link #getAgentparameters() <em>Agentparameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentparameters()
   * @generated
   * @ordered
   */
  protected EList<EObject> agentparameters;

  /**
   * The cached value of the '{@link #getAgentfunction() <em>Agentfunction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentfunction()
   * @generated
   * @ordered
   */
  protected EList<FunctionExpression> agentfunction;

  /**
   * The cached value of the '{@link #getAgentbehaviourdefinition() <em>Agentbehaviourdefinition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentbehaviourdefinition()
   * @generated
   * @ordered
   */
  protected EList<Behaviour> agentbehaviourdefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentEntityImpl()
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
    return EcecPackage.Literals.AGENT_ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.AGENT_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAgentNumbers()
  {
    return agentNumbers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgentNumbers(int newAgentNumbers)
  {
    int oldAgentNumbers = agentNumbers;
    agentNumbers = newAgentNumbers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.AGENT_ENTITY__AGENT_NUMBERS, oldAgentNumbers, agentNumbers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialLocationType getInitialAgentLocation()
  {
    return initialAgentLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialAgentLocation(InitialLocationType newInitialAgentLocation, NotificationChain msgs)
  {
    InitialLocationType oldInitialAgentLocation = initialAgentLocation;
    initialAgentLocation = newInitialAgentLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION, oldInitialAgentLocation, newInitialAgentLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialAgentLocation(InitialLocationType newInitialAgentLocation)
  {
    if (newInitialAgentLocation != initialAgentLocation)
    {
      NotificationChain msgs = null;
      if (initialAgentLocation != null)
        msgs = ((InternalEObject)initialAgentLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION, null, msgs);
      if (newInitialAgentLocation != null)
        msgs = ((InternalEObject)newInitialAgentLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION, null, msgs);
      msgs = basicSetInitialAgentLocation(newInitialAgentLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION, newInitialAgentLocation, newInitialAgentLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpatialEntity getSpatialEntity()
  {
    if (spatialEntity != null && spatialEntity.eIsProxy())
    {
      InternalEObject oldSpatialEntity = (InternalEObject)spatialEntity;
      spatialEntity = (SpatialEntity)eResolveProxy(oldSpatialEntity);
      if (spatialEntity != oldSpatialEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY, oldSpatialEntity, spatialEntity));
      }
    }
    return spatialEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpatialEntity basicGetSpatialEntity()
  {
    return spatialEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpatialEntity(SpatialEntity newSpatialEntity)
  {
    SpatialEntity oldSpatialEntity = spatialEntity;
    spatialEntity = newSpatialEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY, oldSpatialEntity, spatialEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getAgentparameters()
  {
    if (agentparameters == null)
    {
      agentparameters = new EObjectContainmentEList<EObject>(EObject.class, this, EcecPackage.AGENT_ENTITY__AGENTPARAMETERS);
    }
    return agentparameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionExpression> getAgentfunction()
  {
    if (agentfunction == null)
    {
      agentfunction = new EObjectContainmentEList<FunctionExpression>(FunctionExpression.class, this, EcecPackage.AGENT_ENTITY__AGENTFUNCTION);
    }
    return agentfunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behaviour> getAgentbehaviourdefinition()
  {
    if (agentbehaviourdefinition == null)
    {
      agentbehaviourdefinition = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION);
    }
    return agentbehaviourdefinition;
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
      case EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION:
        return basicSetInitialAgentLocation(null, msgs);
      case EcecPackage.AGENT_ENTITY__AGENTPARAMETERS:
        return ((InternalEList<?>)getAgentparameters()).basicRemove(otherEnd, msgs);
      case EcecPackage.AGENT_ENTITY__AGENTFUNCTION:
        return ((InternalEList<?>)getAgentfunction()).basicRemove(otherEnd, msgs);
      case EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION:
        return ((InternalEList<?>)getAgentbehaviourdefinition()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.AGENT_ENTITY__NAME:
        return getName();
      case EcecPackage.AGENT_ENTITY__AGENT_NUMBERS:
        return getAgentNumbers();
      case EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION:
        return getInitialAgentLocation();
      case EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY:
        if (resolve) return getSpatialEntity();
        return basicGetSpatialEntity();
      case EcecPackage.AGENT_ENTITY__AGENTPARAMETERS:
        return getAgentparameters();
      case EcecPackage.AGENT_ENTITY__AGENTFUNCTION:
        return getAgentfunction();
      case EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION:
        return getAgentbehaviourdefinition();
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
      case EcecPackage.AGENT_ENTITY__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__AGENT_NUMBERS:
        setAgentNumbers((Integer)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION:
        setInitialAgentLocation((InitialLocationType)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY:
        setSpatialEntity((SpatialEntity)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__AGENTPARAMETERS:
        getAgentparameters().clear();
        getAgentparameters().addAll((Collection<? extends EObject>)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__AGENTFUNCTION:
        getAgentfunction().clear();
        getAgentfunction().addAll((Collection<? extends FunctionExpression>)newValue);
        return;
      case EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION:
        getAgentbehaviourdefinition().clear();
        getAgentbehaviourdefinition().addAll((Collection<? extends Behaviour>)newValue);
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
      case EcecPackage.AGENT_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.AGENT_ENTITY__AGENT_NUMBERS:
        setAgentNumbers(AGENT_NUMBERS_EDEFAULT);
        return;
      case EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION:
        setInitialAgentLocation((InitialLocationType)null);
        return;
      case EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY:
        setSpatialEntity((SpatialEntity)null);
        return;
      case EcecPackage.AGENT_ENTITY__AGENTPARAMETERS:
        getAgentparameters().clear();
        return;
      case EcecPackage.AGENT_ENTITY__AGENTFUNCTION:
        getAgentfunction().clear();
        return;
      case EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION:
        getAgentbehaviourdefinition().clear();
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
      case EcecPackage.AGENT_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.AGENT_ENTITY__AGENT_NUMBERS:
        return agentNumbers != AGENT_NUMBERS_EDEFAULT;
      case EcecPackage.AGENT_ENTITY__INITIAL_AGENT_LOCATION:
        return initialAgentLocation != null;
      case EcecPackage.AGENT_ENTITY__SPATIAL_ENTITY:
        return spatialEntity != null;
      case EcecPackage.AGENT_ENTITY__AGENTPARAMETERS:
        return agentparameters != null && !agentparameters.isEmpty();
      case EcecPackage.AGENT_ENTITY__AGENTFUNCTION:
        return agentfunction != null && !agentfunction.isEmpty();
      case EcecPackage.AGENT_ENTITY__AGENTBEHAVIOURDEFINITION:
        return agentbehaviourdefinition != null && !agentbehaviourdefinition.isEmpty();
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
    result.append(", agentNumbers: ");
    result.append(agentNumbers);
    result.append(')');
    return result.toString();
  }

} //AgentEntityImpl
