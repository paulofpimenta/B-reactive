/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourQualifiedName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourQualifiedName()
 * @model
 * @generated
 */
public interface BehaviourQualifiedName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Behaviour}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourQualifiedName_Name()
   * @model
   * @generated
   */
  EList<Behaviour> getName();

} // BehaviourQualifiedName
