/**
 */
package ConceptualScenarioMetaModel.util;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenario;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.ContentCharacteristic;
import ConceptualScenarioMetaModel.EntityCharacteristic;
import ConceptualScenarioMetaModel.EntityType;
import ConceptualScenarioMetaModel.Event;
import ConceptualScenarioMetaModel.EventType;
import ConceptualScenarioMetaModel.ExitAction;
import ConceptualScenarioMetaModel.ExitCondition;
import ConceptualScenarioMetaModel.NextState;
import ConceptualScenarioMetaModel.PatternAction;
import ConceptualScenarioMetaModel.PatternOfInterplay;
import ConceptualScenarioMetaModel.Receiver;
import ConceptualScenarioMetaModel.ScenarioIdentification;
import ConceptualScenarioMetaModel.Sender;
import ConceptualScenarioMetaModel.SourceCharacteristic;
import ConceptualScenarioMetaModel.State;
import ConceptualScenarioMetaModel.StateMachine;
import ConceptualScenarioMetaModel.TargetCharacteristic;
import ConceptualScenarioMetaModel.TriggerCondition;
import ConceptualScenarioMetaModel.Variation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage
 * @generated
 */
public class ConceptualScenarioMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptualScenarioMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualScenarioMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConceptualScenarioMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualScenarioMetaModelSwitch<Adapter> modelSwitch =
		new ConceptualScenarioMetaModelSwitch<Adapter>() {
			@Override
			public Adapter caseConceptualEntity(ConceptualEntity object) {
				return createConceptualEntityAdapter();
			}
			@Override
			public Adapter caseEntityCharacteristic(EntityCharacteristic object) {
				return createEntityCharacteristicAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseExitCondition(ExitCondition object) {
				return createExitConditionAdapter();
			}
			@Override
			public Adapter casePatternAction(PatternAction object) {
				return createPatternActionAdapter();
			}
			@Override
			public Adapter casePatternOfInterplay(PatternOfInterplay object) {
				return createPatternOfInterplayAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTriggerCondition(TriggerCondition object) {
				return createTriggerConditionAdapter();
			}
			@Override
			public Adapter caseVariation(Variation object) {
				return createVariationAdapter();
			}
			@Override
			public Adapter caseException(ConceptualScenarioMetaModel.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseConceptualScenario(ConceptualScenario object) {
				return createConceptualScenarioAdapter();
			}
			@Override
			public Adapter caseScenarioIdentification(ScenarioIdentification object) {
				return createScenarioIdentificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.EntityCharacteristic <em>Entity Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.EntityCharacteristic
	 * @generated
	 */
	public Adapter createEntityCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.ConceptualEntity <em>Conceptual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.ConceptualEntity
	 * @generated
	 */
	public Adapter createConceptualEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.ExitCondition <em>Exit Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.ExitCondition
	 * @generated
	 */
	public Adapter createExitConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.PatternAction <em>Pattern Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.PatternAction
	 * @generated
	 */
	public Adapter createPatternActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.PatternOfInterplay <em>Pattern Of Interplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.PatternOfInterplay
	 * @generated
	 */
	public Adapter createPatternOfInterplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.TriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.TriggerCondition
	 * @generated
	 */
	public Adapter createTriggerConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.Variation
	 * @generated
	 */
	public Adapter createVariationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.ConceptualScenario <em>Conceptual Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario
	 * @generated
	 */
	public Adapter createConceptualScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConceptualScenarioMetaModel.ScenarioIdentification <em>Scenario Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification
	 * @generated
	 */
	public Adapter createScenarioIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConceptualScenarioMetaModelAdapterFactory
