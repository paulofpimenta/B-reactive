/**
 */
package org.cirad.dsl.ecec.xtext.ecec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Entity Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getL <em>L</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getX <em>X</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntityDef()
 * @model
 * @generated
 */
public interface SpatialEntityDef extends SpatialEntity
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
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntityDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(LocationType)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntityDef_L()
   * @model containment="true"
   * @generated
   */
  LocationType getL();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LocationType value);

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntityDef_X()
   * @model
   * @generated
   */
  String getX();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(String value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(String)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getSpatialEntityDef_Y()
   * @model
   * @generated
   */
  String getY();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.SpatialEntityDef#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(String value);

} // SpatialEntityDef
