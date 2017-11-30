/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.SetVariable#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getSetVariable()
 * @model
 * @generated
 */
public interface SetVariable extends PrimitiveActivities
{
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(Assignment)
	 * @see behaviorMetamodel.MetamodelPackage#getSetVariable_Assignment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assignment getAssignment();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.SetVariable#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(Assignment value);

} // SetVariable
