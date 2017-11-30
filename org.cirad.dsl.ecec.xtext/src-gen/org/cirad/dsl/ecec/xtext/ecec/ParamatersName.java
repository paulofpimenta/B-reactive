/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paramaters Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParamatersName#getArgs <em>Args</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.ParamatersName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParamatersName()
 * @model
 * @generated
 */
public interface ParamatersName extends ParametersReDefinition, percentage
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParamatersName_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.ParametersInitialDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getParamatersName_Name()
   * @model
   * @generated
   */
  EList<ParametersInitialDefinition> getName();

} // ParamatersName
