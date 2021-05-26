/**
 */
package lowcoders.impl;

import lowcoders.DeepNN;
import lowcoders.LowcodersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deep NN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.DeepNNImpl#getNumHiddenLayer <em>Num Hidden Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeepNNImpl extends MachineLearningBasedRSImpl implements DeepNN {
	/**
	 * The default value of the '{@link #getNumHiddenLayer() <em>Num Hidden Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHiddenLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_HIDDEN_LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumHiddenLayer() <em>Num Hidden Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHiddenLayer()
	 * @generated
	 * @ordered
	 */
	protected int numHiddenLayer = NUM_HIDDEN_LAYER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeepNNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.DEEP_NN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumHiddenLayer() {
		return numHiddenLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumHiddenLayer(int newNumHiddenLayer) {
		int oldNumHiddenLayer = numHiddenLayer;
		numHiddenLayer = newNumHiddenLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DEEP_NN__NUM_HIDDEN_LAYER, oldNumHiddenLayer, numHiddenLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.DEEP_NN__NUM_HIDDEN_LAYER:
				return getNumHiddenLayer();
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
			case LowcodersPackage.DEEP_NN__NUM_HIDDEN_LAYER:
				setNumHiddenLayer((Integer)newValue);
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
			case LowcodersPackage.DEEP_NN__NUM_HIDDEN_LAYER:
				setNumHiddenLayer(NUM_HIDDEN_LAYER_EDEFAULT);
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
			case LowcodersPackage.DEEP_NN__NUM_HIDDEN_LAYER:
				return numHiddenLayer != NUM_HIDDEN_LAYER_EDEFAULT;
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
		result.append(" (numHiddenLayer: ");
		result.append(numHiddenLayer);
		result.append(')');
		return result.toString();
	}

} //DeepNNImpl
