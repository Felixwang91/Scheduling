/**
 */
package cse487.Scheduler.model.scheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.Customer#getName <em>Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Customer#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Customer#getContactPhone <em>Contact Phone</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Customer#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomer_AccountNumber()
	 * @model
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Customer#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Contact Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Phone</em>' attribute.
	 * @see #setContactPhone(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomer_ContactPhone()
	 * @model
	 * @generated
	 */
	String getContactPhone();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Customer#getContactPhone <em>Contact Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Phone</em>' attribute.
	 * @see #getContactPhone()
	 * @generated
	 */
	void setContactPhone(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getCustomer_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Customer#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // Customer
