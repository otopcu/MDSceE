/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.Variation#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Variation#getCondition <em>Condition</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Variation#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.Variation#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getVariation()
 * @model
 * @generated
 */
public interface Variation extends EObject {
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
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getVariation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.Variation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getVariation_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.Variation#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.ConceptualEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getVariation_Receivers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConceptualEntity> getReceivers();

	/**
	 * Returns the value of the '<em><b>Senders</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.ConceptualEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getVariation_Senders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConceptualEntity> getSenders();

} // Variation
