/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.EntityCharacteristic;
import ConceptualScenarioMetaModel.Event;

import ConceptualScenarioMetaModel.TriggerCondition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventImpl#getSouceCharacteristic <em>Souce Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventImpl#getTargetCharacteristic <em>Target Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventImpl#getContentCharacteristic <em>Content Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event {
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
	 * The cached value of the '{@link #getSouceCharacteristic() <em>Souce Characteristic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouceCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EntityCharacteristic souceCharacteristic;
	/**
	 * The cached value of the '{@link #getTargetCharacteristic() <em>Target Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityCharacteristic> targetCharacteristic;
	/**
	 * The cached value of the '{@link #getContentCharacteristic() <em>Content Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityCharacteristic> contentCharacteristic;
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerCondition trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityCharacteristic getSouceCharacteristic() {
		return souceCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouceCharacteristic(EntityCharacteristic newSouceCharacteristic, NotificationChain msgs) {
		EntityCharacteristic oldSouceCharacteristic = souceCharacteristic;
		souceCharacteristic = newSouceCharacteristic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC, oldSouceCharacteristic, newSouceCharacteristic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouceCharacteristic(EntityCharacteristic newSouceCharacteristic) {
		if (newSouceCharacteristic != souceCharacteristic) {
			NotificationChain msgs = null;
			if (souceCharacteristic != null)
				msgs = ((InternalEObject)souceCharacteristic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC, null, msgs);
			if (newSouceCharacteristic != null)
				msgs = ((InternalEObject)newSouceCharacteristic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC, null, msgs);
			msgs = basicSetSouceCharacteristic(newSouceCharacteristic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC, newSouceCharacteristic, newSouceCharacteristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityCharacteristic> getTargetCharacteristic() {
		if (targetCharacteristic == null) {
			targetCharacteristic = new EObjectContainmentEList<EntityCharacteristic>(EntityCharacteristic.class, this, ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC);
		}
		return targetCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityCharacteristic> getContentCharacteristic() {
		if (contentCharacteristic == null) {
			contentCharacteristic = new EObjectContainmentEList<EntityCharacteristic>(EntityCharacteristic.class, this, ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC);
		}
		return contentCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerCondition getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(TriggerCondition newTrigger, NotificationChain msgs) {
		TriggerCondition oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(TriggerCondition newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC:
				return basicSetSouceCharacteristic(null, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC:
				return ((InternalEList<?>)getTargetCharacteristic()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC:
				return ((InternalEList<?>)getContentCharacteristic()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT__TRIGGER:
				return basicSetTrigger(null, msgs);
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
			case ConceptualScenarioMetaModelPackage.EVENT__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC:
				return getSouceCharacteristic();
			case ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC:
				return getTargetCharacteristic();
			case ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC:
				return getContentCharacteristic();
			case ConceptualScenarioMetaModelPackage.EVENT__TRIGGER:
				return getTrigger();
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
			case ConceptualScenarioMetaModelPackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC:
				setSouceCharacteristic((EntityCharacteristic)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC:
				getTargetCharacteristic().clear();
				getTargetCharacteristic().addAll((Collection<? extends EntityCharacteristic>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC:
				getContentCharacteristic().clear();
				getContentCharacteristic().addAll((Collection<? extends EntityCharacteristic>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__TRIGGER:
				setTrigger((TriggerCondition)newValue);
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
			case ConceptualScenarioMetaModelPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC:
				setSouceCharacteristic((EntityCharacteristic)null);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC:
				getTargetCharacteristic().clear();
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC:
				getContentCharacteristic().clear();
				return;
			case ConceptualScenarioMetaModelPackage.EVENT__TRIGGER:
				setTrigger((TriggerCondition)null);
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
			case ConceptualScenarioMetaModelPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.EVENT__SOUCE_CHARACTERISTIC:
				return souceCharacteristic != null;
			case ConceptualScenarioMetaModelPackage.EVENT__TARGET_CHARACTERISTIC:
				return targetCharacteristic != null && !targetCharacteristic.isEmpty();
			case ConceptualScenarioMetaModelPackage.EVENT__CONTENT_CHARACTERISTIC:
				return contentCharacteristic != null && !contentCharacteristic.isEmpty();
			case ConceptualScenarioMetaModelPackage.EVENT__TRIGGER:
				return trigger != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EventImpl
