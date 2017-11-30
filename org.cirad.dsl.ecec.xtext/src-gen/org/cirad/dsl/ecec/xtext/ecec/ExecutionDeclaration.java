/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getA <em>A</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getArg <em>Arg</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExecutionDeclaration()
 * @model
 * @generated
 */
public interface ExecutionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.AttributionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExecutionDeclaration_A()
   * @model containment="true"
   * @generated
   */
  EList<AttributionType> getA();

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(BehaviourQualifiedName)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExecutionDeclaration_Arg()
   * @model containment="true"
   * @generated
   */
  BehaviourQualifiedName getArg();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(BehaviourQualifiedName value);

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(MoveExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getExecutionDeclaration_M()
   * @model containment="true"
   * @generated
   */
  MoveExpression getM();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(MoveExpression value);

} // ExecutionDeclaration
