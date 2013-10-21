/*******************************************************************************
 * Copyright (c) 2010, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     Jens Reimann - implement security callback system
 *******************************************************************************/
package org.eclipse.scada.protocol.ngp.model.Protocol.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.protocol.ngp.model.Protocol.EnumAttribute;
import org.eclipse.scada.protocol.ngp.model.Protocol.ProtocolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumAttributeTest extends AttributeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( EnumAttributeTest.class );
    }

    /**
     * Constructs a new Enum Attribute test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumAttributeTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Enum Attribute test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EnumAttribute getFixture ()
    {
        return (EnumAttribute)fixture;
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
        setFixture ( ProtocolFactory.eINSTANCE.createEnumAttribute () );
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

} //EnumAttributeTest
