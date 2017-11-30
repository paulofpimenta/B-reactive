/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.StartActivity#getBehaviourname <em>Behaviourname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.StartActivity#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getStartActivity()
 * @model
 * @generated
 */
public interface StartActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Behaviourname</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.BehaviourName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviourname</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviourname</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getStartActivity_Behaviourname()
   * @model containment="true"
   * @generated
   */
  EList<BehaviourName> getBehaviourname();

  /**
   * Returns the value of the '<em><b>Param</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getStartActivity_Param()
   * @model
   * @generated
   */
  EList<Parameter> getParam();

} // StartActivity
