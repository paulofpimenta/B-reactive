/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getCelsius <em>Celsius</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getFahrenheit <em>Fahrenheit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTemperatureUnits()
 * @model
 * @generated
 */
public interface TemperatureUnits extends EObject
{
  /**
   * Returns the value of the '<em><b>Celsius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Celsius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Celsius</em>' attribute.
   * @see #setCelsius(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTemperatureUnits_Celsius()
   * @model
   * @generated
   */
  String getCelsius();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getCelsius <em>Celsius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Celsius</em>' attribute.
   * @see #getCelsius()
   * @generated
   */
  void setCelsius(String value);

  /**
   * Returns the value of the '<em><b>Fahrenheit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fahrenheit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fahrenheit</em>' attribute.
   * @see #setFahrenheit(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTemperatureUnits_Fahrenheit()
   * @model
   * @generated
   */
  String getFahrenheit();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.TemperatureUnits#getFahrenheit <em>Fahrenheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fahrenheit</em>' attribute.
   * @see #getFahrenheit()
   * @generated
   */
  void setFahrenheit(String value);

} // TemperatureUnits
