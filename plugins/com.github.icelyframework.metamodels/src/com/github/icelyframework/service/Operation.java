/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Operation#getThrows <em>Throws</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Operation#getPublish <em>Publish</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Operation#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Throws()
	 * @model unique="false"
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Operation#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Operation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' containment reference.
	 * @see #setPublish(Publish)
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Publish()
	 * @model containment="true"
	 * @generated
	 */
	Publish getPublish();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Operation#getPublish <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' containment reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(Publish value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' reference.
	 * @see #setReturntype(TypeDefinition)
	 * @see com.github.icelyframework.service.ServicePackage#getOperation_Returntype()
	 * @model
	 * @generated
	 */
	TypeDefinition getReturntype();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Operation#getReturntype <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(TypeDefinition value);

} // Operation
