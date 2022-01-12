/**
 */
package lowcoders.impl;

import lowcoders.DataStructure;
import lowcoders.LowcodersPackage;
import lowcoders.RecommendationContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.RecommendationContextImpl#getUserContext <em>User Context</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationContextImpl#isIsProactiveSystem <em>Is Proactive System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationContextImpl extends NamedElementImpl implements RecommendationContext {
	/**
	 * The cached value of the '{@link #getUserContext() <em>User Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserContext()
	 * @generated
	 * @ordered
	 */
	protected DataStructure userContext;

	/**
	 * The default value of the '{@link #isIsProactiveSystem() <em>Is Proactive System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProactiveSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROACTIVE_SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProactiveSystem() <em>Is Proactive System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProactiveSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean isProactiveSystem = IS_PROACTIVE_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecommendationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.RECOMMENDATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStructure getUserContext() {
		if (userContext != null && userContext.eIsProxy()) {
			InternalEObject oldUserContext = (InternalEObject)userContext;
			userContext = (DataStructure)eResolveProxy(oldUserContext);
			if (userContext != oldUserContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT, oldUserContext, userContext));
			}
		}
		return userContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure basicGetUserContext() {
		return userContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserContext(DataStructure newUserContext) {
		DataStructure oldUserContext = userContext;
		userContext = newUserContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT, oldUserContext, userContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsProactiveSystem() {
		return isProactiveSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsProactiveSystem(boolean newIsProactiveSystem) {
		boolean oldIsProactiveSystem = isProactiveSystem;
		isProactiveSystem = newIsProactiveSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM, oldIsProactiveSystem, isProactiveSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT:
				if (resolve) return getUserContext();
				return basicGetUserContext();
			case LowcodersPackage.RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM:
				return isIsProactiveSystem();
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
			case LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT:
				setUserContext((DataStructure)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM:
				setIsProactiveSystem((Boolean)newValue);
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
			case LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT:
				setUserContext((DataStructure)null);
				return;
			case LowcodersPackage.RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM:
				setIsProactiveSystem(IS_PROACTIVE_SYSTEM_EDEFAULT);
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
			case LowcodersPackage.RECOMMENDATION_CONTEXT__USER_CONTEXT:
				return userContext != null;
			case LowcodersPackage.RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM:
				return isProactiveSystem != IS_PROACTIVE_SYSTEM_EDEFAULT;
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
		result.append(" (isProactiveSystem: ");
		result.append(isProactiveSystem);
		result.append(')');
		return result.toString();
	}

} //RecommendationContextImpl
