/**
 */
package behaviorMetamodel.provider;


import behaviorMetamodel.MetamodelFactory;
import behaviorMetamodel.MetamodelPackage;
import behaviorMetamodel.Reproduce;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviorMetamodel.Reproduce} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReproduceItemProvider extends PrimitiveActivitiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReproduceItemProvider(AdapterFactory adapterFactory) {
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

			addOffspring_quantityPropertyDescriptor(object);
			addInitial_locationPropertyDescriptor(object);
			addDeclaredattributesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Offspring quantity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffspring_quantityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reproduce_offspring_quantity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reproduce_offspring_quantity_feature", "_UI_Reproduce_type"),
				 MetamodelPackage.Literals.REPRODUCE__OFFSPRING_QUANTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitial_locationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reproduce_initial_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reproduce_initial_location_feature", "_UI_Reproduce_type"),
				 MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaredattributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaredattributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reproduce_declaredattributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reproduce_declaredattributes_feature", "_UI_Reproduce_type"),
				 MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
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
			childrenFeatures.add(MetamodelPackage.Literals.REPRODUCE__OFFSPRING_QUANTITY);
			childrenFeatures.add(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION);
			childrenFeatures.add(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES);
			childrenFeatures.add(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION);
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
	 * This returns Reproduce.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Reproduce"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Reproduce)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Reproduce_type") :
			getString("_UI_Reproduce_type") + " " + label;
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

		switch (notification.getFeatureID(Reproduce.class)) {
			case MetamodelPackage.REPRODUCE__OFFSPRING_QUANTITY:
			case MetamodelPackage.REPRODUCE__INITIAL_LOCATION:
			case MetamodelPackage.REPRODUCE__DECLAREDATTRIBUTES:
			case MetamodelPackage.REPRODUCE__OCCUPIED_EXPRESSION:
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
				(MetamodelPackage.Literals.REPRODUCE__OFFSPRING_QUANTITY,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createVariableClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createParameterClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createAttributeClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createDeclaredLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createDeclaredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createDeclaredAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createDeclaredEntities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION,
				 MetamodelFactory.eINSTANCE.createDeclaredVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createVariableClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createParameterClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createAttributeClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createDeclaredLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createDeclaredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createDeclaredAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createDeclaredEntities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES,
				 MetamodelFactory.eINSTANCE.createDeclaredVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createVariableClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createParameterClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createAttributeClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredEntities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredVariable()));
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
			childFeature == MetamodelPackage.Literals.REPRODUCE__OFFSPRING_QUANTITY ||
			childFeature == MetamodelPackage.Literals.REPRODUCE__INITIAL_LOCATION ||
			childFeature == MetamodelPackage.Literals.REPRODUCE__DECLAREDATTRIBUTES ||
			childFeature == MetamodelPackage.Literals.REPRODUCE__OCCUPIED_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
