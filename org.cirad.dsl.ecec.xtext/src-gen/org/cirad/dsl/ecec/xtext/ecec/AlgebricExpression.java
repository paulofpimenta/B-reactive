/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algebric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArgs <em>Args</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAlgebricExpression()
 * @model
 * @generated
 */
public interface AlgebricExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAlgebricExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

  /**
   * Returns the value of the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' reference.
   * @see #setArg(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAlgebricExpression_Arg()
   * @model
   * @generated
   */
  ParameterExpression getArg();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AlgebricExpression#getArg <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' reference.
   * @see #getArg()
   * @generated
   */
  void setArg(ParameterExpression value);

} // AlgebricExpression
