/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getNumber <em>Number</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getLocationtype <em>Locationtype</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getX <em>X</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getY <em>Y</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getGap <em>Gap</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getFunction <em>Function</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getBehaviourdefinition <em>Behaviourdefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity()
 * @model
 * @generated
 */
public interface SpatialEntity extends EObject
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Locationtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locationtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locationtype</em>' containment reference.
   * @see #setLocationtype(InitialLocationType)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Locationtype()
   * @model containment="true"
   * @generated
   */
  InitialLocationType getLocationtype();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getLocationtype <em>Locationtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locationtype</em>' containment reference.
   * @see #getLocationtype()
   * @generated
   */
  void setLocationtype(InitialLocationType value);

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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getX <em>X</em>}' attribute.
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

  /**
   * Returns the value of the '<em><b>Gap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap</em>' attribute.
   * @see #setGap(int)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Gap()
   * @model
   * @generated
   */
  int getGap();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntity#getGap <em>Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap</em>' attribute.
   * @see #getGap()
   * @generated
   */
  void setGap(int value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getParameters();

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.FunctionExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Function()
   * @model containment="true"
   * @generated
   */
  EList<FunctionExpression> getFunction();

  /**
   * Returns the value of the '<em><b>Behaviourdefinition</b></em>' containment reference list.
   * The list contents are of type {@link org.cirad.dsl.ecec.xtext.ecec.Behaviour}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviourdefinition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviourdefinition</em>' containment reference list.
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntity_Behaviourdefinition()
   * @model containment="true"
   * @generated
   */
  EList<Behaviour> getBehaviourdefinition();

} // SpatialEntity
