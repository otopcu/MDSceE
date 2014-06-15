/**
 */
package ConceptualScenarioMetaModel.tests;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory;
import ConceptualScenarioMetaModel.TargetCharacteristic;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetCharacteristicTest extends EntityCharacteristicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetCharacteristicTest.class);
	}

	/**
	 * Constructs a new Target Characteristic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetCharacteristicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Characteristic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetCharacteristic getFixture() {
		return (TargetCharacteristic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConceptualScenarioMetaModelFactory.eINSTANCE.createTargetCharacteristic());
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

} //TargetCharacteristicTest
