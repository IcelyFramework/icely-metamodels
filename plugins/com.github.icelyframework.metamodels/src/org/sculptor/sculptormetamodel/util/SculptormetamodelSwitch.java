/**
 */
package org.sculptor.sculptormetamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.sculptor.sculptormetamodel.Application;
import org.sculptor.sculptormetamodel.Attribute;
import org.sculptor.sculptormetamodel.BasicType;
import org.sculptor.sculptormetamodel.CommandEvent;
import org.sculptor.sculptormetamodel.Consumer;
import org.sculptor.sculptormetamodel.DataTransferObject;
import org.sculptor.sculptormetamodel.DomainEvent;
import org.sculptor.sculptormetamodel.DomainObject;
import org.sculptor.sculptormetamodel.DomainObjectOperation;
import org.sculptor.sculptormetamodel.DomainObjectTypedElement;
import org.sculptor.sculptormetamodel.Entity;
import org.sculptor.sculptormetamodel.EnumConstructorParameter;
import org.sculptor.sculptormetamodel.EnumValue;
import org.sculptor.sculptormetamodel.Event;
import org.sculptor.sculptormetamodel.Inheritance;
import org.sculptor.sculptormetamodel.NamedElement;
import org.sculptor.sculptormetamodel.Operation;
import org.sculptor.sculptormetamodel.Parameter;
import org.sculptor.sculptormetamodel.Project;
import org.sculptor.sculptormetamodel.Publish;
import org.sculptor.sculptormetamodel.Reference;
import org.sculptor.sculptormetamodel.Repository;
import org.sculptor.sculptormetamodel.RepositoryOperation;
import org.sculptor.sculptormetamodel.Resource;
import org.sculptor.sculptormetamodel.ResourceOperation;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;
import org.sculptor.sculptormetamodel.Service;
import org.sculptor.sculptormetamodel.ServiceOperation;
import org.sculptor.sculptormetamodel.Subscribe;
import org.sculptor.sculptormetamodel.Trait;
import org.sculptor.sculptormetamodel.TypedElement;
import org.sculptor.sculptormetamodel.ValueObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage
 * @generated
 */
public class SculptormetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptormetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptormetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SculptormetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SculptormetamodelPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseNamedElement(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseNamedElement(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.MODULE: {
				org.sculptor.sculptormetamodel.Module module = (org.sculptor.sculptormetamodel.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.DOMAIN_OBJECT: {
				DomainObject domainObject = (DomainObject)theEObject;
				T result = caseDomainObject(domainObject);
				if (result == null) result = caseNamedElement(domainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION: {
				DomainObjectOperation domainObjectOperation = (DomainObjectOperation)theEObject;
				T result = caseDomainObjectOperation(domainObjectOperation);
				if (result == null) result = caseOperation(domainObjectOperation);
				if (result == null) result = caseDomainObjectTypedElement(domainObjectOperation);
				if (result == null) result = caseTypedElement(domainObjectOperation);
				if (result == null) result = caseNamedElement(domainObjectOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.SERVICE_OPERATION: {
				ServiceOperation serviceOperation = (ServiceOperation)theEObject;
				T result = caseServiceOperation(serviceOperation);
				if (result == null) result = caseOperation(serviceOperation);
				if (result == null) result = caseDomainObjectTypedElement(serviceOperation);
				if (result == null) result = caseTypedElement(serviceOperation);
				if (result == null) result = caseNamedElement(serviceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedElement(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.REPOSITORY_OPERATION: {
				RepositoryOperation repositoryOperation = (RepositoryOperation)theEObject;
				T result = caseRepositoryOperation(repositoryOperation);
				if (result == null) result = caseOperation(repositoryOperation);
				if (result == null) result = caseDomainObjectTypedElement(repositoryOperation);
				if (result == null) result = caseTypedElement(repositoryOperation);
				if (result == null) result = caseNamedElement(repositoryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseNamedElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseTypedElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT: {
				DomainObjectTypedElement domainObjectTypedElement = (DomainObjectTypedElement)theEObject;
				T result = caseDomainObjectTypedElement(domainObjectTypedElement);
				if (result == null) result = caseTypedElement(domainObjectTypedElement);
				if (result == null) result = caseNamedElement(domainObjectTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseDomainObjectTypedElement(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseDomainObjectTypedElement(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseDomainObject(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.VALUE_OBJECT: {
				ValueObject valueObject = (ValueObject)theEObject;
				T result = caseValueObject(valueObject);
				if (result == null) result = caseDomainObject(valueObject);
				if (result == null) result = caseNamedElement(valueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.BASIC_TYPE: {
				BasicType basicType = (BasicType)theEObject;
				T result = caseBasicType(basicType);
				if (result == null) result = caseValueObject(basicType);
				if (result == null) result = caseDomainObject(basicType);
				if (result == null) result = caseNamedElement(basicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.ENUM: {
				org.sculptor.sculptormetamodel.Enum enum_ = (org.sculptor.sculptormetamodel.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseDomainObject(enum_);
				if (result == null) result = caseNamedElement(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseNamedElement(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.ENUM_CONSTRUCTOR_PARAMETER: {
				EnumConstructorParameter enumConstructorParameter = (EnumConstructorParameter)theEObject;
				T result = caseEnumConstructorParameter(enumConstructorParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.INHERITANCE: {
				Inheritance inheritance = (Inheritance)theEObject;
				T result = caseInheritance(inheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.DATA_TRANSFER_OBJECT: {
				DataTransferObject dataTransferObject = (DataTransferObject)theEObject;
				T result = caseDataTransferObject(dataTransferObject);
				if (result == null) result = caseValueObject(dataTransferObject);
				if (result == null) result = caseDomainObject(dataTransferObject);
				if (result == null) result = caseNamedElement(dataTransferObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.TRAIT: {
				Trait trait = (Trait)theEObject;
				T result = caseTrait(trait);
				if (result == null) result = caseDomainObject(trait);
				if (result == null) result = caseNamedElement(trait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseValueObject(event);
				if (result == null) result = caseDomainObject(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.COMMAND_EVENT: {
				CommandEvent commandEvent = (CommandEvent)theEObject;
				T result = caseCommandEvent(commandEvent);
				if (result == null) result = caseEvent(commandEvent);
				if (result == null) result = caseValueObject(commandEvent);
				if (result == null) result = caseDomainObject(commandEvent);
				if (result == null) result = caseNamedElement(commandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.DOMAIN_EVENT: {
				DomainEvent domainEvent = (DomainEvent)theEObject;
				T result = caseDomainEvent(domainEvent);
				if (result == null) result = caseEvent(domainEvent);
				if (result == null) result = caseValueObject(domainEvent);
				if (result == null) result = caseDomainObject(domainEvent);
				if (result == null) result = caseNamedElement(domainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.CONSUMER: {
				Consumer consumer = (Consumer)theEObject;
				T result = caseConsumer(consumer);
				if (result == null) result = caseNamedElement(consumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.PUBLISH: {
				Publish publish = (Publish)theEObject;
				T result = casePublish(publish);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.SUBSCRIBE: {
				Subscribe subscribe = (Subscribe)theEObject;
				T result = caseSubscribe(subscribe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptormetamodelPackage.RESOURCE_OPERATION: {
				ResourceOperation resourceOperation = (ResourceOperation)theEObject;
				T result = caseResourceOperation(resourceOperation);
				if (result == null) result = caseOperation(resourceOperation);
				if (result == null) result = caseDomainObjectTypedElement(resourceOperation);
				if (result == null) result = caseTypedElement(resourceOperation);
				if (result == null) result = caseNamedElement(resourceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.sculptor.sculptormetamodel.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObject(DomainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObjectOperation(DomainObjectOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOperation(ServiceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryOperation(RepositoryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObjectTypedElement(DomainObjectTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueObject(ValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicType(BasicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.sculptor.sculptormetamodel.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constructor Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constructor Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstructorParameter(EnumConstructorParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transfer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transfer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransferObject(DataTransferObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrait(Trait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandEvent(CommandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainEvent(DomainEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumer(Consumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublish(Publish object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribe(Subscribe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceOperation(ResourceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SculptormetamodelSwitch
