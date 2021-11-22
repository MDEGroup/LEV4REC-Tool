/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.Evaluation;
import lowcoders.LowcodersPackage;
import lowcoders.Metric;
import lowcoders.ValidationTechnique;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.EvaluationImpl#getBaselines <em>Baselines</em>}</li>
 *   <li>{@link lowcoders.impl.EvaluationImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link lowcoders.impl.EvaluationImpl#getValidationtechnique <em>Validationtechnique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends NamedElementImpl implements Evaluation {
	/**
	 * The cached value of the '{@link #getBaselines() <em>Baselines</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> baselines;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metrics;

	/**
	 * The cached value of the '{@link #getValidationtechnique() <em>Validationtechnique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationtechnique()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationTechnique> validationtechnique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBaselines() {
		if (baselines == null) {
			baselines = new EDataTypeUniqueEList<String>(String.class, this, LowcodersPackage.EVALUATION__BASELINES);
		}
		return baselines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metric> getMetrics() {
		if (metrics == null) {
			metrics = new EDataTypeUniqueEList<Metric>(Metric.class, this, LowcodersPackage.EVALUATION__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidationTechnique> getValidationtechnique() {
		if (validationtechnique == null) {
			validationtechnique = new EObjectContainmentEList<ValidationTechnique>(ValidationTechnique.class, this, LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE);
		}
		return validationtechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE:
				return ((InternalEList<?>)getValidationtechnique()).basicRemove(otherEnd, msgs);
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
			case LowcodersPackage.EVALUATION__BASELINES:
				return getBaselines();
			case LowcodersPackage.EVALUATION__METRICS:
				return getMetrics();
			case LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE:
				return getValidationtechnique();
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
			case LowcodersPackage.EVALUATION__BASELINES:
				getBaselines().clear();
				getBaselines().addAll((Collection<? extends String>)newValue);
				return;
			case LowcodersPackage.EVALUATION__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE:
				getValidationtechnique().clear();
				getValidationtechnique().addAll((Collection<? extends ValidationTechnique>)newValue);
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
			case LowcodersPackage.EVALUATION__BASELINES:
				getBaselines().clear();
				return;
			case LowcodersPackage.EVALUATION__METRICS:
				getMetrics().clear();
				return;
			case LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE:
				getValidationtechnique().clear();
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
			case LowcodersPackage.EVALUATION__BASELINES:
				return baselines != null && !baselines.isEmpty();
			case LowcodersPackage.EVALUATION__METRICS:
				return metrics != null && !metrics.isEmpty();
			case LowcodersPackage.EVALUATION__VALIDATIONTECHNIQUE:
				return validationtechnique != null && !validationtechnique.isEmpty();
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
		result.append(" (baselines: ");
		result.append(baselines);
		result.append(", metrics: ");
		result.append(metrics);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
