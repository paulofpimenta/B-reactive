/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition#getSpecialchar <em>Specialchar</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Specialchar</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.SPECIAL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specialchar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specialchar</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.SPECIAL
   * @see #setSpecialchar(SPECIAL)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionDefinition_Specialchar()
   * @model
   * @generated
   */
  SPECIAL getSpecialchar();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition#getSpecialchar <em>Specialchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specialchar</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.SPECIAL
   * @see #getSpecialchar()
   * @generated
   */
  void setSpecialchar(SPECIAL value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.FunctionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFunctionDefinition_Right()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getRight();

} // FunctionDefinition
