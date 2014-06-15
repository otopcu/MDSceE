/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.Event#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Event#getSouceCharacteristic <em>Souce Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Event#getTargetCharacteristic <em>Target Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Event#getContentCharacteristic <em>Content Characteristic</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Event#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {

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
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Souce Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souce Characteristic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souce Characteristic</em>' containment reference.
	 * @see #setSouceCharacteristic(EntityCharacteristic)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent_SouceCharacteristic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityCharacteristic getSouceCharacteristic();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.Event#getSouceCharacteristic <em>Souce Characteristic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Souce Characteristic</em>' containment reference.
	 * @see #getSouceCharacteristic()
	 * @generated
	 */
	void setSouceCharacteristic(EntityCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Target Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.EntityCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Characteristic</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent_TargetCharacteristic()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityCharacteristic> getTargetCharacteristic();

	/**
	 * Returns the value of the '<em><b>Content Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.EntityCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Characteristic</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent_ContentCharacteristic()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityCharacteristic> getContentCharacteristic();

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
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEvent_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	TriggerCondition getTrigger();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.Event#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerCondition value);
} // Event
