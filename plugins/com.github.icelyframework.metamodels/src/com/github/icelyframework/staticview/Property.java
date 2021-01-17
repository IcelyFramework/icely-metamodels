/**
 */
package com.github.icelyframework.staticview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.Property#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#getMin <em>Min</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#getMax <em>Max</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_IsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Naming Property</em>' attribute.
	 * @see #setIsNamingProperty(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_IsNamingProperty()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNamingProperty();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#isIsNamingProperty <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Naming Property</em>' attribute.
	 * @see #isIsNamingProperty()
	 * @generated
	 */
	void setIsNamingProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_IsRequired()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

} // Property
