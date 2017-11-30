/**
 */
package ecec_cormas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Forager#getCatabolicRate <em>Catabolic Rate</em>}</li>
 *   <li>{@link ecec_cormas.Forager#getFertilityThreshold <em>Fertility Threshold</em>}</li>
 *   <li>{@link ecec_cormas.Forager#getHaverstRate <em>Haverst Rate</em>}</li>
 *   <li>{@link ecec_cormas.Forager#getEnergy <em>Energy</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getForager()
 * @model
 * @generated
 */
public interface Forager extends ecec_cormas.Class {
	/**
	 * Returns the value of the '<em><b>Catabolic Rate</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catabolic Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catabolic Rate</em>' attribute.
	 * @see ecec_cormas.Ecec_cormasPackage#getForager_CatabolicRate()
	 * @model default="2" changeable="false"
	 * @generated
	 */
	float getCatabolicRate();

	/**
	 * Returns the value of the '<em><b>Fertility Threshold</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertility Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fertility Threshold</em>' attribute.
	 * @see ecec_cormas.Ecec_cormasPackage#getForager_FertilityThreshold()
	 * @model default="100" changeable="false"
	 * @generated
	 */
	float getFertilityThreshold();

	/**
	 * Returns the value of the '<em><b>Haverst Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Haverst Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haverst Rate</em>' attribute.
	 * @see #setHaverstRate(float)
	 * @see ecec_cormas.Ecec_cormasPackage#getForager_HaverstRate()
	 * @model
	 * @generated
	 */
	float getHaverstRate();

	/**
	 * Sets the value of the '{@link ecec_cormas.Forager#getHaverstRate <em>Haverst Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haverst Rate</em>' attribute.
	 * @see #getHaverstRate()
	 * @generated
	 */
	void setHaverstRate(float value);

	/**
	 * Returns the value of the '<em><b>Energy</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy</em>' attribute.
	 * @see ecec_cormas.Ecec_cormasPackage#getForager_Energy()
	 * @model default="50" changeable="false"
	 * @generated
	 */
	float getEnergy();

} // Forager
