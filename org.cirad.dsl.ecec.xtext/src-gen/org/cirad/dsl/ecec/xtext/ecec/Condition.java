/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getCe <em>Ce</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getA <em>A</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getM <em>M</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Ce</b></em>' attribute list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.ConditionEnum}.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.ConditionEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ce</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ce</em>' attribute list.
   * @see org.cirad.dsl.ecec.xtext.ecec.ConditionEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCondition_Ce()
   * @model unique="false"
   * @generated
   */
  EList<ConditionEnum> getCe();

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCondition_A()
   * @model containment="true"
   * @generated
   */
  EList<AttributionType> getA();

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(Cell)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCondition_M()
   * @model containment="true"
   * @generated
   */
  Cell getM();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(Cell value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(NeighborhoodExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getCondition_N()
   * @model containment="true"
   * @generated
   */
  NeighborhoodExpression getN();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Condition#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(NeighborhoodExpression value);

} // Condition
