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
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Model#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Model#getSpatialEntity <em>Spatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Model#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getModel_Agent()
   * @model containment="true"
   * @generated
   */
  EList<AgentEntity> getAgent();

  /**
   * Returns the value of the '<em><b>Spatial Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spatial Entity</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spatial Entity</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getModel_SpatialEntity()
   * @model containment="true"
   * @generated
   */
  EList<SpatialEntity> getSpatialEntity();

  /**
   * Returns the value of the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Space</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space</em>' containment reference.
   * @see #setSpace(Space)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getModel_Space()
   * @model containment="true"
   * @generated
   */
  Space getSpace();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Model#getSpace <em>Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Space</em>' containment reference.
   * @see #getSpace()
   * @generated
   */
  void setSpace(Space value);

} // Model
