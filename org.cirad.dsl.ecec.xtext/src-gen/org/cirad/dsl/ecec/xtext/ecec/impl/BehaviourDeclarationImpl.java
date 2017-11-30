/**
 */
package org.cirad.dsl.ecec.xtext.ecec.impl;

import java.util.Collection;

import org.cirad.dsl.ecec.xtext.ecec.BehaviourDeclaration;
import org.cirad.dsl.ecec.xtext.ecec.EcecPackage;
import org.cirad.dsl.ecec.xtext.ecec.ParametersDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDeclarationImpl#getBehaviourname <em>Behaviourname</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDeclarationImpl#getBeaviours <em>Beaviours</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDeclarationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.impl.BehaviourDeclarationImpl#getParameterdeclaration <em>Parameterdeclaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourDeclarationImpl extends AbstractElementsImpl implements BehaviourDeclaration
{
  /**
   * The default value of the '{@link #getBehaviourname() <em>Behaviourname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourname()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOURNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehaviourname() <em>Behaviourname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourname()
   * @generated
   * @ordered
   */
  protected String behaviourname = BEHAVIOURNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBeaviours() <em>Beaviours</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeaviours()
   * @generated
   * @ordered
   */
  protected EList<BehaviourDeclaration> beaviours;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<String> condition;

  /**
   * The cached value of the '{@link #getParameterdeclaration() <em>Parameterdeclaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterdeclaration()
   * @generated
   * @ordered
   */
  protected EList<ParametersDeclaration> parameterdeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviourDeclarationImpl()
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
    return EcecPackage.Literals.BEHAVIOUR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehaviourname()
  {
    return behaviourname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviourname(String newBehaviourname)
  {
    String oldBehaviourname = behaviourname;
    behaviourname = newBehaviourname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcecPackage.BEHAVIOUR_DECLARATION__BEHAVIOURNAME, oldBehaviourname, behaviourname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviourDeclaration> getBeaviours()
  {
    if (beaviours == null)
    {
      beaviours = new EObjectContainmentEList<BehaviourDeclaration>(BehaviourDeclaration.class, this, EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS);
    }
    return beaviours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCondition()
  {
    if (condition == null)
    {
      condition = new EDataTypeEList<String>(String.class, this, EcecPackage.BEHAVIOUR_DECLARATION__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParametersDeclaration> getParameterdeclaration()
  {
    if (parameterdeclaration == null)
    {
      parameterdeclaration = new EObjectContainmentEList<ParametersDeclaration>(ParametersDeclaration.class, this, EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION);
    }
    return parameterdeclaration;
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
      case EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS:
        return ((InternalEList<?>)getBeaviours()).basicRemove(otherEnd, msgs);
      case EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION:
        return ((InternalEList<?>)getParameterdeclaration()).basicRemove(otherEnd, msgs);
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
      case EcecPackage.BEHAVIOUR_DECLARATION__BEHAVIOURNAME:
        return getBehaviourname();
      case EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS:
        return getBeaviours();
      case EcecPackage.BEHAVIOUR_DECLARATION__CONDITION:
        return getCondition();
      case EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION:
        return getParameterdeclaration();
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
      case EcecPackage.BEHAVIOUR_DECLARATION__BEHAVIOURNAME:
        setBehaviourname((String)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS:
        getBeaviours().clear();
        getBeaviours().addAll((Collection<? extends BehaviourDeclaration>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends String>)newValue);
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION:
        getParameterdeclaration().clear();
        getParameterdeclaration().addAll((Collection<? extends ParametersDeclaration>)newValue);
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
      case EcecPackage.BEHAVIOUR_DECLARATION__BEHAVIOURNAME:
        setBehaviourname(BEHAVIOURNAME_EDEFAULT);
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS:
        getBeaviours().clear();
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__CONDITION:
        getCondition().clear();
        return;
      case EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION:
        getParameterdeclaration().clear();
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
      case EcecPackage.BEHAVIOUR_DECLARATION__BEHAVIOURNAME:
        return BEHAVIOURNAME_EDEFAULT == null ? behaviourname != null : !BEHAVIOURNAME_EDEFAULT.equals(behaviourname);
      case EcecPackage.BEHAVIOUR_DECLARATION__BEAVIOURS:
        return beaviours != null && !beaviours.isEmpty();
      case EcecPackage.BEHAVIOUR_DECLARATION__CONDITION:
        return condition != null && !condition.isEmpty();
      case EcecPackage.BEHAVIOUR_DECLARATION__PARAMETERDECLARATION:
        return parameterdeclaration != null && !parameterdeclaration.isEmpty();
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
    result.append(" (behaviourname: ");
    result.append(behaviourname);
    result.append(", condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //BehaviourDeclarationImpl
