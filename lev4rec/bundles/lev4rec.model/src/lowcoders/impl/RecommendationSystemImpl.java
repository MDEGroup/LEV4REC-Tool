/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.LowcodersPackage;
import lowcoders.PyLibType;
import lowcoders.RecommendationContext;
import lowcoders.RecommendationSetting;
import lowcoders.RecommendationSystem;
import lowcoders.RecommendedItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.RecommendationSystemImpl#getRecommenderSettings <em>Recommender Settings</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationSystemImpl#getRecommendationScope <em>Recommendation Scope</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationSystemImpl#getRecommendationContext <em>Recommendation Context</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationSystemImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RecommendationSystemImpl extends NamedElementImpl implements RecommendationSystem {
	/**
	 * The cached value of the '{@link #getRecommenderSettings() <em>Recommender Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommenderSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendationSetting> recommenderSettings;

	/**
	 * The cached value of the '{@link #getRecommendationScope() <em>Recommendation Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationScope()
	 * @generated
	 * @ordered
	 */
	protected RecommendedItem recommendationScope;

	/**
	 * The cached value of the '{@link #getRecommendationContext() <em>Recommendation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationContext()
	 * @generated
	 * @ordered
	 */
	protected RecommendationContext recommendationContext;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final PyLibType GENERATOR_EDEFAULT = PyLibType.SKLEARN;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected PyLibType generator = GENERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecommendationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.RECOMMENDATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecommendationSetting> getRecommenderSettings() {
		if (recommenderSettings == null) {
			recommenderSettings = new EObjectContainmentEList<RecommendationSetting>(RecommendationSetting.class, this, LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS);
		}
		return recommenderSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendedItem getRecommendationScope() {
		return recommendationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendationScope(RecommendedItem newRecommendationScope, NotificationChain msgs) {
		RecommendedItem oldRecommendationScope = recommendationScope;
		recommendationScope = newRecommendationScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE, oldRecommendationScope, newRecommendationScope);
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
	public void setRecommendationScope(RecommendedItem newRecommendationScope) {
		if (newRecommendationScope != recommendationScope) {
			NotificationChain msgs = null;
			if (recommendationScope != null)
				msgs = ((InternalEObject)recommendationScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE, null, msgs);
			if (newRecommendationScope != null)
				msgs = ((InternalEObject)newRecommendationScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE, null, msgs);
			msgs = basicSetRecommendationScope(newRecommendationScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE, newRecommendationScope, newRecommendationScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationContext getRecommendationContext() {
		return recommendationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendationContext(RecommendationContext newRecommendationContext, NotificationChain msgs) {
		RecommendationContext oldRecommendationContext = recommendationContext;
		recommendationContext = newRecommendationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT, oldRecommendationContext, newRecommendationContext);
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
	public void setRecommendationContext(RecommendationContext newRecommendationContext) {
		if (newRecommendationContext != recommendationContext) {
			NotificationChain msgs = null;
			if (recommendationContext != null)
				msgs = ((InternalEObject)recommendationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT, null, msgs);
			if (newRecommendationContext != null)
				msgs = ((InternalEObject)newRecommendationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT, null, msgs);
			msgs = basicSetRecommendationContext(newRecommendationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT, newRecommendationContext, newRecommendationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PyLibType getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerator(PyLibType newGenerator) {
		PyLibType oldGenerator = generator;
		generator = newGenerator == null ? GENERATOR_EDEFAULT : newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS:
				return ((InternalEList<?>)getRecommenderSettings()).basicRemove(otherEnd, msgs);
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE:
				return basicSetRecommendationScope(null, msgs);
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT:
				return basicSetRecommendationContext(null, msgs);
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
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS:
				return getRecommenderSettings();
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE:
				return getRecommendationScope();
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT:
				return getRecommendationContext();
			case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
				return getGenerator();
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
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS:
				getRecommenderSettings().clear();
				getRecommenderSettings().addAll((Collection<? extends RecommendationSetting>)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE:
				setRecommendationScope((RecommendedItem)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT:
				setRecommendationContext((RecommendationContext)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
				setGenerator((PyLibType)newValue);
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
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS:
				getRecommenderSettings().clear();
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE:
				setRecommendationScope((RecommendedItem)null);
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT:
				setRecommendationContext((RecommendationContext)null);
				return;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
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
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS:
				return recommenderSettings != null && !recommenderSettings.isEmpty();
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE:
				return recommendationScope != null;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT:
				return recommendationContext != null;
			case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
				return generator != GENERATOR_EDEFAULT;
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
		result.append(" (generator: ");
		result.append(generator);
		result.append(')');
		return result.toString();
	}

} //RecommendationSystemImpl
