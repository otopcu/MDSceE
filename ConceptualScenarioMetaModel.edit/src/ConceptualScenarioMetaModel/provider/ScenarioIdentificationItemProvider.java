/**
 */
package ConceptualScenarioMetaModel.provider;


import ConceptualScenarioMetaModel.ConceptualScenarioMetaModelPackage;
import ConceptualScenarioMetaModel.ScenarioIdentification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ConceptualScenarioMetaModel.ScenarioIdentification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioIdentificationItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioIdentificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPOCEmailPropertyDescriptor(object);
			addPOCTelephonePropertyDescriptor(object);
			addPOCOrganisationPropertyDescriptor(object);
			addPOCNamePropertyDescriptor(object);
			addUseHistoryPropertyDescriptor(object);
			addPOCTypePropertyDescriptor(object);
			addUseLimitationsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addModificationDatePropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the POC Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPOCEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_POCEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_POCEmail_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__POC_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POC Telephone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPOCTelephonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_POCTelephone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_POCTelephone_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__POC_TELEPHONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POC Organisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPOCOrganisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_POCOrganisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_POCOrganisation_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__POC_ORGANISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POC Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPOCNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_POCName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_POCName_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__POC_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_UseHistory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_UseHistory_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__USE_HISTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POC Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPOCTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_POCType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_POCType_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__POC_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Limitations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseLimitationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_UseLimitations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_UseLimitations_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__USE_LIMITATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_Name_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_Version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_Version_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modification Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModificationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_ModificationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_ModificationDate_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__MODIFICATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_Purpose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_Purpose_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__PURPOSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioIdentification_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioIdentification_Description_feature", "_UI_ScenarioIdentification_type"),
				 ConceptualScenarioMetaModelPackage.Literals.SCENARIO_IDENTIFICATION__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ScenarioIdentification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScenarioIdentification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScenarioIdentification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScenarioIdentification_type") :
			getString("_UI_ScenarioIdentification_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScenarioIdentification.class)) {
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_EMAIL:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TELEPHONE:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_ORGANISATION:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_NAME:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_HISTORY:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__POC_TYPE:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__USE_LIMITATIONS:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__NAME:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__VERSION:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__MODIFICATION_DATE:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__PURPOSE:
			case ConceptualScenarioMetaModelPackage.SCENARIO_IDENTIFICATION__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConceptualScenarioEditPlugin.INSTANCE;
	}

}
