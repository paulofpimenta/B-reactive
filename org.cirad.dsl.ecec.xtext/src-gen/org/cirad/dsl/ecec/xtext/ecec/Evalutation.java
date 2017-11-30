/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evalutation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Evalutation#getEqnum <em>Eqnum</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Evalutation#getPar <em>Par</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Evalutation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEvalutation()
 * @model
 * @generated
 */
public interface Evalutation extends EObject
{
  /**
   * Returns the value of the '<em><b>Eqnum</b></em>' attribute list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.EqualityNumber}.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.EqualityNumber}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eqnum</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eqnum</em>' attribute list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EqualityNumber
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEvalutation_Eqnum()
   * @model unique="false"
   * @generated
   */
  EList<EqualityNumber> getEqnum();

  /**
   * Returns the value of the '<em><b>Par</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEvalutation_Par()
   * @model
   * @generated
   */
  EList<Parameter> getPar();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEvalutation_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Evalutation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Evalutation
