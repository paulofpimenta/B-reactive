/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.EquationBehavior#getEquation <em>Equation</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getEquationBehavior()
 * @model
 * @generated
 */
public interface EquationBehavior extends Behavior
{
	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference.
	 * @see #setEquation(Equation)
	 * @see behaviorMetamodel.MetamodelPackage#getEquationBehavior_Equation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Equation getEquation();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.EquationBehavior#getEquation <em>Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation</em>' containment reference.
	 * @see #getEquation()
	 * @generated
	 */
	void setEquation(Equation value);

} // EquationBehavior
