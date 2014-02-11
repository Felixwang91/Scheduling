/**
 */
package cse487.Scheduler.model.scheduling.impl;

import cse487.Scheduler.model.scheduling.Recipe;
import cse487.Scheduler.model.scheduling.SchedulingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl#getConstituentsName <em>Constituents Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl#getConstituentsWeights <em>Constituents Weights</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl#getAntibioticsRatio <em>Antibiotics Ratio</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl#getAntibioticsName <em>Antibiotics Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.RecipeImpl#getAntibioticsWeights <em>Antibiotics Weights</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe {
	/**
	 * The default value of the '{@link #getConstituentsName() <em>Constituents Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituentsName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTITUENTS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstituentsName() <em>Constituents Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituentsName()
	 * @generated
	 * @ordered
	 */
	protected String constituentsName = CONSTITUENTS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getAntibioticsName() <em>Antibiotics Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTIBIOTICS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntibioticsName() <em>Antibiotics Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntibioticsName()
	 * @generated
	 * @ordered
	 */
	protected String antibioticsName = ANTIBIOTICS_NAME_EDEFAULT;

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
	public String getConstituentsName() {
		return constituentsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstituentsName(String newConstituentsName) {
		String oldConstituentsName = constituentsName;
		constituentsName = newConstituentsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__CONSTITUENTS_NAME, oldConstituentsName, constituentsName));
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
	public String getAntibioticsName() {
		return antibioticsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntibioticsName(String newAntibioticsName) {
		String oldAntibioticsName = antibioticsName;
		antibioticsName = newAntibioticsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.RECIPE__ANTIBIOTICS_NAME, oldAntibioticsName, antibioticsName));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulingPackage.RECIPE__CONSTITUENTS_NAME:
				return getConstituentsName();
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				return getConstituentsWeights();
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				return getAntibioticsRatio();
			case SchedulingPackage.RECIPE__ANTIBIOTICS_NAME:
				return getAntibioticsName();
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				return getAntibioticsWeights();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulingPackage.RECIPE__CONSTITUENTS_NAME:
				setConstituentsName((String)newValue);
				return;
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				setConstituentsWeights((Integer)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				setAntibioticsRatio((Double)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_NAME:
				setAntibioticsName((String)newValue);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				setAntibioticsWeights((Integer)newValue);
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
			case SchedulingPackage.RECIPE__CONSTITUENTS_NAME:
				setConstituentsName(CONSTITUENTS_NAME_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				setConstituentsWeights(CONSTITUENTS_WEIGHTS_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				setAntibioticsRatio(ANTIBIOTICS_RATIO_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_NAME:
				setAntibioticsName(ANTIBIOTICS_NAME_EDEFAULT);
				return;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				setAntibioticsWeights(ANTIBIOTICS_WEIGHTS_EDEFAULT);
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
			case SchedulingPackage.RECIPE__CONSTITUENTS_NAME:
				return CONSTITUENTS_NAME_EDEFAULT == null ? constituentsName != null : !CONSTITUENTS_NAME_EDEFAULT.equals(constituentsName);
			case SchedulingPackage.RECIPE__CONSTITUENTS_WEIGHTS:
				return constituentsWeights != CONSTITUENTS_WEIGHTS_EDEFAULT;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_RATIO:
				return antibioticsRatio != ANTIBIOTICS_RATIO_EDEFAULT;
			case SchedulingPackage.RECIPE__ANTIBIOTICS_NAME:
				return ANTIBIOTICS_NAME_EDEFAULT == null ? antibioticsName != null : !ANTIBIOTICS_NAME_EDEFAULT.equals(antibioticsName);
			case SchedulingPackage.RECIPE__ANTIBIOTICS_WEIGHTS:
				return antibioticsWeights != ANTIBIOTICS_WEIGHTS_EDEFAULT;
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
		result.append(" (constituentsName: ");
		result.append(constituentsName);
		result.append(", constituentsWeights: ");
		result.append(constituentsWeights);
		result.append(", antibioticsRatio: ");
		result.append(antibioticsRatio);
		result.append(", antibioticsName: ");
		result.append(antibioticsName);
		result.append(", antibioticsWeights: ");
		result.append(antibioticsWeights);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
