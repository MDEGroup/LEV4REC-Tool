/**
 */
package lowcoders.impl;

import lowcoders.DataMiningRS;
import lowcoders.DataMiningRSAlgorithm;
import lowcoders.LowcodersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mining RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.DataMiningRSImpl#getDataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMiningRSImpl extends RecommendationSystemImpl implements DataMiningRS {
	/**
	 * The default value of the '{@link #getDataMiningRSAlgorithm() <em>Data Mining RS Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMiningRSAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final DataMiningRSAlgorithm DATA_MINING_RS_ALGORITHM_EDEFAULT = DataMiningRSAlgorithm.CLUSTERING;

	/**
	 * The cached value of the '{@link #getDataMiningRSAlgorithm() <em>Data Mining RS Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMiningRSAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected DataMiningRSAlgorithm dataMiningRSAlgorithm = DATA_MINING_RS_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMiningRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.DATA_MINING_RS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataMiningRSAlgorithm getDataMiningRSAlgorithm() {
		return dataMiningRSAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataMiningRSAlgorithm(DataMiningRSAlgorithm newDataMiningRSAlgorithm) {
		DataMiningRSAlgorithm oldDataMiningRSAlgorithm = dataMiningRSAlgorithm;
		dataMiningRSAlgorithm = newDataMiningRSAlgorithm == null ? DATA_MINING_RS_ALGORITHM_EDEFAULT : newDataMiningRSAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATA_MINING_RS__DATA_MINING_RS_ALGORITHM, oldDataMiningRSAlgorithm, dataMiningRSAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.DATA_MINING_RS__DATA_MINING_RS_ALGORITHM:
				return getDataMiningRSAlgorithm();
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
			case LowcodersPackage.DATA_MINING_RS__DATA_MINING_RS_ALGORITHM:
				setDataMiningRSAlgorithm((DataMiningRSAlgorithm)newValue);
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
			case LowcodersPackage.DATA_MINING_RS__DATA_MINING_RS_ALGORITHM:
				setDataMiningRSAlgorithm(DATA_MINING_RS_ALGORITHM_EDEFAULT);
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
			case LowcodersPackage.DATA_MINING_RS__DATA_MINING_RS_ALGORITHM:
				return dataMiningRSAlgorithm != DATA_MINING_RS_ALGORITHM_EDEFAULT;
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
		result.append(" (dataMiningRSAlgorithm: ");
		result.append(dataMiningRSAlgorithm);
		result.append(')');
		return result.toString();
	}

} //DataMiningRSImpl
