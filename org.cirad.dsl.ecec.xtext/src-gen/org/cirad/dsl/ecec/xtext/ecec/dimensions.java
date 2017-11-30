/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dimensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getDim <em>Dim</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getLen <em>Len</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getDur <em>Dur</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getMa <em>Ma</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getTemp <em>Temp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions()
 * @model
 * @generated
 */
public interface dimensions extends EObject
{
  /**
   * Returns the value of the '<em><b>Dim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' attribute.
   * @see #setDim(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions_Dim()
   * @model
   * @generated
   */
  String getDim();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getDim <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dim</em>' attribute.
   * @see #getDim()
   * @generated
   */
  void setDim(String value);

  /**
   * Returns the value of the '<em><b>Len</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Len</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Len</em>' containment reference.
   * @see #setLen(lenghts)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions_Len()
   * @model containment="true"
   * @generated
   */
  lenghts getLen();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getLen <em>Len</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Len</em>' containment reference.
   * @see #getLen()
   * @generated
   */
  void setLen(lenghts value);

  /**
   * Returns the value of the '<em><b>Dur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dur</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dur</em>' containment reference.
   * @see #setDur(durationtime)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions_Dur()
   * @model containment="true"
   * @generated
   */
  durationtime getDur();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getDur <em>Dur</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dur</em>' containment reference.
   * @see #getDur()
   * @generated
   */
  void setDur(durationtime value);

  /**
   * Returns the value of the '<em><b>Ma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ma</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ma</em>' containment reference.
   * @see #setMa(mass)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions_Ma()
   * @model containment="true"
   * @generated
   */
  mass getMa();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getMa <em>Ma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ma</em>' containment reference.
   * @see #getMa()
   * @generated
   */
  void setMa(mass value);

  /**
   * Returns the value of the '<em><b>Temp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp</em>' containment reference.
   * @see #setTemp(temperature)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getdimensions_Temp()
   * @model containment="true"
   * @generated
   */
  temperature getTemp();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.dimensions#getTemp <em>Temp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temp</em>' containment reference.
   * @see #getTemp()
   * @generated
   */
  void setTemp(temperature value);

} // dimensions
