/**
 */
package ecec_cormas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vegetation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.VegetationUnit#getK <em>K</em>}</li>
 *   <li>{@link ecec_cormas.VegetationUnit#getR <em>R</em>}</li>
 *   <li>{@link ecec_cormas.VegetationUnit#getBiomass <em>Biomass</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getVegetationUnit()
 * @model
 * @generated
 */
public interface VegetationUnit extends ecec_cormas.Class {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see ecec_cormas.Ecec_cormasPackage#getVegetationUnit_K()
	 * @model default="10" changeable="false"
	 * @generated
	 */
	float getK();

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see ecec_cormas.Ecec_cormasPackage#getVegetationUnit_R()
	 * @model default="0.2" changeable="false"
	 * @generated
	 */
	float getR();

	/**
	 * Returns the value of the '<em><b>Biomass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biomass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biomass</em>' attribute.
	 * @see #setBiomass(float)
	 * @see ecec_cormas.Ecec_cormasPackage#getVegetationUnit_Biomass()
	 * @model
	 * @generated
	 */
	float getBiomass();

	/**
	 * Sets the value of the '{@link ecec_cormas.VegetationUnit#getBiomass <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biomass</em>' attribute.
	 * @see #getBiomass()
	 * @generated
	 */
	void setBiomass(float value);

} // VegetationUnit
