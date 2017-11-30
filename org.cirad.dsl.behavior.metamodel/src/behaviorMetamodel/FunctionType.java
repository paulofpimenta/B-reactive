/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.FunctionType#getDomain <em>Domain</em>}</li>
 *   <li>{@link behaviorMetamodel.FunctionType#getCodomain <em>Codomain</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends Type {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link behaviorMetamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getFunctionType_Domain()
	 * @model
	 * @generated
	 */
	EList<Type> getDomain();

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' reference.
	 * @see #setCodomain(Type)
	 * @see behaviorMetamodel.MetamodelPackage#getFunctionType_Codomain()
	 * @model required="true"
	 * @generated
	 */
	Type getCodomain();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.FunctionType#getCodomain <em>Codomain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(Type value);

} // FunctionType
