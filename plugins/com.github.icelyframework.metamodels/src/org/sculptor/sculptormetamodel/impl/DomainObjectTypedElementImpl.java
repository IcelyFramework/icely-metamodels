/**
 */
package org.sculptor.sculptormetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sculptor.sculptormetamodel.DomainObject;
import org.sculptor.sculptormetamodel.DomainObjectTypedElement;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.DomainObjectTypedElementImpl#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.DomainObjectTypedElementImpl#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectTypedElementImpl extends TypedElementImpl implements DomainObjectTypedElement {
	/**
	 * The cached value of the '{@link #getDomainObjectType() <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DomainObject domainObjectType;

	/**
	 * The cached value of the '{@link #getMapKeyDomainObjectType() <em>Map Key Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DomainObject mapKeyDomainObjectType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.DOMAIN_OBJECT_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainObjectType() {
		if (domainObjectType != null && domainObjectType.eIsProxy()) {
			InternalEObject oldDomainObjectType = (InternalEObject)domainObjectType;
			domainObjectType = (DomainObject)eResolveProxy(oldDomainObjectType);
			if (domainObjectType != oldDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
			}
		}
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObjectType() {
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObjectType(DomainObject newDomainObjectType) {
		DomainObject oldDomainObjectType = domainObjectType;
		domainObjectType = newDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getMapKeyDomainObjectType() {
		if (mapKeyDomainObjectType != null && mapKeyDomainObjectType.eIsProxy()) {
			InternalEObject oldMapKeyDomainObjectType = (InternalEObject)mapKeyDomainObjectType;
			mapKeyDomainObjectType = (DomainObject)eResolveProxy(oldMapKeyDomainObjectType);
			if (mapKeyDomainObjectType != oldMapKeyDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE, oldMapKeyDomainObjectType, mapKeyDomainObjectType));
			}
		}
		return mapKeyDomainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetMapKeyDomainObjectType() {
		return mapKeyDomainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKeyDomainObjectType(DomainObject newMapKeyDomainObjectType) {
		DomainObject oldMapKeyDomainObjectType = mapKeyDomainObjectType;
		mapKeyDomainObjectType = newMapKeyDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE, oldMapKeyDomainObjectType, mapKeyDomainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				if (resolve) return getDomainObjectType();
				return basicGetDomainObjectType();
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE:
				if (resolve) return getMapKeyDomainObjectType();
				return basicGetMapKeyDomainObjectType();
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DomainObject)newValue);
				return;
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE:
				setMapKeyDomainObjectType((DomainObject)newValue);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DomainObject)null);
				return;
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE:
				setMapKeyDomainObjectType((DomainObject)null);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE:
				return domainObjectType != null;
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE:
				return mapKeyDomainObjectType != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainObjectTypedElementImpl
