/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.DeclaredVariable#getVariableclass <em>Variableclass</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDeclaredVariable()
 * @model
 * @generated
 */
public interface DeclaredVariable extends Expression
{
	/**
	 * Returns the value of the '<em><b>Variableclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variableclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variableclass</em>' reference.
	 * @see #setVariableclass(VariableClass)
	 * @see behaviorMetamodel.MetamodelPackage#getDeclaredVariable_Variableclass()
	 * @model
	 * @generated
	 */
	VariableClass getVariableclass();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.DeclaredVariable#getVariableclass <em>Variableclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variableclass</em>' reference.
	 * @see #getVariableclass()
	 * @generated
	 */
	void setVariableclass(VariableClass value);

} // DeclaredVariable
