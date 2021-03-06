/**
 */
package com.github.icelyframework.deployment.impl;

import com.github.icelyframework.deployment.DeploymentPackage;
import com.github.icelyframework.deployment.DeploymentType;
import com.github.icelyframework.deployment.GatewayType;
import com.github.icelyframework.deployment.Project;
import com.github.icelyframework.deployment.ProjectDeployment;
import com.github.icelyframework.deployment.ServiceDiscoveryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getDockerRepositoryName <em>Docker Repository Name</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getServiceDiscoveryType <em>Service Discovery Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getAppsFolders <em>Apps Folders</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#isMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getKubernetesServiceType <em>Kubernetes Service Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectDeploymentImpl extends EObjectImpl implements ProjectDeployment {
	/**
	 * The default value of the '{@link #getDockerRepositoryName() <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerRepositoryName() <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected String dockerRepositoryName = DOCKER_REPOSITORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected String directoryPath = DIRECTORY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDiscoveryType() <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceDiscoveryType SERVICE_DISCOVERY_TYPE_EDEFAULT = ServiceDiscoveryType.EUREKA;

	/**
	 * The cached value of the '{@link #getServiceDiscoveryType() <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryType()
	 * @generated
	 * @ordered
	 */
	protected ServiceDiscoveryType serviceDiscoveryType = SERVICE_DISCOVERY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayType GATEWAY_TYPE_EDEFAULT = GatewayType.ZUUL;

	/**
	 * The cached value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected GatewayType gatewayType = GATEWAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentType DEPLOYMENT_TYPE_EDEFAULT = DeploymentType.DOCKER_COMPOSE;

	/**
	 * The cached value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected DeploymentType deploymentType = DEPLOYMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppsFolders() <em>Apps Folders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppsFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> appsFolders;

	/**
	 * The default value of the '{@link #isMonitoring() <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitoring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitoring() <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitoring()
	 * @generated
	 * @ordered
	 */
	protected boolean monitoring = MONITORING_EDEFAULT;

	/**
	 * The default value of the '{@link #getKubernetesServiceType() <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String KUBERNETES_SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKubernetesServiceType() <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceType()
	 * @generated
	 * @ordered
	 */
	protected String kubernetesServiceType = KUBERNETES_SERVICE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectDeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.PROJECT_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerRepositoryName() {
		return dockerRepositoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerRepositoryName(String newDockerRepositoryName) {
		String oldDockerRepositoryName = dockerRepositoryName;
		dockerRepositoryName = newDockerRepositoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME, oldDockerRepositoryName, dockerRepositoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectoryPath() {
		return directoryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryPath(String newDirectoryPath) {
		String oldDirectoryPath = directoryPath;
		directoryPath = newDirectoryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__DIRECTORY_PATH, oldDirectoryPath, directoryPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDiscoveryType getServiceDiscoveryType() {
		return serviceDiscoveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDiscoveryType(ServiceDiscoveryType newServiceDiscoveryType) {
		ServiceDiscoveryType oldServiceDiscoveryType = serviceDiscoveryType;
		serviceDiscoveryType = newServiceDiscoveryType == null ? SERVICE_DISCOVERY_TYPE_EDEFAULT : newServiceDiscoveryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE, oldServiceDiscoveryType, serviceDiscoveryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayType getGatewayType() {
		return gatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayType(GatewayType newGatewayType) {
		GatewayType oldGatewayType = gatewayType;
		gatewayType = newGatewayType == null ? GATEWAY_TYPE_EDEFAULT : newGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__GATEWAY_TYPE, oldGatewayType, gatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentType getDeploymentType() {
		return deploymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentType(DeploymentType newDeploymentType) {
		DeploymentType oldDeploymentType = deploymentType;
		deploymentType = newDeploymentType == null ? DEPLOYMENT_TYPE_EDEFAULT : newDeploymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE, oldDeploymentType, deploymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAppsFolders() {
		if (appsFolders == null) {
			appsFolders = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPackage.PROJECT_DEPLOYMENT__APPS_FOLDERS);
		}
		return appsFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoring(boolean newMonitoring) {
		boolean oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__MONITORING, oldMonitoring, monitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKubernetesServiceType() {
		return kubernetesServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKubernetesServiceType(String newKubernetesServiceType) {
		String oldKubernetesServiceType = kubernetesServiceType;
		kubernetesServiceType = newKubernetesServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE, oldKubernetesServiceType, kubernetesServiceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (eContainerFeatureID() != DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, DeploymentPackage.PROJECT__DEPLOYMENT, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				return basicSetProject(null, msgs);
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.PROJECT__DEPLOYMENT, Project.class, msgs);
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				return getDockerRepositoryName();
			case DeploymentPackage.PROJECT_DEPLOYMENT__DIRECTORY_PATH:
				return getDirectoryPath();
			case DeploymentPackage.PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				return getServiceDiscoveryType();
			case DeploymentPackage.PROJECT_DEPLOYMENT__GATEWAY_TYPE:
				return getGatewayType();
			case DeploymentPackage.PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE:
				return getDeploymentType();
			case DeploymentPackage.PROJECT_DEPLOYMENT__APPS_FOLDERS:
				return getAppsFolders();
			case DeploymentPackage.PROJECT_DEPLOYMENT__MONITORING:
				return isMonitoring();
			case DeploymentPackage.PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				return getKubernetesServiceType();
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				return getProject();
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				setDockerRepositoryName((String)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath((String)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				setServiceDiscoveryType((ServiceDiscoveryType)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__GATEWAY_TYPE:
				setGatewayType((GatewayType)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE:
				setDeploymentType((DeploymentType)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__APPS_FOLDERS:
				getAppsFolders().clear();
				getAppsFolders().addAll((Collection<? extends String>)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__MONITORING:
				setMonitoring((Boolean)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				setKubernetesServiceType((String)newValue);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				setProject((Project)newValue);
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				setDockerRepositoryName(DOCKER_REPOSITORY_NAME_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath(DIRECTORY_PATH_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				setServiceDiscoveryType(SERVICE_DISCOVERY_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__GATEWAY_TYPE:
				setGatewayType(GATEWAY_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE:
				setDeploymentType(DEPLOYMENT_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__APPS_FOLDERS:
				getAppsFolders().clear();
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__MONITORING:
				setMonitoring(MONITORING_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				setKubernetesServiceType(KUBERNETES_SERVICE_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				setProject((Project)null);
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
			case DeploymentPackage.PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				return DOCKER_REPOSITORY_NAME_EDEFAULT == null ? dockerRepositoryName != null : !DOCKER_REPOSITORY_NAME_EDEFAULT.equals(dockerRepositoryName);
			case DeploymentPackage.PROJECT_DEPLOYMENT__DIRECTORY_PATH:
				return DIRECTORY_PATH_EDEFAULT == null ? directoryPath != null : !DIRECTORY_PATH_EDEFAULT.equals(directoryPath);
			case DeploymentPackage.PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				return serviceDiscoveryType != SERVICE_DISCOVERY_TYPE_EDEFAULT;
			case DeploymentPackage.PROJECT_DEPLOYMENT__GATEWAY_TYPE:
				return gatewayType != GATEWAY_TYPE_EDEFAULT;
			case DeploymentPackage.PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE:
				return deploymentType != DEPLOYMENT_TYPE_EDEFAULT;
			case DeploymentPackage.PROJECT_DEPLOYMENT__APPS_FOLDERS:
				return appsFolders != null && !appsFolders.isEmpty();
			case DeploymentPackage.PROJECT_DEPLOYMENT__MONITORING:
				return monitoring != MONITORING_EDEFAULT;
			case DeploymentPackage.PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				return KUBERNETES_SERVICE_TYPE_EDEFAULT == null ? kubernetesServiceType != null : !KUBERNETES_SERVICE_TYPE_EDEFAULT.equals(kubernetesServiceType);
			case DeploymentPackage.PROJECT_DEPLOYMENT__PROJECT:
				return getProject() != null;
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
		result.append(" (dockerRepositoryName: ");
		result.append(dockerRepositoryName);
		result.append(", directoryPath: ");
		result.append(directoryPath);
		result.append(", serviceDiscoveryType: ");
		result.append(serviceDiscoveryType);
		result.append(", gatewayType: ");
		result.append(gatewayType);
		result.append(", deploymentType: ");
		result.append(deploymentType);
		result.append(", appsFolders: ");
		result.append(appsFolders);
		result.append(", monitoring: ");
		result.append(monitoring);
		result.append(", kubernetesServiceType: ");
		result.append(kubernetesServiceType);
		result.append(')');
		return result.toString();
	}

} //ProjectDeploymentImpl
