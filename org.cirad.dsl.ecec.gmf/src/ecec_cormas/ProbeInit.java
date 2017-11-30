/**
 */
package ecec_cormas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.ProbeInit#getProbeInitScheduler <em>Probe Init Scheduler</em>}</li>
 *   <li>{@link ecec_cormas.ProbeInit#getProbeInitAtt <em>Probe Init Att</em>}</li>
 *   <li>{@link ecec_cormas.ProbeInit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getProbeInit()
 * @model
 * @generated
 */
public interface ProbeInit extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Probe Init Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Init Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Init Scheduler</em>' reference.
	 * @see #setProbeInitScheduler(Scheduler)
	 * @see ecec_cormas.Ecec_cormasPackage#getProbeInit_ProbeInitScheduler()
	 * @model
	 * @generated
	 */
	Scheduler getProbeInitScheduler();

	/**
	 * Sets the value of the '{@link ecec_cormas.ProbeInit#getProbeInitScheduler <em>Probe Init Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Init Scheduler</em>' reference.
	 * @see #getProbeInitScheduler()
	 * @generated
	 */
	void setProbeInitScheduler(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Probe Init Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Init Att</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Init Att</em>' reference.
	 * @see #setProbeInitAtt(Attribute)
	 * @see ecec_cormas.Ecec_cormasPackage#getProbeInit_ProbeInitAtt()
	 * @model
	 * @generated
	 */
	Attribute getProbeInitAtt();

	/**
	 * Sets the value of the '{@link ecec_cormas.ProbeInit#getProbeInitAtt <em>Probe Init Att</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Init Att</em>' reference.
	 * @see #getProbeInitAtt()
	 * @generated
	 */
	void setProbeInitAtt(Attribute value);

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
	 * @see ecec_cormas.Ecec_cormasPackage#getProbeInit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.ProbeInit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProbeInit
