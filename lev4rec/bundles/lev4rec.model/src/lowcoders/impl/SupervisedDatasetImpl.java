/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.SupervisedDataset;
import lowcoders.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supervised Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.SupervisedDatasetImpl#getDependatVariable <em>Dependat Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupervisedDatasetImpl extends DatasetImpl implements SupervisedDataset {
	/**
	 * The cached value of the '{@link #getDependatVariable() <em>Dependat Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependatVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable dependatVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupervisedDatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.SUPERVISED_DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getDependatVariable() {
		return dependatVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependatVariable(Variable newDependatVariable, NotificationChain msgs) {
		Variable oldDependatVariable = dependatVariable;
		dependatVariable = newDependatVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE, oldDependatVariable, newDependatVariable);
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
	public void setDependatVariable(Variable newDependatVariable) {
		if (newDependatVariable != dependatVariable) {
			NotificationChain msgs = null;
			if (dependatVariable != null)
				msgs = ((InternalEObject)dependatVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE, null, msgs);
			if (newDependatVariable != null)
				msgs = ((InternalEObject)newDependatVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE, null, msgs);
			msgs = basicSetDependatVariable(newDependatVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE, newDependatVariable, newDependatVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE:
				return basicSetDependatVariable(null, msgs);
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
			case LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE:
				return getDependatVariable();
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
			case LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE:
				setDependatVariable((Variable)newValue);
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
			case LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE:
				setDependatVariable((Variable)null);
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
			case LowcodersPackage.SUPERVISED_DATASET__DEPENDAT_VARIABLE:
				return dependatVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //SupervisedDatasetImpl
