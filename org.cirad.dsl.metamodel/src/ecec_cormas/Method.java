/**
 */
package ecec_cormas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Method#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.Method#getUseAttributes <em>Use Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getMethod()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface Method extends DiagramElement {
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
	 * @see ecec_cormas.Ecec_cormasPackage#getMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Attributes</b></em>' reference list.
	 * The list contents are of type {@link ecec_cormas.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Attributes</em>' reference list.
	 * @see ecec_cormas.Ecec_cormasPackage#getMethod_UseAttributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getUseAttributes();

} // Method
