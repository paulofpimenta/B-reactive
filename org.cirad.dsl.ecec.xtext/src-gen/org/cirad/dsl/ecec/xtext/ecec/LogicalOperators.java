/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.LogicalOperators#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getLogicalOperators()
 * @model
 * @generated
 */
public interface LogicalOperators extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.LogicalOperatorsEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.LogicalOperatorsEnum
   * @see #setType(LogicalOperatorsEnum)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getLogicalOperators_Type()
   * @model
   * @generated
   */
  LogicalOperatorsEnum getType();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.LogicalOperators#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.LogicalOperatorsEnum
   * @see #getType()
   * @generated
   */
  void setType(LogicalOperatorsEnum value);

} // LogicalOperators
