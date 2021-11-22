/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.DataStructure;
import lowcoders.Dataset;
import lowcoders.DatasetManipulationLibrary;
import lowcoders.LowcodersPackage;
import lowcoders.PreprocessingTechnique;
import lowcoders.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.DatasetImpl#getIndipendentVariables <em>Indipendent Variables</em>}</li>
 *   <li>{@link lowcoders.impl.DatasetImpl#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link lowcoders.impl.DatasetImpl#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link lowcoders.impl.DatasetImpl#getDatasetManipulationLibrary <em>Dataset Manipulation Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DatasetImpl extends NamedElementImpl implements Dataset {
	/**
	 * The cached value of the '{@link #getIndipendentVariables() <em>Indipendent Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndipendentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> indipendentVariables;

	/**
	 * The cached value of the '{@link #getDataStructure() <em>Data Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStructure()
	 * @generated
	 * @ordered
	 */
	protected DataStructure dataStructure;

	/**
	 * The cached value of the '{@link #getPreprocessing() <em>Preprocessing</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingTechnique> preprocessing;

	/**
	 * The cached value of the '{@link #getDatasetManipulationLibrary() <em>Dataset Manipulation Library</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetManipulationLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetManipulationLibrary> datasetManipulationLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getIndipendentVariables() {
		if (indipendentVariables == null) {
			indipendentVariables = new EObjectContainmentEList<Variable>(Variable.class, this, LowcodersPackage.DATASET__INDIPENDENT_VARIABLES);
		}
		return indipendentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStructure getDataStructure() {
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStructure(DataStructure newDataStructure, NotificationChain msgs) {
		DataStructure oldDataStructure = dataStructure;
		dataStructure = newDataStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__DATA_STRUCTURE, oldDataStructure, newDataStructure);
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
	public void setDataStructure(DataStructure newDataStructure) {
		if (newDataStructure != dataStructure) {
			NotificationChain msgs = null;
			if (dataStructure != null)
				msgs = ((InternalEObject)dataStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.DATASET__DATA_STRUCTURE, null, msgs);
			if (newDataStructure != null)
				msgs = ((InternalEObject)newDataStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.DATASET__DATA_STRUCTURE, null, msgs);
			msgs = basicSetDataStructure(newDataStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__DATA_STRUCTURE, newDataStructure, newDataStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreprocessingTechnique> getPreprocessing() {
		if (preprocessing == null) {
			preprocessing = new EDataTypeUniqueEList<PreprocessingTechnique>(PreprocessingTechnique.class, this, LowcodersPackage.DATASET__PREPROCESSING);
		}
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetManipulationLibrary> getDatasetManipulationLibrary() {
		if (datasetManipulationLibrary == null) {
			datasetManipulationLibrary = new EDataTypeUniqueEList<DatasetManipulationLibrary>(DatasetManipulationLibrary.class, this, LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY);
		}
		return datasetManipulationLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
				return ((InternalEList<?>)getIndipendentVariables()).basicRemove(otherEnd, msgs);
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
				return basicSetDataStructure(null, msgs);
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
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
				return getIndipendentVariables();
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
				return getDataStructure();
			case LowcodersPackage.DATASET__PREPROCESSING:
				return getPreprocessing();
			case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
				return getDatasetManipulationLibrary();
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
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
				getIndipendentVariables().clear();
				getIndipendentVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
				setDataStructure((DataStructure)newValue);
				return;
			case LowcodersPackage.DATASET__PREPROCESSING:
				getPreprocessing().clear();
				getPreprocessing().addAll((Collection<? extends PreprocessingTechnique>)newValue);
				return;
			case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
				getDatasetManipulationLibrary().clear();
				getDatasetManipulationLibrary().addAll((Collection<? extends DatasetManipulationLibrary>)newValue);
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
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
				getIndipendentVariables().clear();
				return;
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
				setDataStructure((DataStructure)null);
				return;
			case LowcodersPackage.DATASET__PREPROCESSING:
				getPreprocessing().clear();
				return;
			case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
				getDatasetManipulationLibrary().clear();
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
			case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
				return indipendentVariables != null && !indipendentVariables.isEmpty();
			case LowcodersPackage.DATASET__DATA_STRUCTURE:
				return dataStructure != null;
			case LowcodersPackage.DATASET__PREPROCESSING:
				return preprocessing != null && !preprocessing.isEmpty();
			case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
				return datasetManipulationLibrary != null && !datasetManipulationLibrary.isEmpty();
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
		result.append(" (preprocessing: ");
		result.append(preprocessing);
		result.append(", datasetManipulationLibrary: ");
		result.append(datasetManipulationLibrary);
		result.append(')');
		return result.toString();
	}

} //DatasetImpl
