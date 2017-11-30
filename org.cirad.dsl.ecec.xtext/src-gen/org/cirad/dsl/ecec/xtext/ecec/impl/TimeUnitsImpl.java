/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.TimeUnits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.TimeUnitsImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeUnitsImpl extends MinimalEObjectImpl.Container implements TimeUnits
{
  /**
   * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected static final String HOURS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected String hours = HOURS_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected static final String MINUTES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected String minutes = MINUTES_EDEFAULT;

  /**
   * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected static final String SECONDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected String seconds = SECONDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeUnitsImpl()
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
    return EcecPackage.Literals.TIME_UNITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHours()
  {
    return hours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHours(String newHours)
  {
    String oldHours = hours;
    hours = newHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.TIME_UNITS__HOURS, oldHours, hours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutes(String newMinutes)
  {
    String oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.TIME_UNITS__MINUTES, oldMinutes, minutes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeconds()
  {
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeconds(String newSeconds)
  {
    String oldSeconds = seconds;
    seconds = newSeconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.TIME_UNITS__SECONDS, oldSeconds, seconds));
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
      case EcecPackage.TIME_UNITS__HOURS:
        return getHours();
      case EcecPackage.TIME_UNITS__MINUTES:
        return getMinutes();
      case EcecPackage.TIME_UNITS__SECONDS:
        return getSeconds();
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
      case EcecPackage.TIME_UNITS__HOURS:
        setHours((String)newValue);
        return;
      case EcecPackage.TIME_UNITS__MINUTES:
        setMinutes((String)newValue);
        return;
      case EcecPackage.TIME_UNITS__SECONDS:
        setSeconds((String)newValue);
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
      case EcecPackage.TIME_UNITS__HOURS:
        setHours(HOURS_EDEFAULT);
        return;
      case EcecPackage.TIME_UNITS__MINUTES:
        setMinutes(MINUTES_EDEFAULT);
        return;
      case EcecPackage.TIME_UNITS__SECONDS:
        setSeconds(SECONDS_EDEFAULT);
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
      case EcecPackage.TIME_UNITS__HOURS:
        return HOURS_EDEFAULT == null ? hours != null : !HOURS_EDEFAULT.equals(hours);
      case EcecPackage.TIME_UNITS__MINUTES:
        return MINUTES_EDEFAULT == null ? minutes != null : !MINUTES_EDEFAULT.equals(minutes);
      case EcecPackage.TIME_UNITS__SECONDS:
        return SECONDS_EDEFAULT == null ? seconds != null : !SECONDS_EDEFAULT.equals(seconds);
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
    result.append(" (hours: ");
    result.append(hours);
    result.append(", minutes: ");
    result.append(minutes);
    result.append(", seconds: ");
    result.append(seconds);
    result.append(')');
    return result.toString();
  }

} //TimeUnitsImpl
