/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentNumbers <em>Agent Numbers</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getInitialAgentLocation <em>Initial Agent Location</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getSpatialEntity <em>Spatial Entity</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentparameters <em>Agentparameters</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentfunction <em>Agentfunction</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentbehaviourdefinition <em>Agentbehaviourdefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity()
 * @model
 * @generated
 */
public interface AgentEntity extends EObject
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Agent Numbers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Numbers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Numbers</em>' attribute.
   * @see #setAgentNumbers(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_AgentNumbers()
   * @model
   * @generated
   */
  int getAgentNumbers();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getAgentNumbers <em>Agent Numbers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent Numbers</em>' attribute.
   * @see #getAgentNumbers()
   * @generated
   */
  void setAgentNumbers(int value);

  /**
   * Returns the value of the '<em><b>Initial Agent Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Agent Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Agent Location</em>' containment reference.
   * @see #setInitialAgentLocation(InitialLocationType)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_InitialAgentLocation()
   * @model containment="true"
   * @generated
   */
  InitialLocationType getInitialAgentLocation();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getInitialAgentLocation <em>Initial Agent Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Agent Location</em>' containment reference.
   * @see #getInitialAgentLocation()
   * @generated
   */
  void setInitialAgentLocation(InitialLocationType value);

  /**
   * Returns the value of the '<em><b>Spatial Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spatial Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spatial Entity</em>' reference.
   * @see #setSpatialEntity(SpatialEntity)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_SpatialEntity()
   * @model
   * @generated
   */
  SpatialEntity getSpatialEntity();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.AgentEntity#getSpatialEntity <em>Spatial Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spatial Entity</em>' reference.
   * @see #getSpatialEntity()
   * @generated
   */
  void setSpatialEntity(SpatialEntity value);

  /**
   * Returns the value of the '<em><b>Agentparameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agentparameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agentparameters</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_Agentparameters()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAgentparameters();

  /**
   * Returns the value of the '<em><b>Agentfunction</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agentfunction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agentfunction</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_Agentfunction()
   * @model containment="true"
   * @generated
   */
  EList<FunctionExpression> getAgentfunction();

  /**
   * Returns the value of the '<em><b>Agentbehaviourdefinition</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Behaviour}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agentbehaviourdefinition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agentbehaviourdefinition</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAgentEntity_Agentbehaviourdefinition()
   * @model containment="true"
   * @generated
   */
  EList<Behaviour> getAgentbehaviourdefinition();

} // AgentEntity
