/**
 */
package behaviorMetamodel.impl;

import behaviorMetamodel.Edge;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.impl.EdgeImpl#getTarget_node <em>Target node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends ElementImpl implements Edge
{
	/**
	 * The cached value of the '{@link #getTarget_node() <em>Target node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> target_node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl()
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
		return MetamodelPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getTarget_node()
	{
		if (target_node == null)
		{
			target_node = new EObjectContainmentEList<Node>(Node.class, this, MetamodelPackage.EDGE__TARGET_NODE);
		}
		return target_node;
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
			case MetamodelPackage.EDGE__TARGET_NODE:
				return ((InternalEList<?>)getTarget_node()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.EDGE__TARGET_NODE:
				return getTarget_node();
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
			case MetamodelPackage.EDGE__TARGET_NODE:
				getTarget_node().clear();
				getTarget_node().addAll((Collection<? extends Node>)newValue);
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
			case MetamodelPackage.EDGE__TARGET_NODE:
				getTarget_node().clear();
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
			case MetamodelPackage.EDGE__TARGET_NODE:
				return target_node != null && !target_node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
