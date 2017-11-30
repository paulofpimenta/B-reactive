/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Entity;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.ParameterExpression;
import org.cirad.dsl.ecec.xtext.ecec.TypeEntity;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityImpl#getBehaviourdefinition <em>Behaviourdefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeEntity type;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterExpression> parameters;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected EList<FunctionExpression> function;

  /**
   * The cached value of the '{@link #getBehaviourdefinition() <em>Behaviourdefinition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourdefinition()
   * @generated
   * @ordered
   */
  protected EList<Behaviour> behaviourdefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return EcecPackage.Literals.ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeEntity getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeEntity newType, NotificationChain msgs)
  {
    TypeEntity oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.ENTITY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeEntity newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ENTITY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.ENTITY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.ENTITY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterExpression> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterExpression>(ParameterExpression.class, this, EcecPackage.ENTITY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionExpression> getFunction()
  {
    if (function == null)
    {
      function = new EObjectContainmentEList<FunctionExpression>(FunctionExpression.class, this, EcecPackage.ENTITY__FUNCTION);
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behaviour> getBehaviourdefinition()
  {
    if (behaviourdefinition == null)
    {
      behaviourdefinition = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, EcecPackage.ENTITY__BEHAVIOURDEFINITION);
    }
    return behaviourdefinition;
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
      case EcecPackage.ENTITY__TYPE:
        return basicSetType(null, msgs);
      case EcecPackage.ENTITY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EcecPackage.ENTITY__FUNCTION:
        return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
      case EcecPackage.ENTITY__BEHAVIOURDEFINITION:
        return ((InternalEList<?>)getBehaviourdefinition()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.ENTITY__NAME:
        return getName();
      case EcecPackage.ENTITY__TYPE:
        return getType();
      case EcecPackage.ENTITY__PARAMETERS:
        return getParameters();
      case EcecPackage.ENTITY__FUNCTION:
        return getFunction();
      case EcecPackage.ENTITY__BEHAVIOURDEFINITION:
        return getBehaviourdefinition();
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
      case EcecPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.ENTITY__TYPE:
        setType((TypeEntity)newValue);
        return;
      case EcecPackage.ENTITY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterExpression>)newValue);
        return;
      case EcecPackage.ENTITY__FUNCTION:
        getFunction().clear();
        getFunction().addAll((Collection<? extends FunctionExpression>)newValue);
        return;
      case EcecPackage.ENTITY__BEHAVIOURDEFINITION:
        getBehaviourdefinition().clear();
        getBehaviourdefinition().addAll((Collection<? extends Behaviour>)newValue);
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
      case EcecPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.ENTITY__TYPE:
        setType((TypeEntity)null);
        return;
      case EcecPackage.ENTITY__PARAMETERS:
        getParameters().clear();
        return;
      case EcecPackage.ENTITY__FUNCTION:
        getFunction().clear();
        return;
      case EcecPackage.ENTITY__BEHAVIOURDEFINITION:
        getBehaviourdefinition().clear();
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
      case EcecPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.ENTITY__TYPE:
        return type != null;
      case EcecPackage.ENTITY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EcecPackage.ENTITY__FUNCTION:
        return function != null && !function.isEmpty();
      case EcecPackage.ENTITY__BEHAVIOURDEFINITION:
        return behaviourdefinition != null && !behaviourdefinition.isEmpty();
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

} //EntityImpl
