/**
 */
package cse487.Scheduler.model.scheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsName <em>Constituents Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsName <em>Antibiotics Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}</li>
 * </ul>
 * </p>
 *
 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Constituents Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituents Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituents Name</em>' attribute.
	 * @see #setConstituentsName(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe_ConstituentsName()
	 * @model
	 * @generated
	 */
	String getConstituentsName();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsName <em>Constituents Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constituents Name</em>' attribute.
	 * @see #getConstituentsName()
	 * @generated
	 */
	void setConstituentsName(String value);

	/**
	 * Returns the value of the '<em><b>Constituents Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituents Weights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituents Weights</em>' attribute.
	 * @see #setConstituentsWeights(int)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe_ConstituentsWeights()
	 * @model
	 * @generated
	 */
	int getConstituentsWeights();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constituents Weights</em>' attribute.
	 * @see #getConstituentsWeights()
	 * @generated
	 */
	void setConstituentsWeights(int value);

	/**
	 * Returns the value of the '<em><b>Antibiotics Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics Ratio</em>' attribute.
	 * @see #setAntibioticsRatio(double)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe_AntibioticsRatio()
	 * @model
	 * @generated
	 */
	double getAntibioticsRatio();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Ratio</em>' attribute.
	 * @see #getAntibioticsRatio()
	 * @generated
	 */
	void setAntibioticsRatio(double value);

	/**
	 * Returns the value of the '<em><b>Antibiotics Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics Name</em>' attribute.
	 * @see #setAntibioticsName(String)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe_AntibioticsName()
	 * @model
	 * @generated
	 */
	String getAntibioticsName();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsName <em>Antibiotics Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Name</em>' attribute.
	 * @see #getAntibioticsName()
	 * @generated
	 */
	void setAntibioticsName(String value);

	/**
	 * Returns the value of the '<em><b>Antibiotics Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics Weights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics Weights</em>' attribute.
	 * @see #setAntibioticsWeights(int)
	 * @see cse487.Scheduler.model.scheduling.SchedulingPackage#getRecipe_AntibioticsWeights()
	 * @model
	 * @generated
	 */
	int getAntibioticsWeights();

	/**
	 * Sets the value of the '{@link cse487.Scheduler.model.scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Weights</em>' attribute.
	 * @see #getAntibioticsWeights()
	 * @generated
	 */
	void setAntibioticsWeights(int value);

} // Recipe
