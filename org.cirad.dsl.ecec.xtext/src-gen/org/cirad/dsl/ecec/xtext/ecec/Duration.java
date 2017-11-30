/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Duration#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.DurationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.DurationType
   * @see #setType(DurationType)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getDuration_Type()
   * @model
   * @generated
   */
  DurationType getType();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Duration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.DurationType
   * @see #getType()
   * @generated
   */
  void setType(DurationType value);

} // Duration
