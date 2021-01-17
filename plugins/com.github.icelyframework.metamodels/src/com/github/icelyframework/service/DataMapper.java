/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.DataMapper#getDomainObject <em>Domain Object</em>}</li>
 *   <li>{@link com.github.icelyframework.service.DataMapper#getDto <em>Dto</em>}</li>
 *   <li>{@link com.github.icelyframework.service.DataMapper#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getDataMapper()
 * @model
 * @generated
 */
public interface DataMapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getDataMapper_DomainObject()
	 * @model required="true"
	 * @generated
	 */
	EList<DomainObject> getDomainObject();

	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(DTO)
	 * @see com.github.icelyframework.service.ServicePackage#getDataMapper_Dto()
	 * @model required="true"
	 * @generated
	 */
	DTO getDto();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.DataMapper#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(DTO value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getDataMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.DataMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataMapper
