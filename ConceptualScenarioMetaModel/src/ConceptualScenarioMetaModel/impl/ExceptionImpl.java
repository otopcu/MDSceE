/**
 */
package ConceptualScenarioMetaModel.impl;

import ConceptualScenarioMetaModel.ConceptualEntity;
import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.Receiver;
import ConceptualScenarioMetaModel.Sender;

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
 * An implementation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExceptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExceptionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExceptionImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ConceptualScenarioMetaModel.impl.ExceptionImpl#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionImpl extends EObjectImpl implements ConceptualScenarioMetaModel.Exception {
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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualEntity> receivers;

	/**
	 * The cached value of the '{@link #getSenders() <em>Senders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualEntity> senders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualScenarioMetaModelPackage.Literals.EXCEPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXCEPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualScenarioMetaModelPackage.EXCEPTION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualEntity> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<ConceptualEntity>(ConceptualEntity.class, this, ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualEntity> getSenders() {
		if (senders == null) {
			senders = new EObjectContainmentEList<ConceptualEntity>(ConceptualEntity.class, this, ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS);
		}
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS:
				return ((InternalEList<?>)getSenders()).basicRemove(otherEnd, msgs);
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
			case ConceptualScenarioMetaModelPackage.EXCEPTION__NAME:
				return getName();
			case ConceptualScenarioMetaModelPackage.EXCEPTION__CONDITION:
				return getCondition();
			case ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS:
				return getReceivers();
			case ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS:
				return getSenders();
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
			case ConceptualScenarioMetaModelPackage.EXCEPTION__NAME:
				setName((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__CONDITION:
				setCondition((String)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends ConceptualEntity>)newValue);
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS:
				getSenders().clear();
				getSenders().addAll((Collection<? extends ConceptualEntity>)newValue);
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
			case ConceptualScenarioMetaModelPackage.EXCEPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS:
				getReceivers().clear();
				return;
			case ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS:
				getSenders().clear();
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
			case ConceptualScenarioMetaModelPackage.EXCEPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualScenarioMetaModelPackage.EXCEPTION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case ConceptualScenarioMetaModelPackage.EXCEPTION__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case ConceptualScenarioMetaModelPackage.EXCEPTION__SENDERS:
				return senders != null && !senders.isEmpty();
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
		result.append(", Condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ExceptionImpl
