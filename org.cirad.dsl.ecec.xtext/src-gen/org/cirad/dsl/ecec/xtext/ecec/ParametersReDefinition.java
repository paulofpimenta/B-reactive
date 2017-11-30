/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Re Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getParamredef <em>Paramredef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getEquality <em>Equality</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParametersReDefinition()
 * @model
 * @generated
 */
public interface ParametersReDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Paramredef</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramredef</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramredef</em>' reference.
   * @see #setParamredef(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParametersReDefinition_Paramredef()
   * @model
   * @generated
   */
  ParameterExpression getParamredef();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getParamredef <em>Paramredef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramredef</em>' reference.
   * @see #getParamredef()
   * @generated
   */
  void setParamredef(ParameterExpression value);

  /**
   * Returns the value of the '<em><b>Equality</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.Equality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.Equality
   * @see #setEquality(Equality)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParametersReDefinition_Equality()
   * @model
   * @generated
   */
  Equality getEquality();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getEquality <em>Equality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equality</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.Equality
   * @see #getEquality()
   * @generated
   */
  void setEquality(Equality value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParametersReDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ParametersReDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ParametersReDefinition
