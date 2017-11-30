/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.EntityDeclaration#getEntityname <em>Entityname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.EntityDeclaration#getAbstractractElement <em>Abstractract Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEntityDeclaration()
 * @model
 * @generated
 */
public interface EntityDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Entityname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entityname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entityname</em>' attribute.
   * @see #setEntityname(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEntityDeclaration_Entityname()
   * @model
   * @generated
   */
  String getEntityname();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.EntityDeclaration#getEntityname <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entityname</em>' attribute.
   * @see #getEntityname()
   * @generated
   */
  void setEntityname(String value);

  /**
   * Returns the value of the '<em><b>Abstractract Element</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.AbstractElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstractract Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstractract Element</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEntityDeclaration_AbstractractElement()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElements> getAbstractractElement();

} // EntityDeclaration
