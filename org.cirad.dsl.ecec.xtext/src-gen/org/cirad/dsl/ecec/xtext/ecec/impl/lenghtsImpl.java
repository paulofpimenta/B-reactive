/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.lenghts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>lenghts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.lenghtsImpl#getKilometer <em>Kilometer</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.lenghtsImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.lenghtsImpl#getMiles <em>Miles</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.lenghtsImpl#getHectare <em>Hectare</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.lenghtsImpl#getSquarekilometer <em>Squarekilometer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class lenghtsImpl extends MinimalEObjectImpl.Container implements lenghts
{
  /**
   * The default value of the '{@link #getKilometer() <em>Kilometer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKilometer()
   * @generated
   * @ordered
   */
  protected static final String KILOMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKilometer() <em>Kilometer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKilometer()
   * @generated
   * @ordered
   */
  protected String kilometer = KILOMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getMeter() <em>Meter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeter()
   * @generated
   * @ordered
   */
  protected static final String METER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeter() <em>Meter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeter()
   * @generated
   * @ordered
   */
  protected String meter = METER_EDEFAULT;

  /**
   * The default value of the '{@link #getMiles() <em>Miles</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiles()
   * @generated
   * @ordered
   */
  protected static final String MILES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiles() <em>Miles</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiles()
   * @generated
   * @ordered
   */
  protected String miles = MILES_EDEFAULT;

  /**
   * The default value of the '{@link #getHectare() <em>Hectare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHectare()
   * @generated
   * @ordered
   */
  protected static final String HECTARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHectare() <em>Hectare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHectare()
   * @generated
   * @ordered
   */
  protected String hectare = HECTARE_EDEFAULT;

  /**
   * The default value of the '{@link #getSquarekilometer() <em>Squarekilometer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquarekilometer()
   * @generated
   * @ordered
   */
  protected static final String SQUAREKILOMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSquarekilometer() <em>Squarekilometer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquarekilometer()
   * @generated
   * @ordered
   */
  protected String squarekilometer = SQUAREKILOMETER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected lenghtsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EcecPackage.Literals.LENGHTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKilometer()
  {
    return kilometer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKilometer(String newKilometer)
  {
    String oldKilometer = kilometer;
    kilometer = newKilometer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LENGHTS__KILOMETER, oldKilometer, kilometer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMeter()
  {
    return meter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeter(String newMeter)
  {
    String oldMeter = meter;
    meter = newMeter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LENGHTS__METER, oldMeter, meter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiles()
  {
    return miles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiles(String newMiles)
  {
    String oldMiles = miles;
    miles = newMiles;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LENGHTS__MILES, oldMiles, miles));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHectare()
  {
    return hectare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHectare(String newHectare)
  {
    String oldHectare = hectare;
    hectare = newHectare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LENGHTS__HECTARE, oldHectare, hectare));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSquarekilometer()
  {
    return squarekilometer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSquarekilometer(String newSquarekilometer)
  {
    String oldSquarekilometer = squarekilometer;
    squarekilometer = newSquarekilometer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LENGHTS__SQUAREKILOMETER, oldSquarekilometer, squarekilometer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EcecPackage.LENGHTS__KILOMETER:
        return getKilometer();
      case EcecPackage.LENGHTS__METER:
        return getMeter();
      case EcecPackage.LENGHTS__MILES:
        return getMiles();
      case EcecPackage.LENGHTS__HECTARE:
        return getHectare();
      case EcecPackage.LENGHTS__SQUAREKILOMETER:
        return getSquarekilometer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcecPackage.LENGHTS__KILOMETER:
        setKilometer((String)newValue);
        return;
      case EcecPackage.LENGHTS__METER:
        setMeter((String)newValue);
        return;
      case EcecPackage.LENGHTS__MILES:
        setMiles((String)newValue);
        return;
      case EcecPackage.LENGHTS__HECTARE:
        setHectare((String)newValue);
        return;
      case EcecPackage.LENGHTS__SQUAREKILOMETER:
        setSquarekilometer((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EcecPackage.LENGHTS__KILOMETER:
        setKilometer(KILOMETER_EDEFAULT);
        return;
      case EcecPackage.LENGHTS__METER:
        setMeter(METER_EDEFAULT);
        return;
      case EcecPackage.LENGHTS__MILES:
        setMiles(MILES_EDEFAULT);
        return;
      case EcecPackage.LENGHTS__HECTARE:
        setHectare(HECTARE_EDEFAULT);
        return;
      case EcecPackage.LENGHTS__SQUAREKILOMETER:
        setSquarekilometer(SQUAREKILOMETER_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EcecPackage.LENGHTS__KILOMETER:
        return KILOMETER_EDEFAULT == null ? kilometer != null : !KILOMETER_EDEFAULT.equals(kilometer);
      case EcecPackage.LENGHTS__METER:
        return METER_EDEFAULT == null ? meter != null : !METER_EDEFAULT.equals(meter);
      case EcecPackage.LENGHTS__MILES:
        return MILES_EDEFAULT == null ? miles != null : !MILES_EDEFAULT.equals(miles);
      case EcecPackage.LENGHTS__HECTARE:
        return HECTARE_EDEFAULT == null ? hectare != null : !HECTARE_EDEFAULT.equals(hectare);
      case EcecPackage.LENGHTS__SQUAREKILOMETER:
        return SQUAREKILOMETER_EDEFAULT == null ? squarekilometer != null : !SQUAREKILOMETER_EDEFAULT.equals(squarekilometer);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kilometer: ");
    result.append(kilometer);
    result.append(", meter: ");
    result.append(meter);
    result.append(", miles: ");
    result.append(miles);
    result.append(", hectare: ");
    result.append(hectare);
    result.append(", squarekilometer: ");
    result.append(squarekilometer);
    result.append(')');
    return result.toString();
  }

} //lenghtsImpl
