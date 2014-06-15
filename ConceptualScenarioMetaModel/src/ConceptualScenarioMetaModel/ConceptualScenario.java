/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.ConceptualScenario#getEntities <em>Entities</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.ConceptualScenario#getInterplays <em>Interplays</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.ConceptualScenario#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.ConceptualScenario#getEvents <em>Events</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.ConceptualScenario#getIndentification <em>Indentification</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario()
 * @model
 * @generated
 */
public interface ConceptualScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.ConceptualEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConceptualEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Interplays</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.PatternOfInterplay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interplays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interplays</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario_Interplays()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PatternOfInterplay> getInterplays();

	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario_StateMachines()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StateMachine> getStateMachines();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Indentification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indentification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentification</em>' containment reference.
	 * @see #setIndentification(ScenarioIdentification)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getConceptualScenario_Indentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScenarioIdentification getIndentification();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.ConceptualScenario#getIndentification <em>Indentification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentification</em>' containment reference.
	 * @see #getIndentification()
	 * @generated
	 */
	void setIndentification(ScenarioIdentification value);

} // ConceptualScenario
