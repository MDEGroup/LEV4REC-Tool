/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.LowcodersPackage;
import lowcoders.RecommendationContext;
import lowcoders.RecommendationHandler;
import lowcoders.RecommendationUsage;
import lowcoders.WebIService;

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
 * An implementation of the model object '<em><b>Recommendation Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.RecommendationHandlerImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationHandlerImpl#getWebService <em>Web Service</em>}</li>
 *   <li>{@link lowcoders.impl.RecommendationHandlerImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationHandlerImpl extends NamedElementImpl implements RecommendationHandler {
	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendationUsage> usage;

	/**
	 * The cached value of the '{@link #getWebService() <em>Web Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebService()
	 * @generated
	 * @ordered
	 */
	protected WebIService webService;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected RecommendationContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecommendationHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.RECOMMENDATION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecommendationUsage> getUsage() {
		if (usage == null) {
			usage = new EObjectContainmentEList<RecommendationUsage>(RecommendationUsage.class, this, LowcodersPackage.RECOMMENDATION_HANDLER__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebIService getWebService() {
		if (webService != null && webService.eIsProxy()) {
			InternalEObject oldWebService = (InternalEObject)webService;
			webService = (WebIService)eResolveProxy(oldWebService);
			if (webService != oldWebService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE, oldWebService, webService));
			}
		}
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebIService basicGetWebService() {
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebService(WebIService newWebService) {
		WebIService oldWebService = webService;
		webService = newWebService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE, oldWebService, webService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (RecommendationContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(RecommendationContext newContext) {
		RecommendationContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.RECOMMENDATION_HANDLER__USAGE:
				return ((InternalEList<?>)getUsage()).basicRemove(otherEnd, msgs);
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
			case LowcodersPackage.RECOMMENDATION_HANDLER__USAGE:
				return getUsage();
			case LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE:
				if (resolve) return getWebService();
				return basicGetWebService();
			case LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case LowcodersPackage.RECOMMENDATION_HANDLER__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends RecommendationUsage>)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE:
				setWebService((WebIService)newValue);
				return;
			case LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT:
				setContext((RecommendationContext)newValue);
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
			case LowcodersPackage.RECOMMENDATION_HANDLER__USAGE:
				getUsage().clear();
				return;
			case LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE:
				setWebService((WebIService)null);
				return;
			case LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT:
				setContext((RecommendationContext)null);
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
			case LowcodersPackage.RECOMMENDATION_HANDLER__USAGE:
				return usage != null && !usage.isEmpty();
			case LowcodersPackage.RECOMMENDATION_HANDLER__WEB_SERVICE:
				return webService != null;
			case LowcodersPackage.RECOMMENDATION_HANDLER__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //RecommendationHandlerImpl
