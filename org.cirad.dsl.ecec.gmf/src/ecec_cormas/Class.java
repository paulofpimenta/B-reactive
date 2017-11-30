/**
 */
package ecec_cormas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Class#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link ecec_cormas.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ecec_cormas.Class#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.Class#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getClass_()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface Class extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link ecec_cormas.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see ecec_cormas.Ecec_cormasPackage#getClass_Protocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocols();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ecec_cormas.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ecec_cormas.Ecec_cormasPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see ecec_cormas.Ecec_cormasPackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecec_cormas.CormasClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ecec_cormas.CormasClassType
	 * @see #setType(CormasClassType)
	 * @see ecec_cormas.Ecec_cormasPackage#getClass_Type()
	 * @model
	 * @generated
	 */
	CormasClassType getType();

	/**
	 * Sets the value of the '{@link ecec_cormas.Class#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ecec_cormas.CormasClassType
	 * @see #getType()
	 * @generated
	 */
	void setType(CormasClassType value);

} // Class
