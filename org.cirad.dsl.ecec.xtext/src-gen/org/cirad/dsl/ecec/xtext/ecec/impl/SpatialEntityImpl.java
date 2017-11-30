/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.Behaviour;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.FunctionExpression;
import org.cirad.dsl.ecec.xtext.ecec.InitialLocationType;
import org.cirad.dsl.ecec.xtext.ecec.SpatialEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getLocationtype <em>Locationtype</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getX <em>X</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getGap <em>Gap</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpatialEntityImpl#getBehaviourdefinition <em>Behaviourdefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpatialEntityImpl extends MinimalEObjectImpl.Container implements SpatialEntity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected int number = NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocationtype() <em>Locationtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationtype()
   * @generated
   * @ordered
   */
  protected InitialLocationType locationtype;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getGap() <em>Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGap()
   * @generated
   * @ordered
   */
  protected static final int GAP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGap() <em>Gap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGap()
   * @generated
   * @ordered
   */
  protected int gap = GAP_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EObject> parameters;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected EList<FunctionExpression> function;

  /**
   * The cached value of the '{@link #getBehaviourdefinition() <em>Behaviourdefinition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourdefinition()
   * @generated
   * @ordered
   */
  protected EList<Behaviour> behaviourdefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpatialEntityImpl()
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
    return EcecPackage.Literals.SPATIAL_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(int newNumber)
  {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialLocationType getLocationtype()
  {
    return locationtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocationtype(InitialLocationType newLocationtype, NotificationChain msgs)
  {
    InitialLocationType oldLocationtype = locationtype;
    locationtype = newLocationtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE, oldLocationtype, newLocationtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocationtype(InitialLocationType newLocationtype)
  {
    if (newLocationtype != locationtype)
    {
      NotificationChain msgs = null;
      if (locationtype != null)
        msgs = ((InternalEObject)locationtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE, null, msgs);
      if (newLocationtype != null)
        msgs = ((InternalEObject)newLocationtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE, null, msgs);
      msgs = basicSetLocationtype(newLocationtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE, newLocationtype, newLocationtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGap()
  {
    return gap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGap(int newGap)
  {
    int oldGap = gap;
    gap = newGap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPATIAL_ENTITY__GAP, oldGap, gap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EObject>(EObject.class, this, EcecPackage.SPATIAL_ENTITY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionExpression> getFunction()
  {
    if (function == null)
    {
      function = new EObjectContainmentEList<FunctionExpression>(FunctionExpression.class, this, EcecPackage.SPATIAL_ENTITY__FUNCTION);
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behaviour> getBehaviourdefinition()
  {
    if (behaviourdefinition == null)
    {
      behaviourdefinition = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION);
    }
    return behaviourdefinition;
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
      case EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE:
        return basicSetLocationtype(null, msgs);
      case EcecPackage.SPATIAL_ENTITY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EcecPackage.SPATIAL_ENTITY__FUNCTION:
        return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
      case EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION:
        return ((InternalEList<?>)getBehaviourdefinition()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.SPATIAL_ENTITY__NAME:
        return getName();
      case EcecPackage.SPATIAL_ENTITY__NUMBER:
        return getNumber();
      case EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE:
        return getLocationtype();
      case EcecPackage.SPATIAL_ENTITY__X:
        return getX();
      case EcecPackage.SPATIAL_ENTITY__Y:
        return getY();
      case EcecPackage.SPATIAL_ENTITY__GAP:
        return getGap();
      case EcecPackage.SPATIAL_ENTITY__PARAMETERS:
        return getParameters();
      case EcecPackage.SPATIAL_ENTITY__FUNCTION:
        return getFunction();
      case EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION:
        return getBehaviourdefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcecPackage.SPATIAL_ENTITY__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__NUMBER:
        setNumber((Integer)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE:
        setLocationtype((InitialLocationType)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__X:
        setX((Integer)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__Y:
        setY((Integer)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__GAP:
        setGap((Integer)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EObject>)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__FUNCTION:
        getFunction().clear();
        getFunction().addAll((Collection<? extends FunctionExpression>)newValue);
        return;
      case EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION:
        getBehaviourdefinition().clear();
        getBehaviourdefinition().addAll((Collection<? extends Behaviour>)newValue);
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
      case EcecPackage.SPATIAL_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.SPATIAL_ENTITY__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE:
        setLocationtype((InitialLocationType)null);
        return;
      case EcecPackage.SPATIAL_ENTITY__X:
        setX(X_EDEFAULT);
        return;
      case EcecPackage.SPATIAL_ENTITY__Y:
        setY(Y_EDEFAULT);
        return;
      case EcecPackage.SPATIAL_ENTITY__GAP:
        setGap(GAP_EDEFAULT);
        return;
      case EcecPackage.SPATIAL_ENTITY__PARAMETERS:
        getParameters().clear();
        return;
      case EcecPackage.SPATIAL_ENTITY__FUNCTION:
        getFunction().clear();
        return;
      case EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION:
        getBehaviourdefinition().clear();
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
      case EcecPackage.SPATIAL_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.SPATIAL_ENTITY__NUMBER:
        return number != NUMBER_EDEFAULT;
      case EcecPackage.SPATIAL_ENTITY__LOCATIONTYPE:
        return locationtype != null;
      case EcecPackage.SPATIAL_ENTITY__X:
        return x != X_EDEFAULT;
      case EcecPackage.SPATIAL_ENTITY__Y:
        return y != Y_EDEFAULT;
      case EcecPackage.SPATIAL_ENTITY__GAP:
        return gap != GAP_EDEFAULT;
      case EcecPackage.SPATIAL_ENTITY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EcecPackage.SPATIAL_ENTITY__FUNCTION:
        return function != null && !function.isEmpty();
      case EcecPackage.SPATIAL_ENTITY__BEHAVIOURDEFINITION:
        return behaviourdefinition != null && !behaviourdefinition.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", number: ");
    result.append(number);
    result.append(", X: ");
    result.append(x);
    result.append(", Y: ");
    result.append(y);
    result.append(", gap: ");
    result.append(gap);
    result.append(')');
    return result.toString();
  }

} //SpatialEntityImpl
