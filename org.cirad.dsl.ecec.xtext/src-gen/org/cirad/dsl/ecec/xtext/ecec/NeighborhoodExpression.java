/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neighborhood Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getN <em>N</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getNeighborhoodExpression()
 * @model
 * @generated
 */
public interface NeighborhoodExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum}.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute list.
   * @see org.cirad.dsl.ecec.xtext.ecec.NeighbourhooEnum
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getNeighborhoodExpression_N()
   * @model unique="false"
   * @generated
   */
  EList<NeighbourhooEnum> getN();

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(AttributionType)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getNeighborhoodExpression_A()
   * @model containment="true"
   * @generated
   */
  AttributionType getA();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.NeighborhoodExpression#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(AttributionType value);

} // NeighborhoodExpression
