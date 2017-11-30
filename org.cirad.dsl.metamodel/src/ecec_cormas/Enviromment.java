/**
 */
package ecec_cormas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enviromment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Enviromment#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.Enviromment#getPath <em>Path</em>}</li>
 *   <li>{@link ecec_cormas.Enviromment#getLoadEnviroment <em>Load Enviroment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getEnviromment()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/environemment3.svg' label.icon='false' label='Name' label.placement='external' size='60,60' resizable='false'"
 * @generated
 */
public interface Enviromment extends DiagramElement {
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
	 * @see ecec_cormas.Ecec_cormasPackage#getEnviromment_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.Enviromment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see ecec_cormas.Ecec_cormasPackage#getEnviromment_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link ecec_cormas.Enviromment#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Load Enviroment</b></em>' reference list.
	 * The list contents are of type {@link ecec_cormas.Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Enviroment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Enviroment</em>' reference list.
	 * @see ecec_cormas.Ecec_cormasPackage#getEnviromment_LoadEnviroment()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' label='Load Enviromment' source.decoration='none' color='0,0,0'"
	 * @generated
	 */
	EList<Init> getLoadEnviroment();

} // Enviromment
