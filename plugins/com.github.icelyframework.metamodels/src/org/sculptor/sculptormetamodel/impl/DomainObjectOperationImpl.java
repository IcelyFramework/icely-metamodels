/**
 */
package org.sculptor.sculptormetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.sculptor.sculptormetamodel.DomainObject;
import org.sculptor.sculptormetamodel.DomainObjectOperation;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.DomainObjectOperationImpl#getDomainObject <em>Domain Object</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.DomainObjectOperationImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectOperationImpl extends OperationImpl implements DomainObjectOperation {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.DOMAIN_OBJECT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainObject() {
		if (eContainerFeatureID() != SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT) return null;
		return (DomainObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetDomainObject() {
		if (eContainerFeatureID() != SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainObject(DomainObject newDomainObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomainObject, SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObject(DomainObject newDomainObject) {
		if (newDomainObject != eInternalContainer() || (eContainerFeatureID() != SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT && newDomainObject != null)) {
			if (EcoreUtil.isAncestor(this, newDomainObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomainObject != null)
				msgs = ((InternalEObject)newDomainObject).eInverseAdd(this, SculptormetamodelPackage.DOMAIN_OBJECT__OPERATIONS, DomainObject.class, msgs);
			msgs = basicSetDomainObject(newDomainObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT, newDomainObject, newDomainObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomainObject((DomainObject)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				return basicSetDomainObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				return eInternalContainer().eInverseRemove(this, SculptormetamodelPackage.DOMAIN_OBJECT__OPERATIONS, DomainObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				if (resolve) return getDomainObject();
				return basicGetDomainObject();
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				return isAbstract();
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				setDomainObject((DomainObject)newValue);
				return;
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				setAbstract((Boolean)newValue);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				setDomainObject((DomainObject)null);
				return;
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
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
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT:
				return basicGetDomainObject() != null;
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //DomainObjectOperationImpl
