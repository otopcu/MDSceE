/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenario;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualScenarioMetaModelFactoryImpl extends EFactoryImpl implements ConceptualScenarioMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptualScenarioMetaModelFactory init() {
		try {
			ConceptualScenarioMetaModelFactory theConceptualScenarioMetaModelFactory = (ConceptualScenarioMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://conceptualscenario/1.0"); 
			if (theConceptualScenarioMetaModelFactory != null) {
				return theConceptualScenarioMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptualScenarioMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualScenarioMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY: return createConceptualEntity();
			case ConceptualScenarioMetaModelPackage.ENTITY_CHARACTERISTIC: return createEntityCharacteristic();
			case ConceptualScenarioMetaModelPackage.STATE_MACHINE: return createStateMachine();
			case ConceptualScenarioMetaModelPackage.STATE: return createState();
			case ConceptualScenarioMetaModelPackage.EXIT_CONDITION: return createExitCondition();
			case ConceptualScenarioMetaModelPackage.PATTERN_ACTION: return createPatternAction();
			case ConceptualScenarioMetaModelPackage.PATTERN_OF_INTERPLAY: return createPatternOfInterplay();
			case ConceptualScenarioMetaModelPackage.EVENT: return createEvent();
			case ConceptualScenarioMetaModelPackage.TRIGGER_CONDITION: return createTriggerCondition();
			case ConceptualScenarioMetaModelPackage.VARIATION: return createVariation();
			case ConceptualScenarioMetaModelPackage.EXCEPTION: return createException();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_SCENARIO: return createConceptualScenario();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION: return createScenarioIdentification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityCharacteristic createEntityCharacteristic() {
		EntityCharacteristicImpl entityCharacteristic = new EntityCharacteristicImpl();
		return entityCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntity createConceptualEntity() {
		ConceptualEntityImpl conceptualEntity = new ConceptualEntityImpl();
		return conceptualEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitCondition createExitCondition() {
		ExitConditionImpl exitCondition = new ExitConditionImpl();
		return exitCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAction createPatternAction() {
		PatternActionImpl patternAction = new PatternActionImpl();
		return patternAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternOfInterplay createPatternOfInterplay() {
		PatternOfInterplayImpl patternOfInterplay = new PatternOfInterplayImpl();
		return patternOfInterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerCondition createTriggerCondition() {
		TriggerConditionImpl triggerCondition = new TriggerConditionImpl();
		return triggerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variation createVariation() {
		VariationImpl variation = new VariationImpl();
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualScenarioMetaModel.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualScenario createConceptualScenario() {
		ConceptualScenarioImpl conceptualScenario = new ConceptualScenarioImpl();
		return conceptualScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioIdentification createScenarioIdentification() {
		ScenarioIdentificationImpl scenarioIdentification = new ScenarioIdentificationImpl();
		return scenarioIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualScenarioMetaModelPackage getConceptualScenarioMetaModelPackage() {
		return (ConceptualScenarioMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptualScenarioMetaModelPackage getPackage() {
		return ConceptualScenarioMetaModelPackage.eINSTANCE;
	}

} //ConceptualScenarioMetaModelFactoryImpl
