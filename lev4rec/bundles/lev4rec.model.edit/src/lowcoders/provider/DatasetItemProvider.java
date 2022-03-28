/**
 */
package lowcoders.provider;


import java.util.Collection;
import java.util.List;

import lowcoders.Dataset;
import lowcoders.LowcodersFactory;
import lowcoders.LowcodersPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lowcoders.Dataset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetItemProvider(AdapterFactory adapterFactory) {
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

			addPreprocessingPropertyDescriptor(object);
			addDatasetManipulationLibraryPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addIsBuiltInPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Preprocessing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreprocessingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_preprocessing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_preprocessing_feature", "_UI_Dataset_type"),
				 LowcodersPackage.Literals.DATASET__PREPROCESSING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dataset Manipulation Library feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatasetManipulationLibraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_datasetManipulationLibrary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_datasetManipulationLibrary_feature", "_UI_Dataset_type"),
				 LowcodersPackage.Literals.DATASET__DATASET_MANIPULATION_LIBRARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_path_feature", "_UI_Dataset_type"),
				 LowcodersPackage.Literals.DATASET__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Built In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBuiltInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_isBuiltIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_isBuiltIn_feature", "_UI_Dataset_type"),
				 LowcodersPackage.Literals.DATASET__IS_BUILT_IN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LowcodersPackage.Literals.DATASET__INDIPENDENT_VARIABLES);
			childrenFeatures.add(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dataset)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dataset_type") :
			getString("_UI_Dataset_type") + " " + label;
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

		switch (notification.getFeatureID(Dataset.class)) {
			case LowcodersPackage.DATASET__PREPROCESSING:
			case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
			case LowcodersPackage.DATASET__PATH:
			case LowcodersPackage.DATASET__IS_BUILT_IN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
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
				(LowcodersPackage.Literals.DATASET__INDIPENDENT_VARIABLES,
				 LowcodersFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE,
				 LowcodersFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE,
				 LowcodersFactory.eINSTANCE.createMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE,
				 LowcodersFactory.eINSTANCE.createTree()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE,
				 LowcodersFactory.eINSTANCE.createTextualContent()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.DATASET__DATA_STRUCTURE,
				 LowcodersFactory.eINSTANCE.createARFF()));
	}

}
