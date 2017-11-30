/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Move#getLocationexpression <em>Locationexpression</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends PrimitiveActivities
{
	/**
	 * Returns the value of the '<em><b>Locationexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locationexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationexpression</em>' containment reference.
	 * @see #setLocationexpression(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getMove_Locationexpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLocationexpression();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Move#getLocationexpression <em>Locationexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationexpression</em>' containment reference.
	 * @see #getLocationexpression()
	 * @generated
	 */
	void setLocationexpression(Expression value);

} // Move
