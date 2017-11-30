/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParameterQualifiedName()
 * @model
 * @generated
 */
public interface ParameterQualifiedName extends EObject
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
   * @see #setName(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParameterQualifiedName_Name()
   * @model
   * @generated
   */
  ParameterExpression getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ParameterExpression value);

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParameterQualifiedName_A()
   * @model containment="true"
   * @generated
   */
  Attribution getA();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ParameterQualifiedName#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Attribution value);

} // ParameterQualifiedName
