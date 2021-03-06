/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.DomainObjectOperation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.icelyframework.service.DomainObjectOperation#getDomainobject <em>Domainobject</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getDomainObjectOperation()
 * @model
 * @generated
 */
public interface DomainObjectOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getDomainObjectOperation_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.DomainObjectOperation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Domainobject</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobject</em>' container reference.
	 * @see #setDomainobject(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getDomainObjectOperation_Domainobject()
	 * @see com.github.icelyframework.service.DomainObject#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	DomainObject getDomainobject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.DomainObjectOperation#getDomainobject <em>Domainobject</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainobject</em>' container reference.
	 * @see #getDomainobject()
	 * @generated
	 */
	void setDomainobject(DomainObject value);

} // DomainObjectOperation
