/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lev4recgrammar.first.rsDsl.ActivationType;
import org.xtext.lev4recgrammar.first.rsDsl.FeedForwardNN;
import org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage;
import org.xtext.lev4recgrammar.first.rsDsl.SolverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feed Forward NN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getNumEpochs <em>Num Epochs</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getLearningRate <em>Learning Rate</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getMiniBatchSize <em>Mini Batch Size</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FeedForwardNNImpl#getRandomState <em>Random State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedForwardNNImpl extends RecommendationSystemImpl implements FeedForwardNN
{
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
  protected FeedForwardNNImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RsDslPackage.Literals.FEED_FORWARD_NN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumEpochs()
  {
    return numEpochs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumEpochs(int newNumEpochs)
  {
    int oldNumEpochs = numEpochs;
    numEpochs = newNumEpochs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__NUM_EPOCHS, oldNumEpochs, numEpochs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLearningRate()
  {
    return learningRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLearningRate(int newLearningRate)
  {
    int oldLearningRate = learningRate;
    learningRate = newLearningRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__LEARNING_RATE, oldLearningRate, learningRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMiniBatchSize()
  {
    return miniBatchSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMiniBatchSize(int newMiniBatchSize)
  {
    int oldMiniBatchSize = miniBatchSize;
    miniBatchSize = newMiniBatchSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__MINI_BATCH_SIZE, oldMiniBatchSize, miniBatchSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SolverType getSolver()
  {
    return solver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSolver(SolverType newSolver)
  {
    SolverType oldSolver = solver;
    solver = newSolver == null ? SOLVER_EDEFAULT : newSolver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__SOLVER, oldSolver, solver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlpha(float newAlpha)
  {
    float oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__ALPHA, oldAlpha, alpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActivationType getActivationFunction()
  {
    return activationFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActivationFunction(ActivationType newActivationFunction)
  {
    ActivationType oldActivationFunction = activationFunction;
    activationFunction = newActivationFunction == null ? ACTIVATION_FUNCTION_EDEFAULT : newActivationFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRandomState()
  {
    return randomState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRandomState(int newRandomState)
  {
    int oldRandomState = randomState;
    randomState = newRandomState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FEED_FORWARD_NN__RANDOM_STATE, oldRandomState, randomState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RsDslPackage.FEED_FORWARD_NN__NUM_EPOCHS:
        return getNumEpochs();
      case RsDslPackage.FEED_FORWARD_NN__LEARNING_RATE:
        return getLearningRate();
      case RsDslPackage.FEED_FORWARD_NN__MINI_BATCH_SIZE:
        return getMiniBatchSize();
      case RsDslPackage.FEED_FORWARD_NN__SOLVER:
        return getSolver();
      case RsDslPackage.FEED_FORWARD_NN__ALPHA:
        return getAlpha();
      case RsDslPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
        return getActivationFunction();
      case RsDslPackage.FEED_FORWARD_NN__RANDOM_STATE:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RsDslPackage.FEED_FORWARD_NN__NUM_EPOCHS:
        setNumEpochs((Integer)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__LEARNING_RATE:
        setLearningRate((Integer)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__MINI_BATCH_SIZE:
        setMiniBatchSize((Integer)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__SOLVER:
        setSolver((SolverType)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__ALPHA:
        setAlpha((Float)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
        setActivationFunction((ActivationType)newValue);
        return;
      case RsDslPackage.FEED_FORWARD_NN__RANDOM_STATE:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RsDslPackage.FEED_FORWARD_NN__NUM_EPOCHS:
        setNumEpochs(NUM_EPOCHS_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__LEARNING_RATE:
        setLearningRate(LEARNING_RATE_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__MINI_BATCH_SIZE:
        setMiniBatchSize(MINI_BATCH_SIZE_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__SOLVER:
        setSolver(SOLVER_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__ALPHA:
        setAlpha(ALPHA_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
        setActivationFunction(ACTIVATION_FUNCTION_EDEFAULT);
        return;
      case RsDslPackage.FEED_FORWARD_NN__RANDOM_STATE:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RsDslPackage.FEED_FORWARD_NN__NUM_EPOCHS:
        return numEpochs != NUM_EPOCHS_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__LEARNING_RATE:
        return learningRate != LEARNING_RATE_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__MINI_BATCH_SIZE:
        return miniBatchSize != MINI_BATCH_SIZE_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__SOLVER:
        return solver != SOLVER_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__ALPHA:
        return alpha != ALPHA_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__ACTIVATION_FUNCTION:
        return activationFunction != ACTIVATION_FUNCTION_EDEFAULT;
      case RsDslPackage.FEED_FORWARD_NN__RANDOM_STATE:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (numEpochs: ");
    result.append(numEpochs);
    result.append(", learningRate: ");
    result.append(learningRate);
    result.append(", miniBatchSize: ");
    result.append(miniBatchSize);
    result.append(", solver: ");
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