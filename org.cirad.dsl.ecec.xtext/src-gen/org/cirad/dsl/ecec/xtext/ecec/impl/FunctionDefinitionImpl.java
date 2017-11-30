/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition;
import org.cirad.dsl.ecec.xtext.ecec.SPECIAL;

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
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionDefinitionImpl#getSpecialchar <em>Specialchar</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.FunctionDefinitionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MinimalEObjectImpl.Container implements FunctionDefinition
{
  /**
   * The default value of the '{@link #getSpecialchar() <em>Specialchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecialchar()
   * @generated
   * @ordered
   */
  protected static final SPECIAL SPECIALCHAR_EDEFAULT = SPECIAL.DELTA;

  /**
   * The cached value of the '{@link #getSpecialchar() <em>Specialchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecialchar()
   * @generated
   * @ordered
   */
  protected SPECIAL specialchar = SPECIALCHAR_EDEFAULT;

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
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<Expression> right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return EcecPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPECIAL getSpecialchar()
  {
    return specialchar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecialchar(SPECIAL newSpecialchar)
  {
    SPECIAL oldSpecialchar = specialchar;
    specialchar = newSpecialchar == null ? SPECIALCHAR_EDEFAULT : newSpecialchar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_DEFINITION__SPECIALCHAR, oldSpecialchar, specialchar));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.FUNCTION_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<Expression>(Expression.class, this, EcecPackage.FUNCTION_DEFINITION__RIGHT);
    }
    return right;
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
      case EcecPackage.FUNCTION_DEFINITION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.FUNCTION_DEFINITION__SPECIALCHAR:
        return getSpecialchar();
      case EcecPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case EcecPackage.FUNCTION_DEFINITION__RIGHT:
        return getRight();
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
      case EcecPackage.FUNCTION_DEFINITION__SPECIALCHAR:
        setSpecialchar((SPECIAL)newValue);
        return;
      case EcecPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.FUNCTION_DEFINITION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends Expression>)newValue);
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
      case EcecPackage.FUNCTION_DEFINITION__SPECIALCHAR:
        setSpecialchar(SPECIALCHAR_EDEFAULT);
        return;
      case EcecPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.FUNCTION_DEFINITION__RIGHT:
        getRight().clear();
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
      case EcecPackage.FUNCTION_DEFINITION__SPECIALCHAR:
        return specialchar != SPECIALCHAR_EDEFAULT;
      case EcecPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.FUNCTION_DEFINITION__RIGHT:
        return right != null && !right.isEmpty();
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
    result.append(" (specialchar: ");
    result.append(specialchar);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
