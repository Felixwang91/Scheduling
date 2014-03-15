/**
 */
package scheduling;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduling.CustomerOrder#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link scheduling.CustomerOrder#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link scheduling.CustomerOrder#getSubOrder <em>Sub Order</em>}</li>
 *   <li>{@link scheduling.CustomerOrder#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduling.SchedulingPackage#getCustomerOrder()
 * @model
 * @generated
 */
public interface CustomerOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(int)
	 * @see scheduling.SchedulingPackage#getCustomerOrder_OrderID()
	 * @model
	 * @generated
	 */
	int getOrderID();

	/**
	 * Sets the value of the '{@link scheduling.CustomerOrder#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(int value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see scheduling.SchedulingPackage#getCustomerOrder_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link scheduling.CustomerOrder#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sub Order</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.SubOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Order</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getCustomerOrder_SubOrder()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubOrder> getSubOrder();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(Customer)
	 * @see scheduling.SchedulingPackage#getCustomerOrder_Customer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link scheduling.CustomerOrder#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // CustomerOrder
