/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.scada.configuration.world.MasterHandlerPriorities;
import org.eclipse.scada.configuration.world.WorldFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Master Handler Priorities</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterHandlerPrioritiesTest extends TestCase
{

    /**
     * The fixture for this Master Handler Priorities test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MasterHandlerPriorities fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( MasterHandlerPrioritiesTest.class );
    }

    /**
     * Constructs a new Master Handler Priorities test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterHandlerPrioritiesTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Master Handler Priorities test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( MasterHandlerPriorities fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Master Handler Priorities test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MasterHandlerPriorities getFixture ()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( WorldFactory.eINSTANCE.createMasterHandlerPriorities () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //MasterHandlerPrioritiesTest
