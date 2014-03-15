/**
 */
package scheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduling.Recipe#getRecipeName <em>Recipe Name</em>}</li>
 *   <li>{@link scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}</li>
 *   <li>{@link scheduling.Recipe#getConsituent <em>Consituent</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibiotics <em>Antibiotics</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduling.SchedulingPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Recipe Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe Name</em>' attribute.
	 * @see #setRecipeName(String)
	 * @see scheduling.SchedulingPackage#getRecipe_RecipeName()
	 * @model
	 * @generated
	 */
	String getRecipeName();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getRecipeName <em>Recipe Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe Name</em>' attribute.
	 * @see #getRecipeName()
	 * @generated
	 */
	void setRecipeName(String value);

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
	 * @see scheduling.SchedulingPackage#getRecipe_ConstituentsWeights()
	 * @model
	 * @generated
	 */
	int getConstituentsWeights();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}' attribute.
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
	 * @see scheduling.SchedulingPackage#getRecipe_AntibioticsRatio()
	 * @model
	 * @generated
	 */
	double getAntibioticsRatio();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Ratio</em>' attribute.
	 * @see #getAntibioticsRatio()
	 * @generated
	 */
	void setAntibioticsRatio(double value);

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
	 * @see scheduling.SchedulingPackage#getRecipe_AntibioticsWeights()
	 * @model
	 * @generated
	 */
	int getAntibioticsWeights();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Weights</em>' attribute.
	 * @see #getAntibioticsWeights()
	 * @generated
	 */
	void setAntibioticsWeights(int value);

	/**
	 * Returns the value of the '<em><b>Consituent</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.Consituent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consituent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consituent</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getRecipe_Consituent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Consituent> getConsituent();

	/**
	 * Returns the value of the '<em><b>Antibiotics</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.Antibiotics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getRecipe_Antibiotics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Antibiotics> getAntibiotics();

} // Recipe
