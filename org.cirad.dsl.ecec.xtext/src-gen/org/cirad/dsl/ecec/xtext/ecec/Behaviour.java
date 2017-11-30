/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasStart <em>Has Start</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasEnd <em>Has End</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getExecutes <em>Executes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject
{
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Behaviour#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Has Start</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.StartActivityDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Start</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Start</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour_HasStart()
   * @model containment="true"
   * @generated
   */
  EList<StartActivityDeclaration> getHasStart();

  /**
   * Returns the value of the '<em><b>Has End</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has End</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has End</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour_HasEnd()
   * @model containment="true"
   * @generated
   */
  EList<FinishActivity> getHasEnd();

  /**
   * Returns the value of the '<em><b>Has Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Condition</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour_HasCondition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getHasCondition();

  /**
   * Returns the value of the '<em><b>Executes</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.ExecutionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executes</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviour_Executes()
   * @model containment="true"
   * @generated
   */
  EList<ExecutionDeclaration> getExecutes();

} // Behaviour
