/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Expression#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' reference.
   * @see #setParameters(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExpression_Parameters()
   * @model
   * @generated
   */
  ParameterExpression getParameters();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Expression#getParameters <em>Parameters</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterExpression value);

} // Expression
