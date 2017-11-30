/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyspatialEntity <em>Occupiedbyspatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOcuppied <em>Ocuppied</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getX <em>X</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getY <em>Y</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOccupiedbyAgentEntity <em>Occupiedby Agent Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject
{
  /**
   * Returns the value of the '<em><b>Occupiedbyspatial Entity</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occupiedbyspatial Entity</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occupiedbyspatial Entity</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell_OccupiedbyspatialEntity()
   * @model
   * @generated
   */
  EList<SpatialEntity> getOccupiedbyspatialEntity();

  /**
   * Returns the value of the '<em><b>Ocuppied</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocuppied</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocuppied</em>' containment reference.
   * @see #setOcuppied(BooleanExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell_Ocuppied()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getOcuppied();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getOcuppied <em>Ocuppied</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocuppied</em>' containment reference.
   * @see #getOcuppied()
   * @generated
   */
  void setOcuppied(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Cell#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

  /**
   * Returns the value of the '<em><b>Occupiedby Agent Entity</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occupiedby Agent Entity</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occupiedby Agent Entity</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCell_OccupiedbyAgentEntity()
   * @model
   * @generated
   */
  EList<AgentEntity> getOccupiedbyAgentEntity();

} // Cell
