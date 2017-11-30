/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.AbstractElements;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.EntityDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityDeclarationImpl#getEntityname <em>Entityname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.EntityDeclarationImpl#getAbstractractElement <em>Abstractract Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityDeclarationImpl extends MinimalEObjectImpl.Container implements EntityDeclaration
{
  /**
   * The default value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected static final String ENTITYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected String entityname = ENTITYNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAbstractractElement() <em>Abstractract Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractractElement()
   * @generated
   * @ordered
   */
  protected EList<AbstractElements> abstractractElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityDeclarationImpl()
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
    return EcecPackage.Literals.ENTITY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntityname()
  {
    return entityname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityname(String newEntityname)
  {
    String oldEntityname = entityname;
    entityname = newEntityname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.ENTITY_DECLARATION__ENTITYNAME, oldEntityname, entityname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElements> getAbstractractElement()
  {
    if (abstractractElement == null)
    {
      abstractractElement = new EObjectContainmentEList<AbstractElements>(AbstractElements.class, this, EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT);
    }
    return abstractractElement;
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
      case EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT:
        return ((InternalEList<?>)getAbstractractElement()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.ENTITY_DECLARATION__ENTITYNAME:
        return getEntityname();
      case EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT:
        return getAbstractractElement();
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
      case EcecPackage.ENTITY_DECLARATION__ENTITYNAME:
        setEntityname((String)newValue);
        return;
      case EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT:
        getAbstractractElement().clear();
        getAbstractractElement().addAll((Collection<? extends AbstractElements>)newValue);
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
      case EcecPackage.ENTITY_DECLARATION__ENTITYNAME:
        setEntityname(ENTITYNAME_EDEFAULT);
        return;
      case EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT:
        getAbstractractElement().clear();
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
      case EcecPackage.ENTITY_DECLARATION__ENTITYNAME:
        return ENTITYNAME_EDEFAULT == null ? entityname != null : !ENTITYNAME_EDEFAULT.equals(entityname);
      case EcecPackage.ENTITY_DECLARATION__ABSTRACTRACT_ELEMENT:
        return abstractractElement != null && !abstractractElement.isEmpty();
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
    result.append(" (entityname: ");
    result.append(entityname);
    result.append(')');
    return result.toString();
  }

} //EntityDeclarationImpl
