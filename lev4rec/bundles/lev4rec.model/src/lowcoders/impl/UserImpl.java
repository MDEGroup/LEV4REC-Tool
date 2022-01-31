/**
 */
package lowcoders.impl;

import lowcoders.Feedback;
import lowcoders.LowcodersPackage;
import lowcoders.RecommendationContext;
import lowcoders.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.UserImpl#getExpressedFeedback <em>Expressed Feedback</em>}</li>
 *   <li>{@link lowcoders.impl.UserImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends NamedElementImpl implements User {
	/**
	 * The cached value of the '{@link #getExpressedFeedback() <em>Expressed Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressedFeedback()
	 * @generated
	 * @ordered
	 */
	protected Feedback expressedFeedback;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected RecommendationContext query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feedback getExpressedFeedback() {
		if (expressedFeedback != null && expressedFeedback.eIsProxy()) {
			InternalEObject oldExpressedFeedback = (InternalEObject)expressedFeedback;
			expressedFeedback = (Feedback)eResolveProxy(oldExpressedFeedback);
			if (expressedFeedback != oldExpressedFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.USER__EXPRESSED_FEEDBACK, oldExpressedFeedback, expressedFeedback));
			}
		}
		return expressedFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetExpressedFeedback() {
		return expressedFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressedFeedback(Feedback newExpressedFeedback) {
		Feedback oldExpressedFeedback = expressedFeedback;
		expressedFeedback = newExpressedFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.USER__EXPRESSED_FEEDBACK, oldExpressedFeedback, expressedFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationContext getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (RecommendationContext)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.USER__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationContext basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(RecommendationContext newQuery) {
		RecommendationContext oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.USER__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.USER__EXPRESSED_FEEDBACK:
				if (resolve) return getExpressedFeedback();
				return basicGetExpressedFeedback();
			case LowcodersPackage.USER__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
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
			case LowcodersPackage.USER__EXPRESSED_FEEDBACK:
				setExpressedFeedback((Feedback)newValue);
				return;
			case LowcodersPackage.USER__QUERY:
				setQuery((RecommendationContext)newValue);
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
			case LowcodersPackage.USER__EXPRESSED_FEEDBACK:
				setExpressedFeedback((Feedback)null);
				return;
			case LowcodersPackage.USER__QUERY:
				setQuery((RecommendationContext)null);
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
			case LowcodersPackage.USER__EXPRESSED_FEEDBACK:
				return expressedFeedback != null;
			case LowcodersPackage.USER__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
