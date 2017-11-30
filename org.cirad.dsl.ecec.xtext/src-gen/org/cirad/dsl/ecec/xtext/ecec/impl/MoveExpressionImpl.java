/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.MoveExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MoveExpressionImpl#getMove <em>Move</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveExpressionImpl extends MinimalEObjectImpl.Container implements MoveExpression
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
   * The cached value of the '{@link #getMove() <em>Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected EObject move;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveExpressionImpl()
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
    return EcecPackage.Literals.MOVE_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MOVE_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getMove()
  {
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMove(EObject newMove, NotificationChain msgs)
  {
    EObject oldMove = move;
    move = newMove;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.MOVE_EXPRESSION__MOVE, oldMove, newMove);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMove(EObject newMove)
  {
    if (newMove != move)
    {
      NotificationChain msgs = null;
      if (move != null)
        msgs = ((InternalEObject)move).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.MOVE_EXPRESSION__MOVE, null, msgs);
      if (newMove != null)
        msgs = ((InternalEObject)newMove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.MOVE_EXPRESSION__MOVE, null, msgs);
      msgs = basicSetMove(newMove, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MOVE_EXPRESSION__MOVE, newMove, newMove));
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
      case EcecPackage.MOVE_EXPRESSION__MOVE:
        return basicSetMove(null, msgs);
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
      case EcecPackage.MOVE_EXPRESSION__NAME:
        return getName();
      case EcecPackage.MOVE_EXPRESSION__MOVE:
        return getMove();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcecPackage.MOVE_EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.MOVE_EXPRESSION__MOVE:
        setMove((EObject)newValue);
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
      case EcecPackage.MOVE_EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.MOVE_EXPRESSION__MOVE:
        setMove((EObject)null);
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
      case EcecPackage.MOVE_EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.MOVE_EXPRESSION__MOVE:
        return move != null;
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

} //MoveExpressionImpl
