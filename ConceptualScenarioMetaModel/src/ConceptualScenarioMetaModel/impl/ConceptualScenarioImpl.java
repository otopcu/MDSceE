/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenario;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.EntityType;
import ConceptualScenarioMetaModel.Event;
import ConceptualScenarioMetaModel.PatternOfInterplay;
import ConceptualScenarioMetaModel.ScenarioIdentification;
import ConceptualScenarioMetaModel.StateMachine;

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
 * An implementation of the model object '<em><b>Conceptual Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl#getInterplays <em>Interplays</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl#getIndentification <em>Indentification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualScenarioImpl extends EObjectImpl implements ConceptualScenario {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualEntity> entities;

	/**
	 * The cached value of the '{@link #getInterplays() <em>Interplays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterplays()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternOfInterplay> interplays;

	/**
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> stateMachines;

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
	 * The cached value of the '{@link #getIndentification() <em>Indentification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentification()
	 * @generated
	 * @ordered
	 */
	protected ScenarioIdentification indentification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.CONCEPTUAL_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<ConceptualEntity>(ConceptualEntity.class, this, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternOfInterplay> getInterplays() {
		if (interplays == null) {
			interplays = new EObjectContainmentEList<PatternOfInterplay>(PatternOfInterplay.class, this, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS);
		}
		return interplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStateMachines() {
		if (stateMachines == null) {
			stateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioIdentification getIndentification() {
		return indentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndentification(ScenarioIdentification newIndentification, NotificationChain msgs) {
		ScenarioIdentification oldIndentification = indentification;
		indentification = newIndentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION, oldIndentification, newIndentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndentification(ScenarioIdentification newIndentification) {
		if (newIndentification != indentification) {
			NotificationChain msgs = null;
			if (indentification != null)
				msgs = ((InternalEObject)indentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION, null, msgs);
			if (newIndentification != null)
				msgs = ((InternalEObject)newIndentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION, null, msgs);
			msgs = basicSetIndentification(newIndentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION, newIndentification, newIndentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS:
				return ((InternalEList<?>)getInterplays()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES:
				return ((InternalEList<?>)getStateMachines()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION:
				return basicSetIndentification(null, msgs);
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES:
				return getEntities();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS:
				return getInterplays();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES:
				return getStateMachines();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS:
				return getEvents();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION:
				return getIndentification();
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ConceptualEntity>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS:
				getInterplays().clear();
				getInterplays().addAll((Collection<? extends PatternOfInterplay>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION:
				setIndentification((ScenarioIdentification)newValue);
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES:
				getEntities().clear();
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS:
				getInterplays().clear();
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES:
				getStateMachines().clear();
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS:
				getEvents().clear();
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION:
				setIndentification((ScenarioIdentification)null);
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INTERPLAYS:
				return interplays != null && !interplays.isEmpty();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__EVENTS:
				return events != null && !events.isEmpty();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO__INDENTIFICATION:
				return indentification != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptualScenarioImpl
