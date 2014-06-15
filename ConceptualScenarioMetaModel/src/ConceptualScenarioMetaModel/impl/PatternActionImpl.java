/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.Event;
import ConceptualScenarioMetaModel.PatternAction;
import ConceptualScenarioMetaModel.Receiver;
import ConceptualScenarioMetaModel.Sender;
import ConceptualScenarioMetaModel.Variation;

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
 * An implementation of the model object '<em><b>Pattern Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getVariations <em>Variations</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.PatternActionImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternActionImpl extends EObjectImpl implements PatternAction {
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
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected String sequence = SEQUENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSenders() <em>Senders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualEntity> senders;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualEntity> receivers;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getVariations() <em>Variations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariations()
	 * @generated
	 * @ordered
	 */
	protected EList<Variation> variations;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualScenarioMetaModel.Exception> exceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.PATTERN_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(String newSequence) {
		String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualEntity> getSenders() {
		if (senders == null) {
			senders = new EObjectContainmentEList<ConceptualEntity>(ConceptualEntity.class, this, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS);
		}
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualEntity> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<ConceptualEntity>(ConceptualEntity.class, this, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getVariations() {
		if (variations == null) {
			variations = new EObjectContainmentEList<Variation>(Variation.class, this, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS);
		}
		return variations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualScenarioMetaModel.Exception> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentEList<ConceptualScenarioMetaModel.Exception>(ConceptualScenarioMetaModel.Exception.class, this, ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS:
				return ((InternalEList<?>)getSenders()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS:
				return ((InternalEList<?>)getVariations()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SEQUENCE:
				return getSequence();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS:
				return getSenders();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS:
				return getReceivers();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS:
				return getEvents();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS:
				return getVariations();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS:
				return getExceptions();
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
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SEQUENCE:
				setSequence((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS:
				getSenders().clear();
				getSenders().addAll((Collection<? extends ConceptualEntity>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends ConceptualEntity>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS:
				getVariations().clear();
				getVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends ConceptualScenarioMetaModel.Exception>)newValue);
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
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS:
				getSenders().clear();
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS:
				getReceivers().clear();
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS:
				getEvents().clear();
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS:
				getVariations().clear();
				return;
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS:
				getExceptions().clear();
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
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__SENDERS:
				return senders != null && !senders.isEmpty();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EVENTS:
				return events != null && !events.isEmpty();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__VARIATIONS:
				return variations != null && !variations.isEmpty();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
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
		result.append(", Sequence: ");
		result.append(sequence);
		result.append(')');
		return result.toString();
	}

} //PatternActionImpl
