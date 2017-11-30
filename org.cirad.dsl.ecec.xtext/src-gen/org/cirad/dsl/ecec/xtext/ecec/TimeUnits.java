/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getHours <em>Hours</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTimeUnits()
 * @model
 * @generated
 */
public interface TimeUnits extends EObject
{
  /**
   * Returns the value of the '<em><b>Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hours</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hours</em>' attribute.
   * @see #setHours(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTimeUnits_Hours()
   * @model
   * @generated
   */
  String getHours();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getHours <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hours</em>' attribute.
   * @see #getHours()
   * @generated
   */
  void setHours(String value);

  /**
   * Returns the value of the '<em><b>Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutes</em>' attribute.
   * @see #setMinutes(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTimeUnits_Minutes()
   * @model
   * @generated
   */
  String getMinutes();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getMinutes <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutes</em>' attribute.
   * @see #getMinutes()
   * @generated
   */
  void setMinutes(String value);

  /**
   * Returns the value of the '<em><b>Seconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seconds</em>' attribute.
   * @see #setSeconds(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTimeUnits_Seconds()
   * @model
   * @generated
   */
  String getSeconds();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.TimeUnits#getSeconds <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seconds</em>' attribute.
   * @see #getSeconds()
   * @generated
   */
  void setSeconds(String value);

} // TimeUnits
