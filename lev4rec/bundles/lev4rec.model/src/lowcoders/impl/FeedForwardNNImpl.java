/**
 */
package lowcoders.impl;

import lowcoders.ActivationType;
import lowcoders.FeedForwardNN;
import lowcoders.LowcodersPackage;
import lowcoders.SolverType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feed Forward NN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.FeedForwardNNImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link lowcoders.impl.FeedForwardNNImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link lowcoders.impl.FeedForwardNNImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link lowcoders.impl.FeedForwardNNImpl#getRandomState <em>Random State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedForwardNNImpl extends MachineLearningBasedRSImpl implements FeedForwardNN {
	/**
	 * The default value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected static final SolverType SOLVER_EDEFAULT = SolverType.ADAM;

	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected SolverType solver = SOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final float ALPHA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected float alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationFunction() <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType ACTIVATION_FUNCTION_EDEFAULT = ActivationType.RELU;

	/**
	 * The cached value of the '{@link #getActivationFunction() <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected ActivationType activationFunction = ACTIVATION_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandomState() <em>Random State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomState()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandomState() <em>Random State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomState()
	 * @generated
	 * @ordered
	 */
	protected int randomState = RANDOM_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedForwardNNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.FEED_FORWARD_NN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolverType getSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolver(SolverType newSolver) {
		SolverType oldSolver = solver;
		solver = newSolver == null ? SOLVER_EDEFAULT : newSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEED_FORWARD_NN__SOLVER, oldSolver, solver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlpha(float newAlpha) {
		float oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEED_FORWARD_NN__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivationType getActivationFunction() {
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationFunction(ActivationType newActivationFunction) {
		ActivationType oldActivationFunction = activationFunction;
		activationFunction = newActivationFunction == null ? ACTIVATION_FUNCTION_EDEFAULT : newActivationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRandomState() {
		return randomState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRandomState(int newRandomState) {
		int oldRandomState = randomState;
		randomState = newRandomState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEED_FORWARD_NN__RANDOM_STATE, oldRandomState, randomState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.FEED_FORWARD_NN__SOLVER:
				return getSolver();
			case LowcodersPackage.FEED_FORWARD_NN__ALPHA:
				return getAlpha();
			case LowcodersPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
				return getActivationFunction();
			case LowcodersPackage.FEED_FORWARD_NN__RANDOM_STATE:
				return getRandomState();
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
			case LowcodersPackage.FEED_FORWARD_NN__SOLVER:
				setSolver((SolverType)newValue);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__ALPHA:
				setAlpha((Float)newValue);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationType)newValue);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__RANDOM_STATE:
				setRandomState((Integer)newValue);
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
			case LowcodersPackage.FEED_FORWARD_NN__SOLVER:
				setSolver(SOLVER_EDEFAULT);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
				setActivationFunction(ACTIVATION_FUNCTION_EDEFAULT);
				return;
			case LowcodersPackage.FEED_FORWARD_NN__RANDOM_STATE:
				setRandomState(RANDOM_STATE_EDEFAULT);
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
			case LowcodersPackage.FEED_FORWARD_NN__SOLVER:
				return solver != SOLVER_EDEFAULT;
			case LowcodersPackage.FEED_FORWARD_NN__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case LowcodersPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
				return activationFunction != ACTIVATION_FUNCTION_EDEFAULT;
			case LowcodersPackage.FEED_FORWARD_NN__RANDOM_STATE:
				return randomState != RANDOM_STATE_EDEFAULT;
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
		result.append(" (solver: ");
		result.append(solver);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", activationFunction: ");
		result.append(activationFunction);
		result.append(", randomState: ");
		result.append(randomState);
		result.append(')');
		return result.toString();
	}

} //FeedForwardNNImpl
