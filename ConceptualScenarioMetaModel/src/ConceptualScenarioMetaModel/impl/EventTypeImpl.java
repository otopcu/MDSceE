/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.ContentCharacteristic;
import ConceptualScenarioMetaModel.EventType;
import ConceptualScenarioMetaModel.SourceCharacteristic;
import ConceptualScenarioMetaModel.TargetCharacteristic;
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
 * An implementation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventTypeImpl#getSouce <em>Souce</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.EventTypeImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventTypeImpl extends EObjectImpl implements EventType {
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
	 * The cached value of the '{@link #getSouce() <em>Souce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouce()
	 * @generated
	 * @ordered
	 */
	protected SourceCharacteristic souce;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetCharacteristic> target;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentCharacteristic> content;

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
	protected EventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.EVENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCharacteristic getSouce() {
		return souce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouce(SourceCharacteristic newSouce, NotificationChain msgs) {
		SourceCharacteristic oldSouce = souce;
		souce = newSouce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE, oldSouce, newSouce);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouce(SourceCharacteristic newSouce) {
		if (newSouce != souce) {
			NotificationChain msgs = null;
			if (souce != null)
				msgs = ((InternalEObject)souce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE, null, msgs);
			if (newSouce != null)
				msgs = ((InternalEObject)newSouce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE, null, msgs);
			msgs = basicSetSouce(newSouce, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE, newSouce, newSouce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetCharacteristic> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<TargetCharacteristic>(TargetCharacteristic.class, this, ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentCharacteristic> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<ContentCharacteristic>(ContentCharacteristic.class, this, ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT);
		}
		return content;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER, oldTrigger, newTrigger);
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
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE:
				return basicSetSouce(null, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER:
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
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE:
				return getSouce();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET:
				return getTarget();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT:
				return getContent();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER:
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
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE:
				setSouce((SourceCharacteristic)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetCharacteristic>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends ContentCharacteristic>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER:
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
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE:
				setSouce((SourceCharacteristic)null);
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET:
				getTarget().clear();
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT:
				getContent().clear();
				return;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER:
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
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__SOUCE:
				return souce != null;
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TARGET:
				return target != null && !target.isEmpty();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__CONTENT:
				return content != null && !content.isEmpty();
			case ConceptualScenarioMetaModelPackage.EVENT_TYPE__TRIGGER:
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

} //EventTypeImpl
