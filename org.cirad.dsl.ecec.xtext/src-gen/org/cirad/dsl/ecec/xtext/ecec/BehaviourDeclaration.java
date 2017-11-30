/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration#getBehaviourname <em>Behaviourname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration#getBeaviours <em>Beaviours</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration#getParameterdeclaration <em>Parameterdeclaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDeclaration()
 * @model
 * @generated
 */
public interface BehaviourDeclaration extends AbstractElements
{
  /**
   * Returns the value of the '<em><b>Behaviourname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviourname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviourname</em>' attribute.
   * @see #setBehaviourname(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDeclaration_Behaviourname()
   * @model
   * @generated
   */
  String getBehaviourname();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration#getBehaviourname <em>Behaviourname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviourname</em>' attribute.
   * @see #getBehaviourname()
   * @generated
   */
  void setBehaviourname(String value);

  /**
   * Returns the value of the '<em><b>Beaviours</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beaviours</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beaviours</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDeclaration_Beaviours()
   * @model containment="true"
   * @generated
   */
  EList<BehaviourDeclaration> getBeaviours();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDeclaration_Condition()
   * @model unique="false"
   * @generated
   */
  EList<String> getCondition();

  /**
   * Returns the value of the '<em><b>Parameterdeclaration</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.ParametersDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameterdeclaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameterdeclaration</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getBehaviourDeclaration_Parameterdeclaration()
   * @model containment="true"
   * @generated
   */
  EList<ParametersDeclaration> getParameterdeclaration();

} // BehaviourDeclaration
