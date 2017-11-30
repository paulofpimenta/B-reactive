/**
 */
package ecec_cormas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Scheduler#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ecec_cormas.Scheduler#getInitModel <em>Init Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends DiagramElement {
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
	 * @see ecec_cormas.Ecec_cormasPackage#getScheduler_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Init Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Model</em>' reference.
	 * @see #setInitModel(ModelParameters)
	 * @see ecec_cormas.Ecec_cormasPackage#getScheduler_InitModel()
	 * @model required="true"
	 * @generated
	 */
	ModelParameters getInitModel();

	/**
	 * Sets the value of the '{@link ecec_cormas.Scheduler#getInitModel <em>Init Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Model</em>' reference.
	 * @see #getInitModel()
	 * @generated
	 */
	void setInitModel(ModelParameters value);

} // Scheduler
