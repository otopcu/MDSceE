/**
 */
package ConceptualScenarioMetaModel.tests;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelFactory;
import ConceptualScenarioMetaModel.ContentCharacteristic;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Content Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentCharacteristicTest extends EntityCharacteristicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContentCharacteristicTest.class);
	}

	/**
	 * Constructs a new Content Characteristic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentCharacteristicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Content Characteristic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContentCharacteristic getFixture() {
		return (ContentCharacteristic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConceptualScenarioMetaModelFactory.eINSTANCE.createContentCharacteristic());
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

} //ContentCharacteristicTest
