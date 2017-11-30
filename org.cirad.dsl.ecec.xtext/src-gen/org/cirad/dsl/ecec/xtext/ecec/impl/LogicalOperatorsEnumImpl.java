/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.LogicalOperatorsEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Operators Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.LogicalOperatorsEnumImpl#getBiggerthan <em>Biggerthan</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.LogicalOperatorsEnumImpl#getLessthan <em>Lessthan</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.LogicalOperatorsEnumImpl#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.LogicalOperatorsEnumImpl#getBiggerorequalthan <em>Biggerorequalthan</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.LogicalOperatorsEnumImpl#getLessorequalthan <em>Lessorequalthan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalOperatorsEnumImpl extends MinimalEObjectImpl.Container implements LogicalOperatorsEnum
{
  /**
   * The default value of the '{@link #getBiggerthan() <em>Biggerthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiggerthan()
   * @generated
   * @ordered
   */
  protected static final String BIGGERTHAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBiggerthan() <em>Biggerthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiggerthan()
   * @generated
   * @ordered
   */
  protected String biggerthan = BIGGERTHAN_EDEFAULT;

  /**
   * The default value of the '{@link #getLessthan() <em>Lessthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLessthan()
   * @generated
   * @ordered
   */
  protected static final String LESSTHAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLessthan() <em>Lessthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLessthan()
   * @generated
   * @ordered
   */
  protected String lessthan = LESSTHAN_EDEFAULT;

  /**
   * The default value of the '{@link #getEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqual()
   * @generated
   * @ordered
   */
  protected static final String EQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqual()
   * @generated
   * @ordered
   */
  protected String equal = EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getBiggerorequalthan() <em>Biggerorequalthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiggerorequalthan()
   * @generated
   * @ordered
   */
  protected static final String BIGGEROREQUALTHAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBiggerorequalthan() <em>Biggerorequalthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiggerorequalthan()
   * @generated
   * @ordered
   */
  protected String biggerorequalthan = BIGGEROREQUALTHAN_EDEFAULT;

  /**
   * The default value of the '{@link #getLessorequalthan() <em>Lessorequalthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLessorequalthan()
   * @generated
   * @ordered
   */
  protected static final String LESSOREQUALTHAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLessorequalthan() <em>Lessorequalthan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLessorequalthan()
   * @generated
   * @ordered
   */
  protected String lessorequalthan = LESSOREQUALTHAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalOperatorsEnumImpl()
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
    return EcecPackage.Literals.LOGICAL_OPERATORS_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBiggerthan()
  {
    return biggerthan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBiggerthan(String newBiggerthan)
  {
    String oldBiggerthan = biggerthan;
    biggerthan = newBiggerthan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGERTHAN, oldBiggerthan, biggerthan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLessthan()
  {
    return lessthan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLessthan(String newLessthan)
  {
    String oldLessthan = lessthan;
    lessthan = newLessthan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LOGICAL_OPERATORS_ENUM__LESSTHAN, oldLessthan, lessthan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEqual()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqual(String newEqual)
  {
    String oldEqual = equal;
    equal = newEqual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LOGICAL_OPERATORS_ENUM__EQUAL, oldEqual, equal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBiggerorequalthan()
  {
    return biggerorequalthan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBiggerorequalthan(String newBiggerorequalthan)
  {
    String oldBiggerorequalthan = biggerorequalthan;
    biggerorequalthan = newBiggerorequalthan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGEROREQUALTHAN, oldBiggerorequalthan, biggerorequalthan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLessorequalthan()
  {
    return lessorequalthan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLessorequalthan(String newLessorequalthan)
  {
    String oldLessorequalthan = lessorequalthan;
    lessorequalthan = newLessorequalthan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.LOGICAL_OPERATORS_ENUM__LESSOREQUALTHAN, oldLessorequalthan, lessorequalthan));
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
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGERTHAN:
        return getBiggerthan();
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSTHAN:
        return getLessthan();
      case EcecPackage.LOGICAL_OPERATORS_ENUM__EQUAL:
        return getEqual();
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGEROREQUALTHAN:
        return getBiggerorequalthan();
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSOREQUALTHAN:
        return getLessorequalthan();
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
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGERTHAN:
        setBiggerthan((String)newValue);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSTHAN:
        setLessthan((String)newValue);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__EQUAL:
        setEqual((String)newValue);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGEROREQUALTHAN:
        setBiggerorequalthan((String)newValue);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSOREQUALTHAN:
        setLessorequalthan((String)newValue);
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
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGERTHAN:
        setBiggerthan(BIGGERTHAN_EDEFAULT);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSTHAN:
        setLessthan(LESSTHAN_EDEFAULT);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__EQUAL:
        setEqual(EQUAL_EDEFAULT);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGEROREQUALTHAN:
        setBiggerorequalthan(BIGGEROREQUALTHAN_EDEFAULT);
        return;
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSOREQUALTHAN:
        setLessorequalthan(LESSOREQUALTHAN_EDEFAULT);
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
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGERTHAN:
        return BIGGERTHAN_EDEFAULT == null ? biggerthan != null : !BIGGERTHAN_EDEFAULT.equals(biggerthan);
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSTHAN:
        return LESSTHAN_EDEFAULT == null ? lessthan != null : !LESSTHAN_EDEFAULT.equals(lessthan);
      case EcecPackage.LOGICAL_OPERATORS_ENUM__EQUAL:
        return EQUAL_EDEFAULT == null ? equal != null : !EQUAL_EDEFAULT.equals(equal);
      case EcecPackage.LOGICAL_OPERATORS_ENUM__BIGGEROREQUALTHAN:
        return BIGGEROREQUALTHAN_EDEFAULT == null ? biggerorequalthan != null : !BIGGEROREQUALTHAN_EDEFAULT.equals(biggerorequalthan);
      case EcecPackage.LOGICAL_OPERATORS_ENUM__LESSOREQUALTHAN:
        return LESSOREQUALTHAN_EDEFAULT == null ? lessorequalthan != null : !LESSOREQUALTHAN_EDEFAULT.equals(lessorequalthan);
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
    result.append(" (biggerthan: ");
    result.append(biggerthan);
    result.append(", lessthan: ");
    result.append(lessthan);
    result.append(", equal: ");
    result.append(equal);
    result.append(", biggerorequalthan: ");
    result.append(biggerorequalthan);
    result.append(", lessorequalthan: ");
    result.append(lessorequalthan);
    result.append(')');
    return result.toString();
  }

} //LogicalOperatorsEnumImpl
