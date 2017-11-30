/**
 */
package ecec_cormas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.CustomProtocol#getProtocolName <em>Protocol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getCustomProtocol()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface CustomProtocol extends Protocol {
	/**
	 * Returns the value of the '<em><b>Protocol Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Name</em>' attribute.
	 * @see #setProtocolName(String)
	 * @see ecec_cormas.Ecec_cormasPackage#getCustomProtocol_ProtocolName()
	 * @model default=""
	 * @generated
	 */
	String getProtocolName();

	/**
	 * Sets the value of the '{@link ecec_cormas.CustomProtocol#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
	void setProtocolName(String value);

} // CustomProtocol
