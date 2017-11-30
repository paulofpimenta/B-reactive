/**
 */
package ecec_cormas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Probe#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.Probe#getClasses <em>Classes</em>}</li>
 *   <li>{@link ecec_cormas.Probe#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getProbe()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/probes.svg' label.icon='false' label='Name' label.placement='external' size='60,60' resizable='false'"
 * @generated
 */
public interface Probe extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecec_cormas.Ecec_cormasPackage#getProbe_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.Probe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference.
	 * @see #setClasses(ecec_cormas.Class)
	 * @see ecec_cormas.Ecec_cormasPackage#getProbe_Classes()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' label='aClassProbe'"
	 * @generated
	 */
	ecec_cormas.Class getClasses();

	/**
	 * Sets the value of the '{@link ecec_cormas.Probe#getClasses <em>Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(ecec_cormas.Class value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attribute)
	 * @see ecec_cormas.Ecec_cormasPackage#getProbe_Attributes()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' label='aAttributeProbe'"
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link ecec_cormas.Probe#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

} // Probe
