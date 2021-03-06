/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getCascade <em>Cascade</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isRequired <em>Required</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isCache <em>Cache</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getDatabaseJoinColumn <em>Database Join Column</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isInverse <em>Inverse</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getValidate <em>Validate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getDatabaseJoinTable <em>Database Join Table</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#getType <em>Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isGeneratedBySculptor <em>Generated By Sculptor</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Relation#isGeneratedByJHipster <em>Generated By JHipster</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	DomainObject getTarget();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.DomainObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Source()
	 * @see com.github.icelyframework.service.DomainObject#getRelations
	 * @model opposite="relations" required="true" transient="false"
	 * @generated
	 */
	DomainObject getSource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see #setCascade(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Cascade()
	 * @model unique="false"
	 * @generated
	 */
	String getCascade();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(String value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see #setOrderBy(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_OrderBy()
	 * @model unique="false"
	 * @generated
	 */
	String getOrderBy();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Nullable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relation)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Opposite()
	 * @model
	 * @generated
	 */
	Relation getOpposite();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relation value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.RelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see com.github.icelyframework.service.RelationType
	 * @see #setRelationType(RelationType)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_RelationType()
	 * @model
	 * @generated
	 */
	RelationType getRelationType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see com.github.icelyframework.service.RelationType
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(RelationType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Changeable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Cache()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Database Join Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Join Column</em>' attribute.
	 * @see #setDatabaseJoinColumn(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_DatabaseJoinColumn()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabaseJoinColumn();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getDatabaseJoinColumn <em>Database Join Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Join Column</em>' attribute.
	 * @see #getDatabaseJoinColumn()
	 * @generated
	 */
	void setDatabaseJoinColumn(String value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' attribute.
	 * @see #setInverse(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Inverse()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInverse();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isInverse <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' attribute.
	 * @see #isInverse()
	 * @generated
	 */
	void setInverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Validate()
	 * @model unique="false"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Transient()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Database Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Join Table</em>' attribute.
	 * @see #setDatabaseJoinTable(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_DatabaseJoinTable()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabaseJoinTable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getDatabaseJoinTable <em>Database Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Join Table</em>' attribute.
	 * @see #getDatabaseJoinTable()
	 * @generated
	 */
	void setDatabaseJoinTable(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated By Sculptor</em>' attribute.
	 * @see #setGeneratedBySculptor(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_GeneratedBySculptor()
	 * @model default="True"
	 * @generated
	 */
	boolean isGeneratedBySculptor();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isGeneratedBySculptor <em>Generated By Sculptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated By Sculptor</em>' attribute.
	 * @see #isGeneratedBySculptor()
	 * @generated
	 */
	void setGeneratedBySculptor(boolean value);

	/**
	 * Returns the value of the '<em><b>Generated By JHipster</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated By JHipster</em>' attribute.
	 * @see #setGeneratedByJHipster(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRelation_GeneratedByJHipster()
	 * @model default="False"
	 * @generated
	 */
	boolean isGeneratedByJHipster();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Relation#isGeneratedByJHipster <em>Generated By JHipster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated By JHipster</em>' attribute.
	 * @see #isGeneratedByJHipster()
	 * @generated
	 */
	void setGeneratedByJHipster(boolean value);

} // Relation
