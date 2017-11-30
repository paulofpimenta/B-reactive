/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AgentEntity;
import org.cirad.dsl.ecec.xtext.ecec.BooleanExpression;
import org.cirad.dsl.ecec.xtext.ecec.Cell;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl#getOccupiedbyspatialEntity <em>Occupiedbyspatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl#getOcuppied <em>Ocuppied</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl#getX <em>X</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.CellImpl#getOccupiedbyAgentEntity <em>Occupiedby Agent Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell
{
  /**
   * The cached value of the '{@link #getOccupiedbyspatialEntity() <em>Occupiedbyspatial Entity</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupiedbyspatialEntity()
   * @generated
   * @ordered
   */
  protected EList<SpatialEntity> occupiedbyspatialEntity;

  /**
   * The cached value of the '{@link #getOcuppied() <em>Ocuppied</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOcuppied()
   * @generated
   * @ordered
   */
  protected BooleanExpression ocuppied;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The cached value of the '{@link #getOccupiedbyAgentEntity() <em>Occupiedby Agent Entity</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupiedbyAgentEntity()
   * @generated
   * @ordered
   */
  protected EList<AgentEntity> occupiedbyAgentEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellImpl()
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
    return EcecPackage.Literals.CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpatialEntity> getOccupiedbyspatialEntity()
  {
    if (occupiedbyspatialEntity == null)
    {
      occupiedbyspatialEntity = new EObjectResolvingEList<SpatialEntity>(SpatialEntity.class, this, EcecPackage.CELL__OCCUPIEDBYSPATIAL_ENTITY);
    }
    return occupiedbyspatialEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression getOcuppied()
  {
    return ocuppied;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOcuppied(BooleanExpression newOcuppied, NotificationChain msgs)
  {
    BooleanExpression oldOcuppied = ocuppied;
    ocuppied = newOcuppied;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.CELL__OCUPPIED, oldOcuppied, newOcuppied);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOcuppied(BooleanExpression newOcuppied)
  {
    if (newOcuppied != ocuppied)
    {
      NotificationChain msgs = null;
      if (ocuppied != null)
        msgs = ((InternalEObject)ocuppied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CELL__OCUPPIED, null, msgs);
      if (newOcuppied != null)
        msgs = ((InternalEObject)newOcuppied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.CELL__OCUPPIED, null, msgs);
      msgs = basicSetOcuppied(newOcuppied, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.CELL__OCUPPIED, newOcuppied, newOcuppied));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.CELL__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.CELL__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AgentEntity> getOccupiedbyAgentEntity()
  {
    if (occupiedbyAgentEntity == null)
    {
      occupiedbyAgentEntity = new EObjectResolvingEList<AgentEntity>(AgentEntity.class, this, EcecPackage.CELL__OCCUPIEDBY_AGENT_ENTITY);
    }
    return occupiedbyAgentEntity;
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
      case EcecPackage.CELL__OCUPPIED:
        return basicSetOcuppied(null, msgs);
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
      case EcecPackage.CELL__OCCUPIEDBYSPATIAL_ENTITY:
        return getOccupiedbyspatialEntity();
      case EcecPackage.CELL__OCUPPIED:
        return getOcuppied();
      case EcecPackage.CELL__X:
        return getX();
      case EcecPackage.CELL__Y:
        return getY();
      case EcecPackage.CELL__OCCUPIEDBY_AGENT_ENTITY:
        return getOccupiedbyAgentEntity();
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
      case EcecPackage.CELL__OCCUPIEDBYSPATIAL_ENTITY:
        getOccupiedbyspatialEntity().clear();
        getOccupiedbyspatialEntity().addAll((Collection<? extends SpatialEntity>)newValue);
        return;
      case EcecPackage.CELL__OCUPPIED:
        setOcuppied((BooleanExpression)newValue);
        return;
      case EcecPackage.CELL__X:
        setX((Integer)newValue);
        return;
      case EcecPackage.CELL__Y:
        setY((Integer)newValue);
        return;
      case EcecPackage.CELL__OCCUPIEDBY_AGENT_ENTITY:
        getOccupiedbyAgentEntity().clear();
        getOccupiedbyAgentEntity().addAll((Collection<? extends AgentEntity>)newValue);
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
      case EcecPackage.CELL__OCCUPIEDBYSPATIAL_ENTITY:
        getOccupiedbyspatialEntity().clear();
        return;
      case EcecPackage.CELL__OCUPPIED:
        setOcuppied((BooleanExpression)null);
        return;
      case EcecPackage.CELL__X:
        setX(X_EDEFAULT);
        return;
      case EcecPackage.CELL__Y:
        setY(Y_EDEFAULT);
        return;
      case EcecPackage.CELL__OCCUPIEDBY_AGENT_ENTITY:
        getOccupiedbyAgentEntity().clear();
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
      case EcecPackage.CELL__OCCUPIEDBYSPATIAL_ENTITY:
        return occupiedbyspatialEntity != null && !occupiedbyspatialEntity.isEmpty();
      case EcecPackage.CELL__OCUPPIED:
        return ocuppied != null;
      case EcecPackage.CELL__X:
        return x != X_EDEFAULT;
      case EcecPackage.CELL__Y:
        return y != Y_EDEFAULT;
      case EcecPackage.CELL__OCCUPIEDBY_AGENT_ENTITY:
        return occupiedbyAgentEntity != null && !occupiedbyAgentEntity.isEmpty();
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(')');
    return result.toString();
  }

} //CellImpl
