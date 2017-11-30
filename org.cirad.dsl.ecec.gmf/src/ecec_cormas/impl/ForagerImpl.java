/**
 */
package ecec_cormas.impl;

import ecec_cormas.Ecec_cormasPackage;
import ecec_cormas.Forager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecec_cormas.impl.ForagerImpl#getCatabolicRate <em>Catabolic Rate</em>}</li>
 *   <li>{@link ecec_cormas.impl.ForagerImpl#getFertilityThreshold <em>Fertility Threshold</em>}</li>
 *   <li>{@link ecec_cormas.impl.ForagerImpl#getHaverstRate <em>Haverst Rate</em>}</li>
 *   <li>{@link ecec_cormas.impl.ForagerImpl#getEnergy <em>Energy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForagerImpl extends ClassImpl implements Forager {
	/**
	 * The default value of the '{@link #getCatabolicRate() <em>Catabolic Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatabolicRate()
	 * @generated
	 * @ordered
	 */
	protected static final float CATABOLIC_RATE_EDEFAULT = 2.0F;

	/**
	 * The cached value of the '{@link #getCatabolicRate() <em>Catabolic Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatabolicRate()
	 * @generated
	 * @ordered
	 */
	protected float catabolicRate = CATABOLIC_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFertilityThreshold() <em>Fertility Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFertilityThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final float FERTILITY_THRESHOLD_EDEFAULT = 100.0F;

	/**
	 * The cached value of the '{@link #getFertilityThreshold() <em>Fertility Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFertilityThreshold()
	 * @generated
	 * @ordered
	 */
	protected float fertilityThreshold = FERTILITY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHaverstRate() <em>Haverst Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaverstRate()
	 * @generated
	 * @ordered
	 */
	protected static final float HAVERST_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHaverstRate() <em>Haverst Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaverstRate()
	 * @generated
	 * @ordered
	 */
	protected float haverstRate = HAVERST_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_EDEFAULT = 50.0F;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected float energy = ENERGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecec_cormasPackage.Literals.FORAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCatabolicRate() {
		return catabolicRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFertilityThreshold() {
		return fertilityThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHaverstRate() {
		return haverstRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaverstRate(float newHaverstRate) {
		float oldHaverstRate = haverstRate;
		haverstRate = newHaverstRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecec_cormasPackage.FORAGER__HAVERST_RATE, oldHaverstRate, haverstRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergy() {
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecec_cormasPackage.FORAGER__CATABOLIC_RATE:
				return getCatabolicRate();
			case Ecec_cormasPackage.FORAGER__FERTILITY_THRESHOLD:
				return getFertilityThreshold();
			case Ecec_cormasPackage.FORAGER__HAVERST_RATE:
				return getHaverstRate();
			case Ecec_cormasPackage.FORAGER__ENERGY:
				return getEnergy();
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
			case Ecec_cormasPackage.FORAGER__HAVERST_RATE:
				setHaverstRate((Float)newValue);
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
			case Ecec_cormasPackage.FORAGER__HAVERST_RATE:
				setHaverstRate(HAVERST_RATE_EDEFAULT);
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
			case Ecec_cormasPackage.FORAGER__CATABOLIC_RATE:
				return catabolicRate != CATABOLIC_RATE_EDEFAULT;
			case Ecec_cormasPackage.FORAGER__FERTILITY_THRESHOLD:
				return fertilityThreshold != FERTILITY_THRESHOLD_EDEFAULT;
			case Ecec_cormasPackage.FORAGER__HAVERST_RATE:
				return haverstRate != HAVERST_RATE_EDEFAULT;
			case Ecec_cormasPackage.FORAGER__ENERGY:
				return energy != ENERGY_EDEFAULT;
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
		result.append(" (CatabolicRate: ");
		result.append(catabolicRate);
		result.append(", FertilityThreshold: ");
		result.append(fertilityThreshold);
		result.append(", HaverstRate: ");
		result.append(haverstRate);
		result.append(", Energy: ");
		result.append(energy);
		result.append(')');
		return result.toString();
	}

} //ForagerImpl
