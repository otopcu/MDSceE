/**
 */
package ConceptualScenarioMetaModel.tests;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory;
import ConceptualScenarioMetaModel.Receiver;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReceiverTest extends EntityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReceiverTest.class);
	}

	/**
	 * Constructs a new Receiver test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Receiver test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Receiver getFixture() {
		return (Receiver)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConceptualScenarioMetaModelFactory.eINSTANCE.createReceiver());
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

} //ReceiverTest
