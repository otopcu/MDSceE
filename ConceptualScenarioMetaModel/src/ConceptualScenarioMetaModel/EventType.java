/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.EventType#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.EventType#getSouce <em>Souce</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.EventType#getTarget <em>Target</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.EventType#getContent <em>Content</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.EventType#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType()
 * @model abstract="true"
 * @generated
 */
public interface EventType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.EventType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Souce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souce</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souce</em>' containment reference.
	 * @see #setSouce(SourceCharacteristic)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType_Souce()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceCharacteristic getSouce();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.EventType#getSouce <em>Souce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Souce</em>' containment reference.
	 * @see #getSouce()
	 * @generated
	 */
	void setSouce(SourceCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.TargetCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetCharacteristic> getTarget();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.ContentCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentCharacteristic> getContent();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(TriggerCondition)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEventType_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	TriggerCondition getTrigger();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.EventType#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerCondition value);

} // EventType
