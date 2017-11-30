/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.Space;
import org.cirad.dsl.ecec.xtext.ecec.TypeofNeighbourhood;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl#getNumcells <em>Numcells</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.SpaceImpl#getTypeneigh <em>Typeneigh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpaceImpl extends MinimalEObjectImpl.Container implements Space
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
   * The default value of the '{@link #getNumcells() <em>Numcells</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumcells()
   * @generated
   * @ordered
   */
  protected static final int NUMCELLS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumcells() <em>Numcells</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumcells()
   * @generated
   * @ordered
   */
  protected int numcells = NUMCELLS_EDEFAULT;

  /**
   * The default value of the '{@link #getTypeneigh() <em>Typeneigh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeneigh()
   * @generated
   * @ordered
   */
  protected static final TypeofNeighbourhood TYPENEIGH_EDEFAULT = TypeofNeighbourhood.VONNEUMAN;

  /**
   * The cached value of the '{@link #getTypeneigh() <em>Typeneigh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeneigh()
   * @generated
   * @ordered
   */
  protected TypeofNeighbourhood typeneigh = TYPENEIGH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpaceImpl()
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
    return EcecPackage.Literals.SPACE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumcells()
  {
    return numcells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumcells(int newNumcells)
  {
    int oldNumcells = numcells;
    numcells = newNumcells;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPACE__NUMCELLS, oldNumcells, numcells));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeofNeighbourhood getTypeneigh()
  {
    return typeneigh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeneigh(TypeofNeighbourhood newTypeneigh)
  {
    TypeofNeighbourhood oldTypeneigh = typeneigh;
    typeneigh = newTypeneigh == null ? TYPENEIGH_EDEFAULT : newTypeneigh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.SPACE__TYPENEIGH, oldTypeneigh, typeneigh));
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
      case EcecPackage.SPACE__NAME:
        return getName();
      case EcecPackage.SPACE__NUMCELLS:
        return getNumcells();
      case EcecPackage.SPACE__TYPENEIGH:
        return getTypeneigh();
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
      case EcecPackage.SPACE__NAME:
        setName((String)newValue);
        return;
      case EcecPackage.SPACE__NUMCELLS:
        setNumcells((Integer)newValue);
        return;
      case EcecPackage.SPACE__TYPENEIGH:
        setTypeneigh((TypeofNeighbourhood)newValue);
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
      case EcecPackage.SPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcecPackage.SPACE__NUMCELLS:
        setNumcells(NUMCELLS_EDEFAULT);
        return;
      case EcecPackage.SPACE__TYPENEIGH:
        setTypeneigh(TYPENEIGH_EDEFAULT);
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
      case EcecPackage.SPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcecPackage.SPACE__NUMCELLS:
        return numcells != NUMCELLS_EDEFAULT;
      case EcecPackage.SPACE__TYPENEIGH:
        return typeneigh != TYPENEIGH_EDEFAULT;
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
    result.append(", numcells: ");
    result.append(numcells);
    result.append(", typeneigh: ");
    result.append(typeneigh);
    result.append(')');
    return result.toString();
  }

} //SpaceImpl
