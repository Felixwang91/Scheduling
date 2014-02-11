/**
 */
package cse487.Scheduler.model.scheduling;

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
 *   <li>{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.CustomerOrder#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.CustomerOrder#getSubOrder <em>Sub Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomerOrder()
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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomerOrder_OrderID()
	 * @model
	 * @generated
	 */
	int getOrderID();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(int value);

	/**
	 * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Name</em>' attribute.
	 * @see #setCustomerName(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomerOrder_CustomerName()
	 * @model
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomerOrder_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.CustomerOrder#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sub Order</b></em>' containment reference list.
	 * The list contents are of type {@link cse487.Scheduler.model.scheduling.SubOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Order</em>' containment reference list.
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomerOrder_SubOrder()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubOrder> getSubOrder();

} // CustomerOrder
