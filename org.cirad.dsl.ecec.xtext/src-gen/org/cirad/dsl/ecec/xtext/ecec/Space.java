/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Space#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Space#getNumcells <em>Numcells</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.Space#getTypeneigh <em>Typeneigh</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends EObject
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Numcells</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numcells</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numcells</em>' attribute.
   * @see #setNumcells(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpace_Numcells()
   * @model
   * @generated
   */
  int getNumcells();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getNumcells <em>Numcells</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numcells</em>' attribute.
   * @see #getNumcells()
   * @generated
   */
  void setNumcells(int value);

  /**
   * Returns the value of the '<em><b>Typeneigh</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeneigh</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeneigh</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood
   * @see #setTypeneigh(TypeofNeighbourhood)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpace_Typeneigh()
   * @model
   * @generated
   */
  TypeofNeighbourhood getTypeneigh();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.Space#getTypeneigh <em>Typeneigh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeneigh</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood
   * @see #getTypeneigh()
   * @generated
   */
  void setTypeneigh(TypeofNeighbourhood value);

} // Space
