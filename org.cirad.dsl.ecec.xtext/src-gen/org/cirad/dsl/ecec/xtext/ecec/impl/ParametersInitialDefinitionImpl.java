/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Expression;
import org.cirad.dsl.ecec.xtext.ecec.ParametersInitialDefinition;
import org.cirad.dsl.ecec.xtext.ecec.percentage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Initial Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersInitialDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersInitialDefinitionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersInitialDefinitionImpl#getEr <em>Er</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersInitialDefinitionImpl extends ParameterExpressionImpl implements ParametersInitialDefinition
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
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Expression> args;

  /**
   * The cached value of the '{@link #getEr() <em>Er</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEr()
   * @generated
   * @ordered
   */
  protected EList<percentage> er;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParametersInitialDefinitionImpl()
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
    return EcecPackage.Literals.PARAMETERS_INITIAL_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.PARAMETERS_INITIAL_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Expression>(Expression.class, this, EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<percentage> getEr()
  {
    if (er == null)
    {
      er = new EObjectContainmentEList<percentage>(percentage.class, this, EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER);
    }
    return er;
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
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER:
        return ((InternalEList<?>)getEr()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__NAME:
        return getName();
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS:
        return getArgs();
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER:
        return getEr();
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
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Expression>)newValue);
        return;
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER:
        getEr().clear();
        getEr().addAll((Collection<? extends percentage>)newValue);
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
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS:
        getArgs().clear();
        return;
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER:
        getEr().clear();
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
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ARGS:
        return args != null && !args.isEmpty();
      case EcecPackage.PARAMETERS_INITIAL_DEFINITION__ER:
        return er != null && !er.isEmpty();
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

} //ParametersInitialDefinitionImpl
