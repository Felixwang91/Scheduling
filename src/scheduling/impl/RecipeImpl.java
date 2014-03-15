/**
 */
package scheduling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scheduling.Antibiotics;
import scheduling.Consituent;
import scheduling.Recipe;
import scheduling.SchedulingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scheduling.impl.RecipeImpl#getRecipeName <em>Recipe Name</em>}</li>
 *   <li>{@link scheduling.impl.RecipeImpl#getConstituentsWeights <em>Constituents Weights</em>}</li>
 *   <li>{@link scheduling.impl.RecipeImpl#getAntibioticsRatio <em>Antibiotics Ratio</em>}</li>
 *   <li>{@link scheduling.impl.RecipeImpl#getAntibioticsWeights <em>Antibiotics Weights</em>}</li>
 *   <li>{@link scheduling.impl.RecipeImpl#getConsituent <em>Consituent</em>}</li>
 *   <li>{@link scheduling.impl.RecipeImpl#getAntibiotics <em>Antibiotics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe {
	/**
	 * The default value of the '{@link #getRecipeName() <em>Recipe Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipeName()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipeName() <em>Recipe Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipeName()
	 * @generated
	 * @ordered
	 */
	protected String recipeName = RECIPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstituentsWeights() <em>Constituents Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituentsWeights()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSTITUENTS_WEIGHTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConstituentsWeights() <em>Constituents Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituentsWeights()
	 * @generated
	 * @ordered
	 */
	protected int constituentsWeights = CONSTITUENTS_WEIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntibioticsRatio() <em>Antibiotics Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double ANTIBIOTICS_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAntibioticsRatio() <em>Antibiotics Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsRatio()
	 * @generated
	 * @ordered
	 */
	protected double antibioticsRatio = ANTIBIOTICS_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntibioticsWeights() <em>Antibiotics Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsWeights()
	 * @generated
	 * @ordered
	 */
	protected static final int ANTIBIOTICS_WEIGHTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAntibioticsWeights() <em>Antibiotics Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsWeights()
	 * @generated
	 * @ordered
	 */
	protected int antibioticsWeights = ANTIBIOTICS_WEIGHTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsituent() <em>Consituent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsituent()
	 * @generated
	 * @ordered
	 */
	protected EList<Consituent> consituent;

	/**
	 * The cached value of the '{@link #getAntibiotics() <em>Antibiotics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibiotics()
	 * @generated
	 * @ordered
	 */
	protected EList<Antibiotics> antibiotics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingPackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipeName() {
		return recipeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipeName(String newRecipeName) {
		String oldRecipeName = recipeName;
		recipeName = newRecipeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__RECIPE_NAME, oldRecipeName, recipeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConstituentsWeights() {
		return constituentsWeights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstituentsWeights(int newConstituentsWeights) {
		int oldConstituentsWeights = constituentsWeights;
		constituentsWeights = newConstituentsWeights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS, oldConstituentsWeights, constituentsWeights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAntibioticsRatio() {
		return antibioticsRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntibioticsRatio(double newAntibioticsRatio) {
		double oldAntibioticsRatio = antibioticsRatio;
		antibioticsRatio = newAntibioticsRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO, oldAntibioticsRatio, antibioticsRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAntibioticsWeights() {
		return antibioticsWeights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntibioticsWeights(int newAntibioticsWeights) {
		int oldAntibioticsWeights = antibioticsWeights;
		antibioticsWeights = newAntibioticsWeights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS, oldAntibioticsWeights, antibioticsWeights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consituent> getConsituent() {
		if (consituent == null) {
			consituent = new EObjectContainmentEList<Consituent>(Consituent.class, this, SchedulingPackage.RECIPE__CONSITUENT);
		}
		return consituent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Antibiotics> getAntibiotics() {
		if (antibiotics == null) {
			antibiotics = new EObjectContainmentEList<Antibiotics>(Antibiotics.class, this, SchedulingPackage.RECIPE__ANTIBIOTICS);
		}
		return antibiotics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingPackage.RECIPE__CONSITUENT:
				return ((InternalEList<?>)getConsituent()).basicRemove(otherEnd, msgs);
			case SchedulingPackage.RECIPE__ANTIBIOTICS:
				return ((InternalEList<?>)getAntibiotics()).basicRemove(otherEnd, msgs);
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
			case SchedulingPackage.RECIPE__RECIPE_NAME:
				return getRecipeName();
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				return getConstituentsWeights();
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				return getAntibioticsRatio();
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				return getAntibioticsWeights();
			case SchedulingPackage.RECIPE__CONSITUENT:
				return getConsituent();
			case SchedulingPackage.RECIPE__ANTIBIOTICS:
				return getAntibiotics();
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
			case SchedulingPackage.RECIPE__RECIPE_NAME:
				setRecipeName((String)newValue);
				return;
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				setConstituentsWeights((Integer)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				setAntibioticsRatio((Double)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				setAntibioticsWeights((Integer)newValue);
				return;
			case SchedulingPackage.RECIPE__CONSITUENT:
				getConsituent().clear();
				getConsituent().addAll((Collection<? extends Consituent>)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS:
				getAntibiotics().clear();
				getAntibiotics().addAll((Collection<? extends Antibiotics>)newValue);
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
			case SchedulingPackage.RECIPE__RECIPE_NAME:
				setRecipeName(RECIPE_NAME_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				setConstituentsWeights(CONSTITUENTS_WEIGHTS_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				setAntibioticsRatio(ANTIBIOTICS_RATIO_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				setAntibioticsWeights(ANTIBIOTICS_WEIGHTS_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__CONSITUENT:
				getConsituent().clear();
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS:
				getAntibiotics().clear();
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
			case SchedulingPackage.RECIPE__RECIPE_NAME:
				return RECIPE_NAME_EDEFAULT == null ? recipeName != null : !RECIPE_NAME_EDEFAULT.equals(recipeName);
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				return constituentsWeights != CONSTITUENTS_WEIGHTS_EDEFAULT;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				return antibioticsRatio != ANTIBIOTICS_RATIO_EDEFAULT;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				return antibioticsWeights != ANTIBIOTICS_WEIGHTS_EDEFAULT;
			case SchedulingPackage.RECIPE__CONSITUENT:
				return consituent != null && !consituent.isEmpty();
			case SchedulingPackage.RECIPE__ANTIBIOTICS:
				return antibiotics != null && !antibiotics.isEmpty();
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
		result.append(" (recipeName: ");
		result.append(recipeName);
		result.append(", constituentsWeights: ");
		result.append(constituentsWeights);
		result.append(", antibioticsRatio: ");
		result.append(antibioticsRatio);
		result.append(", antibioticsWeights: ");
		result.append(antibioticsWeights);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
