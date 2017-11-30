/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getP <em>P</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getF <em>F</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAttributionType()
 * @model
 * @generated
 */
public interface AttributionType extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(ParameterQualifiedName)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAttributionType_P()
   * @model containment="true"
   * @generated
   */
  ParameterQualifiedName getP();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(ParameterQualifiedName value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(FunctionQualifiedName)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAttributionType_F()
   * @model containment="true"
   * @generated
   */
  FunctionQualifiedName getF();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AttributionType#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(FunctionQualifiedName value);

} // AttributionType
