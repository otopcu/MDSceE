/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.ScenarioIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPOCEmail <em>POC Email</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPOCTelephone <em>POC Telephone</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPOCOrganisation <em>POC Organisation</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPOCName <em>POC Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getUseHistory <em>Use History</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPOCType <em>POC Type</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getUseLimitations <em>Use Limitations</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ScenarioIdentificationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioIdentificationImpl extends EObjectImpl implements ScenarioIdentification {
	/**
	 * The default value of the '{@link #getPOCEmail() <em>POC Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCEmail() <em>POC Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCEmail()
	 * @generated
	 * @ordered
	 */
	protected String pocEmail = POC_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOCTelephone() <em>POC Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCTelephone() <em>POC Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCTelephone()
	 * @generated
	 * @ordered
	 */
	protected String pocTelephone = POC_TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOCOrganisation() <em>POC Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCOrganisation()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_ORGANISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCOrganisation() <em>POC Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCOrganisation()
	 * @generated
	 * @ordered
	 */
	protected String pocOrganisation = POC_ORGANISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOCName() <em>POC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCName()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCName() <em>POC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCName()
	 * @generated
	 * @ordered
	 */
	protected String pocName = POC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseHistory() <em>Use History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseHistory() <em>Use History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHistory()
	 * @generated
	 * @ordered
	 */
	protected String useHistory = USE_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOCType() <em>POC Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCType()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCType() <em>POC Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCType()
	 * @generated
	 * @ordered
	 */
	protected String pocType = POC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLimitations() <em>Use Limitations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitations()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_LIMITATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseLimitations() <em>Use Limitations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitations()
	 * @generated
	 * @ordered
	 */
	protected String useLimitations = USE_LIMITATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected String modificationDate = MODIFICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCEmail() {
		return pocEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCEmail(String newPOCEmail) {
		String oldPOCEmail = pocEmail;
		pocEmail = newPOCEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL, oldPOCEmail, pocEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCTelephone() {
		return pocTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCTelephone(String newPOCTelephone) {
		String oldPOCTelephone = pocTelephone;
		pocTelephone = newPOCTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE, oldPOCTelephone, pocTelephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCOrganisation() {
		return pocOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCOrganisation(String newPOCOrganisation) {
		String oldPOCOrganisation = pocOrganisation;
		pocOrganisation = newPOCOrganisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION, oldPOCOrganisation, pocOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCName() {
		return pocName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCName(String newPOCName) {
		String oldPOCName = pocName;
		pocName = newPOCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME, oldPOCName, pocName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseHistory() {
		return useHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseHistory(String newUseHistory) {
		String oldUseHistory = useHistory;
		useHistory = newUseHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY, oldUseHistory, useHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCType() {
		return pocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCType(String newPOCType) {
		String oldPOCType = pocType;
		pocType = newPOCType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE, oldPOCType, pocType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseLimitations() {
		return useLimitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLimitations(String newUseLimitations) {
		String oldUseLimitations = useLimitations;
		useLimitations = newUseLimitations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS, oldUseLimitations, useLimitations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificationDate() {
		return modificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(String newModificationDate) {
		String oldModificationDate = modificationDate;
		modificationDate = newModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE, oldModificationDate, modificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL:
				return getPOCEmail();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE:
				return getPOCTelephone();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION:
				return getPOCOrganisation();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME:
				return getPOCName();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY:
				return getUseHistory();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE:
				return getPOCType();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS:
				return getUseLimitations();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION:
				return getVersion();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE:
				return getModificationDate();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE:
				return getPurpose();
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL:
				setPOCEmail((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE:
				setPOCTelephone((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION:
				setPOCOrganisation((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME:
				setPOCName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY:
				setUseHistory((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE:
				setPOCType((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS:
				setUseLimitations((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION:
				setVersion((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE:
				setModificationDate((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL:
				setPOCEmail(POC_EMAIL_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE:
				setPOCTelephone(POC_TELEPHONE_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION:
				setPOCOrganisation(POC_ORGANISATION_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME:
				setPOCName(POC_NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY:
				setUseHistory(USE_HISTORY_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE:
				setPOCType(POC_TYPE_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS:
				setUseLimitations(USE_LIMITATIONS_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE:
				setModificationDate(MODIFICATION_DATE_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL:
				return POC_EMAIL_EDEFAULT == null ? pocEmail != null : !POC_EMAIL_EDEFAULT.equals(pocEmail);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE:
				return POC_TELEPHONE_EDEFAULT == null ? pocTelephone != null : !POC_TELEPHONE_EDEFAULT.equals(pocTelephone);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION:
				return POC_ORGANISATION_EDEFAULT == null ? pocOrganisation != null : !POC_ORGANISATION_EDEFAULT.equals(pocOrganisation);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME:
				return POC_NAME_EDEFAULT == null ? pocName != null : !POC_NAME_EDEFAULT.equals(pocName);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY:
				return USE_HISTORY_EDEFAULT == null ? useHistory != null : !USE_HISTORY_EDEFAULT.equals(useHistory);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE:
				return POC_TYPE_EDEFAULT == null ? pocType != null : !POC_TYPE_EDEFAULT.equals(pocType);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS:
				return USE_LIMITATIONS_EDEFAULT == null ? useLimitations != null : !USE_LIMITATIONS_EDEFAULT.equals(useLimitations);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE:
				return MODIFICATION_DATE_EDEFAULT == null ? modificationDate != null : !MODIFICATION_DATE_EDEFAULT.equals(modificationDate);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (POCEmail: ");
		result.append(pocEmail);
		result.append(", POCTelephone: ");
		result.append(pocTelephone);
		result.append(", POCOrganisation: ");
		result.append(pocOrganisation);
		result.append(", POCName: ");
		result.append(pocName);
		result.append(", UseHistory: ");
		result.append(useHistory);
		result.append(", POCType: ");
		result.append(pocType);
		result.append(", UseLimitations: ");
		result.append(useLimitations);
		result.append(", Name: ");
		result.append(name);
		result.append(", Version: ");
		result.append(version);
		result.append(", ModificationDate: ");
		result.append(modificationDate);
		result.append(", Purpose: ");
		result.append(purpose);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ScenarioIdentificationImpl
