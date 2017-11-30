/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Definion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getHasStart <em>Has Start</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getHasEnd <em>Has End</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getHasDuration <em>Has Duration</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getExecutes <em>Executes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion()
 * @model
 * @generated
 */
public interface BehaviourDefinion extends EObject
{
  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' attribute.
   * @see #setBehaviour(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_Behaviour()
   * @model
   * @generated
   */
  String getBehaviour();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDefinion#getBehaviour <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' attribute.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(String value);

  /**
   * Returns the value of the '<em><b>Has Start</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.StartActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Start</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Start</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_HasStart()
   * @model containment="true"
   * @generated
   */
  EList<StartActivity> getHasStart();

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_HasEnd()
   * @model containment="true"
   * @generated
   */
  EList<FinishActivity> getHasEnd();

  /**
   * Returns the value of the '<em><b>Has Duration</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Duration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Duration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Duration</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_HasDuration()
   * @model containment="true"
   * @generated
   */
  EList<Duration> getHasDuration();

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_HasCondition()
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDefinion_Executes()
   * @model containment="true"
   * @generated
   */
  EList<ExecutionDeclaration> getExecutes();

} // BehaviourDefinion
