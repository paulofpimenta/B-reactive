/**
 */
package org.cirad.dsl.ecec.xtext.ecec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Re Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getFunctionredef <em>Functionredef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getEquality <em>Equality</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionReDefinition()
 * @model
 * @generated
 */
public interface FunctionReDefinition extends StartActivityDeclaration, FinishActivity, Condition
{
  /**
   * Returns the value of the '<em><b>Functionredef</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functionredef</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionredef</em>' reference.
   * @see #setFunctionredef(FunctionExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionReDefinition_Functionredef()
   * @model
   * @generated
   */
  FunctionExpression getFunctionredef();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getFunctionredef <em>Functionredef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionredef</em>' reference.
   * @see #getFunctionredef()
   * @generated
   */
  void setFunctionredef(FunctionExpression value);

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionReDefinition_Equality()
   * @model
   * @generated
   */
  Equality getEquality();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getEquality <em>Equality</em>}' attribute.
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionReDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionReDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // FunctionReDefinition
