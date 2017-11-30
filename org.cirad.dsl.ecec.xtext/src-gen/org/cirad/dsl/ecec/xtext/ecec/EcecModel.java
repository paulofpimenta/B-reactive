/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.EcecModel#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.EcecModel#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEcecModel()
 * @model
 * @generated
 */
public interface EcecModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEcecModel_Entity()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntity();

  /**
   * Returns the value of the '<em><b>Space</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Space}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Space</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEcecModel_Space()
   * @model containment="true"
   * @generated
   */
  EList<Space> getSpace();

} // EcecModel
