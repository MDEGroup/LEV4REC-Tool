/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.lev4recgrammar.first.lowcoders.Dataset;
import org.xtext.lev4recgrammar.first.lowcoders.Evaluation;
import org.xtext.lev4recgrammar.first.lowcoders.FeedbackComponent;
import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.PresentationLayer;
import org.xtext.lev4recgrammar.first.lowcoders.RSModel;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendationSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getPresentationLayer <em>Presentation Layer</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getRecommendationSystem <em>Recommendation System</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RSModelImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSModelImpl extends MinimalEObjectImpl.Container implements RSModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataset()
   * @generated
   * @ordered
   */
  protected Dataset dataset;

  /**
   * The cached value of the '{@link #getPresentationLayer() <em>Presentation Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationLayer()
   * @generated
   * @ordered
   */
  protected PresentationLayer presentationLayer;

  /**
   * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected Evaluation evaluation;

  /**
   * The cached value of the '{@link #getRecommendationSystem() <em>Recommendation System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecommendationSystem()
   * @generated
   * @ordered
   */
  protected RecommendationSystem recommendationSystem;

  /**
   * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedback()
   * @generated
   * @ordered
   */
  protected FeedbackComponent feedback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RSModelImpl()
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
    return LowcodersPackage.Literals.RS_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dataset getDataset()
  {
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataset(Dataset newDataset, NotificationChain msgs)
  {
    Dataset oldDataset = dataset;
    dataset = newDataset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__DATASET, oldDataset, newDataset);
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
  public void setDataset(Dataset newDataset)
  {
    if (newDataset != dataset)
    {
      NotificationChain msgs = null;
      if (dataset != null)
        msgs = ((InternalEObject)dataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__DATASET, null, msgs);
      if (newDataset != null)
        msgs = ((InternalEObject)newDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__DATASET, null, msgs);
      msgs = basicSetDataset(newDataset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__DATASET, newDataset, newDataset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PresentationLayer getPresentationLayer()
  {
    return presentationLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPresentationLayer(PresentationLayer newPresentationLayer, NotificationChain msgs)
  {
    PresentationLayer oldPresentationLayer = presentationLayer;
    presentationLayer = newPresentationLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__PRESENTATION_LAYER, oldPresentationLayer, newPresentationLayer);
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
  public void setPresentationLayer(PresentationLayer newPresentationLayer)
  {
    if (newPresentationLayer != presentationLayer)
    {
      NotificationChain msgs = null;
      if (presentationLayer != null)
        msgs = ((InternalEObject)presentationLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__PRESENTATION_LAYER, null, msgs);
      if (newPresentationLayer != null)
        msgs = ((InternalEObject)newPresentationLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__PRESENTATION_LAYER, null, msgs);
      msgs = basicSetPresentationLayer(newPresentationLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__PRESENTATION_LAYER, newPresentationLayer, newPresentationLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Evaluation getEvaluation()
  {
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs)
  {
    Evaluation oldEvaluation = evaluation;
    evaluation = newEvaluation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__EVALUATION, oldEvaluation, newEvaluation);
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
  public void setEvaluation(Evaluation newEvaluation)
  {
    if (newEvaluation != evaluation)
    {
      NotificationChain msgs = null;
      if (evaluation != null)
        msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__EVALUATION, null, msgs);
      if (newEvaluation != null)
        msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__EVALUATION, null, msgs);
      msgs = basicSetEvaluation(newEvaluation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__EVALUATION, newEvaluation, newEvaluation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecommendationSystem getRecommendationSystem()
  {
    return recommendationSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecommendationSystem(RecommendationSystem newRecommendationSystem, NotificationChain msgs)
  {
    RecommendationSystem oldRecommendationSystem = recommendationSystem;
    recommendationSystem = newRecommendationSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM, oldRecommendationSystem, newRecommendationSystem);
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
  public void setRecommendationSystem(RecommendationSystem newRecommendationSystem)
  {
    if (newRecommendationSystem != recommendationSystem)
    {
      NotificationChain msgs = null;
      if (recommendationSystem != null)
        msgs = ((InternalEObject)recommendationSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM, null, msgs);
      if (newRecommendationSystem != null)
        msgs = ((InternalEObject)newRecommendationSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM, null, msgs);
      msgs = basicSetRecommendationSystem(newRecommendationSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM, newRecommendationSystem, newRecommendationSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeedbackComponent getFeedback()
  {
    return feedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeedback(FeedbackComponent newFeedback, NotificationChain msgs)
  {
    FeedbackComponent oldFeedback = feedback;
    feedback = newFeedback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__FEEDBACK, oldFeedback, newFeedback);
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
  public void setFeedback(FeedbackComponent newFeedback)
  {
    if (newFeedback != feedback)
    {
      NotificationChain msgs = null;
      if (feedback != null)
        msgs = ((InternalEObject)feedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__FEEDBACK, null, msgs);
      if (newFeedback != null)
        msgs = ((InternalEObject)newFeedback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RS_MODEL__FEEDBACK, null, msgs);
      msgs = basicSetFeedback(newFeedback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RS_MODEL__FEEDBACK, newFeedback, newFeedback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LowcodersPackage.RS_MODEL__DATASET:
        return basicSetDataset(null, msgs);
      case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
        return basicSetPresentationLayer(null, msgs);
      case LowcodersPackage.RS_MODEL__EVALUATION:
        return basicSetEvaluation(null, msgs);
      case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
        return basicSetRecommendationSystem(null, msgs);
      case LowcodersPackage.RS_MODEL__FEEDBACK:
        return basicSetFeedback(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LowcodersPackage.RS_MODEL__NAME:
        return getName();
      case LowcodersPackage.RS_MODEL__DATASET:
        return getDataset();
      case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
        return getPresentationLayer();
      case LowcodersPackage.RS_MODEL__EVALUATION:
        return getEvaluation();
      case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
        return getRecommendationSystem();
      case LowcodersPackage.RS_MODEL__FEEDBACK:
        return getFeedback();
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
      case LowcodersPackage.RS_MODEL__NAME:
        setName((String)newValue);
        return;
      case LowcodersPackage.RS_MODEL__DATASET:
        setDataset((Dataset)newValue);
        return;
      case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)newValue);
        return;
      case LowcodersPackage.RS_MODEL__EVALUATION:
        setEvaluation((Evaluation)newValue);
        return;
      case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
        setRecommendationSystem((RecommendationSystem)newValue);
        return;
      case LowcodersPackage.RS_MODEL__FEEDBACK:
        setFeedback((FeedbackComponent)newValue);
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
      case LowcodersPackage.RS_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LowcodersPackage.RS_MODEL__DATASET:
        setDataset((Dataset)null);
        return;
      case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)null);
        return;
      case LowcodersPackage.RS_MODEL__EVALUATION:
        setEvaluation((Evaluation)null);
        return;
      case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
        setRecommendationSystem((RecommendationSystem)null);
        return;
      case LowcodersPackage.RS_MODEL__FEEDBACK:
        setFeedback((FeedbackComponent)null);
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
      case LowcodersPackage.RS_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LowcodersPackage.RS_MODEL__DATASET:
        return dataset != null;
      case LowcodersPackage.RS_MODEL__PRESENTATION_LAYER:
        return presentationLayer != null;
      case LowcodersPackage.RS_MODEL__EVALUATION:
        return evaluation != null;
      case LowcodersPackage.RS_MODEL__RECOMMENDATION_SYSTEM:
        return recommendationSystem != null;
      case LowcodersPackage.RS_MODEL__FEEDBACK:
        return feedback != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RSModelImpl
