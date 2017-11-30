/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.DeclaredParameter#getParameterclass <em>Parameterclass</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDeclaredParameter()
 * @model
 * @generated
 */
public interface DeclaredParameter extends Expression
{
	/**
	 * Returns the value of the '<em><b>Parameterclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterclass</em>' reference.
	 * @see #setParameterclass(ParameterClass)
	 * @see behaviorMetamodel.MetamodelPackage#getDeclaredParameter_Parameterclass()
	 * @model
	 * @generated
	 */
	ParameterClass getParameterclass();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.DeclaredParameter#getParameterclass <em>Parameterclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterclass</em>' reference.
	 * @see #getParameterclass()
	 * @generated
	 */
	void setParameterclass(ParameterClass value);

} // DeclaredParameter
