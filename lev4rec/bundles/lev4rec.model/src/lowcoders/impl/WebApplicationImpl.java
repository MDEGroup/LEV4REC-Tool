/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.PresentationLayer;
import lowcoders.RecommendedItem;
import lowcoders.WebApplication;

import lowcoders.WebInterfaceLibrary;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.WebApplicationImpl#getRecommendations <em>Recommendations</em>}</li>
 *   <li>{@link lowcoders.impl.WebApplicationImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link lowcoders.impl.WebApplicationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link lowcoders.impl.WebApplicationImpl#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends NamedElementImpl implements WebApplication {
	/**
	 * The cached value of the '{@link #getRecommendations() <em>Recommendations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendations()
	 * @generated
	 * @ordered
	 */
	protected RecommendedItem recommendations;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final WebInterfaceLibrary LIBRARY_EDEFAULT = WebInterfaceLibrary.FLASK;
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected WebInterfaceLibrary library = LIBRARY_EDEFAULT;
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.WEB_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendedItem getRecommendations() {
		if (recommendations != null && recommendations.eIsProxy()) {
			InternalEObject oldRecommendations = (InternalEObject)recommendations;
			recommendations = (RecommendedItem)eResolveProxy(oldRecommendations);
			if (recommendations != oldRecommendations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS, oldRecommendations, recommendations));
			}
		}
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendedItem basicGetRecommendations() {
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendations(RecommendedItem newRecommendations) {
		RecommendedItem oldRecommendations = recommendations;
		recommendations = newRecommendations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS, oldRecommendations, recommendations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebInterfaceLibrary getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(WebInterfaceLibrary newLibrary) {
		WebInterfaceLibrary oldLibrary = library;
		library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_APPLICATION__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_APPLICATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_APPLICATION__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				if (resolve) return getRecommendations();
				return basicGetRecommendations();
			case LowcodersPackage.WEB_APPLICATION__LIBRARY:
				return getLibrary();
			case LowcodersPackage.WEB_APPLICATION__PORT:
				return getPort();
			case LowcodersPackage.WEB_APPLICATION__HOST:
				return getHost();
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
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				setRecommendations((RecommendedItem)newValue);
				return;
			case LowcodersPackage.WEB_APPLICATION__LIBRARY:
				setLibrary((WebInterfaceLibrary)newValue);
				return;
			case LowcodersPackage.WEB_APPLICATION__PORT:
				setPort((String)newValue);
				return;
			case LowcodersPackage.WEB_APPLICATION__HOST:
				setHost((String)newValue);
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
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				setRecommendations((RecommendedItem)null);
				return;
			case LowcodersPackage.WEB_APPLICATION__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case LowcodersPackage.WEB_APPLICATION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case LowcodersPackage.WEB_APPLICATION__HOST:
				setHost(HOST_EDEFAULT);
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
			case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS:
				return recommendations != null;
			case LowcodersPackage.WEB_APPLICATION__LIBRARY:
				return library != LIBRARY_EDEFAULT;
			case LowcodersPackage.WEB_APPLICATION__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case LowcodersPackage.WEB_APPLICATION__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PresentationLayer.class) {
			switch (derivedFeatureID) {
				case LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS: return LowcodersPackage.PRESENTATION_LAYER__RECOMMENDATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PresentationLayer.class) {
			switch (baseFeatureID) {
				case LowcodersPackage.PRESENTATION_LAYER__RECOMMENDATIONS: return LowcodersPackage.WEB_APPLICATION__RECOMMENDATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (library: ");
		result.append(library);
		result.append(", port: ");
		result.append(port);
		result.append(", host: ");
		result.append(host);
		result.append(')');
		return result.toString();
	}

} //WebApplicationImpl
