/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.AttributeClass;
import behaviorMetamodel.DeclaredAttributes;
import behaviorMetamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.DeclaredAttributesImpl#getAttributeclass <em>Attributeclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaredAttributesImpl extends ExpressionImpl implements DeclaredAttributes
{
	/**
	 * The cached value of the '{@link #getAttributeclass() <em>Attributeclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeclass()
	 * @generated
	 * @ordered
	 */
	protected AttributeClass attributeclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredAttributesImpl()
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
		return MetamodelPackage.Literals.DECLARED_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeClass getAttributeclass()
	{
		if (attributeclass != null && attributeclass.eIsProxy())
		{
			InternalEObject oldAttributeclass = (InternalEObject)attributeclass;
			attributeclass = (AttributeClass)eResolveProxy(oldAttributeclass);
			if (attributeclass != oldAttributeclass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS, oldAttributeclass, attributeclass));
			}
		}
		return attributeclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeClass basicGetAttributeclass()
	{
		return attributeclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeclass(AttributeClass newAttributeclass)
	{
		AttributeClass oldAttributeclass = attributeclass;
		attributeclass = newAttributeclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS, oldAttributeclass, attributeclass));
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
			case MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS:
				if (resolve) return getAttributeclass();
				return basicGetAttributeclass();
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
			case MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS:
				setAttributeclass((AttributeClass)newValue);
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
			case MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS:
				setAttributeclass((AttributeClass)null);
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
			case MetamodelPackage.DECLARED_ATTRIBUTES__ATTRIBUTECLASS:
				return attributeclass != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredAttributesImpl
