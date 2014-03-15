/**
 */
package scheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antibiotics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduling.Antibiotics#getName <em>Name</em>}</li>
 *   <li>{@link scheduling.Antibiotics#getQuantityOnHand <em>Quantity On Hand</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduling.SchedulingPackage#getAntibiotics()
 * @model
 * @generated
 */
public interface Antibiotics extends EObject {
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
	 * @see scheduling.SchedulingPackage#getAntibiotics_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scheduling.Antibiotics#getName <em>Name</em>}' attribute.
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
	 * @see scheduling.SchedulingPackage#getAntibiotics_QuantityOnHand()
	 * @model
	 * @generated
	 */
	int getQuantityOnHand();

	/**
	 * Sets the value of the '{@link scheduling.Antibiotics#getQuantityOnHand <em>Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand</em>' attribute.
	 * @see #getQuantityOnHand()
	 * @generated
	 */
	void setQuantityOnHand(int value);

} // Antibiotics
