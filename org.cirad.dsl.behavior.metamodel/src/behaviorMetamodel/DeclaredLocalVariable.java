/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.DeclaredLocalVariable#getLocalvariable <em>Localvariable</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDeclaredLocalVariable()
 * @model
 * @generated
 */
public interface DeclaredLocalVariable extends Expression
{
	/**
	 * Returns the value of the '<em><b>Localvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localvariable</em>' reference.
	 * @see #setLocalvariable(LocalVariable)
	 * @see behaviorMetamodel.MetamodelPackage#getDeclaredLocalVariable_Localvariable()
	 * @model
	 * @generated
	 */
	LocalVariable getLocalvariable();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.DeclaredLocalVariable#getLocalvariable <em>Localvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localvariable</em>' reference.
	 * @see #getLocalvariable()
	 * @generated
	 */
	void setLocalvariable(LocalVariable value);

} // DeclaredLocalVariable
