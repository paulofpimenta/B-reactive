/**
 */
package behaviorMetamodel.provider;


import behaviorMetamodel.Edge;
import behaviorMetamodel.MetamodelFactory;
import behaviorMetamodel.MetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviorMetamodel.Edge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTarget_nodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTarget_nodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Edge_target_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Edge_target_node_feature", "_UI_Edge_type"),
				 MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetamodelPackage.Literals.EDGE__TARGET_NODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Edge.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Edge"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Edge)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Edge_type") :
			getString("_UI_Edge_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Edge.class)) {
			case MetamodelPackage.EDGE__TARGET_NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createControlNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createExecutableNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createMerge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createPrimitiveActivities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createDie()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createReproduce()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createDeclaredBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.EDGE__TARGET_NODE,
				 MetamodelFactory.eINSTANCE.createSetVariable()));
	}

}
