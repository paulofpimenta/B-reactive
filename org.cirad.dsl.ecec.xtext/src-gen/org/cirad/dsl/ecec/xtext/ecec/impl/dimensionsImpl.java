/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.dimensions;
import org.cirad.dsl.ecec.xtext.ecec.durationtime;
import org.cirad.dsl.ecec.xtext.ecec.lenghts;
import org.cirad.dsl.ecec.xtext.ecec.mass;
import org.cirad.dsl.ecec.xtext.ecec.temperature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dimensions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.dimensionsImpl#getDim <em>Dim</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.dimensionsImpl#getLen <em>Len</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.dimensionsImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.dimensionsImpl#getMa <em>Ma</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.dimensionsImpl#getTemp <em>Temp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dimensionsImpl extends MinimalEObjectImpl.Container implements dimensions
{
  /**
   * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected static final String DIM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected String dim = DIM_EDEFAULT;

  /**
   * The cached value of the '{@link #getLen() <em>Len</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLen()
   * @generated
   * @ordered
   */
  protected lenghts len;

  /**
   * The cached value of the '{@link #getDur() <em>Dur</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDur()
   * @generated
   * @ordered
   */
  protected durationtime dur;

  /**
   * The cached value of the '{@link #getMa() <em>Ma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMa()
   * @generated
   * @ordered
   */
  protected mass ma;

  /**
   * The cached value of the '{@link #getTemp() <em>Temp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemp()
   * @generated
   * @ordered
   */
  protected temperature temp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected dimensionsImpl()
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
    return EcecPackage.Literals.DIMENSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDim()
  {
    return dim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDim(String newDim)
  {
    String oldDim = dim;
    dim = newDim;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__DIM, oldDim, dim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lenghts getLen()
  {
    return len;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLen(lenghts newLen, NotificationChain msgs)
  {
    lenghts oldLen = len;
    len = newLen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__LEN, oldLen, newLen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLen(lenghts newLen)
  {
    if (newLen != len)
    {
      NotificationChain msgs = null;
      if (len != null)
        msgs = ((InternalEObject)len).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__LEN, null, msgs);
      if (newLen != null)
        msgs = ((InternalEObject)newLen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__LEN, null, msgs);
      msgs = basicSetLen(newLen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__LEN, newLen, newLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public durationtime getDur()
  {
    return dur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDur(durationtime newDur, NotificationChain msgs)
  {
    durationtime oldDur = dur;
    dur = newDur;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__DUR, oldDur, newDur);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDur(durationtime newDur)
  {
    if (newDur != dur)
    {
      NotificationChain msgs = null;
      if (dur != null)
        msgs = ((InternalEObject)dur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__DUR, null, msgs);
      if (newDur != null)
        msgs = ((InternalEObject)newDur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__DUR, null, msgs);
      msgs = basicSetDur(newDur, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__DUR, newDur, newDur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mass getMa()
  {
    return ma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMa(mass newMa, NotificationChain msgs)
  {
    mass oldMa = ma;
    ma = newMa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__MA, oldMa, newMa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMa(mass newMa)
  {
    if (newMa != ma)
    {
      NotificationChain msgs = null;
      if (ma != null)
        msgs = ((InternalEObject)ma).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__MA, null, msgs);
      if (newMa != null)
        msgs = ((InternalEObject)newMa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__MA, null, msgs);
      msgs = basicSetMa(newMa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__MA, newMa, newMa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public temperature getTemp()
  {
    return temp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemp(temperature newTemp, NotificationChain msgs)
  {
    temperature oldTemp = temp;
    temp = newTemp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__TEMP, oldTemp, newTemp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemp(temperature newTemp)
  {
    if (newTemp != temp)
    {
      NotificationChain msgs = null;
      if (temp != null)
        msgs = ((InternalEObject)temp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__TEMP, null, msgs);
      if (newTemp != null)
        msgs = ((InternalEObject)newTemp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.DIMENSIONS__TEMP, null, msgs);
      msgs = basicSetTemp(newTemp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.DIMENSIONS__TEMP, newTemp, newTemp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EcecPackage.DIMENSIONS__LEN:
        return basicSetLen(null, msgs);
      case EcecPackage.DIMENSIONS__DUR:
        return basicSetDur(null, msgs);
      case EcecPackage.DIMENSIONS__MA:
        return basicSetMa(null, msgs);
      case EcecPackage.DIMENSIONS__TEMP:
        return basicSetTemp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EcecPackage.DIMENSIONS__DIM:
        return getDim();
      case EcecPackage.DIMENSIONS__LEN:
        return getLen();
      case EcecPackage.DIMENSIONS__DUR:
        return getDur();
      case EcecPackage.DIMENSIONS__MA:
        return getMa();
      case EcecPackage.DIMENSIONS__TEMP:
        return getTemp();
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
      case EcecPackage.DIMENSIONS__DIM:
        setDim((String)newValue);
        return;
      case EcecPackage.DIMENSIONS__LEN:
        setLen((lenghts)newValue);
        return;
      case EcecPackage.DIMENSIONS__DUR:
        setDur((durationtime)newValue);
        return;
      case EcecPackage.DIMENSIONS__MA:
        setMa((mass)newValue);
        return;
      case EcecPackage.DIMENSIONS__TEMP:
        setTemp((temperature)newValue);
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
      case EcecPackage.DIMENSIONS__DIM:
        setDim(DIM_EDEFAULT);
        return;
      case EcecPackage.DIMENSIONS__LEN:
        setLen((lenghts)null);
        return;
      case EcecPackage.DIMENSIONS__DUR:
        setDur((durationtime)null);
        return;
      case EcecPackage.DIMENSIONS__MA:
        setMa((mass)null);
        return;
      case EcecPackage.DIMENSIONS__TEMP:
        setTemp((temperature)null);
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
      case EcecPackage.DIMENSIONS__DIM:
        return DIM_EDEFAULT == null ? dim != null : !DIM_EDEFAULT.equals(dim);
      case EcecPackage.DIMENSIONS__LEN:
        return len != null;
      case EcecPackage.DIMENSIONS__DUR:
        return dur != null;
      case EcecPackage.DIMENSIONS__MA:
        return ma != null;
      case EcecPackage.DIMENSIONS__TEMP:
        return temp != null;
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
    result.append(" (dim: ");
    result.append(dim);
    result.append(')');
    return result.toString();
  }

} //dimensionsImpl
