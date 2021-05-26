/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.ValidationTechnique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.ValidationTechniqueImpl#getNOfRecommendations <em>NOf Recommendations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValidationTechniqueImpl extends NamedElementImpl implements ValidationTechnique {
	/**
	 * The default value of the '{@link #getNOfRecommendations() <em>NOf Recommendations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOfRecommendations()
	 * @generated
	 * @ordered
	 */
	protected static final int NOF_RECOMMENDATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNOfRecommendations() <em>NOf Recommendations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOfRecommendations()
	 * @generated
	 * @ordered
	 */
	protected int nOfRecommendations = NOF_RECOMMENDATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.VALIDATION_TECHNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNOfRecommendations() {
		return nOfRecommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNOfRecommendations(int newNOfRecommendations) {
		int oldNOfRecommendations = nOfRecommendations;
		nOfRecommendations = newNOfRecommendations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS, oldNOfRecommendations, nOfRecommendations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS:
				return getNOfRecommendations();
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
			case LowcodersPackage.VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS:
				setNOfRecommendations((Integer)newValue);
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
			case LowcodersPackage.VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS:
				setNOfRecommendations(NOF_RECOMMENDATIONS_EDEFAULT);
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
			case LowcodersPackage.VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS:
				return nOfRecommendations != NOF_RECOMMENDATIONS_EDEFAULT;
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
		result.append(" (nOfRecommendations: ");
		result.append(nOfRecommendations);
		result.append(')');
		return result.toString();
	}

} //ValidationTechniqueImpl
