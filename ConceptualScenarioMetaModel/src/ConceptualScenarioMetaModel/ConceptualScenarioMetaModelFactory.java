/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage
 * @generated
 */
public interface ConceptualScenarioMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualScenarioMetaModelFactory eINSTANCE = ConceptualScenarioMetaModel.impl.ConceptualScenarioMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Characteristic</em>'.
	 * @generated
	 */
	EntityCharacteristic createEntityCharacteristic();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Conceptual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conceptual Entity</em>'.
	 * @generated
	 */
	ConceptualEntity createConceptualEntity();

	/**
	 * Returns a new object of class '<em>Exit Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Condition</em>'.
	 * @generated
	 */
	ExitCondition createExitCondition();

	/**
	 * Returns a new object of class '<em>Pattern Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Action</em>'.
	 * @generated
	 */
	PatternAction createPatternAction();

	/**
	 * Returns a new object of class '<em>Pattern Of Interplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Of Interplay</em>'.
	 * @generated
	 */
	PatternOfInterplay createPatternOfInterplay();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Trigger Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Condition</em>'.
	 * @generated
	 */
	TriggerCondition createTriggerCondition();

	/**
	 * Returns a new object of class '<em>Variation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation</em>'.
	 * @generated
	 */
	Variation createVariation();

	/**
	 * Returns a new object of class '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception</em>'.
	 * @generated
	 */
	Exception createException();

	/**
	 * Returns a new object of class '<em>Conceptual Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conceptual Scenario</em>'.
	 * @generated
	 */
	ConceptualScenario createConceptualScenario();

	/**
	 * Returns a new object of class '<em>Scenario Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Identification</em>'.
	 * @generated
	 */
	ScenarioIdentification createScenarioIdentification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConceptualScenarioMetaModelPackage getConceptualScenarioMetaModelPackage();

} //ConceptualScenarioMetaModelFactory
