/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finish Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getSaef <em>Saef</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.FinishActivity#getBe2 <em>Be2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFinishActivity()
 * @model
 * @generated
 */
public interface FinishActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Saef</b></em>' attribute list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp}.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Saef</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Saef</em>' attribute list.
   * @see org.cirad.dsl.ecec.xtext.ecec.StarAndEndExp
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFinishActivity_Saef()
   * @model unique="false"
   * @generated
   */
  EList<StarAndEndExp> getSaef();

  /**
   * Returns the value of the '<em><b>Be2</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be2</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getFinishActivity_Be2()
   * @model containment="true"
   * @generated
   */
  EList<BehaviourQualifiedName> getBe2();

} // FinishActivity
