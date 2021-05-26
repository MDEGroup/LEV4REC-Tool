/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.CustomRecommender_SOREC;
import lowcoders.LowcodersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Recommender SOREC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.CustomRecommender_SORECImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link lowcoders.impl.CustomRecommender_SORECImpl#getRequiredTools <em>Required Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomRecommender_SORECImpl extends RecommendationSystemImpl implements CustomRecommender_SOREC {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredTools() <em>Required Tools</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTools()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomRecommender_SORECImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.CUSTOM_RECOMMENDER_SOREC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredTools() {
		if (requiredTools == null) {
			requiredTools = new EDataTypeUniqueEList<String>(String.class, this, LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS);
		}
		return requiredTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__DESCRIPTION:
				return getDescription();
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS:
				return getRequiredTools();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS:
				getRequiredTools().clear();
				getRequiredTools().addAll((Collection<? extends String>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS:
				getRequiredTools().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS:
				return requiredTools != null && !requiredTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", requiredTools: ");
		result.append(requiredTools);
		result.append(')');
		return result.toString();
	}

} //CustomRecommender_SORECImpl
