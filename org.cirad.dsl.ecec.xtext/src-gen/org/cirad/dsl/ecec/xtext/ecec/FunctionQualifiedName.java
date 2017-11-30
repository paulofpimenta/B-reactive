/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionQualifiedName()
 * @model
 * @generated
 */
public interface FunctionQualifiedName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(FunctionExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionQualifiedName_Name()
   * @model
   * @generated
   */
  FunctionExpression getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(FunctionExpression value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Attribution)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionQualifiedName_A()
   * @model containment="true"
   * @generated
   */
  Attribution getA();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionQualifiedName#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Attribution value);

} // FunctionQualifiedName
