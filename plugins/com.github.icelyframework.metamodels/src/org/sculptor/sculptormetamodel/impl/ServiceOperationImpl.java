/**
 */
package org.sculptor.sculptormetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.sculptor.sculptormetamodel.RepositoryOperation;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;
import org.sculptor.sculptormetamodel.Service;
import org.sculptor.sculptormetamodel.ServiceOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.ServiceOperationImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.ServiceOperationImpl#getServiceDelegate <em>Service Delegate</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.ServiceOperationImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOperationImpl extends OperationImpl implements ServiceOperation {
	/**
	 * The cached value of the '{@link #getServiceDelegate() <em>Service Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDelegate()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation serviceDelegate;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected RepositoryOperation delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.SERVICE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service getService() {
		if (eContainerFeatureID() != SculptormetamodelPackage.SERVICE_OPERATION__SERVICE) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		if (eContainerFeatureID() != SculptormetamodelPackage.SERVICE_OPERATION__SERVICE) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, SculptormetamodelPackage.SERVICE_OPERATION__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(Service newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != SculptormetamodelPackage.SERVICE_OPERATION__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, SculptormetamodelPackage.SERVICE__OPERATIONS, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.SERVICE_OPERATION__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOperation getServiceDelegate() {
		if (serviceDelegate != null && serviceDelegate.eIsProxy()) {
			InternalEObject oldServiceDelegate = (InternalEObject)serviceDelegate;
			serviceDelegate = (ServiceOperation)eResolveProxy(oldServiceDelegate);
			if (serviceDelegate != oldServiceDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
			}
		}
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetServiceDelegate() {
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDelegate(ServiceOperation newServiceDelegate) {
		ServiceOperation oldServiceDelegate = serviceDelegate;
		serviceDelegate = newServiceDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryOperation getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (RepositoryOperation)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryOperation basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(RepositoryOperation newDelegate) {
		RepositoryOperation oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((Service)otherEnd, msgs);
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				return basicSetService(null, msgs);
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				return eInternalContainer().eInverseRemove(this, SculptormetamodelPackage.SERVICE__OPERATIONS, Service.class, msgs);
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				if (resolve) return getServiceDelegate();
				return basicGetServiceDelegate();
			case SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)newValue);
				return;
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)newValue);
				return;
			case SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE:
				setDelegate((RepositoryOperation)newValue);
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)null);
				return;
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)null);
				return;
			case SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE:
				setDelegate((RepositoryOperation)null);
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
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE:
				return basicGetService() != null;
			case SculptormetamodelPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				return serviceDelegate != null;
			case SculptormetamodelPackage.SERVICE_OPERATION__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOperationImpl
