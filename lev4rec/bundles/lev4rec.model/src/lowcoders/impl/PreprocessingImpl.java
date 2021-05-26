/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.LowcodersPackage;
import lowcoders.Preprocessing;
import lowcoders.PreprocessingTechnique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.PreprocessingImpl#getPreprocessigTechnique <em>Preprocessig Technique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreprocessingImpl extends MinimalEObjectImpl.Container implements Preprocessing {
	/**
	 * The cached value of the '{@link #getPreprocessigTechnique() <em>Preprocessig Technique</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessigTechnique()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingTechnique> preprocessigTechnique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreprocessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.PREPROCESSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreprocessingTechnique> getPreprocessigTechnique() {
		if (preprocessigTechnique == null) {
			preprocessigTechnique = new EDataTypeUniqueEList<PreprocessingTechnique>(PreprocessingTechnique.class, this, LowcodersPackage.PREPROCESSING__PREPROCESSIG_TECHNIQUE);
		}
		return preprocessigTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.PREPROCESSING__PREPROCESSIG_TECHNIQUE:
				return getPreprocessigTechnique();
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
			case LowcodersPackage.PREPROCESSING__PREPROCESSIG_TECHNIQUE:
				getPreprocessigTechnique().clear();
				getPreprocessigTechnique().addAll((Collection<? extends PreprocessingTechnique>)newValue);
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
			case LowcodersPackage.PREPROCESSING__PREPROCESSIG_TECHNIQUE:
				getPreprocessigTechnique().clear();
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
			case LowcodersPackage.PREPROCESSING__PREPROCESSIG_TECHNIQUE:
				return preprocessigTechnique != null && !preprocessigTechnique.isEmpty();
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
		result.append(" (preprocessigTechnique: ");
		result.append(preprocessigTechnique);
		result.append(')');
		return result.toString();
	}

} //PreprocessingImpl
