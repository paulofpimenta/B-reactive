/**
 */
package org.cirad.dsl.ecec.xtext.ecec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Between</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Between#getParameter1 <em>Parameter1</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Between#getParameter2 <em>Parameter2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBetween()
 * @model
 * @generated
 */
public interface Between extends OperatorBetween
{
  /**
   * Returns the value of the '<em><b>Parameter1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter1</em>' containment reference.
   * @see #setParameter1(Definition)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBetween_Parameter1()
   * @model containment="true"
   * @generated
   */
  Definition getParameter1();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Between#getParameter1 <em>Parameter1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter1</em>' containment reference.
   * @see #getParameter1()
   * @generated
   */
  void setParameter1(Definition value);

  /**
   * Returns the value of the '<em><b>Parameter2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter2</em>' containment reference.
   * @see #setParameter2(Definition)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBetween_Parameter2()
   * @model containment="true"
   * @generated
   */
  Definition getParameter2();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Between#getParameter2 <em>Parameter2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter2</em>' containment reference.
   * @see #getParameter2()
   * @generated
   */
  void setParameter2(Definition value);

} // Between
