/**
 */
package ConceptualScenarioMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Of Interplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.PatternOfInterplay#getActions <em>Actions</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.PatternOfInterplay#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getPatternOfInterplay()
 * @model
 * @generated
 */
public interface PatternOfInterplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptualScenarioMetaModel.PatternAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getPatternOfInterplay_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PatternAction> getActions();

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
	 * @see ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage#getPatternOfInterplay_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConceptualScenarioMetaModel.PatternOfInterplay#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PatternOfInterplay
