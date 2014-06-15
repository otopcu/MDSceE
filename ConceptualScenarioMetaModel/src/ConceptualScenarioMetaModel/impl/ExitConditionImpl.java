/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.ExitAction;
import ConceptualScenarioMetaModel.ExitCondition;
import ConceptualScenarioMetaModel.PatternAction;
import ConceptualScenarioMetaModel.State;
import ConceptualScenarioMetaModel.NextState;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExitConditionImpl#getNextState <em>Next State</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExitConditionImpl#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitConditionImpl extends EObjectImpl implements ExitCondition {
	/**
	 * The cached value of the '{@link #getNextState() <em>Next State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextState()
	 * @generated
	 * @ordered
	 */
	protected State nextState;

	/**
	 * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitAction()
	 * @generated
	 * @ordered
	 */
	protected PatternAction exitAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.EXIT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getNextState() {
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextState(State newNextState, NotificationChain msgs) {
		State oldNextState = nextState;
		nextState = newNextState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE, oldNextState, newNextState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextState(State newNextState) {
		if (newNextState != nextState) {
			NotificationChain msgs = null;
			if (nextState != null)
				msgs = ((InternalEObject)nextState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE, null, msgs);
			if (newNextState != null)
				msgs = ((InternalEObject)newNextState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE, null, msgs);
			msgs = basicSetNextState(newNextState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE, newNextState, newNextState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAction getExitAction() {
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitAction(PatternAction newExitAction, NotificationChain msgs) {
		PatternAction oldExitAction = exitAction;
		exitAction = newExitAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION, oldExitAction, newExitAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitAction(PatternAction newExitAction) {
		if (newExitAction != exitAction) {
			NotificationChain msgs = null;
			if (exitAction != null)
				msgs = ((InternalEObject)exitAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION, null, msgs);
			if (newExitAction != null)
				msgs = ((InternalEObject)newExitAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION, null, msgs);
			msgs = basicSetExitAction(newExitAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION, newExitAction, newExitAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE:
				return basicSetNextState(null, msgs);
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION:
				return basicSetExitAction(null, msgs);
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
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE:
				return getNextState();
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION:
				return getExitAction();
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
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE:
				setNextState((State)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION:
				setExitAction((PatternAction)newValue);
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
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE:
				setNextState((State)null);
				return;
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION:
				setExitAction((PatternAction)null);
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
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__NEXT_STATE:
				return nextState != null;
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION__EXIT_ACTION:
				return exitAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ExitConditionImpl
