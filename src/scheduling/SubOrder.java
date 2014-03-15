/**
 */
package scheduling;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduling.SubOrder#isRequireFlush <em>Require Flush</em>}</li>
 *   <li>{@link scheduling.SubOrder#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link scheduling.SubOrder#getDeliverDate <em>Deliver Date</em>}</li>
 *   <li>{@link scheduling.SubOrder#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduling.SchedulingPackage#getSubOrder()
 * @model
 * @generated
 */
public interface SubOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Require Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Flush</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Flush</em>' attribute.
	 * @see #setRequireFlush(boolean)
	 * @see scheduling.SchedulingPackage#getSubOrder_RequireFlush()
	 * @model
	 * @generated
	 */
	boolean isRequireFlush();

	/**
	 * Sets the value of the '{@link scheduling.SubOrder#isRequireFlush <em>Require Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Flush</em>' attribute.
	 * @see #isRequireFlush()
	 * @generated
	 */
	void setRequireFlush(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see scheduling.SchedulingPackage#getSubOrder_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link scheduling.SubOrder#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Deliver Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliver Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliver Date</em>' attribute.
	 * @see #setDeliverDate(Date)
	 * @see scheduling.SchedulingPackage#getSubOrder_DeliverDate()
	 * @model
	 * @generated
	 */
	Date getDeliverDate();

	/**
	 * Sets the value of the '{@link scheduling.SubOrder#getDeliverDate <em>Deliver Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver Date</em>' attribute.
	 * @see #getDeliverDate()
	 * @generated
	 */
	void setDeliverDate(Date value);

	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getSubOrder_Recipe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe> getRecipe();

} // SubOrder
