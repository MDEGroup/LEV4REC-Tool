/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.PresentationLayer;
import lowcoders.RecommendedItem;
import lowcoders.WebApplication;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.WebApplicationImpl#getRecommendations <em>Recommendations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends NamedElementImpl implements WebApplication {
	/**
	 * The cached value of the '{@link #getRecommendations() <em>Recommendations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendations()
	 * @generated
	 * @ordered
	 */
	protected RecommendedItem recommendations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.WEB_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendedItem getRecommendations() {
		if (recommendations != null && recommendations.eIsProxy()) {
			InternalEObject oldRecommendations = (InternalEObject)recommendations;
			recommendations = (RecommendedItem)eResolveProxy(oldRecommendations);
			if (recommendations != oldRecommendations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS, oldRecommendations, recommendations));
			}
		}
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendedItem basicGetRecommendations() {
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendations(RecommendedItem newRecommendations) {
		RecommendedItem oldRecommendations = recommendations;
		recommendations = newRecommendations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS, oldRecommendations, recommendations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				if (resolve) return getRecommendations();
				return basicGetRecommendations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				setRecommendations((RecommendedItem)newValue);
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
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				setRecommendations((RecommendedItem)null);
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
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				return recommendations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PresentationLayer.class) {
			switch (derivedFeatureID) {
				case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS: return LowcodersPackage.PRESENTATION_LAYER__RECOMMENDATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PresentationLayer.class) {
			switch (baseFeatureID) {
				case LowcodersPackage.PRESENTATION_LAYER__RECOMMENDATIONS: return LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WebApplicationImpl
