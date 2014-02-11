/**
 */
package cse487.Scheduler.model.scheduling;

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
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#isRequireFlush <em>Require Flush</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getDeliverDate <em>Deliver Date</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLocationLat <em>Farm Location Lat</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLcationLong <em>Farm Lcation Long</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getBin <em>Bin</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getMiles <em>Miles</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.SubOrder#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder()
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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_RequireFlush()
	 * @model
	 * @generated
	 */
	boolean isRequireFlush();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#isRequireFlush <em>Require Flush</em>}' attribute.
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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getQuantity <em>Quantity</em>}' attribute.
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
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_DeliverDate()
	 * @model
	 * @generated
	 */
	Date getDeliverDate();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getDeliverDate <em>Deliver Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver Date</em>' attribute.
	 * @see #getDeliverDate()
	 * @generated
	 */
	void setDeliverDate(Date value);

	/**
	 * Returns the value of the '<em><b>Farm Location Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farm Location Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm Location Lat</em>' attribute.
	 * @see #setFarmLocationLat(double)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_FarmLocationLat()
	 * @model
	 * @generated
	 */
	double getFarmLocationLat();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLocationLat <em>Farm Location Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farm Location Lat</em>' attribute.
	 * @see #getFarmLocationLat()
	 * @generated
	 */
	void setFarmLocationLat(double value);

	/**
	 * Returns the value of the '<em><b>Farm Lcation Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farm Lcation Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm Lcation Long</em>' attribute.
	 * @see #setFarmLcationLong(double)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_FarmLcationLong()
	 * @model
	 * @generated
	 */
	double getFarmLcationLong();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getFarmLcationLong <em>Farm Lcation Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farm Lcation Long</em>' attribute.
	 * @see #getFarmLcationLong()
	 * @generated
	 */
	void setFarmLcationLong(double value);

	/**
	 * Returns the value of the '<em><b>Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin</em>' attribute.
	 * @see #setBin(int)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_Bin()
	 * @model
	 * @generated
	 */
	int getBin();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getBin <em>Bin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin</em>' attribute.
	 * @see #getBin()
	 * @generated
	 */
	void setBin(int value);

	/**
	 * Returns the value of the '<em><b>Miles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miles</em>' attribute.
	 * @see #setMiles(int)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_Miles()
	 * @model
	 * @generated
	 */
	int getMiles();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.SubOrder#getMiles <em>Miles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miles</em>' attribute.
	 * @see #getMiles()
	 * @generated
	 */
	void setMiles(int value);

	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' containment reference list.
	 * The list contents are of type {@link cse487.Scheduler.model.scheduling.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' containment reference list.
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getSubOrder_Recipe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe> getRecipe();

} // SubOrder
