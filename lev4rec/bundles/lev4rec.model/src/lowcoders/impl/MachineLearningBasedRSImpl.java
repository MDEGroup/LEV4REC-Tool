/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.MachineLearningBasedRS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Learning Based RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.MachineLearningBasedRSImpl#getNumEpochs <em>Num Epochs</em>}</li>
 *   <li>{@link lowcoders.impl.MachineLearningBasedRSImpl#getLearningRate <em>Learning Rate</em>}</li>
 *   <li>{@link lowcoders.impl.MachineLearningBasedRSImpl#getMiniBatchSize <em>Mini Batch Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineLearningBasedRSImpl extends RecommendationSystemImpl implements MachineLearningBasedRS {
	/**
	 * The default value of the '{@link #getNumEpochs() <em>Num Epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEpochs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EPOCHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumEpochs() <em>Num Epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEpochs()
	 * @generated
	 * @ordered
	 */
	protected int numEpochs = NUM_EPOCHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLearningRate() <em>Learning Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningRate()
	 * @generated
	 * @ordered
	 */
	protected static final int LEARNING_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLearningRate() <em>Learning Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningRate()
	 * @generated
	 * @ordered
	 */
	protected int learningRate = LEARNING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiniBatchSize() <em>Mini Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiniBatchSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MINI_BATCH_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMiniBatchSize() <em>Mini Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiniBatchSize()
	 * @generated
	 * @ordered
	 */
	protected int miniBatchSize = MINI_BATCH_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineLearningBasedRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.MACHINE_LEARNING_BASED_RS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumEpochs() {
		return numEpochs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumEpochs(int newNumEpochs) {
		int oldNumEpochs = numEpochs;
		numEpochs = newNumEpochs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.MACHINE_LEARNING_BASED_RS__NUM_EPOCHS, oldNumEpochs, numEpochs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLearningRate() {
		return learningRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearningRate(int newLearningRate) {
		int oldLearningRate = learningRate;
		learningRate = newLearningRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.MACHINE_LEARNING_BASED_RS__LEARNING_RATE, oldLearningRate, learningRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMiniBatchSize() {
		return miniBatchSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiniBatchSize(int newMiniBatchSize) {
		int oldMiniBatchSize = miniBatchSize;
		miniBatchSize = newMiniBatchSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE, oldMiniBatchSize, miniBatchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__NUM_EPOCHS:
				return getNumEpochs();
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__LEARNING_RATE:
				return getLearningRate();
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE:
				return getMiniBatchSize();
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
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__NUM_EPOCHS:
				setNumEpochs((Integer)newValue);
				return;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__LEARNING_RATE:
				setLearningRate((Integer)newValue);
				return;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE:
				setMiniBatchSize((Integer)newValue);
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
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__NUM_EPOCHS:
				setNumEpochs(NUM_EPOCHS_EDEFAULT);
				return;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__LEARNING_RATE:
				setLearningRate(LEARNING_RATE_EDEFAULT);
				return;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE:
				setMiniBatchSize(MINI_BATCH_SIZE_EDEFAULT);
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
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__NUM_EPOCHS:
				return numEpochs != NUM_EPOCHS_EDEFAULT;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__LEARNING_RATE:
				return learningRate != LEARNING_RATE_EDEFAULT;
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE:
				return miniBatchSize != MINI_BATCH_SIZE_EDEFAULT;
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
		result.append(" (numEpochs: ");
		result.append(numEpochs);
		result.append(", learningRate: ");
		result.append(learningRate);
		result.append(", miniBatchSize: ");
		result.append(miniBatchSize);
		result.append(')');
		return result.toString();
	}

} //MachineLearningBasedRSImpl
