/**
 */
package lowcoders.impl;

import lowcoders.AdditiveFeedback;
import lowcoders.LowcodersPackage;
import lowcoders.RecommendationSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.AdditiveFeedbackImpl#getNumOfInsertion <em>Num Of Insertion</em>}</li>
 *   <li>{@link lowcoders.impl.AdditiveFeedbackImpl#getRecommender <em>Recommender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditiveFeedbackImpl extends FeedbackImpl implements AdditiveFeedback {
	/**
	 * The default value of the '{@link #getNumOfInsertion() <em>Num Of Insertion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfInsertion()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_INSERTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfInsertion() <em>Num Of Insertion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfInsertion()
	 * @generated
	 * @ordered
	 */
	protected int numOfInsertion = NUM_OF_INSERTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecommender() <em>Recommender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommender()
	 * @generated
	 * @ordered
	 */
	protected RecommendationSystem recommender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditiveFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.ADDITIVE_FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOfInsertion() {
		return numOfInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfInsertion(int newNumOfInsertion) {
		int oldNumOfInsertion = numOfInsertion;
		numOfInsertion = newNumOfInsertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.ADDITIVE_FEEDBACK__NUM_OF_INSERTION, oldNumOfInsertion, numOfInsertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationSystem getRecommender() {
		if (recommender != null && recommender.eIsProxy()) {
			InternalEObject oldRecommender = (InternalEObject)recommender;
			recommender = (RecommendationSystem)eResolveProxy(oldRecommender);
			if (recommender != oldRecommender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER, oldRecommender, recommender));
			}
		}
		return recommender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationSystem basicGetRecommender() {
		return recommender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommender(RecommendationSystem newRecommender) {
		RecommendationSystem oldRecommender = recommender;
		recommender = newRecommender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER, oldRecommender, recommender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.ADDITIVE_FEEDBACK__NUM_OF_INSERTION:
				return getNumOfInsertion();
			case LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER:
				if (resolve) return getRecommender();
				return basicGetRecommender();
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
			case LowcodersPackage.ADDITIVE_FEEDBACK__NUM_OF_INSERTION:
				setNumOfInsertion((Integer)newValue);
				return;
			case LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER:
				setRecommender((RecommendationSystem)newValue);
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
			case LowcodersPackage.ADDITIVE_FEEDBACK__NUM_OF_INSERTION:
				setNumOfInsertion(NUM_OF_INSERTION_EDEFAULT);
				return;
			case LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER:
				setRecommender((RecommendationSystem)null);
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
			case LowcodersPackage.ADDITIVE_FEEDBACK__NUM_OF_INSERTION:
				return numOfInsertion != NUM_OF_INSERTION_EDEFAULT;
			case LowcodersPackage.ADDITIVE_FEEDBACK__RECOMMENDER:
				return recommender != null;
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
		result.append(" (numOfInsertion: ");
		result.append(numOfInsertion);
		result.append(')');
		return result.toString();
	}

} //AdditiveFeedbackImpl
