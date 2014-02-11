/**
 */
package cse487.Scheduler.model.scheduling.impl;

import cse487.Scheduler.model.scheduling.CustomerOrder;
import cse487.Scheduler.model.scheduling.SchedulingPackage;
import cse487.Scheduler.model.scheduling.SubOrder;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.CustomerOrderImpl#getSubOrder <em>Sub Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerOrderImpl extends MinimalEObjectImpl.Container implements CustomerOrder {
	/**
	 * The default value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected int orderID = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected String customerName = CUSTOMER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubOrder() <em>Sub Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<SubOrder> subOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingPackage.Literals.CUSTOMER_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderID(int newOrderID) {
		int oldOrderID = orderID;
		orderID = newOrderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.CUSTOMER_ORDER__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerName(String newCustomerName) {
		String oldCustomerName = customerName;
		customerName = newCustomerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.CUSTOMER_ORDER__CUSTOMER_NAME, oldCustomerName, customerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(Date newOrderDate) {
		Date oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.CUSTOMER_ORDER__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubOrder> getSubOrder() {
		if (subOrder == null) {
			subOrder = new EObjectContainmentEList<SubOrder>(SubOrder.class, this, SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER);
		}
		return subOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER:
				return ((InternalEList<?>)getSubOrder()).basicRemove(otherEnd, msgs);
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
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_ID:
				return getOrderID();
			case SchedulingPackage.CUSTOMER_ORDER__CUSTOMER_NAME:
				return getCustomerName();
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_DATE:
				return getOrderDate();
			case SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER:
				return getSubOrder();
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
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_ID:
				setOrderID((Integer)newValue);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__CUSTOMER_NAME:
				setCustomerName((String)newValue);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_DATE:
				setOrderDate((Date)newValue);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER:
				getSubOrder().clear();
				getSubOrder().addAll((Collection<? extends SubOrder>)newValue);
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
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_ID:
				setOrderID(ORDER_ID_EDEFAULT);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__CUSTOMER_NAME:
				setCustomerName(CUSTOMER_NAME_EDEFAULT);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER:
				getSubOrder().clear();
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
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_ID:
				return orderID != ORDER_ID_EDEFAULT;
			case SchedulingPackage.CUSTOMER_ORDER__CUSTOMER_NAME:
				return CUSTOMER_NAME_EDEFAULT == null ? customerName != null : !CUSTOMER_NAME_EDEFAULT.equals(customerName);
			case SchedulingPackage.CUSTOMER_ORDER__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
			case SchedulingPackage.CUSTOMER_ORDER__SUB_ORDER:
				return subOrder != null && !subOrder.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orderID: ");
		result.append(orderID);
		result.append(", customerName: ");
		result.append(customerName);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(')');
		return result.toString();
	}

} //CustomerOrderImpl
