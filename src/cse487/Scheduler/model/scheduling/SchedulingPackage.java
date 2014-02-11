/**
 */
package cse487.Scheduler.model.scheduling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see cse487.Scheduler.model.scheduling.SchedulingFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://scheduling/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scheduling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulingPackage eINSTANCE = cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl <em>Customer Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getCustomerOrder()
	 * @generated
	 */
	int CUSTOMER_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER__CUSTOMER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER__ORDER_DATE = 2;

	/**
	 * The feature id for the '<em><b>Sub Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER__SUB_ORDER = 3;

	/**
	 * The number of structural features of the '<em>Customer Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.SubOrderImpl <em>Sub Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.SubOrderImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getSubOrder()
	 * @generated
	 */
	int SUB_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Require Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__REQUIRE_FLUSH = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Deliver Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__DELIVER_DATE = 2;

	/**
	 * The feature id for the '<em><b>Farm Location Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__FARM_LOCATION_LAT = 3;

	/**
	 * The feature id for the '<em><b>Farm Lcation Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__FARM_LCATION_LONG = 4;

	/**
	 * The feature id for the '<em><b>Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__BIN = 5;

	/**
	 * The feature id for the '<em><b>Miles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__MILES = 6;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER__RECIPE = 7;

	/**
	 * The number of structural features of the '<em>Sub Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Sub Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.RecipeImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 2;

	/**
	 * The feature id for the '<em><b>Constituents Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__CONSTITUENTS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Constituents Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__CONSTITUENTS_WEIGHTS = 1;

	/**
	 * The feature id for the '<em><b>Antibiotics Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__ANTIBIOTICS_RATIO = 2;

	/**
	 * The feature id for the '<em><b>Antibiotics Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__ANTIBIOTICS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Antibiotics Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__ANTIBIOTICS_WEIGHTS = 4;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.CustomerImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACCOUNT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Contact Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CONTACT_PHONE = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.AddressImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS1 = 0;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS2 = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 3;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP = 4;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.ConsituentImpl <em>Consituent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.ConsituentImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getConsituent()
	 * @generated
	 */
	int CONSITUENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSITUENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSITUENT__QUANTITY_ON_HAND = 1;

	/**
	 * The number of structural features of the '<em>Consituent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSITUENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Consituent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSITUENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cse487.Scheduler.model.scheduling.impl.AntibioticsImpl <em>Antibiotics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cse487.Scheduler.model.scheduling.impl.AntibioticsImpl
	 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getAntibiotics()
	 * @generated
	 */
	int ANTIBIOTICS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIBIOTICS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIBIOTICS__QUANTITY_ON_HAND = 1;

	/**
	 * The number of structural features of the '<em>Antibiotics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIBIOTICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Antibiotics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIBIOTICS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.CustomerOrder <em>Customer Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Order</em>'.
	 * @see cse487.Scheduler.model.scheduling.CustomerOrder
	 * @generated
	 */
	EClass getCustomerOrder();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see cse487.Scheduler.model.scheduling.CustomerOrder#getOrderID()
	 * @see #getCustomerOrder()
	 * @generated
	 */
	EAttribute getCustomerOrder_OrderID();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getCustomerName <em>Customer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.CustomerOrder#getCustomerName()
	 * @see #getCustomerOrder()
	 * @generated
	 */
	EAttribute getCustomerOrder_CustomerName();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see cse487.Scheduler.model.scheduling.CustomerOrder#getOrderDate()
	 * @see #getCustomerOrder()
	 * @generated
	 */
	EAttribute getCustomerOrder_OrderDate();

	/**
	 * Returns the meta object for the containment reference list '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getSubOrder <em>Sub Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Order</em>'.
	 * @see cse487.Scheduler.model.scheduling.CustomerOrder#getSubOrder()
	 * @see #getCustomerOrder()
	 * @generated
	 */
	EReference getCustomerOrder_SubOrder();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.SubOrder <em>Sub Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Order</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder
	 * @generated
	 */
	EClass getSubOrder();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#isRequireFlush <em>Require Flush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Flush</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#isRequireFlush()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_RequireFlush();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getQuantity()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getDeliverDate <em>Deliver Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliver Date</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getDeliverDate()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_DeliverDate();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLocationLat <em>Farm Location Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farm Location Lat</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getFarmLocationLat()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_FarmLocationLat();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLcationLong <em>Farm Lcation Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farm Lcation Long</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getFarmLcationLong()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_FarmLcationLong();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getBin <em>Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getBin()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_Bin();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.SubOrder#getMiles <em>Miles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miles</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getMiles()
	 * @see #getSubOrder()
	 * @generated
	 */
	EAttribute getSubOrder_Miles();

	/**
	 * Returns the meta object for the containment reference list '{@link cse487.Scheduler.model.scheduling.SubOrder#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipe</em>'.
	 * @see cse487.Scheduler.model.scheduling.SubOrder#getRecipe()
	 * @see #getSubOrder()
	 * @generated
	 */
	EReference getSubOrder_Recipe();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsName <em>Constituents Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constituents Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe#getConstituentsName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_ConstituentsName();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constituents Weights</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe#getConstituentsWeights()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_ConstituentsWeights();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antibiotics Ratio</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe#getAntibioticsRatio()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_AntibioticsRatio();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsName <em>Antibiotics Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antibiotics Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe#getAntibioticsName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_AntibioticsName();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antibiotics Weights</em>'.
	 * @see cse487.Scheduler.model.scheduling.Recipe#getAntibioticsWeights()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_AntibioticsWeights();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see cse487.Scheduler.model.scheduling.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Customer#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see cse487.Scheduler.model.scheduling.Customer#getAccountNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Customer#getContactPhone <em>Contact Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Phone</em>'.
	 * @see cse487.Scheduler.model.scheduling.Customer#getContactPhone()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ContactPhone();

	/**
	 * Returns the meta object for the containment reference '{@link cse487.Scheduler.model.scheduling.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see cse487.Scheduler.model.scheduling.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Address();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Address#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address#getAddress1()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Address1();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Address#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address#getAddress2()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Address2();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Address#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see cse487.Scheduler.model.scheduling.Address#getZip()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Zip();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.Consituent <em>Consituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consituent</em>'.
	 * @see cse487.Scheduler.model.scheduling.Consituent
	 * @generated
	 */
	EClass getConsituent();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Consituent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.Consituent#getName()
	 * @see #getConsituent()
	 * @generated
	 */
	EAttribute getConsituent_Name();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Consituent#getQuantityOnHand <em>Quantity On Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity On Hand</em>'.
	 * @see cse487.Scheduler.model.scheduling.Consituent#getQuantityOnHand()
	 * @see #getConsituent()
	 * @generated
	 */
	EAttribute getConsituent_QuantityOnHand();

	/**
	 * Returns the meta object for class '{@link cse487.Scheduler.model.scheduling.Antibiotics <em>Antibiotics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antibiotics</em>'.
	 * @see cse487.Scheduler.model.scheduling.Antibiotics
	 * @generated
	 */
	EClass getAntibiotics();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Antibiotics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cse487.Scheduler.model.scheduling.Antibiotics#getName()
	 * @see #getAntibiotics()
	 * @generated
	 */
	EAttribute getAntibiotics_Name();

	/**
	 * Returns the meta object for the attribute '{@link cse487.Scheduler.model.scheduling.Antibiotics#getQuantityOnHand <em>Quantity On Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity On Hand</em>'.
	 * @see cse487.Scheduler.model.scheduling.Antibiotics#getQuantityOnHand()
	 * @see #getAntibiotics()
	 * @generated
	 */
	EAttribute getAntibiotics_QuantityOnHand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulingFactory getSchedulingFactory();

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
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl <em>Customer Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getCustomerOrder()
		 * @generated
		 */
		EClass CUSTOMER_ORDER = eINSTANCE.getCustomerOrder();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ORDER__ORDER_ID = eINSTANCE.getCustomerOrder_OrderID();

		/**
		 * The meta object literal for the '<em><b>Customer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ORDER__CUSTOMER_NAME = eINSTANCE.getCustomerOrder_CustomerName();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ORDER__ORDER_DATE = eINSTANCE.getCustomerOrder_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Sub Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ORDER__SUB_ORDER = eINSTANCE.getCustomerOrder_SubOrder();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.SubOrderImpl <em>Sub Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.SubOrderImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getSubOrder()
		 * @generated
		 */
		EClass SUB_ORDER = eINSTANCE.getSubOrder();

		/**
		 * The meta object literal for the '<em><b>Require Flush</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__REQUIRE_FLUSH = eINSTANCE.getSubOrder_RequireFlush();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__QUANTITY = eINSTANCE.getSubOrder_Quantity();

		/**
		 * The meta object literal for the '<em><b>Deliver Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__DELIVER_DATE = eINSTANCE.getSubOrder_DeliverDate();

		/**
		 * The meta object literal for the '<em><b>Farm Location Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__FARM_LOCATION_LAT = eINSTANCE.getSubOrder_FarmLocationLat();

		/**
		 * The meta object literal for the '<em><b>Farm Lcation Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__FARM_LCATION_LONG = eINSTANCE.getSubOrder_FarmLcationLong();

		/**
		 * The meta object literal for the '<em><b>Bin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__BIN = eINSTANCE.getSubOrder_Bin();

		/**
		 * The meta object literal for the '<em><b>Miles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ORDER__MILES = eINSTANCE.getSubOrder_Miles();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ORDER__RECIPE = eINSTANCE.getSubOrder_Recipe();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.RecipeImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Constituents Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__CONSTITUENTS_NAME = eINSTANCE.getRecipe_ConstituentsName();

		/**
		 * The meta object literal for the '<em><b>Constituents Weights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__CONSTITUENTS_WEIGHTS = eINSTANCE.getRecipe_ConstituentsWeights();

		/**
		 * The meta object literal for the '<em><b>Antibiotics Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__ANTIBIOTICS_RATIO = eINSTANCE.getRecipe_AntibioticsRatio();

		/**
		 * The meta object literal for the '<em><b>Antibiotics Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__ANTIBIOTICS_NAME = eINSTANCE.getRecipe_AntibioticsName();

		/**
		 * The meta object literal for the '<em><b>Antibiotics Weights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__ANTIBIOTICS_WEIGHTS = eINSTANCE.getRecipe_AntibioticsWeights();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.CustomerImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ACCOUNT_NUMBER = eINSTANCE.getCustomer_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Contact Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CONTACT_PHONE = eINSTANCE.getCustomer_ContactPhone();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.AddressImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS1 = eINSTANCE.getAddress_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS2 = eINSTANCE.getAddress_Address2();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ZIP = eINSTANCE.getAddress_Zip();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.ConsituentImpl <em>Consituent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.ConsituentImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getConsituent()
		 * @generated
		 */
		EClass CONSITUENT = eINSTANCE.getConsituent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSITUENT__NAME = eINSTANCE.getConsituent_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity On Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSITUENT__QUANTITY_ON_HAND = eINSTANCE.getConsituent_QuantityOnHand();

		/**
		 * The meta object literal for the '{@link cse487.Scheduler.model.scheduling.impl.AntibioticsImpl <em>Antibiotics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cse487.Scheduler.model.scheduling.impl.AntibioticsImpl
		 * @see cse487.Scheduler.model.scheduling.impl.SchedulingPackageImpl#getAntibiotics()
		 * @generated
		 */
		EClass ANTIBIOTICS = eINSTANCE.getAntibiotics();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTIBIOTICS__NAME = eINSTANCE.getAntibiotics_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity On Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTIBIOTICS__QUANTITY_ON_HAND = eINSTANCE.getAntibiotics_QuantityOnHand();

	}

} //SchedulingPackage
