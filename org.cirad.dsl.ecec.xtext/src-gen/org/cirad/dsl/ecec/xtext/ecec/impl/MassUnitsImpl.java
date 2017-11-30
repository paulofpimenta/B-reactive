/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.MassUnits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl#getKilogram <em>Kilogram</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl#getGram <em>Gram</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl#getPounds <em>Pounds</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.MassUnitsImpl#getOunces <em>Ounces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassUnitsImpl extends MinimalEObjectImpl.Container implements MassUnits
{
  /**
   * The default value of the '{@link #getKilogram() <em>Kilogram</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKilogram()
   * @generated
   * @ordered
   */
  protected static final String KILOGRAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKilogram() <em>Kilogram</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKilogram()
   * @generated
   * @ordered
   */
  protected String kilogram = KILOGRAM_EDEFAULT;

  /**
   * The default value of the '{@link #getGram() <em>Gram</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGram()
   * @generated
   * @ordered
   */
  protected static final String GRAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGram() <em>Gram</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGram()
   * @generated
   * @ordered
   */
  protected String gram = GRAM_EDEFAULT;

  /**
   * The default value of the '{@link #getPounds() <em>Pounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPounds()
   * @generated
   * @ordered
   */
  protected static final String POUNDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPounds() <em>Pounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPounds()
   * @generated
   * @ordered
   */
  protected String pounds = POUNDS_EDEFAULT;

  /**
   * The default value of the '{@link #getOunces() <em>Ounces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOunces()
   * @generated
   * @ordered
   */
  protected static final String OUNCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOunces() <em>Ounces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOunces()
   * @generated
   * @ordered
   */
  protected String ounces = OUNCES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MassUnitsImpl()
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
    return EcecPackage.Literals.MASS_UNITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKilogram()
  {
    return kilogram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKilogram(String newKilogram)
  {
    String oldKilogram = kilogram;
    kilogram = newKilogram;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MASS_UNITS__KILOGRAM, oldKilogram, kilogram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGram()
  {
    return gram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGram(String newGram)
  {
    String oldGram = gram;
    gram = newGram;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MASS_UNITS__GRAM, oldGram, gram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPounds()
  {
    return pounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPounds(String newPounds)
  {
    String oldPounds = pounds;
    pounds = newPounds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MASS_UNITS__POUNDS, oldPounds, pounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOunces()
  {
    return ounces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOunces(String newOunces)
  {
    String oldOunces = ounces;
    ounces = newOunces;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.MASS_UNITS__OUNCES, oldOunces, ounces));
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
      case EcecPackage.MASS_UNITS__KILOGRAM:
        return getKilogram();
      case EcecPackage.MASS_UNITS__GRAM:
        return getGram();
      case EcecPackage.MASS_UNITS__POUNDS:
        return getPounds();
      case EcecPackage.MASS_UNITS__OUNCES:
        return getOunces();
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
      case EcecPackage.MASS_UNITS__KILOGRAM:
        setKilogram((String)newValue);
        return;
      case EcecPackage.MASS_UNITS__GRAM:
        setGram((String)newValue);
        return;
      case EcecPackage.MASS_UNITS__POUNDS:
        setPounds((String)newValue);
        return;
      case EcecPackage.MASS_UNITS__OUNCES:
        setOunces((String)newValue);
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
      case EcecPackage.MASS_UNITS__KILOGRAM:
        setKilogram(KILOGRAM_EDEFAULT);
        return;
      case EcecPackage.MASS_UNITS__GRAM:
        setGram(GRAM_EDEFAULT);
        return;
      case EcecPackage.MASS_UNITS__POUNDS:
        setPounds(POUNDS_EDEFAULT);
        return;
      case EcecPackage.MASS_UNITS__OUNCES:
        setOunces(OUNCES_EDEFAULT);
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
      case EcecPackage.MASS_UNITS__KILOGRAM:
        return KILOGRAM_EDEFAULT == null ? kilogram != null : !KILOGRAM_EDEFAULT.equals(kilogram);
      case EcecPackage.MASS_UNITS__GRAM:
        return GRAM_EDEFAULT == null ? gram != null : !GRAM_EDEFAULT.equals(gram);
      case EcecPackage.MASS_UNITS__POUNDS:
        return POUNDS_EDEFAULT == null ? pounds != null : !POUNDS_EDEFAULT.equals(pounds);
      case EcecPackage.MASS_UNITS__OUNCES:
        return OUNCES_EDEFAULT == null ? ounces != null : !OUNCES_EDEFAULT.equals(ounces);
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
    result.append(" (kilogram: ");
    result.append(kilogram);
    result.append(", gram: ");
    result.append(gram);
    result.append(", pounds: ");
    result.append(pounds);
    result.append(", ounces: ");
    result.append(ounces);
    result.append(')');
    return result.toString();
  }

} //MassUnitsImpl
