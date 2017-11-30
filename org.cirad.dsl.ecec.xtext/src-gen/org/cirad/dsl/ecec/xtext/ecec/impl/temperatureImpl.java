/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.temperature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.temperatureImpl#getCelsius <em>Celsius</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.temperatureImpl#getFahrenheit <em>Fahrenheit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class temperatureImpl extends MinimalEObjectImpl.Container implements temperature
{
  /**
   * The default value of the '{@link #getCelsius() <em>Celsius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCelsius()
   * @generated
   * @ordered
   */
  protected static final String CELSIUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCelsius() <em>Celsius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCelsius()
   * @generated
   * @ordered
   */
  protected String celsius = CELSIUS_EDEFAULT;

  /**
   * The default value of the '{@link #getFahrenheit() <em>Fahrenheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFahrenheit()
   * @generated
   * @ordered
   */
  protected static final String FAHRENHEIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFahrenheit() <em>Fahrenheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFahrenheit()
   * @generated
   * @ordered
   */
  protected String fahrenheit = FAHRENHEIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected temperatureImpl()
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
    return EcecPackage.Literals.TEMPERATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCelsius()
  {
    return celsius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCelsius(String newCelsius)
  {
    String oldCelsius = celsius;
    celsius = newCelsius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.TEMPERATURE__CELSIUS, oldCelsius, celsius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFahrenheit()
  {
    return fahrenheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFahrenheit(String newFahrenheit)
  {
    String oldFahrenheit = fahrenheit;
    fahrenheit = newFahrenheit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.TEMPERATURE__FAHRENHEIT, oldFahrenheit, fahrenheit));
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
      case EcecPackage.TEMPERATURE__CELSIUS:
        return getCelsius();
      case EcecPackage.TEMPERATURE__FAHRENHEIT:
        return getFahrenheit();
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
      case EcecPackage.TEMPERATURE__CELSIUS:
        setCelsius((String)newValue);
        return;
      case EcecPackage.TEMPERATURE__FAHRENHEIT:
        setFahrenheit((String)newValue);
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
      case EcecPackage.TEMPERATURE__CELSIUS:
        setCelsius(CELSIUS_EDEFAULT);
        return;
      case EcecPackage.TEMPERATURE__FAHRENHEIT:
        setFahrenheit(FAHRENHEIT_EDEFAULT);
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
      case EcecPackage.TEMPERATURE__CELSIUS:
        return CELSIUS_EDEFAULT == null ? celsius != null : !CELSIUS_EDEFAULT.equals(celsius);
      case EcecPackage.TEMPERATURE__FAHRENHEIT:
        return FAHRENHEIT_EDEFAULT == null ? fahrenheit != null : !FAHRENHEIT_EDEFAULT.equals(fahrenheit);
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
    result.append(" (celsius: ");
    result.append(celsius);
    result.append(", Fahrenheit: ");
    result.append(fahrenheit);
    result.append(')');
    return result.toString();
  }

} //temperatureImpl
