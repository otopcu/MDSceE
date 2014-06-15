/**
 */
package ConceptualScenarioMetaModel.tests;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conceptual Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualEntityTest extends EntityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConceptualEntityTest.class);
	}

	/**
	 * Constructs a new Conceptual Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conceptual Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConceptualEntity getFixture() {
		return (ConceptualEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConceptualScenarioMetaModelFactory.eINSTANCE.createConceptualEntity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConceptualEntityTest
