/**
 */
package scheduling.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scheduling.Recipe;
import scheduling.SchedulingPackage;
import scheduling.SubOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scheduling.impl.SubOrderImpl#isRequireFlush <em>Require Flush</em>}</li>
 *   <li>{@link scheduling.impl.SubOrderImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link scheduling.impl.SubOrderImpl#getDeliverDate <em>Deliver Date</em>}</li>
 *   <li>{@link scheduling.impl.SubOrderImpl#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubOrderImpl extends MinimalEObjectImpl.Container implements SubOrder {
	/**
	 * The default value of the '{@link #isRequireFlush() <em>Require Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireFlush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_FLUSH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireFlush() <em>Require Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireFlush()
	 * @generated
	 * @ordered
	 */
	protected boolean requireFlush = REQUIRE_FLUSH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliverDate() <em>Deliver Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliverDate() <em>Deliver Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliverDate = DELIVER_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> recipe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingPackage.Literals.SUB_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireFlush() {
		return requireFlush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireFlush(boolean newRequireFlush) {
		boolean oldRequireFlush = requireFlush;
		requireFlush = newRequireFlush;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.SUB_ORDER__REQUIRE_FLUSH, oldRequireFlush, requireFlush));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.SUB_ORDER__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliverDate() {
		return deliverDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverDate(Date newDeliverDate) {
		Date oldDeliverDate = deliverDate;
		deliverDate = newDeliverDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.SUB_ORDER__DELIVER_DATE, oldDeliverDate, deliverDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recipe> getRecipe() {
		if (recipe == null) {
			recipe = new EObjectContainmentEList<Recipe>(Recipe.class, this, SchedulingPackage.SUB_ORDER__RECIPE);
		}
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingPackage.SUB_ORDER__RECIPE:
				return ((InternalEList<?>)getRecipe()).basicRemove(otherEnd, msgs);
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
			case SchedulingPackage.SUB_ORDER__REQUIRE_FLUSH:
				return isRequireFlush();
			case SchedulingPackage.SUB_ORDER__QUANTITY:
				return getQuantity();
			case SchedulingPackage.SUB_ORDER__DELIVER_DATE:
				return getDeliverDate();
			case SchedulingPackage.SUB_ORDER__RECIPE:
				return getRecipe();
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
			case SchedulingPackage.SUB_ORDER__REQUIRE_FLUSH:
				setRequireFlush((Boolean)newValue);
				return;
			case SchedulingPackage.SUB_ORDER__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case SchedulingPackage.SUB_ORDER__DELIVER_DATE:
				setDeliverDate((Date)newValue);
				return;
			case SchedulingPackage.SUB_ORDER__RECIPE:
				getRecipe().clear();
				getRecipe().addAll((Collection<? extends Recipe>)newValue);
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
			case SchedulingPackage.SUB_ORDER__REQUIRE_FLUSH:
				setRequireFlush(REQUIRE_FLUSH_EDEFAULT);
				return;
			case SchedulingPackage.SUB_ORDER__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case SchedulingPackage.SUB_ORDER__DELIVER_DATE:
				setDeliverDate(DELIVER_DATE_EDEFAULT);
				return;
			case SchedulingPackage.SUB_ORDER__RECIPE:
				getRecipe().clear();
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
			case SchedulingPackage.SUB_ORDER__REQUIRE_FLUSH:
				return requireFlush != REQUIRE_FLUSH_EDEFAULT;
			case SchedulingPackage.SUB_ORDER__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case SchedulingPackage.SUB_ORDER__DELIVER_DATE:
				return DELIVER_DATE_EDEFAULT == null ? deliverDate != null : !DELIVER_DATE_EDEFAULT.equals(deliverDate);
			case SchedulingPackage.SUB_ORDER__RECIPE:
				return recipe != null && !recipe.isEmpty();
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
		result.append(" (requireFlush: ");
		result.append(requireFlush);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", deliverDate: ");
		result.append(deliverDate);
		result.append(')');
		return result.toString();
	}

} //SubOrderImpl
