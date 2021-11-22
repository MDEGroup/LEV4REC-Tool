/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.GroundTruthExtraction;
import lowcoders.LowcodersPackage;
import lowcoders.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Truth Extraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.GroundTruthExtractionImpl#getSizeGT <em>Size GT</em>}</li>
 *   <li>{@link lowcoders.impl.GroundTruthExtractionImpl#getSplittingRules <em>Splitting Rules</em>}</li>
 *   <li>{@link lowcoders.impl.GroundTruthExtractionImpl#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundTruthExtractionImpl extends MinimalEObjectImpl.Container implements GroundTruthExtraction {
	/**
	 * The default value of the '{@link #getSizeGT() <em>Size GT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGT()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_GT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeGT() <em>Size GT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGT()
	 * @generated
	 * @ordered
	 */
	protected String sizeGT = SIZE_GT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSplittingRules() <em>Splitting Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplittingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> splittingRules;

	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable targetVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundTruthExtractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.GROUND_TRUTH_EXTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeGT() {
		return sizeGT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeGT(String newSizeGT) {
		String oldSizeGT = sizeGT;
		sizeGT = newSizeGT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.GROUND_TRUTH_EXTRACTION__SIZE_GT, oldSizeGT, sizeGT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSplittingRules() {
		if (splittingRules == null) {
			splittingRules = new EDataTypeUniqueEList<String>(String.class, this, LowcodersPackage.GROUND_TRUTH_EXTRACTION__SPLITTING_RULES);
		}
		return splittingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getTargetVariable() {
		if (targetVariable != null && targetVariable.eIsProxy()) {
			InternalEObject oldTargetVariable = (InternalEObject)targetVariable;
			targetVariable = (Variable)eResolveProxy(oldTargetVariable);
			if (targetVariable != oldTargetVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE, oldTargetVariable, targetVariable));
			}
		}
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetVariable(Variable newTargetVariable) {
		Variable oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE, oldTargetVariable, targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SIZE_GT:
				return getSizeGT();
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SPLITTING_RULES:
				return getSplittingRules();
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE:
				if (resolve) return getTargetVariable();
				return basicGetTargetVariable();
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
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SIZE_GT:
				setSizeGT((String)newValue);
				return;
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SPLITTING_RULES:
				getSplittingRules().clear();
				getSplittingRules().addAll((Collection<? extends String>)newValue);
				return;
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE:
				setTargetVariable((Variable)newValue);
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
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SIZE_GT:
				setSizeGT(SIZE_GT_EDEFAULT);
				return;
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SPLITTING_RULES:
				getSplittingRules().clear();
				return;
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE:
				setTargetVariable((Variable)null);
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
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SIZE_GT:
				return SIZE_GT_EDEFAULT == null ? sizeGT != null : !SIZE_GT_EDEFAULT.equals(sizeGT);
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__SPLITTING_RULES:
				return splittingRules != null && !splittingRules.isEmpty();
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE:
				return targetVariable != null;
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
		result.append(" (sizeGT: ");
		result.append(sizeGT);
		result.append(", splittingRules: ");
		result.append(splittingRules);
		result.append(')');
		return result.toString();
	}

} //GroundTruthExtractionImpl
