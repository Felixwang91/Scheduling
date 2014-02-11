/**
 */
package cse487.Scheduler.model.scheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consituent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.Consituent#getName <em>Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Consituent#getQuantityOnHand <em>Quantity On Hand</em>}</li>
 * </ul>
 * </p>
 *
 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getConsituent()
 * @model
 * @generated
 */
public interface Consituent extends EObject {
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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getConsituent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Consituent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand</em>' attribute.
	 * @see #setQuantityOnHand(int)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getConsituent_QuantityOnHand()
	 * @model
	 * @generated
	 */
	int getQuantityOnHand();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Consituent#getQuantityOnHand <em>Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand</em>' attribute.
	 * @see #getQuantityOnHand()
	 * @generated
	 */
	void setQuantityOnHand(int value);

} // Consituent
