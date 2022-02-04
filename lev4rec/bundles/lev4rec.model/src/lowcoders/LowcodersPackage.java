/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface LowcodersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lowcoders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.disim.univaq/lowcode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lowcoders";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LowcodersPackage eINSTANCE = lowcoders.impl.LowcodersPackageImpl.init();

	/**
	 * The meta object id for the '{@link lowcoders.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.NamedElementImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.UserEventImpl <em>User Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.UserEventImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getUserEvent()
	 * @generated
	 */
	int USER_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT__EVENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>User Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DatasetImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Indipendent Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__INDIPENDENT_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATA_STRUCTURE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PREPROCESSING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dataset Manipulation Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATASET_MANIPULATION_LIBRARY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PATH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__IS_BUILT_IN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RSModelImpl <em>RS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RSModelImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRSModel()
	 * @generated
	 */
	int RS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__DATASET = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__PRESENTATION_LAYER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__EVALUATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recommendation System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__RECOMMENDATION_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL__FEEDBACK = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>RS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendationHandlerImpl <em>Recommendation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendationHandlerImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationHandler()
	 * @generated
	 */
	int RECOMMENDATION_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER__USAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER__WEB_SERVICE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recommendation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Recommendation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_HANDLER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ProactiveHandlerImpl <em>Proactive Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ProactiveHandlerImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getProactiveHandler()
	 * @generated
	 */
	int PROACTIVE_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER__NAME = RECOMMENDATION_HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER__USAGE = RECOMMENDATION_HANDLER__USAGE;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER__WEB_SERVICE = RECOMMENDATION_HANDLER__WEB_SERVICE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER__CONTEXT = RECOMMENDATION_HANDLER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER__CONDITION = RECOMMENDATION_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proactive Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER_FEATURE_COUNT = RECOMMENDATION_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proactive Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVE_HANDLER_OPERATION_COUNT = RECOMMENDATION_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ReactiveHandlerImpl <em>Reactive Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ReactiveHandlerImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getReactiveHandler()
	 * @generated
	 */
	int REACTIVE_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER__NAME = RECOMMENDATION_HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER__USAGE = RECOMMENDATION_HANDLER__USAGE;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER__WEB_SERVICE = RECOMMENDATION_HANDLER__WEB_SERVICE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER__CONTEXT = RECOMMENDATION_HANDLER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER__EVENT = RECOMMENDATION_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reactive Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER_FEATURE_COUNT = RECOMMENDATION_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reactive Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_HANDLER_OPERATION_COUNT = RECOMMENDATION_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendationUsageImpl <em>Recommendation Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendationUsageImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationUsage()
	 * @generated
	 */
	int RECOMMENDATION_USAGE = 7;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_USAGE__USAGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Recommended Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_USAGE__RECOMMENDED_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Guielements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_USAGE__GUIELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Recommendation Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_USAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recommendation Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DataSourceImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.PresentationLayerImpl <em>Presentation Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.PresentationLayerImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getPresentationLayer()
	 * @generated
	 */
	int PRESENTATION_LAYER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER__RECOMMENDATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Presentation Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Presentation Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.WebIServiceImpl <em>Web IService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.WebIServiceImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getWebIService()
	 * @generated
	 */
	int WEB_ISERVICE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ISERVICE__NAME = PRESENTATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ISERVICE__RECOMMENDATIONS = PRESENTATION_LAYER__RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ISERVICE__LIBRARY = PRESENTATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ISERVICE_FEATURE_COUNT = PRESENTATION_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ISERVICE_OPERATION_COUNT = PRESENTATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.WebApplicationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__RECOMMENDATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__LIBRARY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__PORT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__HOST = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.IDEIntegrationImpl <em>IDE Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.IDEIntegrationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getIDEIntegration()
	 * @generated
	 */
	int IDE_INTEGRATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_INTEGRATION__NAME = PRESENTATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_INTEGRATION__RECOMMENDATIONS = PRESENTATION_LAYER__RECOMMENDATIONS;

	/**
	 * The number of structural features of the '<em>IDE Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_INTEGRATION_FEATURE_COUNT = PRESENTATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDE Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_INTEGRATION_OPERATION_COUNT = PRESENTATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.VSCodePluginImpl <em>VS Code Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.VSCodePluginImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getVSCodePlugin()
	 * @generated
	 */
	int VS_CODE_PLUGIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VS_CODE_PLUGIN__NAME = IDE_INTEGRATION__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VS_CODE_PLUGIN__RECOMMENDATIONS = IDE_INTEGRATION__RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VS_CODE_PLUGIN__HANDLER = IDE_INTEGRATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VS Code Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VS_CODE_PLUGIN_FEATURE_COUNT = IDE_INTEGRATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VS Code Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VS_CODE_PLUGIN_OPERATION_COUNT = IDE_INTEGRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.TraversableGraphImpl <em>Traversable Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.TraversableGraphImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getTraversableGraph()
	 * @generated
	 */
	int TRAVERSABLE_GRAPH = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABLE_GRAPH__NAME = PRESENTATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABLE_GRAPH__RECOMMENDATIONS = PRESENTATION_LAYER__RECOMMENDATIONS;

	/**
	 * The number of structural features of the '<em>Traversable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABLE_GRAPH_FEATURE_COUNT = PRESENTATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traversable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABLE_GRAPH_OPERATION_COUNT = PRESENTATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.EvaluationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Baselines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__BASELINES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__METRICS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Technique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__VALIDATION_TECHNIQUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ValidationTechniqueImpl <em>Validation Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ValidationTechniqueImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getValidationTechnique()
	 * @generated
	 */
	int VALIDATION_TECHNIQUE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_TECHNIQUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_TECHNIQUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Validation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_TECHNIQUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.UnsupervisedDatasetImpl <em>Unsupervised Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.UnsupervisedDatasetImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getUnsupervisedDataset()
	 * @generated
	 */
	int UNSUPERVISED_DATASET = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Indipendent Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__INDIPENDENT_VARIABLES = DATASET__INDIPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__DATA_STRUCTURE = DATASET__DATA_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__PREPROCESSING = DATASET__PREPROCESSING;

	/**
	 * The feature id for the '<em><b>Dataset Manipulation Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__DATASET_MANIPULATION_LIBRARY = DATASET__DATASET_MANIPULATION_LIBRARY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__PATH = DATASET__PATH;

	/**
	 * The feature id for the '<em><b>Is Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET__IS_BUILT_IN = DATASET__IS_BUILT_IN;

	/**
	 * The number of structural features of the '<em>Unsupervised Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsupervised Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPERVISED_DATASET_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.SupervisedDatasetImpl <em>Supervised Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.SupervisedDatasetImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getSupervisedDataset()
	 * @generated
	 */
	int SUPERVISED_DATASET = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Indipendent Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__INDIPENDENT_VARIABLES = DATASET__INDIPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__DATA_STRUCTURE = DATASET__DATA_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__PREPROCESSING = DATASET__PREPROCESSING;

	/**
	 * The feature id for the '<em><b>Dataset Manipulation Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__DATASET_MANIPULATION_LIBRARY = DATASET__DATASET_MANIPULATION_LIBRARY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__PATH = DATASET__PATH;

	/**
	 * The feature id for the '<em><b>Is Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__IS_BUILT_IN = DATASET__IS_BUILT_IN;

	/**
	 * The feature id for the '<em><b>Dependat Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET__DEPENDAT_VARIABLE = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supervised Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET_FEATURE_COUNT = DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Supervised Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_DATASET_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.VariableImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DATA_SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PREPROCESSING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Missing Value Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_MISSING_VALUE_ALLOWED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_MULTIPLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.PreprocessingImpl <em>Preprocessing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.PreprocessingImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getPreprocessing()
	 * @generated
	 */
	int PREPROCESSING = 20;

	/**
	 * The feature id for the '<em><b>Preprocessig Technique</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING__PREPROCESSIG_TECHNIQUE = 0;

	/**
	 * The number of structural features of the '<em>Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.CodeRepositoryImpl <em>Code Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.CodeRepositoryImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getCodeRepository()
	 * @generated
	 */
	int CODE_REPOSITORY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REPOSITORY__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REPOSITORY__METADATA = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REPOSITORY_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REPOSITORY_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.CommunicationChannelImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getCommunicationChannel()
	 * @generated
	 */
	int COMMUNICATION_CHANNEL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__NAME = DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.BugTrackingSystemImpl <em>Bug Tracking System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.BugTrackingSystemImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getBugTrackingSystem()
	 * @generated
	 */
	int BUG_TRACKING_SYSTEM = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM__NAME = DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Bug Tracking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bug Tracking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DataStructureImpl <em>Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DataStructureImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.GraphImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = DATA_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = DATA_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RELATIONS = DATA_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = DATA_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = DATA_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.MatrixImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = DATA_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__COLUMNS = DATA_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = DATA_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = DATA_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.TreeImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NODES = GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__RELATIONS = GRAPH__RELATIONS;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.TextualContentImpl <em>Textual Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.TextualContentImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getTextualContent()
	 * @generated
	 */
	int TEXTUAL_CONTENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTENT__NAME = DATA_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTENT__CONTENTS = DATA_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTENT__ROOT_PATH = DATA_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Textual Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTENT_FEATURE_COUNT = DATA_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Textual Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTENT_OPERATION_COUNT = DATA_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ARFFImpl <em>ARFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ARFFImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getARFF()
	 * @generated
	 */
	int ARFF = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARFF__NAME = DATA_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARFF__VARIABLES = DATA_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ARFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARFF_FEATURE_COUNT = DATA_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ARFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARFF_OPERATION_COUNT = DATA_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendationSystemImpl <em>Recommendation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendationSystemImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationSystem()
	 * @generated
	 */
	int RECOMMENDATION_SYSTEM = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM__SETTINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM__GENERATOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.MachineLearningBasedRSImpl <em>Machine Learning Based RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.MachineLearningBasedRSImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getMachineLearningBasedRS()
	 * @generated
	 */
	int MACHINE_LEARNING_BASED_RS = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__NAME = RECOMMENDATION_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__SETTINGS = RECOMMENDATION_SYSTEM__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__SCOPE = RECOMMENDATION_SYSTEM__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__CONTEXT = RECOMMENDATION_SYSTEM__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__GENERATOR = RECOMMENDATION_SYSTEM__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__NUM_EPOCHS = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__LEARNING_RATE = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine Learning Based RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS_FEATURE_COUNT = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Machine Learning Based RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_BASED_RS_OPERATION_COUNT = RECOMMENDATION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.FilteringRSImpl <em>Filtering RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.FilteringRSImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getFilteringRS()
	 * @generated
	 */
	int FILTERING_RS = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__NAME = RECOMMENDATION_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__SETTINGS = RECOMMENDATION_SYSTEM__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__SCOPE = RECOMMENDATION_SYSTEM__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__CONTEXT = RECOMMENDATION_SYSTEM__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__GENERATOR = RECOMMENDATION_SYSTEM__GENERATOR;

	/**
	 * The feature id for the '<em><b>Filtering RS Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__FILTERING_RS_ALGORITHM = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Similarity Calculator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__SIMILARITY_CALCULATOR = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__CUTOFF = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Neighborhood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS__NEIGHBORHOOD = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Filtering RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS_FEATURE_COUNT = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Filtering RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RS_OPERATION_COUNT = RECOMMENDATION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DataMiningRSImpl <em>Data Mining RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DataMiningRSImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDataMiningRS()
	 * @generated
	 */
	int DATA_MINING_RS = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__NAME = RECOMMENDATION_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__SETTINGS = RECOMMENDATION_SYSTEM__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__SCOPE = RECOMMENDATION_SYSTEM__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__CONTEXT = RECOMMENDATION_SYSTEM__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__GENERATOR = RECOMMENDATION_SYSTEM__GENERATOR;

	/**
	 * The feature id for the '<em><b>Data Mining RS Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS__DATA_MINING_RS_ALGORITHM = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Mining RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS_FEATURE_COUNT = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Mining RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MINING_RS_OPERATION_COUNT = RECOMMENDATION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.CustomRecommenderImpl <em>Custom Recommender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.CustomRecommenderImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getCustomRecommender()
	 * @generated
	 */
	int CUSTOM_RECOMMENDER = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__NAME = RECOMMENDATION_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__SETTINGS = RECOMMENDATION_SYSTEM__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__SCOPE = RECOMMENDATION_SYSTEM__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__CONTEXT = RECOMMENDATION_SYSTEM__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__GENERATOR = RECOMMENDATION_SYSTEM__GENERATOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__DESCRIPTION = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Tools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER__REQUIRED_TOOLS = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Recommender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER_FEATURE_COUNT = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Custom Recommender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RECOMMENDER_OPERATION_COUNT = RECOMMENDATION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendationSettingImpl <em>Recommendation Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendationSettingImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationSetting()
	 * @generated
	 */
	int RECOMMENDATION_SETTING = 35;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SETTING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SETTING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Recommendation Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SETTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Recommendation Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.GeneticAlgorithmImpl <em>Genetic Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.GeneticAlgorithmImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getGeneticAlgorithm()
	 * @generated
	 */
	int GENETIC_ALGORITHM = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__NAME = RECOMMENDATION_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__SETTINGS = RECOMMENDATION_SYSTEM__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__SCOPE = RECOMMENDATION_SYSTEM__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__CONTEXT = RECOMMENDATION_SYSTEM__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__GENERATOR = RECOMMENDATION_SYSTEM__GENERATOR;

	/**
	 * The feature id for the '<em><b>Fitness Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__FITNESS_FUNCTION = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__SEARCH_STRATEGY = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mutation Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__MUTATION_OPERATOR = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Genetic Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM_FEATURE_COUNT = RECOMMENDATION_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Genetic Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM_OPERATION_COUNT = RECOMMENDATION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.UserStudyImpl <em>User Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.UserStudyImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudy()
	 * @generated
	 */
	int USER_STUDY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY__NAME = VALIDATION_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY__NOF_RECOMMENDATIONS = VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY__TYPE = VALIDATION_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY__ANALYSIS = VALIDATION_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY_FEATURE_COUNT = VALIDATION_TECHNIQUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STUDY_OPERATION_COUNT = VALIDATION_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.AutomatedValidationImpl <em>Automated Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.AutomatedValidationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getAutomatedValidation()
	 * @generated
	 */
	int AUTOMATED_VALIDATION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_VALIDATION__NAME = VALIDATION_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_VALIDATION__NOF_RECOMMENDATIONS = VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_VALIDATION__LIBRARY = VALIDATION_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automated Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_VALIDATION_FEATURE_COUNT = VALIDATION_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Automated Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_VALIDATION_OPERATION_COUNT = VALIDATION_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.CrossValidationImpl <em>Cross Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.CrossValidationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getCrossValidation()
	 * @generated
	 */
	int CROSS_VALIDATION = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__NAME = AUTOMATED_VALIDATION__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__NOF_RECOMMENDATIONS = AUTOMATED_VALIDATION__NOF_RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__LIBRARY = AUTOMATED_VALIDATION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Number Of Fold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__NUMBER_OF_FOLD = AUTOMATED_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Truth Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR = AUTOMATED_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_FEATURE_COUNT = AUTOMATED_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_OPERATION_COUNT = AUTOMATED_VALIDATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendationContextImpl <em>Recommendation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendationContextImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationContext()
	 * @generated
	 */
	int RECOMMENDATION_CONTEXT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_CONTEXT__USER_CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Proactive System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recommendation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recommendation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DependencyManagerImpl <em>Dependency Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DependencyManagerImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDependencyManager()
	 * @generated
	 */
	int DEPENDENCY_MANAGER = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MANAGER__NAME = DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Dependency Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MANAGER_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MANAGER_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.VariableRelationImpl <em>Variable Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.VariableRelationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getVariableRelation()
	 * @generated
	 */
	int VARIABLE_RELATION = 41;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RELATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Variable Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.GroundTruthExtractionImpl <em>Ground Truth Extraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.GroundTruthExtractionImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getGroundTruthExtraction()
	 * @generated
	 */
	int GROUND_TRUTH_EXTRACTION = 42;

	/**
	 * The feature id for the '<em><b>Size GT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TRUTH_EXTRACTION__SIZE_GT = 0;

	/**
	 * The feature id for the '<em><b>Splitting Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TRUTH_EXTRACTION__SPLITTING_RULES = 1;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Ground Truth Extraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TRUTH_EXTRACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ground Truth Extraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TRUTH_EXTRACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.FileImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SOURCE_PATH = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ENCODING = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecommendedItemImpl <em>Recommended Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecommendedItemImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendedItem()
	 * @generated
	 */
	int RECOMMENDED_ITEM = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDED_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outcame</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDED_ITEM__OUTCAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDED_ITEM__ORDERED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recommended Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDED_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recommended Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDED_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ContextValidationImpl <em>Context Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ContextValidationImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getContextValidation()
	 * @generated
	 */
	int CONTEXT_VALIDATION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALIDATION__NAME = VALIDATION_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALIDATION__NOF_RECOMMENDATIONS = VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Test Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALIDATION__TEST_CONTEXT = VALIDATION_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALIDATION_FEATURE_COUNT = VALIDATION_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VALIDATION_OPERATION_COUNT = VALIDATION_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RawOutcomesImpl <em>Raw Outcomes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RawOutcomesImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRawOutcomes()
	 * @generated
	 */
	int RAW_OUTCOMES = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OUTCOMES__NAME = PRESENTATION_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OUTCOMES__RECOMMENDATIONS = PRESENTATION_LAYER__RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OUTCOMES__FORMAT = PRESENTATION_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Outcomes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OUTCOMES_FEATURE_COUNT = PRESENTATION_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raw Outcomes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OUTCOMES_OPERATION_COUNT = PRESENTATION_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RandomSplittingImpl <em>Random Splitting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RandomSplittingImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRandomSplitting()
	 * @generated
	 */
	int RANDOM_SPLITTING = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SPLITTING__NAME = AUTOMATED_VALIDATION__NAME;

	/**
	 * The feature id for the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SPLITTING__NOF_RECOMMENDATIONS = AUTOMATED_VALIDATION__NOF_RECOMMENDATIONS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SPLITTING__LIBRARY = AUTOMATED_VALIDATION__LIBRARY;

	/**
	 * The number of structural features of the '<em>Random Splitting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SPLITTING_FEATURE_COUNT = AUTOMATED_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Splitting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SPLITTING_OPERATION_COUNT = AUTOMATED_VALIDATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DeepNNImpl <em>Deep NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DeepNNImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDeepNN()
	 * @generated
	 */
	int DEEP_NN = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The feature id for the '<em><b>Num Hidden Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN__NUM_HIDDEN_LAYER = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deep NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deep NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEP_NN_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ConvolutionalNNImpl <em>Convolutional NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ConvolutionalNNImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getConvolutionalNN()
	 * @generated
	 */
	int CONVOLUTIONAL_NN = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The number of structural features of the '<em>Convolutional NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Convolutional NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOLUTIONAL_NN_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.BayesianImpl <em>Bayesian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.BayesianImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getBayesian()
	 * @generated
	 */
	int BAYESIAN = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The number of structural features of the '<em>Bayesian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bayesian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAYESIAN_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RecurrentNNImpl <em>Recurrent NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RecurrentNNImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecurrentNN()
	 * @generated
	 */
	int RECURRENT_NN = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The number of structural features of the '<em>Recurrent NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recurrent NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENT_NN_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.SVMImpl <em>SVM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.SVMImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getSVM()
	 * @generated
	 */
	int SVM = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The feature id for the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__KERNEL = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.DecisionTreeImpl <em>Decision Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.DecisionTreeImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getDecisionTree()
	 * @generated
	 */
	int DECISION_TREE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The number of structural features of the '<em>Decision Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TREE_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.FeedForwardNNImpl <em>Feed Forward NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.FeedForwardNNImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getFeedForwardNN()
	 * @generated
	 */
	int FEED_FORWARD_NN = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__NAME = MACHINE_LEARNING_BASED_RS__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__SETTINGS = MACHINE_LEARNING_BASED_RS__SETTINGS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__SCOPE = MACHINE_LEARNING_BASED_RS__SCOPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__CONTEXT = MACHINE_LEARNING_BASED_RS__CONTEXT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__GENERATOR = MACHINE_LEARNING_BASED_RS__GENERATOR;

	/**
	 * The feature id for the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__NUM_EPOCHS = MACHINE_LEARNING_BASED_RS__NUM_EPOCHS;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__LEARNING_RATE = MACHINE_LEARNING_BASED_RS__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__MINI_BATCH_SIZE = MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__SOLVER = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__ALPHA = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__ACTIVATION_FUNCTION = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Random State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN__RANDOM_STATE = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feed Forward NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN_FEATURE_COUNT = MACHINE_LEARNING_BASED_RS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feed Forward NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_FORWARD_NN_OPERATION_COUNT = MACHINE_LEARNING_BASED_RS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.GUIElementImpl <em>GUI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.GUIElementImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getGUIElement()
	 * @generated
	 */
	int GUI_ELEMENT = 56;

	/**
	 * The number of structural features of the '<em>GUI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>GUI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.UserImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getUser()
	 * @generated
	 */
	int USER = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EXPRESSED_FEEDBACK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__QUERY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.FeedbackComponentImpl <em>Feedback Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.FeedbackComponentImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getFeedbackComponent()
	 * @generated
	 */
	int FEEDBACK_COMPONENT = 58;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_COMPONENT__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Expressed Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_COMPONENT__LIBRARY = 2;

	/**
	 * The number of structural features of the '<em>Feedback Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feedback Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.FeedbackImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 59;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ImplicitFeedbackImpl <em>Implicit Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ImplicitFeedbackImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getImplicitFeedback()
	 * @generated
	 */
	int IMPLICIT_FEEDBACK = 60;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_FEEDBACK__ITEM = FEEDBACK__ITEM;

	/**
	 * The number of structural features of the '<em>Implicit Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implicit Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_FEEDBACK_OPERATION_COUNT = FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.HybridFeedbackImpl <em>Hybrid Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.HybridFeedbackImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getHybridFeedback()
	 * @generated
	 */
	int HYBRID_FEEDBACK = 61;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_FEEDBACK__ITEM = FEEDBACK__ITEM;

	/**
	 * The number of structural features of the '<em>Hybrid Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hybrid Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_FEEDBACK_OPERATION_COUNT = FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.AdditiveFeedbackImpl <em>Additive Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.AdditiveFeedbackImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getAdditiveFeedback()
	 * @generated
	 */
	int ADDITIVE_FEEDBACK = 62;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_FEEDBACK__ITEM = FEEDBACK__ITEM;

	/**
	 * The feature id for the '<em><b>Num Of Insertion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_FEEDBACK__NUM_OF_INSERTION = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recommender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_FEEDBACK__RECOMMENDER = FEEDBACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Additive Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Additive Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_FEEDBACK_OPERATION_COUNT = FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.ExplicitFeedbackImpl <em>Explicit Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.ExplicitFeedbackImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getExplicitFeedback()
	 * @generated
	 */
	int EXPLICIT_FEEDBACK = 63;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_FEEDBACK__ITEM = FEEDBACK__ITEM;

	/**
	 * The number of structural features of the '<em>Explicit Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Explicit Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_FEEDBACK_OPERATION_COUNT = FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.impl.RatingImpl
	 * @see lowcoders.impl.LowcodersPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 64;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__ITEM = EXPLICIT_FEEDBACK__ITEM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__TYPE = EXPLICIT_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = EXPLICIT_FEEDBACK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = EXPLICIT_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lowcoders.UserEventType <em>User Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.UserEventType
	 * @see lowcoders.impl.LowcodersPackageImpl#getUserEventType()
	 * @generated
	 */
	int USER_EVENT_TYPE = 65;

	/**
	 * The meta object id for the '{@link lowcoders.CollaborativeFilteringAlgorithm <em>Collaborative Filtering Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.CollaborativeFilteringAlgorithm
	 * @see lowcoders.impl.LowcodersPackageImpl#getCollaborativeFilteringAlgorithm()
	 * @generated
	 */
	int COLLABORATIVE_FILTERING_ALGORITHM = 66;

	/**
	 * The meta object id for the '{@link lowcoders.WebContainer <em>Web Container</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.WebContainer
	 * @see lowcoders.impl.LowcodersPackageImpl#getWebContainer()
	 * @generated
	 */
	int WEB_CONTAINER = 67;

	/**
	 * The meta object id for the '{@link lowcoders.Metric <em>Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.Metric
	 * @see lowcoders.impl.LowcodersPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 68;

	/**
	 * The meta object id for the '{@link lowcoders.PreprocessingTechnique <em>Preprocessing Technique</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.PreprocessingTechnique
	 * @see lowcoders.impl.LowcodersPackageImpl#getPreprocessingTechnique()
	 * @generated
	 */
	int PREPROCESSING_TECHNIQUE = 69;

	/**
	 * The meta object id for the '{@link lowcoders.RecommendationUsageType <em>Recommendation Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.RecommendationUsageType
	 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationUsageType()
	 * @generated
	 */
	int RECOMMENDATION_USAGE_TYPE = 70;

	/**
	 * The meta object id for the '{@link lowcoders.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.VariableType
	 * @see lowcoders.impl.LowcodersPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 71;

	/**
	 * The meta object id for the '{@link lowcoders.DataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.DataMiningRSAlgorithm
	 * @see lowcoders.impl.LowcodersPackageImpl#getDataMiningRSAlgorithm()
	 * @generated
	 */
	int DATA_MINING_RS_ALGORITHM = 72;

	/**
	 * The meta object id for the '{@link lowcoders.FilteringRSAlgorithm <em>Filtering RS Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.FilteringRSAlgorithm
	 * @see lowcoders.impl.LowcodersPackageImpl#getFilteringRSAlgorithm()
	 * @generated
	 */
	int FILTERING_RS_ALGORITHM = 73;

	/**
	 * The meta object id for the '{@link lowcoders.SearchStrategy <em>Search Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.SearchStrategy
	 * @see lowcoders.impl.LowcodersPackageImpl#getSearchStrategy()
	 * @generated
	 */
	int SEARCH_STRATEGY = 74;

	/**
	 * The meta object id for the '{@link lowcoders.MutationOperation <em>Mutation Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.MutationOperation
	 * @see lowcoders.impl.LowcodersPackageImpl#getMutationOperation()
	 * @generated
	 */
	int MUTATION_OPERATION = 75;

	/**
	 * The meta object id for the '{@link lowcoders.UserStudyType <em>User Study Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.UserStudyType
	 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudyType()
	 * @generated
	 */
	int USER_STUDY_TYPE = 76;

	/**
	 * The meta object id for the '{@link lowcoders.UserStudyAnalysis <em>User Study Analysis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.UserStudyAnalysis
	 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudyAnalysis()
	 * @generated
	 */
	int USER_STUDY_ANALYSIS = 77;

	/**
	 * The meta object id for the '{@link lowcoders.SimilarityFunction <em>Similarity Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.SimilarityFunction
	 * @see lowcoders.impl.LowcodersPackageImpl#getSimilarityFunction()
	 * @generated
	 */
	int SIMILARITY_FUNCTION = 78;

	/**
	 * The meta object id for the '{@link lowcoders.PyLibType <em>Py Lib Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.PyLibType
	 * @see lowcoders.impl.LowcodersPackageImpl#getPyLibType()
	 * @generated
	 */
	int PY_LIB_TYPE = 79;

	/**
	 * The meta object id for the '{@link lowcoders.FeedbackLibType <em>Feedback Lib Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.FeedbackLibType
	 * @see lowcoders.impl.LowcodersPackageImpl#getFeedbackLibType()
	 * @generated
	 */
	int FEEDBACK_LIB_TYPE = 80;

	/**
	 * The meta object id for the '{@link lowcoders.SolverType <em>Solver Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.SolverType
	 * @see lowcoders.impl.LowcodersPackageImpl#getSolverType()
	 * @generated
	 */
	int SOLVER_TYPE = 81;

	/**
	 * The meta object id for the '{@link lowcoders.KernelType <em>Kernel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.KernelType
	 * @see lowcoders.impl.LowcodersPackageImpl#getKernelType()
	 * @generated
	 */
	int KERNEL_TYPE = 82;

	/**
	 * The meta object id for the '{@link lowcoders.ActivationType <em>Activation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.ActivationType
	 * @see lowcoders.impl.LowcodersPackageImpl#getActivationType()
	 * @generated
	 */
	int ACTIVATION_TYPE = 83;

	/**
	 * The meta object id for the '{@link lowcoders.DatasetManipulationLibrary <em>Dataset Manipulation Library</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.DatasetManipulationLibrary
	 * @see lowcoders.impl.LowcodersPackageImpl#getDatasetManipulationLibrary()
	 * @generated
	 */
	int DATASET_MANIPULATION_LIBRARY = 84;

	/**
	 * The meta object id for the '{@link lowcoders.WebInterfaceLibrary <em>Web Interface Library</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.WebInterfaceLibrary
	 * @see lowcoders.impl.LowcodersPackageImpl#getWebInterfaceLibrary()
	 * @generated
	 */
	int WEB_INTERFACE_LIBRARY = 85;

	/**
	 * The meta object id for the '{@link lowcoders.RawFormat <em>Raw Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.RawFormat
	 * @see lowcoders.impl.LowcodersPackageImpl#getRawFormat()
	 * @generated
	 */
	int RAW_FORMAT = 86;

	/**
	 * The meta object id for the '{@link lowcoders.ValidationLibrary <em>Validation Library</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.ValidationLibrary
	 * @see lowcoders.impl.LowcodersPackageImpl#getValidationLibrary()
	 * @generated
	 */
	int VALIDATION_LIBRARY = 87;


	/**
	 * The meta object id for the '{@link lowcoders.RatingType <em>Rating Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lowcoders.RatingType
	 * @see lowcoders.impl.LowcodersPackageImpl#getRatingType()
	 * @generated
	 */
	int RATING_TYPE = 88;


	/**
	 * Returns the meta object for class '{@link lowcoders.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see lowcoders.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lowcoders.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link lowcoders.UserEvent <em>User Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Event</em>'.
	 * @see lowcoders.UserEvent
	 * @generated
	 */
	EClass getUserEvent();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.UserEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see lowcoders.UserEvent#getEventType()
	 * @see #getUserEvent()
	 * @generated
	 */
	EAttribute getUserEvent_EventType();

	/**
	 * Returns the meta object for class '{@link lowcoders.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see lowcoders.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link lowcoders.Dataset#getIndipendentVariables <em>Indipendent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indipendent Variables</em>'.
	 * @see lowcoders.Dataset#getIndipendentVariables()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_IndipendentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.Dataset#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Structure</em>'.
	 * @see lowcoders.Dataset#getDataStructure()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_DataStructure();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.Dataset#getPreprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preprocessing</em>'.
	 * @see lowcoders.Dataset#getPreprocessing()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Preprocessing();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.Dataset#getDatasetManipulationLibrary <em>Dataset Manipulation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dataset Manipulation Library</em>'.
	 * @see lowcoders.Dataset#getDatasetManipulationLibrary()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_DatasetManipulationLibrary();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Dataset#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see lowcoders.Dataset#getPath()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Path();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Dataset#isIsBuiltIn <em>Is Built In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Built In</em>'.
	 * @see lowcoders.Dataset#isIsBuiltIn()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_IsBuiltIn();

	/**
	 * Returns the meta object for class '{@link lowcoders.RSModel <em>RS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS Model</em>'.
	 * @see lowcoders.RSModel
	 * @generated
	 */
	EClass getRSModel();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RSModel#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see lowcoders.RSModel#getDataset()
	 * @see #getRSModel()
	 * @generated
	 */
	EReference getRSModel_Dataset();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RSModel#getPresentationLayer <em>Presentation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Layer</em>'.
	 * @see lowcoders.RSModel#getPresentationLayer()
	 * @see #getRSModel()
	 * @generated
	 */
	EReference getRSModel_PresentationLayer();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RSModel#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see lowcoders.RSModel#getEvaluation()
	 * @see #getRSModel()
	 * @generated
	 */
	EReference getRSModel_Evaluation();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RSModel#getRecommendationSystem <em>Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recommendation System</em>'.
	 * @see lowcoders.RSModel#getRecommendationSystem()
	 * @see #getRSModel()
	 * @generated
	 */
	EReference getRSModel_RecommendationSystem();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RSModel#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see lowcoders.RSModel#getFeedback()
	 * @see #getRSModel()
	 * @generated
	 */
	EReference getRSModel_Feedback();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendationHandler <em>Recommendation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Handler</em>'.
	 * @see lowcoders.RecommendationHandler
	 * @generated
	 */
	EClass getRecommendationHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link lowcoders.RecommendationHandler#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usage</em>'.
	 * @see lowcoders.RecommendationHandler#getUsage()
	 * @see #getRecommendationHandler()
	 * @generated
	 */
	EReference getRecommendationHandler_Usage();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.RecommendationHandler#getWebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Service</em>'.
	 * @see lowcoders.RecommendationHandler#getWebService()
	 * @see #getRecommendationHandler()
	 * @generated
	 */
	EReference getRecommendationHandler_WebService();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.RecommendationHandler#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see lowcoders.RecommendationHandler#getContext()
	 * @see #getRecommendationHandler()
	 * @generated
	 */
	EReference getRecommendationHandler_Context();

	/**
	 * Returns the meta object for class '{@link lowcoders.ProactiveHandler <em>Proactive Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proactive Handler</em>'.
	 * @see lowcoders.ProactiveHandler
	 * @generated
	 */
	EClass getProactiveHandler();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.ProactiveHandler#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see lowcoders.ProactiveHandler#isCondition()
	 * @see #getProactiveHandler()
	 * @generated
	 */
	EAttribute getProactiveHandler_Condition();

	/**
	 * Returns the meta object for class '{@link lowcoders.ReactiveHandler <em>Reactive Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Handler</em>'.
	 * @see lowcoders.ReactiveHandler
	 * @generated
	 */
	EClass getReactiveHandler();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.ReactiveHandler#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see lowcoders.ReactiveHandler#getEvent()
	 * @see #getReactiveHandler()
	 * @generated
	 */
	EReference getReactiveHandler_Event();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendationUsage <em>Recommendation Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Usage</em>'.
	 * @see lowcoders.RecommendationUsage
	 * @generated
	 */
	EClass getRecommendationUsage();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendationUsage#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see lowcoders.RecommendationUsage#getUsageType()
	 * @see #getRecommendationUsage()
	 * @generated
	 */
	EAttribute getRecommendationUsage_UsageType();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.RecommendationUsage#getRecommendedItems <em>Recommended Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommended Items</em>'.
	 * @see lowcoders.RecommendationUsage#getRecommendedItems()
	 * @see #getRecommendationUsage()
	 * @generated
	 */
	EReference getRecommendationUsage_RecommendedItems();

	/**
	 * Returns the meta object for the containment reference list '{@link lowcoders.RecommendationUsage#getGuielements <em>Guielements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guielements</em>'.
	 * @see lowcoders.RecommendationUsage#getGuielements()
	 * @see #getRecommendationUsage()
	 * @generated
	 */
	EReference getRecommendationUsage_Guielements();

	/**
	 * Returns the meta object for class '{@link lowcoders.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see lowcoders.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link lowcoders.PresentationLayer <em>Presentation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Layer</em>'.
	 * @see lowcoders.PresentationLayer
	 * @generated
	 */
	EClass getPresentationLayer();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.PresentationLayer#getRecommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recommendations</em>'.
	 * @see lowcoders.PresentationLayer#getRecommendations()
	 * @see #getPresentationLayer()
	 * @generated
	 */
	EReference getPresentationLayer_Recommendations();

	/**
	 * Returns the meta object for class '{@link lowcoders.WebIService <em>Web IService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web IService</em>'.
	 * @see lowcoders.WebIService
	 * @generated
	 */
	EClass getWebIService();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.WebIService#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see lowcoders.WebIService#getLibrary()
	 * @see #getWebIService()
	 * @generated
	 */
	EAttribute getWebIService_Library();

	/**
	 * Returns the meta object for class '{@link lowcoders.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see lowcoders.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.WebApplication#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see lowcoders.WebApplication#getLibrary()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Library();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.WebApplication#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see lowcoders.WebApplication#getPort()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Port();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.WebApplication#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see lowcoders.WebApplication#getHost()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Host();

	/**
	 * Returns the meta object for class '{@link lowcoders.IDEIntegration <em>IDE Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDE Integration</em>'.
	 * @see lowcoders.IDEIntegration
	 * @generated
	 */
	EClass getIDEIntegration();

	/**
	 * Returns the meta object for class '{@link lowcoders.VSCodePlugin <em>VS Code Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VS Code Plugin</em>'.
	 * @see lowcoders.VSCodePlugin
	 * @generated
	 */
	EClass getVSCodePlugin();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.VSCodePlugin#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handler</em>'.
	 * @see lowcoders.VSCodePlugin#getHandler()
	 * @see #getVSCodePlugin()
	 * @generated
	 */
	EReference getVSCodePlugin_Handler();

	/**
	 * Returns the meta object for class '{@link lowcoders.TraversableGraph <em>Traversable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversable Graph</em>'.
	 * @see lowcoders.TraversableGraph
	 * @generated
	 */
	EClass getTraversableGraph();

	/**
	 * Returns the meta object for class '{@link lowcoders.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see lowcoders.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.Evaluation#getBaselines <em>Baselines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Baselines</em>'.
	 * @see lowcoders.Evaluation#getBaselines()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Baselines();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.Evaluation#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metrics</em>'.
	 * @see lowcoders.Evaluation#getMetrics()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link lowcoders.Evaluation#getValidationTechnique <em>Validation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Technique</em>'.
	 * @see lowcoders.Evaluation#getValidationTechnique()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_ValidationTechnique();

	/**
	 * Returns the meta object for class '{@link lowcoders.ValidationTechnique <em>Validation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Technique</em>'.
	 * @see lowcoders.ValidationTechnique
	 * @generated
	 */
	EClass getValidationTechnique();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.ValidationTechnique#getNOfRecommendations <em>NOf Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOf Recommendations</em>'.
	 * @see lowcoders.ValidationTechnique#getNOfRecommendations()
	 * @see #getValidationTechnique()
	 * @generated
	 */
	EAttribute getValidationTechnique_NOfRecommendations();

	/**
	 * Returns the meta object for class '{@link lowcoders.UnsupervisedDataset <em>Unsupervised Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsupervised Dataset</em>'.
	 * @see lowcoders.UnsupervisedDataset
	 * @generated
	 */
	EClass getUnsupervisedDataset();

	/**
	 * Returns the meta object for class '{@link lowcoders.SupervisedDataset <em>Supervised Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervised Dataset</em>'.
	 * @see lowcoders.SupervisedDataset
	 * @generated
	 */
	EClass getSupervisedDataset();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.SupervisedDataset#getDependatVariable <em>Dependat Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependat Variable</em>'.
	 * @see lowcoders.SupervisedDataset#getDependatVariable()
	 * @see #getSupervisedDataset()
	 * @generated
	 */
	EReference getSupervisedDataset_DependatVariable();

	/**
	 * Returns the meta object for class '{@link lowcoders.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see lowcoders.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.Variable#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see lowcoders.Variable#getDataSource()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.Variable#getPreprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preprocessing</em>'.
	 * @see lowcoders.Variable#getPreprocessing()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Preprocessing();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lowcoders.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Variable#isIsMissingValueAllowed <em>Is Missing Value Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing Value Allowed</em>'.
	 * @see lowcoders.Variable#isIsMissingValueAllowed()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsMissingValueAllowed();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Variable#isIsMultiple <em>Is Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple</em>'.
	 * @see lowcoders.Variable#isIsMultiple()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsMultiple();

	/**
	 * Returns the meta object for class '{@link lowcoders.Preprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessing</em>'.
	 * @see lowcoders.Preprocessing
	 * @generated
	 */
	EClass getPreprocessing();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.Preprocessing#getPreprocessigTechnique <em>Preprocessig Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preprocessig Technique</em>'.
	 * @see lowcoders.Preprocessing#getPreprocessigTechnique()
	 * @see #getPreprocessing()
	 * @generated
	 */
	EAttribute getPreprocessing_PreprocessigTechnique();

	/**
	 * Returns the meta object for class '{@link lowcoders.CodeRepository <em>Code Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Repository</em>'.
	 * @see lowcoders.CodeRepository
	 * @generated
	 */
	EClass getCodeRepository();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.CodeRepository#isMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see lowcoders.CodeRepository#isMetadata()
	 * @see #getCodeRepository()
	 * @generated
	 */
	EAttribute getCodeRepository_Metadata();

	/**
	 * Returns the meta object for class '{@link lowcoders.CommunicationChannel <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Channel</em>'.
	 * @see lowcoders.CommunicationChannel
	 * @generated
	 */
	EClass getCommunicationChannel();

	/**
	 * Returns the meta object for class '{@link lowcoders.BugTrackingSystem <em>Bug Tracking System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bug Tracking System</em>'.
	 * @see lowcoders.BugTrackingSystem
	 * @generated
	 */
	EClass getBugTrackingSystem();

	/**
	 * Returns the meta object for class '{@link lowcoders.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Structure</em>'.
	 * @see lowcoders.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for class '{@link lowcoders.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see lowcoders.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see lowcoders.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.Graph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relations</em>'.
	 * @see lowcoders.Graph#getRelations()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Relations();

	/**
	 * Returns the meta object for class '{@link lowcoders.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see lowcoders.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.Matrix#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see lowcoders.Matrix#getColumns()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Columns();

	/**
	 * Returns the meta object for class '{@link lowcoders.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see lowcoders.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for class '{@link lowcoders.TextualContent <em>Textual Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Content</em>'.
	 * @see lowcoders.TextualContent
	 * @generated
	 */
	EClass getTextualContent();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.TextualContent#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contents</em>'.
	 * @see lowcoders.TextualContent#getContents()
	 * @see #getTextualContent()
	 * @generated
	 */
	EReference getTextualContent_Contents();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.TextualContent#getRootPath <em>Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Path</em>'.
	 * @see lowcoders.TextualContent#getRootPath()
	 * @see #getTextualContent()
	 * @generated
	 */
	EAttribute getTextualContent_RootPath();

	/**
	 * Returns the meta object for class '{@link lowcoders.ARFF <em>ARFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARFF</em>'.
	 * @see lowcoders.ARFF
	 * @generated
	 */
	EClass getARFF();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.ARFF#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see lowcoders.ARFF#getVariables()
	 * @see #getARFF()
	 * @generated
	 */
	EReference getARFF_Variables();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendationSystem <em>Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation System</em>'.
	 * @see lowcoders.RecommendationSystem
	 * @generated
	 */
	EClass getRecommendationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link lowcoders.RecommendationSystem#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see lowcoders.RecommendationSystem#getSettings()
	 * @see #getRecommendationSystem()
	 * @generated
	 */
	EReference getRecommendationSystem_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RecommendationSystem#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see lowcoders.RecommendationSystem#getScope()
	 * @see #getRecommendationSystem()
	 * @generated
	 */
	EReference getRecommendationSystem_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.RecommendationSystem#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see lowcoders.RecommendationSystem#getContext()
	 * @see #getRecommendationSystem()
	 * @generated
	 */
	EReference getRecommendationSystem_Context();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendationSystem#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see lowcoders.RecommendationSystem#getGenerator()
	 * @see #getRecommendationSystem()
	 * @generated
	 */
	EAttribute getRecommendationSystem_Generator();

	/**
	 * Returns the meta object for class '{@link lowcoders.MachineLearningBasedRS <em>Machine Learning Based RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Learning Based RS</em>'.
	 * @see lowcoders.MachineLearningBasedRS
	 * @generated
	 */
	EClass getMachineLearningBasedRS();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.MachineLearningBasedRS#getNumEpochs <em>Num Epochs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Epochs</em>'.
	 * @see lowcoders.MachineLearningBasedRS#getNumEpochs()
	 * @see #getMachineLearningBasedRS()
	 * @generated
	 */
	EAttribute getMachineLearningBasedRS_NumEpochs();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.MachineLearningBasedRS#getLearningRate <em>Learning Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learning Rate</em>'.
	 * @see lowcoders.MachineLearningBasedRS#getLearningRate()
	 * @see #getMachineLearningBasedRS()
	 * @generated
	 */
	EAttribute getMachineLearningBasedRS_LearningRate();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.MachineLearningBasedRS#getMiniBatchSize <em>Mini Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mini Batch Size</em>'.
	 * @see lowcoders.MachineLearningBasedRS#getMiniBatchSize()
	 * @see #getMachineLearningBasedRS()
	 * @generated
	 */
	EAttribute getMachineLearningBasedRS_MiniBatchSize();

	/**
	 * Returns the meta object for class '{@link lowcoders.FilteringRS <em>Filtering RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering RS</em>'.
	 * @see lowcoders.FilteringRS
	 * @generated
	 */
	EClass getFilteringRS();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FilteringRS#getFilteringRSAlgorithm <em>Filtering RS Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering RS Algorithm</em>'.
	 * @see lowcoders.FilteringRS#getFilteringRSAlgorithm()
	 * @see #getFilteringRS()
	 * @generated
	 */
	EAttribute getFilteringRS_FilteringRSAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FilteringRS#getSimilarityCalculator <em>Similarity Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Similarity Calculator</em>'.
	 * @see lowcoders.FilteringRS#getSimilarityCalculator()
	 * @see #getFilteringRS()
	 * @generated
	 */
	EAttribute getFilteringRS_SimilarityCalculator();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FilteringRS#getCutoff <em>Cutoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cutoff</em>'.
	 * @see lowcoders.FilteringRS#getCutoff()
	 * @see #getFilteringRS()
	 * @generated
	 */
	EAttribute getFilteringRS_Cutoff();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FilteringRS#getNeighborhood <em>Neighborhood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neighborhood</em>'.
	 * @see lowcoders.FilteringRS#getNeighborhood()
	 * @see #getFilteringRS()
	 * @generated
	 */
	EAttribute getFilteringRS_Neighborhood();

	/**
	 * Returns the meta object for class '{@link lowcoders.DataMiningRS <em>Data Mining RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mining RS</em>'.
	 * @see lowcoders.DataMiningRS
	 * @generated
	 */
	EClass getDataMiningRS();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.DataMiningRS#getDataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Mining RS Algorithm</em>'.
	 * @see lowcoders.DataMiningRS#getDataMiningRSAlgorithm()
	 * @see #getDataMiningRS()
	 * @generated
	 */
	EAttribute getDataMiningRS_DataMiningRSAlgorithm();

	/**
	 * Returns the meta object for class '{@link lowcoders.CustomRecommender <em>Custom Recommender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Recommender</em>'.
	 * @see lowcoders.CustomRecommender
	 * @generated
	 */
	EClass getCustomRecommender();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.CustomRecommender#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lowcoders.CustomRecommender#getDescription()
	 * @see #getCustomRecommender()
	 * @generated
	 */
	EAttribute getCustomRecommender_Description();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.CustomRecommender#getRequiredTools <em>Required Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Tools</em>'.
	 * @see lowcoders.CustomRecommender#getRequiredTools()
	 * @see #getCustomRecommender()
	 * @generated
	 */
	EAttribute getCustomRecommender_RequiredTools();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendationSetting <em>Recommendation Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Setting</em>'.
	 * @see lowcoders.RecommendationSetting
	 * @generated
	 */
	EClass getRecommendationSetting();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendationSetting#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see lowcoders.RecommendationSetting#getKey()
	 * @see #getRecommendationSetting()
	 * @generated
	 */
	EAttribute getRecommendationSetting_Key();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendationSetting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lowcoders.RecommendationSetting#getValue()
	 * @see #getRecommendationSetting()
	 * @generated
	 */
	EAttribute getRecommendationSetting_Value();

	/**
	 * Returns the meta object for class '{@link lowcoders.GeneticAlgorithm <em>Genetic Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genetic Algorithm</em>'.
	 * @see lowcoders.GeneticAlgorithm
	 * @generated
	 */
	EClass getGeneticAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.GeneticAlgorithm#getFitnessFunction <em>Fitness Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fitness Function</em>'.
	 * @see lowcoders.GeneticAlgorithm#getFitnessFunction()
	 * @see #getGeneticAlgorithm()
	 * @generated
	 */
	EAttribute getGeneticAlgorithm_FitnessFunction();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.GeneticAlgorithm#getSearchStrategy <em>Search Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Strategy</em>'.
	 * @see lowcoders.GeneticAlgorithm#getSearchStrategy()
	 * @see #getGeneticAlgorithm()
	 * @generated
	 */
	EAttribute getGeneticAlgorithm_SearchStrategy();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.GeneticAlgorithm#getMutationOperator <em>Mutation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutation Operator</em>'.
	 * @see lowcoders.GeneticAlgorithm#getMutationOperator()
	 * @see #getGeneticAlgorithm()
	 * @generated
	 */
	EAttribute getGeneticAlgorithm_MutationOperator();

	/**
	 * Returns the meta object for class '{@link lowcoders.UserStudy <em>User Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Study</em>'.
	 * @see lowcoders.UserStudy
	 * @generated
	 */
	EClass getUserStudy();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.UserStudy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lowcoders.UserStudy#getType()
	 * @see #getUserStudy()
	 * @generated
	 */
	EAttribute getUserStudy_Type();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.UserStudy#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis</em>'.
	 * @see lowcoders.UserStudy#getAnalysis()
	 * @see #getUserStudy()
	 * @generated
	 */
	EAttribute getUserStudy_Analysis();

	/**
	 * Returns the meta object for class '{@link lowcoders.CrossValidation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Validation</em>'.
	 * @see lowcoders.CrossValidation
	 * @generated
	 */
	EClass getCrossValidation();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.CrossValidation#getNumberOfFold <em>Number Of Fold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Fold</em>'.
	 * @see lowcoders.CrossValidation#getNumberOfFold()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EAttribute getCrossValidation_NumberOfFold();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.CrossValidation#getGroundTruthExtractor <em>Ground Truth Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Truth Extractor</em>'.
	 * @see lowcoders.CrossValidation#getGroundTruthExtractor()
	 * @see #getCrossValidation()
	 * @generated
	 */
	EReference getCrossValidation_GroundTruthExtractor();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendationContext <em>Recommendation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Context</em>'.
	 * @see lowcoders.RecommendationContext
	 * @generated
	 */
	EClass getRecommendationContext();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.RecommendationContext#getUserContext <em>User Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Context</em>'.
	 * @see lowcoders.RecommendationContext#getUserContext()
	 * @see #getRecommendationContext()
	 * @generated
	 */
	EReference getRecommendationContext_UserContext();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proactive System</em>'.
	 * @see lowcoders.RecommendationContext#isIsProactiveSystem()
	 * @see #getRecommendationContext()
	 * @generated
	 */
	EAttribute getRecommendationContext_IsProactiveSystem();

	/**
	 * Returns the meta object for class '{@link lowcoders.DependencyManager <em>Dependency Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Manager</em>'.
	 * @see lowcoders.DependencyManager
	 * @generated
	 */
	EClass getDependencyManager();

	/**
	 * Returns the meta object for class '{@link lowcoders.VariableRelation <em>Variable Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Relation</em>'.
	 * @see lowcoders.VariableRelation
	 * @generated
	 */
	EClass getVariableRelation();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.VariableRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lowcoders.VariableRelation#getSource()
	 * @see #getVariableRelation()
	 * @generated
	 */
	EReference getVariableRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.VariableRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lowcoders.VariableRelation#getTarget()
	 * @see #getVariableRelation()
	 * @generated
	 */
	EReference getVariableRelation_Target();

	/**
	 * Returns the meta object for class '{@link lowcoders.GroundTruthExtraction <em>Ground Truth Extraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Truth Extraction</em>'.
	 * @see lowcoders.GroundTruthExtraction
	 * @generated
	 */
	EClass getGroundTruthExtraction();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.GroundTruthExtraction#getSizeGT <em>Size GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size GT</em>'.
	 * @see lowcoders.GroundTruthExtraction#getSizeGT()
	 * @see #getGroundTruthExtraction()
	 * @generated
	 */
	EAttribute getGroundTruthExtraction_SizeGT();

	/**
	 * Returns the meta object for the attribute list '{@link lowcoders.GroundTruthExtraction#getSplittingRules <em>Splitting Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Splitting Rules</em>'.
	 * @see lowcoders.GroundTruthExtraction#getSplittingRules()
	 * @see #getGroundTruthExtraction()
	 * @generated
	 */
	EAttribute getGroundTruthExtraction_SplittingRules();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.GroundTruthExtraction#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see lowcoders.GroundTruthExtraction#getTargetVariable()
	 * @see #getGroundTruthExtraction()
	 * @generated
	 */
	EReference getGroundTruthExtraction_TargetVariable();

	/**
	 * Returns the meta object for class '{@link lowcoders.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see lowcoders.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.File#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path</em>'.
	 * @see lowcoders.File#getSourcePath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_SourcePath();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.File#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see lowcoders.File#getEncoding()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Encoding();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecommendedItem <em>Recommended Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommended Item</em>'.
	 * @see lowcoders.RecommendedItem
	 * @generated
	 */
	EClass getRecommendedItem();

	/**
	 * Returns the meta object for the reference list '{@link lowcoders.RecommendedItem#getOutcame <em>Outcame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcame</em>'.
	 * @see lowcoders.RecommendedItem#getOutcame()
	 * @see #getRecommendedItem()
	 * @generated
	 */
	EReference getRecommendedItem_Outcame();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RecommendedItem#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see lowcoders.RecommendedItem#isOrdered()
	 * @see #getRecommendedItem()
	 * @generated
	 */
	EAttribute getRecommendedItem_Ordered();

	/**
	 * Returns the meta object for class '{@link lowcoders.ContextValidation <em>Context Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Validation</em>'.
	 * @see lowcoders.ContextValidation
	 * @generated
	 */
	EClass getContextValidation();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.ContextValidation#getTestContext <em>Test Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Context</em>'.
	 * @see lowcoders.ContextValidation#getTestContext()
	 * @see #getContextValidation()
	 * @generated
	 */
	EReference getContextValidation_TestContext();

	/**
	 * Returns the meta object for class '{@link lowcoders.RawOutcomes <em>Raw Outcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Outcomes</em>'.
	 * @see lowcoders.RawOutcomes
	 * @generated
	 */
	EClass getRawOutcomes();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.RawOutcomes#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see lowcoders.RawOutcomes#getFormat()
	 * @see #getRawOutcomes()
	 * @generated
	 */
	EAttribute getRawOutcomes_Format();

	/**
	 * Returns the meta object for class '{@link lowcoders.RandomSplitting <em>Random Splitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Splitting</em>'.
	 * @see lowcoders.RandomSplitting
	 * @generated
	 */
	EClass getRandomSplitting();

	/**
	 * Returns the meta object for class '{@link lowcoders.AutomatedValidation <em>Automated Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automated Validation</em>'.
	 * @see lowcoders.AutomatedValidation
	 * @generated
	 */
	EClass getAutomatedValidation();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.AutomatedValidation#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see lowcoders.AutomatedValidation#getLibrary()
	 * @see #getAutomatedValidation()
	 * @generated
	 */
	EAttribute getAutomatedValidation_Library();

	/**
	 * Returns the meta object for class '{@link lowcoders.DeepNN <em>Deep NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deep NN</em>'.
	 * @see lowcoders.DeepNN
	 * @generated
	 */
	EClass getDeepNN();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.DeepNN#getNumHiddenLayer <em>Num Hidden Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Hidden Layer</em>'.
	 * @see lowcoders.DeepNN#getNumHiddenLayer()
	 * @see #getDeepNN()
	 * @generated
	 */
	EAttribute getDeepNN_NumHiddenLayer();

	/**
	 * Returns the meta object for class '{@link lowcoders.ConvolutionalNN <em>Convolutional NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convolutional NN</em>'.
	 * @see lowcoders.ConvolutionalNN
	 * @generated
	 */
	EClass getConvolutionalNN();

	/**
	 * Returns the meta object for class '{@link lowcoders.Bayesian <em>Bayesian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bayesian</em>'.
	 * @see lowcoders.Bayesian
	 * @generated
	 */
	EClass getBayesian();

	/**
	 * Returns the meta object for class '{@link lowcoders.RecurrentNN <em>Recurrent NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurrent NN</em>'.
	 * @see lowcoders.RecurrentNN
	 * @generated
	 */
	EClass getRecurrentNN();

	/**
	 * Returns the meta object for class '{@link lowcoders.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVM</em>'.
	 * @see lowcoders.SVM
	 * @generated
	 */
	EClass getSVM();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.SVM#getKernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel</em>'.
	 * @see lowcoders.SVM#getKernel()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_Kernel();

	/**
	 * Returns the meta object for class '{@link lowcoders.DecisionTree <em>Decision Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Tree</em>'.
	 * @see lowcoders.DecisionTree
	 * @generated
	 */
	EClass getDecisionTree();

	/**
	 * Returns the meta object for class '{@link lowcoders.FeedForwardNN <em>Feed Forward NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feed Forward NN</em>'.
	 * @see lowcoders.FeedForwardNN
	 * @generated
	 */
	EClass getFeedForwardNN();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FeedForwardNN#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver</em>'.
	 * @see lowcoders.FeedForwardNN#getSolver()
	 * @see #getFeedForwardNN()
	 * @generated
	 */
	EAttribute getFeedForwardNN_Solver();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FeedForwardNN#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see lowcoders.FeedForwardNN#getAlpha()
	 * @see #getFeedForwardNN()
	 * @generated
	 */
	EAttribute getFeedForwardNN_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FeedForwardNN#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Function</em>'.
	 * @see lowcoders.FeedForwardNN#getActivationFunction()
	 * @see #getFeedForwardNN()
	 * @generated
	 */
	EAttribute getFeedForwardNN_ActivationFunction();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FeedForwardNN#getRandomState <em>Random State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random State</em>'.
	 * @see lowcoders.FeedForwardNN#getRandomState()
	 * @see #getFeedForwardNN()
	 * @generated
	 */
	EAttribute getFeedForwardNN_RandomState();

	/**
	 * Returns the meta object for class '{@link lowcoders.GUIElement <em>GUI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Element</em>'.
	 * @see lowcoders.GUIElement
	 * @generated
	 */
	EClass getGUIElement();

	/**
	 * Returns the meta object for class '{@link lowcoders.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see lowcoders.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.User#getExpressedFeedback <em>Expressed Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expressed Feedback</em>'.
	 * @see lowcoders.User#getExpressedFeedback()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ExpressedFeedback();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.User#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see lowcoders.User#getQuery()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Query();

	/**
	 * Returns the meta object for class '{@link lowcoders.FeedbackComponent <em>Feedback Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Component</em>'.
	 * @see lowcoders.FeedbackComponent
	 * @generated
	 */
	EClass getFeedbackComponent();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.FeedbackComponent#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see lowcoders.FeedbackComponent#getQuery()
	 * @see #getFeedbackComponent()
	 * @generated
	 */
	EReference getFeedbackComponent_Query();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.FeedbackComponent#getExpressedFeedback <em>Expressed Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressed Feedback</em>'.
	 * @see lowcoders.FeedbackComponent#getExpressedFeedback()
	 * @see #getFeedbackComponent()
	 * @generated
	 */
	EReference getFeedbackComponent_ExpressedFeedback();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.FeedbackComponent#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see lowcoders.FeedbackComponent#getLibrary()
	 * @see #getFeedbackComponent()
	 * @generated
	 */
	EAttribute getFeedbackComponent_Library();

	/**
	 * Returns the meta object for class '{@link lowcoders.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see lowcoders.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the containment reference '{@link lowcoders.Feedback#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see lowcoders.Feedback#getItem()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_Item();

	/**
	 * Returns the meta object for class '{@link lowcoders.ImplicitFeedback <em>Implicit Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Feedback</em>'.
	 * @see lowcoders.ImplicitFeedback
	 * @generated
	 */
	EClass getImplicitFeedback();

	/**
	 * Returns the meta object for class '{@link lowcoders.HybridFeedback <em>Hybrid Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Feedback</em>'.
	 * @see lowcoders.HybridFeedback
	 * @generated
	 */
	EClass getHybridFeedback();

	/**
	 * Returns the meta object for class '{@link lowcoders.AdditiveFeedback <em>Additive Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Feedback</em>'.
	 * @see lowcoders.AdditiveFeedback
	 * @generated
	 */
	EClass getAdditiveFeedback();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.AdditiveFeedback#getNumOfInsertion <em>Num Of Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Insertion</em>'.
	 * @see lowcoders.AdditiveFeedback#getNumOfInsertion()
	 * @see #getAdditiveFeedback()
	 * @generated
	 */
	EAttribute getAdditiveFeedback_NumOfInsertion();

	/**
	 * Returns the meta object for the reference '{@link lowcoders.AdditiveFeedback#getRecommender <em>Recommender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recommender</em>'.
	 * @see lowcoders.AdditiveFeedback#getRecommender()
	 * @see #getAdditiveFeedback()
	 * @generated
	 */
	EReference getAdditiveFeedback_Recommender();

	/**
	 * Returns the meta object for class '{@link lowcoders.ExplicitFeedback <em>Explicit Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Feedback</em>'.
	 * @see lowcoders.ExplicitFeedback
	 * @generated
	 */
	EClass getExplicitFeedback();

	/**
	 * Returns the meta object for class '{@link lowcoders.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see lowcoders.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link lowcoders.Rating#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lowcoders.Rating#getType()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Type();

	/**
	 * Returns the meta object for enum '{@link lowcoders.UserEventType <em>User Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Event Type</em>'.
	 * @see lowcoders.UserEventType
	 * @generated
	 */
	EEnum getUserEventType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.CollaborativeFilteringAlgorithm <em>Collaborative Filtering Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collaborative Filtering Algorithm</em>'.
	 * @see lowcoders.CollaborativeFilteringAlgorithm
	 * @generated
	 */
	EEnum getCollaborativeFilteringAlgorithm();

	/**
	 * Returns the meta object for enum '{@link lowcoders.WebContainer <em>Web Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Web Container</em>'.
	 * @see lowcoders.WebContainer
	 * @generated
	 */
	EEnum getWebContainer();

	/**
	 * Returns the meta object for enum '{@link lowcoders.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric</em>'.
	 * @see lowcoders.Metric
	 * @generated
	 */
	EEnum getMetric();

	/**
	 * Returns the meta object for enum '{@link lowcoders.PreprocessingTechnique <em>Preprocessing Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preprocessing Technique</em>'.
	 * @see lowcoders.PreprocessingTechnique
	 * @generated
	 */
	EEnum getPreprocessingTechnique();

	/**
	 * Returns the meta object for enum '{@link lowcoders.RecommendationUsageType <em>Recommendation Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recommendation Usage Type</em>'.
	 * @see lowcoders.RecommendationUsageType
	 * @generated
	 */
	EEnum getRecommendationUsageType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see lowcoders.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.DataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Mining RS Algorithm</em>'.
	 * @see lowcoders.DataMiningRSAlgorithm
	 * @generated
	 */
	EEnum getDataMiningRSAlgorithm();

	/**
	 * Returns the meta object for enum '{@link lowcoders.FilteringRSAlgorithm <em>Filtering RS Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filtering RS Algorithm</em>'.
	 * @see lowcoders.FilteringRSAlgorithm
	 * @generated
	 */
	EEnum getFilteringRSAlgorithm();

	/**
	 * Returns the meta object for enum '{@link lowcoders.SearchStrategy <em>Search Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Strategy</em>'.
	 * @see lowcoders.SearchStrategy
	 * @generated
	 */
	EEnum getSearchStrategy();

	/**
	 * Returns the meta object for enum '{@link lowcoders.MutationOperation <em>Mutation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mutation Operation</em>'.
	 * @see lowcoders.MutationOperation
	 * @generated
	 */
	EEnum getMutationOperation();

	/**
	 * Returns the meta object for enum '{@link lowcoders.UserStudyType <em>User Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Study Type</em>'.
	 * @see lowcoders.UserStudyType
	 * @generated
	 */
	EEnum getUserStudyType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.UserStudyAnalysis <em>User Study Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Study Analysis</em>'.
	 * @see lowcoders.UserStudyAnalysis
	 * @generated
	 */
	EEnum getUserStudyAnalysis();

	/**
	 * Returns the meta object for enum '{@link lowcoders.SimilarityFunction <em>Similarity Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Similarity Function</em>'.
	 * @see lowcoders.SimilarityFunction
	 * @generated
	 */
	EEnum getSimilarityFunction();

	/**
	 * Returns the meta object for enum '{@link lowcoders.PyLibType <em>Py Lib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Py Lib Type</em>'.
	 * @see lowcoders.PyLibType
	 * @generated
	 */
	EEnum getPyLibType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.FeedbackLibType <em>Feedback Lib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Lib Type</em>'.
	 * @see lowcoders.FeedbackLibType
	 * @generated
	 */
	EEnum getFeedbackLibType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.SolverType <em>Solver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Solver Type</em>'.
	 * @see lowcoders.SolverType
	 * @generated
	 */
	EEnum getSolverType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.KernelType <em>Kernel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kernel Type</em>'.
	 * @see lowcoders.KernelType
	 * @generated
	 */
	EEnum getKernelType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.ActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Type</em>'.
	 * @see lowcoders.ActivationType
	 * @generated
	 */
	EEnum getActivationType();

	/**
	 * Returns the meta object for enum '{@link lowcoders.DatasetManipulationLibrary <em>Dataset Manipulation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dataset Manipulation Library</em>'.
	 * @see lowcoders.DatasetManipulationLibrary
	 * @generated
	 */
	EEnum getDatasetManipulationLibrary();

	/**
	 * Returns the meta object for enum '{@link lowcoders.WebInterfaceLibrary <em>Web Interface Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Web Interface Library</em>'.
	 * @see lowcoders.WebInterfaceLibrary
	 * @generated
	 */
	EEnum getWebInterfaceLibrary();

	/**
	 * Returns the meta object for enum '{@link lowcoders.RawFormat <em>Raw Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Raw Format</em>'.
	 * @see lowcoders.RawFormat
	 * @generated
	 */
	EEnum getRawFormat();

	/**
	 * Returns the meta object for enum '{@link lowcoders.ValidationLibrary <em>Validation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Library</em>'.
	 * @see lowcoders.ValidationLibrary
	 * @generated
	 */
	EEnum getValidationLibrary();

	/**
	 * Returns the meta object for enum '{@link lowcoders.RatingType <em>Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rating Type</em>'.
	 * @see lowcoders.RatingType
	 * @generated
	 */
	EEnum getRatingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LowcodersFactory getLowcodersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lowcoders.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.NamedElementImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.UserEventImpl <em>User Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.UserEventImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getUserEvent()
		 * @generated
		 */
		EClass USER_EVENT = eINSTANCE.getUserEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_EVENT__EVENT_TYPE = eINSTANCE.getUserEvent_EventType();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DatasetImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Indipendent Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__INDIPENDENT_VARIABLES = eINSTANCE.getDataset_IndipendentVariables();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DATA_STRUCTURE = eINSTANCE.getDataset_DataStructure();

		/**
		 * The meta object literal for the '<em><b>Preprocessing</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__PREPROCESSING = eINSTANCE.getDataset_Preprocessing();

		/**
		 * The meta object literal for the '<em><b>Dataset Manipulation Library</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__DATASET_MANIPULATION_LIBRARY = eINSTANCE.getDataset_DatasetManipulationLibrary();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__PATH = eINSTANCE.getDataset_Path();

		/**
		 * The meta object literal for the '<em><b>Is Built In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__IS_BUILT_IN = eINSTANCE.getDataset_IsBuiltIn();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RSModelImpl <em>RS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RSModelImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRSModel()
		 * @generated
		 */
		EClass RS_MODEL = eINSTANCE.getRSModel();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS_MODEL__DATASET = eINSTANCE.getRSModel_Dataset();

		/**
		 * The meta object literal for the '<em><b>Presentation Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS_MODEL__PRESENTATION_LAYER = eINSTANCE.getRSModel_PresentationLayer();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS_MODEL__EVALUATION = eINSTANCE.getRSModel_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Recommendation System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS_MODEL__RECOMMENDATION_SYSTEM = eINSTANCE.getRSModel_RecommendationSystem();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS_MODEL__FEEDBACK = eINSTANCE.getRSModel_Feedback();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendationHandlerImpl <em>Recommendation Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendationHandlerImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationHandler()
		 * @generated
		 */
		EClass RECOMMENDATION_HANDLER = eINSTANCE.getRecommendationHandler();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_HANDLER__USAGE = eINSTANCE.getRecommendationHandler_Usage();

		/**
		 * The meta object literal for the '<em><b>Web Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_HANDLER__WEB_SERVICE = eINSTANCE.getRecommendationHandler_WebService();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_HANDLER__CONTEXT = eINSTANCE.getRecommendationHandler_Context();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ProactiveHandlerImpl <em>Proactive Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ProactiveHandlerImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getProactiveHandler()
		 * @generated
		 */
		EClass PROACTIVE_HANDLER = eINSTANCE.getProactiveHandler();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROACTIVE_HANDLER__CONDITION = eINSTANCE.getProactiveHandler_Condition();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ReactiveHandlerImpl <em>Reactive Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ReactiveHandlerImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getReactiveHandler()
		 * @generated
		 */
		EClass REACTIVE_HANDLER = eINSTANCE.getReactiveHandler();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIVE_HANDLER__EVENT = eINSTANCE.getReactiveHandler_Event();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendationUsageImpl <em>Recommendation Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendationUsageImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationUsage()
		 * @generated
		 */
		EClass RECOMMENDATION_USAGE = eINSTANCE.getRecommendationUsage();

		/**
		 * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_USAGE__USAGE_TYPE = eINSTANCE.getRecommendationUsage_UsageType();

		/**
		 * The meta object literal for the '<em><b>Recommended Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_USAGE__RECOMMENDED_ITEMS = eINSTANCE.getRecommendationUsage_RecommendedItems();

		/**
		 * The meta object literal for the '<em><b>Guielements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_USAGE__GUIELEMENTS = eINSTANCE.getRecommendationUsage_Guielements();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DataSourceImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.PresentationLayerImpl <em>Presentation Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.PresentationLayerImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getPresentationLayer()
		 * @generated
		 */
		EClass PRESENTATION_LAYER = eINSTANCE.getPresentationLayer();

		/**
		 * The meta object literal for the '<em><b>Recommendations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_LAYER__RECOMMENDATIONS = eINSTANCE.getPresentationLayer_Recommendations();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.WebIServiceImpl <em>Web IService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.WebIServiceImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getWebIService()
		 * @generated
		 */
		EClass WEB_ISERVICE = eINSTANCE.getWebIService();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ISERVICE__LIBRARY = eINSTANCE.getWebIService_Library();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.WebApplicationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__LIBRARY = eINSTANCE.getWebApplication_Library();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__PORT = eINSTANCE.getWebApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__HOST = eINSTANCE.getWebApplication_Host();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.IDEIntegrationImpl <em>IDE Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.IDEIntegrationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getIDEIntegration()
		 * @generated
		 */
		EClass IDE_INTEGRATION = eINSTANCE.getIDEIntegration();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.VSCodePluginImpl <em>VS Code Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.VSCodePluginImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getVSCodePlugin()
		 * @generated
		 */
		EClass VS_CODE_PLUGIN = eINSTANCE.getVSCodePlugin();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VS_CODE_PLUGIN__HANDLER = eINSTANCE.getVSCodePlugin_Handler();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.TraversableGraphImpl <em>Traversable Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.TraversableGraphImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getTraversableGraph()
		 * @generated
		 */
		EClass TRAVERSABLE_GRAPH = eINSTANCE.getTraversableGraph();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.EvaluationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Baselines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__BASELINES = eINSTANCE.getEvaluation_Baselines();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__METRICS = eINSTANCE.getEvaluation_Metrics();

		/**
		 * The meta object literal for the '<em><b>Validation Technique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__VALIDATION_TECHNIQUE = eINSTANCE.getEvaluation_ValidationTechnique();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ValidationTechniqueImpl <em>Validation Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ValidationTechniqueImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getValidationTechnique()
		 * @generated
		 */
		EClass VALIDATION_TECHNIQUE = eINSTANCE.getValidationTechnique();

		/**
		 * The meta object literal for the '<em><b>NOf Recommendations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS = eINSTANCE.getValidationTechnique_NOfRecommendations();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.UnsupervisedDatasetImpl <em>Unsupervised Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.UnsupervisedDatasetImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getUnsupervisedDataset()
		 * @generated
		 */
		EClass UNSUPERVISED_DATASET = eINSTANCE.getUnsupervisedDataset();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.SupervisedDatasetImpl <em>Supervised Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.SupervisedDatasetImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getSupervisedDataset()
		 * @generated
		 */
		EClass SUPERVISED_DATASET = eINSTANCE.getSupervisedDataset();

		/**
		 * The meta object literal for the '<em><b>Dependat Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_DATASET__DEPENDAT_VARIABLE = eINSTANCE.getSupervisedDataset_DependatVariable();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.VariableImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DATA_SOURCE = eINSTANCE.getVariable_DataSource();

		/**
		 * The meta object literal for the '<em><b>Preprocessing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PREPROCESSING = eINSTANCE.getVariable_Preprocessing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Is Missing Value Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_MISSING_VALUE_ALLOWED = eINSTANCE.getVariable_IsMissingValueAllowed();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_MULTIPLE = eINSTANCE.getVariable_IsMultiple();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.PreprocessingImpl <em>Preprocessing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.PreprocessingImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getPreprocessing()
		 * @generated
		 */
		EClass PREPROCESSING = eINSTANCE.getPreprocessing();

		/**
		 * The meta object literal for the '<em><b>Preprocessig Technique</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESSING__PREPROCESSIG_TECHNIQUE = eINSTANCE.getPreprocessing_PreprocessigTechnique();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.CodeRepositoryImpl <em>Code Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.CodeRepositoryImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getCodeRepository()
		 * @generated
		 */
		EClass CODE_REPOSITORY = eINSTANCE.getCodeRepository();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_REPOSITORY__METADATA = eINSTANCE.getCodeRepository_Metadata();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.CommunicationChannelImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getCommunicationChannel()
		 * @generated
		 */
		EClass COMMUNICATION_CHANNEL = eINSTANCE.getCommunicationChannel();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.BugTrackingSystemImpl <em>Bug Tracking System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.BugTrackingSystemImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getBugTrackingSystem()
		 * @generated
		 */
		EClass BUG_TRACKING_SYSTEM = eINSTANCE.getBugTrackingSystem();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DataStructureImpl <em>Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DataStructureImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.GraphImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__RELATIONS = eINSTANCE.getGraph_Relations();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.MatrixImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__COLUMNS = eINSTANCE.getMatrix_Columns();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.TreeImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.TextualContentImpl <em>Textual Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.TextualContentImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getTextualContent()
		 * @generated
		 */
		EClass TEXTUAL_CONTENT = eINSTANCE.getTextualContent();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTENT__CONTENTS = eINSTANCE.getTextualContent_Contents();

		/**
		 * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_CONTENT__ROOT_PATH = eINSTANCE.getTextualContent_RootPath();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ARFFImpl <em>ARFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ARFFImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getARFF()
		 * @generated
		 */
		EClass ARFF = eINSTANCE.getARFF();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARFF__VARIABLES = eINSTANCE.getARFF_Variables();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendationSystemImpl <em>Recommendation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendationSystemImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationSystem()
		 * @generated
		 */
		EClass RECOMMENDATION_SYSTEM = eINSTANCE.getRecommendationSystem();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_SYSTEM__SETTINGS = eINSTANCE.getRecommendationSystem_Settings();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_SYSTEM__SCOPE = eINSTANCE.getRecommendationSystem_Scope();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_SYSTEM__CONTEXT = eINSTANCE.getRecommendationSystem_Context();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_SYSTEM__GENERATOR = eINSTANCE.getRecommendationSystem_Generator();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.MachineLearningBasedRSImpl <em>Machine Learning Based RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.MachineLearningBasedRSImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getMachineLearningBasedRS()
		 * @generated
		 */
		EClass MACHINE_LEARNING_BASED_RS = eINSTANCE.getMachineLearningBasedRS();

		/**
		 * The meta object literal for the '<em><b>Num Epochs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_LEARNING_BASED_RS__NUM_EPOCHS = eINSTANCE.getMachineLearningBasedRS_NumEpochs();

		/**
		 * The meta object literal for the '<em><b>Learning Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_LEARNING_BASED_RS__LEARNING_RATE = eINSTANCE.getMachineLearningBasedRS_LearningRate();

		/**
		 * The meta object literal for the '<em><b>Mini Batch Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE = eINSTANCE.getMachineLearningBasedRS_MiniBatchSize();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.FilteringRSImpl <em>Filtering RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.FilteringRSImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getFilteringRS()
		 * @generated
		 */
		EClass FILTERING_RS = eINSTANCE.getFilteringRS();

		/**
		 * The meta object literal for the '<em><b>Filtering RS Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_RS__FILTERING_RS_ALGORITHM = eINSTANCE.getFilteringRS_FilteringRSAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Similarity Calculator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_RS__SIMILARITY_CALCULATOR = eINSTANCE.getFilteringRS_SimilarityCalculator();

		/**
		 * The meta object literal for the '<em><b>Cutoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_RS__CUTOFF = eINSTANCE.getFilteringRS_Cutoff();

		/**
		 * The meta object literal for the '<em><b>Neighborhood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_RS__NEIGHBORHOOD = eINSTANCE.getFilteringRS_Neighborhood();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DataMiningRSImpl <em>Data Mining RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DataMiningRSImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDataMiningRS()
		 * @generated
		 */
		EClass DATA_MINING_RS = eINSTANCE.getDataMiningRS();

		/**
		 * The meta object literal for the '<em><b>Data Mining RS Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MINING_RS__DATA_MINING_RS_ALGORITHM = eINSTANCE.getDataMiningRS_DataMiningRSAlgorithm();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.CustomRecommenderImpl <em>Custom Recommender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.CustomRecommenderImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getCustomRecommender()
		 * @generated
		 */
		EClass CUSTOM_RECOMMENDER = eINSTANCE.getCustomRecommender();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RECOMMENDER__DESCRIPTION = eINSTANCE.getCustomRecommender_Description();

		/**
		 * The meta object literal for the '<em><b>Required Tools</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RECOMMENDER__REQUIRED_TOOLS = eINSTANCE.getCustomRecommender_RequiredTools();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendationSettingImpl <em>Recommendation Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendationSettingImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationSetting()
		 * @generated
		 */
		EClass RECOMMENDATION_SETTING = eINSTANCE.getRecommendationSetting();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_SETTING__KEY = eINSTANCE.getRecommendationSetting_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_SETTING__VALUE = eINSTANCE.getRecommendationSetting_Value();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.GeneticAlgorithmImpl <em>Genetic Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.GeneticAlgorithmImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getGeneticAlgorithm()
		 * @generated
		 */
		EClass GENETIC_ALGORITHM = eINSTANCE.getGeneticAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Fitness Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENETIC_ALGORITHM__FITNESS_FUNCTION = eINSTANCE.getGeneticAlgorithm_FitnessFunction();

		/**
		 * The meta object literal for the '<em><b>Search Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENETIC_ALGORITHM__SEARCH_STRATEGY = eINSTANCE.getGeneticAlgorithm_SearchStrategy();

		/**
		 * The meta object literal for the '<em><b>Mutation Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENETIC_ALGORITHM__MUTATION_OPERATOR = eINSTANCE.getGeneticAlgorithm_MutationOperator();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.UserStudyImpl <em>User Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.UserStudyImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudy()
		 * @generated
		 */
		EClass USER_STUDY = eINSTANCE.getUserStudy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STUDY__TYPE = eINSTANCE.getUserStudy_Type();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STUDY__ANALYSIS = eINSTANCE.getUserStudy_Analysis();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.CrossValidationImpl <em>Cross Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.CrossValidationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getCrossValidation()
		 * @generated
		 */
		EClass CROSS_VALIDATION = eINSTANCE.getCrossValidation();

		/**
		 * The meta object literal for the '<em><b>Number Of Fold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_VALIDATION__NUMBER_OF_FOLD = eINSTANCE.getCrossValidation_NumberOfFold();

		/**
		 * The meta object literal for the '<em><b>Ground Truth Extractor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR = eINSTANCE.getCrossValidation_GroundTruthExtractor();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendationContextImpl <em>Recommendation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendationContextImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationContext()
		 * @generated
		 */
		EClass RECOMMENDATION_CONTEXT = eINSTANCE.getRecommendationContext();

		/**
		 * The meta object literal for the '<em><b>User Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATION_CONTEXT__USER_CONTEXT = eINSTANCE.getRecommendationContext_UserContext();

		/**
		 * The meta object literal for the '<em><b>Is Proactive System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM = eINSTANCE.getRecommendationContext_IsProactiveSystem();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DependencyManagerImpl <em>Dependency Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DependencyManagerImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDependencyManager()
		 * @generated
		 */
		EClass DEPENDENCY_MANAGER = eINSTANCE.getDependencyManager();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.VariableRelationImpl <em>Variable Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.VariableRelationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getVariableRelation()
		 * @generated
		 */
		EClass VARIABLE_RELATION = eINSTANCE.getVariableRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_RELATION__SOURCE = eINSTANCE.getVariableRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_RELATION__TARGET = eINSTANCE.getVariableRelation_Target();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.GroundTruthExtractionImpl <em>Ground Truth Extraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.GroundTruthExtractionImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getGroundTruthExtraction()
		 * @generated
		 */
		EClass GROUND_TRUTH_EXTRACTION = eINSTANCE.getGroundTruthExtraction();

		/**
		 * The meta object literal for the '<em><b>Size GT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_TRUTH_EXTRACTION__SIZE_GT = eINSTANCE.getGroundTruthExtraction_SizeGT();

		/**
		 * The meta object literal for the '<em><b>Splitting Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_TRUTH_EXTRACTION__SPLITTING_RULES = eINSTANCE.getGroundTruthExtraction_SplittingRules();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE = eINSTANCE.getGroundTruthExtraction_TargetVariable();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.FileImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SOURCE_PATH = eINSTANCE.getFile_SourcePath();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ENCODING = eINSTANCE.getFile_Encoding();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecommendedItemImpl <em>Recommended Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecommendedItemImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendedItem()
		 * @generated
		 */
		EClass RECOMMENDED_ITEM = eINSTANCE.getRecommendedItem();

		/**
		 * The meta object literal for the '<em><b>Outcame</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDED_ITEM__OUTCAME = eINSTANCE.getRecommendedItem_Outcame();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDED_ITEM__ORDERED = eINSTANCE.getRecommendedItem_Ordered();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ContextValidationImpl <em>Context Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ContextValidationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getContextValidation()
		 * @generated
		 */
		EClass CONTEXT_VALIDATION = eINSTANCE.getContextValidation();

		/**
		 * The meta object literal for the '<em><b>Test Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VALIDATION__TEST_CONTEXT = eINSTANCE.getContextValidation_TestContext();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RawOutcomesImpl <em>Raw Outcomes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RawOutcomesImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRawOutcomes()
		 * @generated
		 */
		EClass RAW_OUTCOMES = eINSTANCE.getRawOutcomes();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_OUTCOMES__FORMAT = eINSTANCE.getRawOutcomes_Format();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RandomSplittingImpl <em>Random Splitting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RandomSplittingImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRandomSplitting()
		 * @generated
		 */
		EClass RANDOM_SPLITTING = eINSTANCE.getRandomSplitting();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.AutomatedValidationImpl <em>Automated Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.AutomatedValidationImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getAutomatedValidation()
		 * @generated
		 */
		EClass AUTOMATED_VALIDATION = eINSTANCE.getAutomatedValidation();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATED_VALIDATION__LIBRARY = eINSTANCE.getAutomatedValidation_Library();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DeepNNImpl <em>Deep NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DeepNNImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDeepNN()
		 * @generated
		 */
		EClass DEEP_NN = eINSTANCE.getDeepNN();

		/**
		 * The meta object literal for the '<em><b>Num Hidden Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEEP_NN__NUM_HIDDEN_LAYER = eINSTANCE.getDeepNN_NumHiddenLayer();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ConvolutionalNNImpl <em>Convolutional NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ConvolutionalNNImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getConvolutionalNN()
		 * @generated
		 */
		EClass CONVOLUTIONAL_NN = eINSTANCE.getConvolutionalNN();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.BayesianImpl <em>Bayesian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.BayesianImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getBayesian()
		 * @generated
		 */
		EClass BAYESIAN = eINSTANCE.getBayesian();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RecurrentNNImpl <em>Recurrent NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RecurrentNNImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecurrentNN()
		 * @generated
		 */
		EClass RECURRENT_NN = eINSTANCE.getRecurrentNN();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.SVMImpl <em>SVM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.SVMImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getSVM()
		 * @generated
		 */
		EClass SVM = eINSTANCE.getSVM();

		/**
		 * The meta object literal for the '<em><b>Kernel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__KERNEL = eINSTANCE.getSVM_Kernel();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.DecisionTreeImpl <em>Decision Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.DecisionTreeImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getDecisionTree()
		 * @generated
		 */
		EClass DECISION_TREE = eINSTANCE.getDecisionTree();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.FeedForwardNNImpl <em>Feed Forward NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.FeedForwardNNImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getFeedForwardNN()
		 * @generated
		 */
		EClass FEED_FORWARD_NN = eINSTANCE.getFeedForwardNN();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_FORWARD_NN__SOLVER = eINSTANCE.getFeedForwardNN_Solver();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_FORWARD_NN__ALPHA = eINSTANCE.getFeedForwardNN_Alpha();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_FORWARD_NN__ACTIVATION_FUNCTION = eINSTANCE.getFeedForwardNN_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Random State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_FORWARD_NN__RANDOM_STATE = eINSTANCE.getFeedForwardNN_RandomState();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.GUIElementImpl <em>GUI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.GUIElementImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getGUIElement()
		 * @generated
		 */
		EClass GUI_ELEMENT = eINSTANCE.getGUIElement();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.UserImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Expressed Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__EXPRESSED_FEEDBACK = eINSTANCE.getUser_ExpressedFeedback();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__QUERY = eINSTANCE.getUser_Query();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.FeedbackComponentImpl <em>Feedback Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.FeedbackComponentImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getFeedbackComponent()
		 * @generated
		 */
		EClass FEEDBACK_COMPONENT = eINSTANCE.getFeedbackComponent();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_COMPONENT__QUERY = eINSTANCE.getFeedbackComponent_Query();

		/**
		 * The meta object literal for the '<em><b>Expressed Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK = eINSTANCE.getFeedbackComponent_ExpressedFeedback();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_COMPONENT__LIBRARY = eINSTANCE.getFeedbackComponent_Library();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.FeedbackImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__ITEM = eINSTANCE.getFeedback_Item();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ImplicitFeedbackImpl <em>Implicit Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ImplicitFeedbackImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getImplicitFeedback()
		 * @generated
		 */
		EClass IMPLICIT_FEEDBACK = eINSTANCE.getImplicitFeedback();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.HybridFeedbackImpl <em>Hybrid Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.HybridFeedbackImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getHybridFeedback()
		 * @generated
		 */
		EClass HYBRID_FEEDBACK = eINSTANCE.getHybridFeedback();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.AdditiveFeedbackImpl <em>Additive Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.AdditiveFeedbackImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getAdditiveFeedback()
		 * @generated
		 */
		EClass ADDITIVE_FEEDBACK = eINSTANCE.getAdditiveFeedback();

		/**
		 * The meta object literal for the '<em><b>Num Of Insertion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_FEEDBACK__NUM_OF_INSERTION = eINSTANCE.getAdditiveFeedback_NumOfInsertion();

		/**
		 * The meta object literal for the '<em><b>Recommender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_FEEDBACK__RECOMMENDER = eINSTANCE.getAdditiveFeedback_Recommender();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.ExplicitFeedbackImpl <em>Explicit Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.ExplicitFeedbackImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getExplicitFeedback()
		 * @generated
		 */
		EClass EXPLICIT_FEEDBACK = eINSTANCE.getExplicitFeedback();

		/**
		 * The meta object literal for the '{@link lowcoders.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.impl.RatingImpl
		 * @see lowcoders.impl.LowcodersPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__TYPE = eINSTANCE.getRating_Type();

		/**
		 * The meta object literal for the '{@link lowcoders.UserEventType <em>User Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.UserEventType
		 * @see lowcoders.impl.LowcodersPackageImpl#getUserEventType()
		 * @generated
		 */
		EEnum USER_EVENT_TYPE = eINSTANCE.getUserEventType();

		/**
		 * The meta object literal for the '{@link lowcoders.CollaborativeFilteringAlgorithm <em>Collaborative Filtering Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.CollaborativeFilteringAlgorithm
		 * @see lowcoders.impl.LowcodersPackageImpl#getCollaborativeFilteringAlgorithm()
		 * @generated
		 */
		EEnum COLLABORATIVE_FILTERING_ALGORITHM = eINSTANCE.getCollaborativeFilteringAlgorithm();

		/**
		 * The meta object literal for the '{@link lowcoders.WebContainer <em>Web Container</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.WebContainer
		 * @see lowcoders.impl.LowcodersPackageImpl#getWebContainer()
		 * @generated
		 */
		EEnum WEB_CONTAINER = eINSTANCE.getWebContainer();

		/**
		 * The meta object literal for the '{@link lowcoders.Metric <em>Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.Metric
		 * @see lowcoders.impl.LowcodersPackageImpl#getMetric()
		 * @generated
		 */
		EEnum METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link lowcoders.PreprocessingTechnique <em>Preprocessing Technique</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.PreprocessingTechnique
		 * @see lowcoders.impl.LowcodersPackageImpl#getPreprocessingTechnique()
		 * @generated
		 */
		EEnum PREPROCESSING_TECHNIQUE = eINSTANCE.getPreprocessingTechnique();

		/**
		 * The meta object literal for the '{@link lowcoders.RecommendationUsageType <em>Recommendation Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.RecommendationUsageType
		 * @see lowcoders.impl.LowcodersPackageImpl#getRecommendationUsageType()
		 * @generated
		 */
		EEnum RECOMMENDATION_USAGE_TYPE = eINSTANCE.getRecommendationUsageType();

		/**
		 * The meta object literal for the '{@link lowcoders.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.VariableType
		 * @see lowcoders.impl.LowcodersPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link lowcoders.DataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.DataMiningRSAlgorithm
		 * @see lowcoders.impl.LowcodersPackageImpl#getDataMiningRSAlgorithm()
		 * @generated
		 */
		EEnum DATA_MINING_RS_ALGORITHM = eINSTANCE.getDataMiningRSAlgorithm();

		/**
		 * The meta object literal for the '{@link lowcoders.FilteringRSAlgorithm <em>Filtering RS Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.FilteringRSAlgorithm
		 * @see lowcoders.impl.LowcodersPackageImpl#getFilteringRSAlgorithm()
		 * @generated
		 */
		EEnum FILTERING_RS_ALGORITHM = eINSTANCE.getFilteringRSAlgorithm();

		/**
		 * The meta object literal for the '{@link lowcoders.SearchStrategy <em>Search Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.SearchStrategy
		 * @see lowcoders.impl.LowcodersPackageImpl#getSearchStrategy()
		 * @generated
		 */
		EEnum SEARCH_STRATEGY = eINSTANCE.getSearchStrategy();

		/**
		 * The meta object literal for the '{@link lowcoders.MutationOperation <em>Mutation Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.MutationOperation
		 * @see lowcoders.impl.LowcodersPackageImpl#getMutationOperation()
		 * @generated
		 */
		EEnum MUTATION_OPERATION = eINSTANCE.getMutationOperation();

		/**
		 * The meta object literal for the '{@link lowcoders.UserStudyType <em>User Study Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.UserStudyType
		 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudyType()
		 * @generated
		 */
		EEnum USER_STUDY_TYPE = eINSTANCE.getUserStudyType();

		/**
		 * The meta object literal for the '{@link lowcoders.UserStudyAnalysis <em>User Study Analysis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.UserStudyAnalysis
		 * @see lowcoders.impl.LowcodersPackageImpl#getUserStudyAnalysis()
		 * @generated
		 */
		EEnum USER_STUDY_ANALYSIS = eINSTANCE.getUserStudyAnalysis();

		/**
		 * The meta object literal for the '{@link lowcoders.SimilarityFunction <em>Similarity Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.SimilarityFunction
		 * @see lowcoders.impl.LowcodersPackageImpl#getSimilarityFunction()
		 * @generated
		 */
		EEnum SIMILARITY_FUNCTION = eINSTANCE.getSimilarityFunction();

		/**
		 * The meta object literal for the '{@link lowcoders.PyLibType <em>Py Lib Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.PyLibType
		 * @see lowcoders.impl.LowcodersPackageImpl#getPyLibType()
		 * @generated
		 */
		EEnum PY_LIB_TYPE = eINSTANCE.getPyLibType();

		/**
		 * The meta object literal for the '{@link lowcoders.FeedbackLibType <em>Feedback Lib Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.FeedbackLibType
		 * @see lowcoders.impl.LowcodersPackageImpl#getFeedbackLibType()
		 * @generated
		 */
		EEnum FEEDBACK_LIB_TYPE = eINSTANCE.getFeedbackLibType();

		/**
		 * The meta object literal for the '{@link lowcoders.SolverType <em>Solver Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.SolverType
		 * @see lowcoders.impl.LowcodersPackageImpl#getSolverType()
		 * @generated
		 */
		EEnum SOLVER_TYPE = eINSTANCE.getSolverType();

		/**
		 * The meta object literal for the '{@link lowcoders.KernelType <em>Kernel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.KernelType
		 * @see lowcoders.impl.LowcodersPackageImpl#getKernelType()
		 * @generated
		 */
		EEnum KERNEL_TYPE = eINSTANCE.getKernelType();

		/**
		 * The meta object literal for the '{@link lowcoders.ActivationType <em>Activation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.ActivationType
		 * @see lowcoders.impl.LowcodersPackageImpl#getActivationType()
		 * @generated
		 */
		EEnum ACTIVATION_TYPE = eINSTANCE.getActivationType();

		/**
		 * The meta object literal for the '{@link lowcoders.DatasetManipulationLibrary <em>Dataset Manipulation Library</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.DatasetManipulationLibrary
		 * @see lowcoders.impl.LowcodersPackageImpl#getDatasetManipulationLibrary()
		 * @generated
		 */
		EEnum DATASET_MANIPULATION_LIBRARY = eINSTANCE.getDatasetManipulationLibrary();

		/**
		 * The meta object literal for the '{@link lowcoders.WebInterfaceLibrary <em>Web Interface Library</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.WebInterfaceLibrary
		 * @see lowcoders.impl.LowcodersPackageImpl#getWebInterfaceLibrary()
		 * @generated
		 */
		EEnum WEB_INTERFACE_LIBRARY = eINSTANCE.getWebInterfaceLibrary();

		/**
		 * The meta object literal for the '{@link lowcoders.RawFormat <em>Raw Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.RawFormat
		 * @see lowcoders.impl.LowcodersPackageImpl#getRawFormat()
		 * @generated
		 */
		EEnum RAW_FORMAT = eINSTANCE.getRawFormat();

		/**
		 * The meta object literal for the '{@link lowcoders.ValidationLibrary <em>Validation Library</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.ValidationLibrary
		 * @see lowcoders.impl.LowcodersPackageImpl#getValidationLibrary()
		 * @generated
		 */
		EEnum VALIDATION_LIBRARY = eINSTANCE.getValidationLibrary();

		/**
		 * The meta object literal for the '{@link lowcoders.RatingType <em>Rating Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lowcoders.RatingType
		 * @see lowcoders.impl.LowcodersPackageImpl#getRatingType()
		 * @generated
		 */
		EEnum RATING_TYPE = eINSTANCE.getRatingType();

	}

} //LowcodersPackage
