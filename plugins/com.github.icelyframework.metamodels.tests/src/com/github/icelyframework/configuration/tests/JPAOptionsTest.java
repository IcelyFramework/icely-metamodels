/**
 */
package com.github.icelyframework.configuration.tests;

import com.github.icelyframework.configuration.ConfigurationFactory;
import com.github.icelyframework.configuration.JPAOptions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>JPA Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JPAOptionsTest extends TestCase {

	/**
	 * The fixture for this JPA Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPAOptions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JPAOptionsTest.class);
	}

	/**
	 * Constructs a new JPA Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPAOptionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this JPA Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JPAOptions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this JPA Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPAOptions getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createJPAOptions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //JPAOptionsTest
