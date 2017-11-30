/**
 */
package behaviorMetamodel.provider;


import behaviorMetamodel.LocalVariable;
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
 * This is the item provider adapter for a {@link behaviorMetamodel.LocalVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalVariableItemProvider extends VariableClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariableItemProvider(AdapterFactory adapterFactory) {
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

			addExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalVariable_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalVariable_expression_feature", "_UI_LocalVariable_type"),
				 MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
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
			childrenFeatures.add(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION);
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
	 * This returns LocalVariable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalVariable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LocalVariable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalVariable_type") :
			getString("_UI_LocalVariable_type") + " " + label;
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

		switch (notification.getFeatureID(LocalVariable.class)) {
			case MetamodelPackage.LOCAL_VARIABLE__EXPRESSION:
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
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createVariableClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createParameterClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createAttributeClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredEntities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.LOCAL_VARIABLE__EXPRESSION,
				 MetamodelFactory.eINSTANCE.createDeclaredVariable()));
	}

}
