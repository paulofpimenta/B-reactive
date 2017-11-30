/**
 */
package org.cirad.dsl.ecec.xtext.ecec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.DimensionExpression#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getDimensionExpression()
 * @model
 * @generated
 */
public interface DimensionExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Dimensions)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getDimensionExpression_D()
   * @model containment="true"
   * @generated
   */
  Dimensions getD();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.DimensionExpression#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Dimensions value);

} // DimensionExpression
