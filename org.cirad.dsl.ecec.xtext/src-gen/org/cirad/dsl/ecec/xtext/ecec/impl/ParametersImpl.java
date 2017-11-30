/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.InitialValueExpressionDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.Parameters;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.ParametersImpl#getInitexpression <em>Initexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersImpl extends ParametersListDeclarationImpl implements Parameters
{
  /**
   * The cached value of the '{@link #getInitexpression() <em>Initexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitexpression()
   * @generated
   * @ordered
   */
  protected EList<InitialValueExpressionDeclaration> initexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParametersImpl()
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
    return EcecPackage.Literals.PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitialValueExpressionDeclaration> getInitexpression()
  {
    if (initexpression == null)
    {
      initexpression = new EObjectContainmentEList<InitialValueExpressionDeclaration>(InitialValueExpressionDeclaration.class, this, EcecPackage.PARAMETERS__INITEXPRESSION);
    }
    return initexpression;
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
      case EcecPackage.PARAMETERS__INITEXPRESSION:
        return ((InternalEList<?>)getInitexpression()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.PARAMETERS__INITEXPRESSION:
        return getInitexpression();
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
      case EcecPackage.PARAMETERS__INITEXPRESSION:
        getInitexpression().clear();
        getInitexpression().addAll((Collection<? extends InitialValueExpressionDeclaration>)newValue);
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
      case EcecPackage.PARAMETERS__INITEXPRESSION:
        getInitexpression().clear();
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
      case EcecPackage.PARAMETERS__INITEXPRESSION:
        return initexpression != null && !initexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParametersImpl
