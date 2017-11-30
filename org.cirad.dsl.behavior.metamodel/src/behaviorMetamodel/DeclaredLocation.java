/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.DeclaredLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDeclaredLocation()
 * @model
 * @generated
 */
public interface DeclaredLocation extends Expression {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see behaviorMetamodel.MetamodelPackage#getDeclaredLocation_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.DeclaredLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // DeclaredLocation
