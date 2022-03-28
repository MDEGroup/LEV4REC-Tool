/**
 */
package lowcoders.provider;


import java.util.Collection;
import java.util.List;

import lowcoders.LowcodersFactory;
import lowcoders.LowcodersPackage;
import lowcoders.RSModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lowcoders.RSModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RSModelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(LowcodersPackage.Literals.RS_MODEL__DATASET);
			childrenFeatures.add(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER);
			childrenFeatures.add(LowcodersPackage.Literals.RS_MODEL__EVALUATION);
			childrenFeatures.add(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM);
			childrenFeatures.add(LowcodersPackage.Literals.RS_MODEL__FEEDBACK);
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
	 * This returns RSModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RSModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RSModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RSModel_type") :
			getString("_UI_RSModel_type") + " " + label;
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

		switch (notification.getFeatureID(RSModel.class)) {
			case LowcodersPackage.RS_MODEL__DATASET:
			case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
			case LowcodersPackage.RS_MODEL__EVALUATION:
			case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
			case LowcodersPackage.RS_MODEL__FEEDBACK:
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
				(LowcodersPackage.Literals.RS_MODEL__DATASET,
				 LowcodersFactory.eINSTANCE.createUnsupervisedDataset()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__DATASET,
				 LowcodersFactory.eINSTANCE.createSupervisedDataset()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createWebIService()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createWebApplication()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createIDEIntegration()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createVSCodePlugin()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createTraversableGraph()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__PRESENTATION_LAYER,
				 LowcodersFactory.eINSTANCE.createRawOutcomes()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__EVALUATION,
				 LowcodersFactory.eINSTANCE.createEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createMachineLearningBasedRS()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createFilteringRS()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createDataMiningRS()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createCustomRecommender()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createGeneticAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createDeepNN()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createConvolutionalNN()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createBayesian()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createRecurrentNN()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createSVM()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createDecisionTree()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__RECOMMENDATION_SYSTEM,
				 LowcodersFactory.eINSTANCE.createFeedForwardNN()));

		newChildDescriptors.add
			(createChildParameter
				(LowcodersPackage.Literals.RS_MODEL__FEEDBACK,
				 LowcodersFactory.eINSTANCE.createFeedbackComponent()));
	}

}
