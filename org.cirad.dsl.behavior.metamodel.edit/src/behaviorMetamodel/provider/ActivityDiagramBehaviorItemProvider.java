/**
 */
package behaviorMetamodel.provider;


import behaviorMetamodel.ActivityDiagramBehavior;
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
 * This is the item provider adapter for a {@link behaviorMetamodel.ActivityDiagramBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramBehaviorItemProvider extends BehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramBehaviorItemProvider(AdapterFactory adapterFactory) {
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

			addStartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagramBehavior_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagramBehavior_start_feature", "_UI_ActivityDiagramBehavior_type"),
				 MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__START,
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
			childrenFeatures.add(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__START);
			childrenFeatures.add(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS);
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
	 * This returns ActivityDiagramBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDiagramBehavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityDiagramBehavior)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityDiagramBehavior_type") :
			getString("_UI_ActivityDiagramBehavior_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityDiagramBehavior.class)) {
			case MetamodelPackage.ACTIVITY_DIAGRAM_BEHAVIOR__START:
			case MetamodelPackage.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS:
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
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__START,
				 MetamodelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createEdge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createUnconditionedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createIfTrueEdge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createIfFalseEdge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createControlNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createExecutableNode()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createMerge()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createPrimitiveActivities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createDie()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createReproduce()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createDeclaredBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS,
				 MetamodelFactory.eINSTANCE.createSetVariable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__START ||
			childFeature == MetamodelPackage.Literals.ACTIVITY_DIAGRAM_BEHAVIOR__ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
