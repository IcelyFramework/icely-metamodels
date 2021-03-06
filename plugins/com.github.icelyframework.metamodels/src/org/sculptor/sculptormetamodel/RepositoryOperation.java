/**
 */
package org.sculptor.sculptormetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.RepositoryOperation#getAccessObjectName <em>Access Object Name</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.RepositoryOperation#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepositoryOperation()
 * @model
 * @generated
 */
public interface RepositoryOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #setDelegateToAccessObject(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepositoryOperation_DelegateToAccessObject()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDelegateToAccessObject();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #isDelegateToAccessObject()
	 * @generated
	 */
	void setDelegateToAccessObject(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Object Name</em>' attribute.
	 * @see #setAccessObjectName(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepositoryOperation_AccessObjectName()
	 * @model unique="false"
	 * @generated
	 */
	String getAccessObjectName();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.RepositoryOperation#getAccessObjectName <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Object Name</em>' attribute.
	 * @see #getAccessObjectName()
	 * @generated
	 */
	void setAccessObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Repository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepositoryOperation_Repository()
	 * @see org.sculptor.sculptormetamodel.Repository#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.RepositoryOperation#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // RepositoryOperation
