/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.EntityType#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.EntityType#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEntityType()
 * @model abstract="true"
 * @generated
 */
public interface EntityType extends EObject {
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
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEntityType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.EntityType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.EntityCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getEntityType_Characteristics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntityCharacteristic> getCharacteristics();

} // EntityType
