/**
 */
package lowcoders.impl;

import lowcoders.ContextValidation;
import lowcoders.LowcodersPackage;
import lowcoders.RecommendationContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.ContextValidationImpl#getTestContext <em>Test Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextValidationImpl extends ValidationTechniqueImpl implements ContextValidation {
	/**
	 * The cached value of the '{@link #getTestContext() <em>Test Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestContext()
	 * @generated
	 * @ordered
	 */
	protected RecommendationContext testContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.CONTEXT_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationContext getTestContext() {
		if (testContext != null && testContext.eIsProxy()) {
			InternalEObject oldTestContext = (InternalEObject)testContext;
			testContext = (RecommendationContext)eResolveProxy(oldTestContext);
			if (testContext != oldTestContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT, oldTestContext, testContext));
			}
		}
		return testContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationContext basicGetTestContext() {
		return testContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestContext(RecommendationContext newTestContext) {
		RecommendationContext oldTestContext = testContext;
		testContext = newTestContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT, oldTestContext, testContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT:
				if (resolve) return getTestContext();
				return basicGetTestContext();
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
			case LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT:
				setTestContext((RecommendationContext)newValue);
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
			case LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT:
				setTestContext((RecommendationContext)null);
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
			case LowcodersPackage.CONTEXT_VALIDATION__TEST_CONTEXT:
				return testContext != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextValidationImpl
