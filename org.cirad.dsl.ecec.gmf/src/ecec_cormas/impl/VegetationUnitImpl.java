/**
 */
package ecec_cormas.impl;

import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.VegetationUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vegetation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.VegetationUnitImpl#getK <em>K</em>}</li>
 *   <li>{@link ecec_cormas.impl.VegetationUnitImpl#getR <em>R</em>}</li>
 *   <li>{@link ecec_cormas.impl.VegetationUnitImpl#getBiomass <em>Biomass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VegetationUnitImpl extends ClassImpl implements VegetationUnit {
	/**
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final float K_EDEFAULT = 10.0F;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected float k = K_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.2F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getBiomass() <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiomass()
	 * @generated
	 * @ordered
	 */
	protected static final float BIOMASS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBiomass() <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiomass()
	 * @generated
	 * @ordered
	 */
	protected float biomass = BIOMASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VegetationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.VEGETATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBiomass() {
		return biomass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiomass(float newBiomass) {
		float oldBiomass = biomass;
		biomass = newBiomass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.VEGETATION_UNIT__BIOMASS, oldBiomass, biomass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.VEGETATION_UNIT__K:
				return getK();
			case Ecec_cormasPackage.VEGETATION_UNIT__R:
				return getR();
			case Ecec_cormasPackage.VEGETATION_UNIT__BIOMASS:
				return getBiomass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ecec_cormasPackage.VEGETATION_UNIT__BIOMASS:
				setBiomass((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ecec_cormasPackage.VEGETATION_UNIT__BIOMASS:
				setBiomass(BIOMASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ecec_cormasPackage.VEGETATION_UNIT__K:
				return k != K_EDEFAULT;
			case Ecec_cormasPackage.VEGETATION_UNIT__R:
				return r != R_EDEFAULT;
			case Ecec_cormasPackage.VEGETATION_UNIT__BIOMASS:
				return biomass != BIOMASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (k: ");
		result.append(k);
		result.append(", r: ");
		result.append(r);
		result.append(", Biomass: ");
		result.append(biomass);
		result.append(')');
		return result.toString();
	}

} //VegetationUnitImpl
