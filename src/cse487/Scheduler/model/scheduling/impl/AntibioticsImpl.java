/**
 */
package cse487.Scheduler.model.scheduling.impl;

import cse487.Scheduler.model.scheduling.Antibiotics;
import cse487.Scheduler.model.scheduling.SchedulingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antibiotics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.AntibioticsImpl#getName <em>Name</em>}</li>
 *   <li>{@link cse487.Scheduler.model.scheduling.impl.AntibioticsImpl#getQuantityOnHand <em>Quantity On Hand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AntibioticsImpl extends MinimalEObjectImpl.Container implements Antibiotics {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityOnHand() <em>Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_ON_HAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantityOnHand() <em>Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected int quantityOnHand = QUANTITY_ON_HAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntibioticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingPackage.Literals.ANTIBIOTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.ANTIBIOTICS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityOnHand(int newQuantityOnHand) {
		int oldQuantityOnHand = quantityOnHand;
		quantityOnHand = newQuantityOnHand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.ANTIBIOTICS__QUANTITY_ON_HAND, oldQuantityOnHand, quantityOnHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulingPackage.ANTIBIOTICS__NAME:
				return getName();
			case SchedulingPackage.ANTIBIOTICS__QUANTITY_ON_HAND:
				return getQuantityOnHand();
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
			case SchedulingPackage.ANTIBIOTICS__NAME:
				setName((String)newValue);
				return;
			case SchedulingPackage.ANTIBIOTICS__QUANTITY_ON_HAND:
				setQuantityOnHand((Integer)newValue);
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
			case SchedulingPackage.ANTIBIOTICS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchedulingPackage.ANTIBIOTICS__QUANTITY_ON_HAND:
				setQuantityOnHand(QUANTITY_ON_HAND_EDEFAULT);
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
			case SchedulingPackage.ANTIBIOTICS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchedulingPackage.ANTIBIOTICS__QUANTITY_ON_HAND:
				return quantityOnHand != QUANTITY_ON_HAND_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", quantityOnHand: ");
		result.append(quantityOnHand);
		result.append(')');
		return result.toString();
	}

} //AntibioticsImpl
