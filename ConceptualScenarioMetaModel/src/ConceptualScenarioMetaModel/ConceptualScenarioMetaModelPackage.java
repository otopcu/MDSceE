/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptualScenarioMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConceptualScenarioMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://conceptualscenario/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptualscenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualScenarioMetaModelPackage eINSTANCE = ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.EntityCharacteristicImpl <em>Entity Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.EntityCharacteristicImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getEntityCharacteristic()
	 * @generated
	 */
	int ENTITY_CHARACTERISTIC = 1;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.StateMachineImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 2;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.StateImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.ConceptualEntityImpl <em>Conceptual Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.ConceptualEntityImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getConceptualEntity()
	 * @generated
	 */
	int CONCEPTUAL_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY__CHARACTERISTICS = 1;

	/**
	 * The number of structural features of the '<em>Conceptual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHARACTERISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHARACTERISTIC__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHARACTERISTIC__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Entity Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Con Ent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CON_ENT = 2;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__GUARD = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.ExitConditionImpl <em>Exit Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.ExitConditionImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getExitCondition()
	 * @generated
	 */
	int EXIT_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Next State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITION__NEXT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITION__EXIT_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Exit Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.PatternActionImpl <em>Pattern Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.PatternActionImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getPatternAction()
	 * @generated
	 */
	int PATTERN_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__SENDERS = 2;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__RECEIVERS = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__EVENTS = 4;

	/**
	 * The feature id for the '<em><b>Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__VARIATIONS = 5;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__EXCEPTIONS = 6;

	/**
	 * The number of structural features of the '<em>Pattern Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.PatternOfInterplayImpl <em>Pattern Of Interplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.PatternOfInterplayImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getPatternOfInterplay()
	 * @generated
	 */
	int PATTERN_OF_INTERPLAY = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OF_INTERPLAY__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OF_INTERPLAY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pattern Of Interplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OF_INTERPLAY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.EventImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Souce Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOUCE_CHARACTERISTIC = 1;

	/**
	 * The feature id for the '<em><b>Target Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGET_CHARACTERISTIC = 2;

	/**
	 * The feature id for the '<em><b>Content Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTENT_CHARACTERISTIC = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.TriggerConditionImpl <em>Trigger Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.TriggerConditionImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getTriggerCondition()
	 * @generated
	 */
	int TRIGGER_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_CONDITION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Trigger Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.VariationImpl <em>Variation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.VariationImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getVariation()
	 * @generated
	 */
	int VARIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__RECEIVERS = 2;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__SENDERS = 3;

	/**
	 * The number of structural features of the '<em>Variation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.ExceptionImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__RECEIVERS = 2;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__SENDERS = 3;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl <em>Conceptual Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getConceptualScenario()
	 * @generated
	 */
	int CONCEPTUAL_SCENARIO = 11;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Interplays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO__INTERPLAYS = 1;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO__STATE_MACHINES = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Indentification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO__INDENTIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Conceptual Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCENARIO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl <em>Scenario Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl
	 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getScenarioIdentification()
	 * @generated
	 */
	int SCENARIO_IDENTIFICATION = 12;

	/**
	 * The feature id for the '<em><b>POC Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__POC_EMAIL = 0;

	/**
	 * The feature id for the '<em><b>POC Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__POC_TELEPHONE = 1;

	/**
	 * The feature id for the '<em><b>POC Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__POC_ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>POC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__POC_NAME = 3;

	/**
	 * The feature id for the '<em><b>Use History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__USE_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>POC Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__POC_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Use Limitations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__USE_LIMITATIONS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__NAME = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__VERSION = 8;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__MODIFICATION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__PURPOSE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION__DESCRIPTION = 11;

	/**
	 * The number of structural features of the '<em>Scenario Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_IDENTIFICATION_FEATURE_COUNT = 12;


	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.EntityCharacteristic <em>Entity Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Characteristic</em>'.
	 * @see ConceptualScenarioMetaModel.EntityCharacteristic
	 * @generated
	 */
	EClass getEntityCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.EntityCharacteristic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.EntityCharacteristic#getName()
	 * @see #getEntityCharacteristic()
	 * @generated
	 */
	EAttribute getEntityCharacteristic_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.EntityCharacteristic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ConceptualScenarioMetaModel.EntityCharacteristic#getType()
	 * @see #getEntityCharacteristic()
	 * @generated
	 */
	EAttribute getEntityCharacteristic_Type();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.EntityCharacteristic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ConceptualScenarioMetaModel.EntityCharacteristic#getValue()
	 * @see #getEntityCharacteristic()
	 * @generated
	 */
	EAttribute getEntityCharacteristic_Value();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see ConceptualScenarioMetaModel.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.StateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.StateMachine#getName()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.StateMachine#getConEnt <em>Con Ent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Con Ent</em>'.
	 * @see ConceptualScenarioMetaModel.StateMachine#getConEnt()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ConEnt();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ConceptualScenarioMetaModel.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ConceptualScenarioMetaModel.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.State#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard</em>'.
	 * @see ConceptualScenarioMetaModel.State#getGuard()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Guard();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.ConceptualEntity <em>Conceptual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Entity</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualEntity
	 * @generated
	 */
	EClass getConceptualEntity();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ConceptualEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualEntity#getName()
	 * @see #getConceptualEntity()
	 * @generated
	 */
	EAttribute getConceptualEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.ConceptualEntity#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualEntity#getCharacteristics()
	 * @see #getConceptualEntity()
	 * @generated
	 */
	EReference getConceptualEntity_Characteristics();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.ExitCondition <em>Exit Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Condition</em>'.
	 * @see ConceptualScenarioMetaModel.ExitCondition
	 * @generated
	 */
	EClass getExitCondition();

	/**
	 * Returns the meta object for the containment reference '{@link ConceptualScenarioMetaModel.ExitCondition#getNextState <em>Next State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next State</em>'.
	 * @see ConceptualScenarioMetaModel.ExitCondition#getNextState()
	 * @see #getExitCondition()
	 * @generated
	 */
	EReference getExitCondition_NextState();

	/**
	 * Returns the meta object for the containment reference '{@link ConceptualScenarioMetaModel.ExitCondition#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Action</em>'.
	 * @see ConceptualScenarioMetaModel.ExitCondition#getExitAction()
	 * @see #getExitCondition()
	 * @generated
	 */
	EReference getExitCondition_ExitAction();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.PatternAction <em>Pattern Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Action</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction
	 * @generated
	 */
	EClass getPatternAction();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.PatternAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getName()
	 * @see #getPatternAction()
	 * @generated
	 */
	EAttribute getPatternAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.PatternAction#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getSequence()
	 * @see #getPatternAction()
	 * @generated
	 */
	EAttribute getPatternAction_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternAction#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Senders</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getSenders()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Senders();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternAction#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getReceivers()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Receivers();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternAction#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getEvents()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternAction#getVariations <em>Variations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variations</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getVariations()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Variations();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternAction#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see ConceptualScenarioMetaModel.PatternAction#getExceptions()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Exceptions();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.PatternOfInterplay <em>Pattern Of Interplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Of Interplay</em>'.
	 * @see ConceptualScenarioMetaModel.PatternOfInterplay
	 * @generated
	 */
	EClass getPatternOfInterplay();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.PatternOfInterplay#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ConceptualScenarioMetaModel.PatternOfInterplay#getActions()
	 * @see #getPatternOfInterplay()
	 * @generated
	 */
	EReference getPatternOfInterplay_Actions();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.PatternOfInterplay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.PatternOfInterplay#getName()
	 * @see #getPatternOfInterplay()
	 * @generated
	 */
	EAttribute getPatternOfInterplay_Name();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ConceptualScenarioMetaModel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ConceptualScenarioMetaModel.Event#getSouceCharacteristic <em>Souce Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Souce Characteristic</em>'.
	 * @see ConceptualScenarioMetaModel.Event#getSouceCharacteristic()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_SouceCharacteristic();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Event#getTargetCharacteristic <em>Target Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Characteristic</em>'.
	 * @see ConceptualScenarioMetaModel.Event#getTargetCharacteristic()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_TargetCharacteristic();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Event#getContentCharacteristic <em>Content Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Characteristic</em>'.
	 * @see ConceptualScenarioMetaModel.Event#getContentCharacteristic()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContentCharacteristic();

	/**
	 * Returns the meta object for the containment reference '{@link ConceptualScenarioMetaModel.Event#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see ConceptualScenarioMetaModel.Event#getTrigger()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Trigger();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.TriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Condition</em>'.
	 * @see ConceptualScenarioMetaModel.TriggerCondition
	 * @generated
	 */
	EClass getTriggerCondition();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.TriggerCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ConceptualScenarioMetaModel.TriggerCondition#getCondition()
	 * @see #getTriggerCondition()
	 * @generated
	 */
	EAttribute getTriggerCondition_Condition();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation</em>'.
	 * @see ConceptualScenarioMetaModel.Variation
	 * @generated
	 */
	EClass getVariation();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.Variation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.Variation#getName()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.Variation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ConceptualScenarioMetaModel.Variation#getCondition()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Variation#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see ConceptualScenarioMetaModel.Variation#getReceivers()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_Receivers();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Variation#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Senders</em>'.
	 * @see ConceptualScenarioMetaModel.Variation#getSenders()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_Senders();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see ConceptualScenarioMetaModel.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.Exception#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.Exception#getName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.Exception#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ConceptualScenarioMetaModel.Exception#getCondition()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Exception#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see ConceptualScenarioMetaModel.Exception#getReceivers()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_Receivers();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.Exception#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Senders</em>'.
	 * @see ConceptualScenarioMetaModel.Exception#getSenders()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_Senders();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.ConceptualScenario <em>Conceptual Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Scenario</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario
	 * @generated
	 */
	EClass getConceptualScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.ConceptualScenario#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario#getEntities()
	 * @see #getConceptualScenario()
	 * @generated
	 */
	EReference getConceptualScenario_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.ConceptualScenario#getInterplays <em>Interplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interplays</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario#getInterplays()
	 * @see #getConceptualScenario()
	 * @generated
	 */
	EReference getConceptualScenario_Interplays();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.ConceptualScenario#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Machines</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario#getStateMachines()
	 * @see #getConceptualScenario()
	 * @generated
	 */
	EReference getConceptualScenario_StateMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptualScenarioMetaModel.ConceptualScenario#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario#getEvents()
	 * @see #getConceptualScenario()
	 * @generated
	 */
	EReference getConceptualScenario_Events();

	/**
	 * Returns the meta object for the containment reference '{@link ConceptualScenarioMetaModel.ConceptualScenario#getIndentification <em>Indentification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indentification</em>'.
	 * @see ConceptualScenarioMetaModel.ConceptualScenario#getIndentification()
	 * @see #getConceptualScenario()
	 * @generated
	 */
	EReference getConceptualScenario_Indentification();

	/**
	 * Returns the meta object for class '{@link ConceptualScenarioMetaModel.ScenarioIdentification <em>Scenario Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Identification</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification
	 * @generated
	 */
	EClass getScenarioIdentification();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPOCEmail <em>POC Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Email</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPOCEmail()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_POCEmail();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPOCTelephone <em>POC Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Telephone</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPOCTelephone()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_POCTelephone();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPOCOrganisation <em>POC Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Organisation</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPOCOrganisation()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_POCOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPOCName <em>POC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Name</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPOCName()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_POCName();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getUseHistory <em>Use History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use History</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getUseHistory()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_UseHistory();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPOCType <em>POC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Type</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPOCType()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_POCType();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getUseLimitations <em>Use Limitations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limitations</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getUseLimitations()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_UseLimitations();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getName()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getVersion()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_Version();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getModificationDate()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getPurpose()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link ConceptualScenarioMetaModel.ScenarioIdentification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ConceptualScenarioMetaModel.ScenarioIdentification#getDescription()
	 * @see #getScenarioIdentification()
	 * @generated
	 */
	EAttribute getScenarioIdentification_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptualScenarioMetaModelFactory getConceptualScenarioMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.EntityCharacteristicImpl <em>Entity Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.EntityCharacteristicImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getEntityCharacteristic()
		 * @generated
		 */
		EClass ENTITY_CHARACTERISTIC = eINSTANCE.getEntityCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CHARACTERISTIC__NAME = eINSTANCE.getEntityCharacteristic_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CHARACTERISTIC__TYPE = eINSTANCE.getEntityCharacteristic_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CHARACTERISTIC__VALUE = eINSTANCE.getEntityCharacteristic_Value();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.StateMachineImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Con Ent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CON_ENT = eINSTANCE.getStateMachine_ConEnt();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.StateImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__GUARD = eINSTANCE.getState_Guard();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.ConceptualEntityImpl <em>Conceptual Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.ConceptualEntityImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getConceptualEntity()
		 * @generated
		 */
		EClass CONCEPTUAL_ENTITY = eINSTANCE.getConceptualEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_ENTITY__NAME = eINSTANCE.getConceptualEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_ENTITY__CHARACTERISTICS = eINSTANCE.getConceptualEntity_Characteristics();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.ExitConditionImpl <em>Exit Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.ExitConditionImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getExitCondition()
		 * @generated
		 */
		EClass EXIT_CONDITION = eINSTANCE.getExitCondition();

		/**
		 * The meta object literal for the '<em><b>Next State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_CONDITION__NEXT_STATE = eINSTANCE.getExitCondition_NextState();

		/**
		 * The meta object literal for the '<em><b>Exit Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_CONDITION__EXIT_ACTION = eINSTANCE.getExitCondition_ExitAction();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.PatternActionImpl <em>Pattern Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.PatternActionImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getPatternAction()
		 * @generated
		 */
		EClass PATTERN_ACTION = eINSTANCE.getPatternAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ACTION__NAME = eINSTANCE.getPatternAction_Name();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ACTION__SEQUENCE = eINSTANCE.getPatternAction_Sequence();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__SENDERS = eINSTANCE.getPatternAction_Senders();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__RECEIVERS = eINSTANCE.getPatternAction_Receivers();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__EVENTS = eINSTANCE.getPatternAction_Events();

		/**
		 * The meta object literal for the '<em><b>Variations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__VARIATIONS = eINSTANCE.getPatternAction_Variations();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__EXCEPTIONS = eINSTANCE.getPatternAction_Exceptions();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.PatternOfInterplayImpl <em>Pattern Of Interplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.PatternOfInterplayImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getPatternOfInterplay()
		 * @generated
		 */
		EClass PATTERN_OF_INTERPLAY = eINSTANCE.getPatternOfInterplay();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OF_INTERPLAY__ACTIONS = eINSTANCE.getPatternOfInterplay_Actions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_OF_INTERPLAY__NAME = eINSTANCE.getPatternOfInterplay_Name();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.EventImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Souce Characteristic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SOUCE_CHARACTERISTIC = eINSTANCE.getEvent_SouceCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Target Characteristic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TARGET_CHARACTERISTIC = eINSTANCE.getEvent_TargetCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Content Characteristic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTENT_CHARACTERISTIC = eINSTANCE.getEvent_ContentCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRIGGER = eINSTANCE.getEvent_Trigger();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.TriggerConditionImpl <em>Trigger Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.TriggerConditionImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getTriggerCondition()
		 * @generated
		 */
		EClass TRIGGER_CONDITION = eINSTANCE.getTriggerCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_CONDITION__CONDITION = eINSTANCE.getTriggerCondition_Condition();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.VariationImpl <em>Variation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.VariationImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getVariation()
		 * @generated
		 */
		EClass VARIATION = eINSTANCE.getVariation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION__NAME = eINSTANCE.getVariation_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION__CONDITION = eINSTANCE.getVariation_Condition();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION__RECEIVERS = eINSTANCE.getVariation_Receivers();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION__SENDERS = eINSTANCE.getVariation_Senders();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.ExceptionImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__CONDITION = eINSTANCE.getException_Condition();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__RECEIVERS = eINSTANCE.getException_Receivers();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__SENDERS = eINSTANCE.getException_Senders();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl <em>Conceptual Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getConceptualScenario()
		 * @generated
		 */
		EClass CONCEPTUAL_SCENARIO = eINSTANCE.getConceptualScenario();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCENARIO__ENTITIES = eINSTANCE.getConceptualScenario_Entities();

		/**
		 * The meta object literal for the '<em><b>Interplays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCENARIO__INTERPLAYS = eINSTANCE.getConceptualScenario_Interplays();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCENARIO__STATE_MACHINES = eINSTANCE.getConceptualScenario_StateMachines();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCENARIO__EVENTS = eINSTANCE.getConceptualScenario_Events();

		/**
		 * The meta object literal for the '<em><b>Indentification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCENARIO__INDENTIFICATION = eINSTANCE.getConceptualScenario_Indentification();

		/**
		 * The meta object literal for the '{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl <em>Scenario Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl
		 * @see ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelPackageImpl#getScenarioIdentification()
		 * @generated
		 */
		EClass SCENARIO_IDENTIFICATION = eINSTANCE.getScenarioIdentification();

		/**
		 * The meta object literal for the '<em><b>POC Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__POC_EMAIL = eINSTANCE.getScenarioIdentification_POCEmail();

		/**
		 * The meta object literal for the '<em><b>POC Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__POC_TELEPHONE = eINSTANCE.getScenarioIdentification_POCTelephone();

		/**
		 * The meta object literal for the '<em><b>POC Organisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__POC_ORGANISATION = eINSTANCE.getScenarioIdentification_POCOrganisation();

		/**
		 * The meta object literal for the '<em><b>POC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__POC_NAME = eINSTANCE.getScenarioIdentification_POCName();

		/**
		 * The meta object literal for the '<em><b>Use History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__USE_HISTORY = eINSTANCE.getScenarioIdentification_UseHistory();

		/**
		 * The meta object literal for the '<em><b>POC Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__POC_TYPE = eINSTANCE.getScenarioIdentification_POCType();

		/**
		 * The meta object literal for the '<em><b>Use Limitations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__USE_LIMITATIONS = eINSTANCE.getScenarioIdentification_UseLimitations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__NAME = eINSTANCE.getScenarioIdentification_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__VERSION = eINSTANCE.getScenarioIdentification_Version();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__MODIFICATION_DATE = eINSTANCE.getScenarioIdentification_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__PURPOSE = eINSTANCE.getScenarioIdentification_Purpose();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_IDENTIFICATION__DESCRIPTION = eINSTANCE.getScenarioIdentification_Description();

	}

} //ConceptualScenarioMetaModelPackage
