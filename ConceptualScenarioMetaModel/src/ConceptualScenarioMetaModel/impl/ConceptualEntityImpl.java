/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;

import ConceptualScenarioMetaModel.EntityCharacteristic;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ConceptualEntityImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualEntityImpl extends EObjectImpl implements ConceptualEntity {
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
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityCharacteristic> characteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.CONCEPTUAL_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityCharacteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<EntityCharacteristic>(EntityCharacteristic.class, this, ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS:
				return getCharacteristics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends EntityCharacteristic>)newValue);
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS:
				getCharacteristics().clear();
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
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.CONCEPTUAL_ENTITY__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConceptualEntityImpl
