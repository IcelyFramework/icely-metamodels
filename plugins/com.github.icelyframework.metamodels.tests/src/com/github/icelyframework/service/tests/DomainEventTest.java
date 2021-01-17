/**
 */
package com.github.icelyframework.service.tests;

import com.github.icelyframework.service.DomainEvent;
import com.github.icelyframework.service.ServiceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainEventTest.class);
	}

	/**
	 * Constructs a new Domain Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DomainEvent getFixture() {
		return (DomainEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceFactory.eINSTANCE.createDomainEvent());
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

} //DomainEventTest
