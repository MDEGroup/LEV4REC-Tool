/**
 */
package lowcoders.impl;

import java.util.Collection;

import lowcoders.LowcodersPackage;
import lowcoders.RecommendationHandler;
import lowcoders.VSCodePlugin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VS Code Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.VSCodePluginImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSCodePluginImpl extends IDEIntegrationImpl implements VSCodePlugin {
	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendationHandler> handler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSCodePluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.VS_CODE_PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecommendationHandler> getHandler() {
		if (handler == null) {
			handler = new EObjectResolvingEList<RecommendationHandler>(RecommendationHandler.class, this, LowcodersPackage.VS_CODE_PLUGIN__HANDLER);
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.VS_CODE_PLUGIN__HANDLER:
				return getHandler();
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
			case LowcodersPackage.VS_CODE_PLUGIN__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends RecommendationHandler>)newValue);
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
			case LowcodersPackage.VS_CODE_PLUGIN__HANDLER:
				getHandler().clear();
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
			case LowcodersPackage.VS_CODE_PLUGIN__HANDLER:
				return handler != null && !handler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSCodePluginImpl
