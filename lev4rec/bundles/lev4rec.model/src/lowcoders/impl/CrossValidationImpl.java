/**
 */
package lowcoders.impl;

import lowcoders.CrossValidation;
import lowcoders.GroundTruthExtraction;
import lowcoders.LowcodersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.CrossValidationImpl#getNumberOfFold <em>Number Of Fold</em>}</li>
 *   <li>{@link lowcoders.impl.CrossValidationImpl#getGroundTruthExtractor <em>Ground Truth Extractor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossValidationImpl extends AutomatedValidationImpl implements CrossValidation {
	/**
	 * The default value of the '{@link #getNumberOfFold() <em>Number Of Fold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFold()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_FOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfFold() <em>Number Of Fold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFold()
	 * @generated
	 * @ordered
	 */
	protected int numberOfFold = NUMBER_OF_FOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroundTruthExtractor() <em>Ground Truth Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTruthExtractor()
	 * @generated
	 * @ordered
	 */
	protected GroundTruthExtraction groundTruthExtractor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.CROSS_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfFold() {
		return numberOfFold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfFold(int newNumberOfFold) {
		int oldNumberOfFold = numberOfFold;
		numberOfFold = newNumberOfFold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.CROSS_VALIDATION__NUMBER_OF_FOLD, oldNumberOfFold, numberOfFold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundTruthExtraction getGroundTruthExtractor() {
		return groundTruthExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundTruthExtractor(GroundTruthExtraction newGroundTruthExtractor, NotificationChain msgs) {
		GroundTruthExtraction oldGroundTruthExtractor = groundTruthExtractor;
		groundTruthExtractor = newGroundTruthExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR, oldGroundTruthExtractor, newGroundTruthExtractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroundTruthExtractor(GroundTruthExtraction newGroundTruthExtractor) {
		if (newGroundTruthExtractor != groundTruthExtractor) {
			NotificationChain msgs = null;
			if (groundTruthExtractor != null)
				msgs = ((InternalEObject)groundTruthExtractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR, null, msgs);
			if (newGroundTruthExtractor != null)
				msgs = ((InternalEObject)newGroundTruthExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR, null, msgs);
			msgs = basicSetGroundTruthExtractor(newGroundTruthExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR, newGroundTruthExtractor, newGroundTruthExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR:
				return basicSetGroundTruthExtractor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.CROSS_VALIDATION__NUMBER_OF_FOLD:
				return getNumberOfFold();
			case LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR:
				return getGroundTruthExtractor();
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
			case LowcodersPackage.CROSS_VALIDATION__NUMBER_OF_FOLD:
				setNumberOfFold((Integer)newValue);
				return;
			case LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR:
				setGroundTruthExtractor((GroundTruthExtraction)newValue);
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
			case LowcodersPackage.CROSS_VALIDATION__NUMBER_OF_FOLD:
				setNumberOfFold(NUMBER_OF_FOLD_EDEFAULT);
				return;
			case LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR:
				setGroundTruthExtractor((GroundTruthExtraction)null);
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
			case LowcodersPackage.CROSS_VALIDATION__NUMBER_OF_FOLD:
				return numberOfFold != NUMBER_OF_FOLD_EDEFAULT;
			case LowcodersPackage.CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR:
				return groundTruthExtractor != null;
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
		result.append(" (numberOfFold: ");
		result.append(numberOfFold);
		result.append(')');
		return result.toString();
	}

} //CrossValidationImpl
