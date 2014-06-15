/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.ExitCondition#getNextState <em>Next State</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.ExitCondition#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getExitCondition()
 * @model
 * @generated
 */
public interface ExitCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Next State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next State</em>' containment reference.
	 * @see #setNextState(State)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getExitCondition_NextState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getNextState();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.ExitCondition#getNextState <em>Next State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next State</em>' containment reference.
	 * @see #getNextState()
	 * @generated
	 */
	void setNextState(State value);

	/**
	 * Returns the value of the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Action</em>' containment reference.
	 * @see #setExitAction(PatternAction)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getExitCondition_ExitAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PatternAction getExitAction();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.ExitCondition#getExitAction <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action</em>' containment reference.
	 * @see #getExitAction()
	 * @generated
	 */
	void setExitAction(PatternAction value);

} // ExitCondition
