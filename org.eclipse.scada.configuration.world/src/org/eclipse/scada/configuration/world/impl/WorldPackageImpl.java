/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.impl;

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.scada.configuration.security.SecurityPackage;
import org.eclipse.scada.configuration.world.Application;
import org.eclipse.scada.configuration.world.ApplicationNode;
import org.eclipse.scada.configuration.world.CommonDriver;
import org.eclipse.scada.configuration.world.Credentials;
import org.eclipse.scada.configuration.world.Documentable;
import org.eclipse.scada.configuration.world.Driver;
import org.eclipse.scada.configuration.world.Endpoint;
import org.eclipse.scada.configuration.world.ExecDriver;
import org.eclipse.scada.configuration.world.ExternalNode;
import org.eclipse.scada.configuration.world.HandlerPriorityRule;
import org.eclipse.scada.configuration.world.MasterHandlerPriorities;
import org.eclipse.scada.configuration.world.NamedDocumentable;
import org.eclipse.scada.configuration.world.Node;
import org.eclipse.scada.configuration.world.Options;
import org.eclipse.scada.configuration.world.PasswordCredentials;
import org.eclipse.scada.configuration.world.Service;
import org.eclipse.scada.configuration.world.UsernamePasswordCredentials;
import org.eclipse.scada.configuration.world.World;
import org.eclipse.scada.configuration.world.WorldFactory;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.deployment.DeploymentPackage;
import org.eclipse.scada.configuration.world.deployment.impl.DeploymentPackageImpl;
import org.eclipse.scada.configuration.world.osgi.OsgiPackage;
import org.eclipse.scada.configuration.world.osgi.impl.OsgiPackageImpl;
import org.eclipse.scada.configuration.world.osgi.profile.ProfilePackage;
import org.eclipse.scada.configuration.world.osgi.profile.impl.ProfilePackageImpl;
import org.eclipse.scada.da.exec.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldPackageImpl extends EPackageImpl implements WorldPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass worldEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass driverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass execDriverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commonDriverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass handlerPriorityRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass masterHandlerPrioritiesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass optionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass usernamePasswordCredentialsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passwordCredentialsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass credentialsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externalNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedDocumentableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType patternEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package
     * package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.scada.configuration.world.WorldPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private WorldPackageImpl ()
    {
        super ( eNS_URI, WorldFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * <p>
     * This method is used to initialize {@link WorldPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static WorldPackage init ()
    {
        if ( isInited )
            return (WorldPackage)EPackage.Registry.INSTANCE.getEPackage ( WorldPackage.eNS_URI );

        // Obtain or create and register package
        WorldPackageImpl theWorldPackage = (WorldPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new WorldPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfigurationPackage.eINSTANCE.eClass ();
        SecurityPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        OsgiPackageImpl theOsgiPackage = (OsgiPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( OsgiPackage.eNS_URI ) instanceof OsgiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( OsgiPackage.eNS_URI ) : OsgiPackage.eINSTANCE );
        ProfilePackageImpl theProfilePackage = (ProfilePackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProfilePackage.eNS_URI ) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProfilePackage.eNS_URI ) : ProfilePackage.eINSTANCE );
        DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( DeploymentPackage.eNS_URI ) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( DeploymentPackage.eNS_URI ) : DeploymentPackage.eINSTANCE );

        // Create package meta-data objects
        theWorldPackage.createPackageContents ();
        theOsgiPackage.createPackageContents ();
        theProfilePackage.createPackageContents ();
        theDeploymentPackage.createPackageContents ();

        // Initialize created meta-data
        theWorldPackage.initializePackageContents ();
        theOsgiPackage.initializePackageContents ();
        theProfilePackage.initializePackageContents ();
        theDeploymentPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theWorldPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( WorldPackage.eNS_URI, theWorldPackage );
        return theWorldPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWorld ()
    {
        return worldEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorld_Nodes ()
    {
        return (EReference)worldEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorld_Options ()
    {
        return (EReference)worldEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNode ()
    {
        return nodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNode_HostName ()
    {
        return (EAttribute)nodeEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNode_Endpoints ()
    {
        return (EReference)nodeEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNode_Deployments ()
    {
        return (EReference)nodeEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationNode ()
    {
        return applicationNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationNode_Applications ()
    {
        return (EReference)applicationNodeEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationNode_Services ()
    {
        return (EReference)applicationNodeEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDocumentable ()
    {
        return documentableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDocumentable_ShortDescription ()
    {
        return (EAttribute)documentableEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplication ()
    {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDriver ()
    {
        return driverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDriver__GetEndpoints ()
    {
        return driverEClass.getEOperations ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEndpoint ()
    {
        return endpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEndpoint_Node ()
    {
        return (EReference)endpointEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEndpoint_PortNumber ()
    {
        return (EAttribute)endpointEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExecDriver ()
    {
        return execDriverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExecDriver_Root ()
    {
        return (EReference)execDriverEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommonDriver ()
    {
        return commonDriverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommonDriver_Password ()
    {
        return (EReference)commonDriverEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommonDriver_Endpoints ()
    {
        return (EReference)commonDriverEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHandlerPriorityRule ()
    {
        return handlerPriorityRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandlerPriorityRule_Order ()
    {
        return (EAttribute)handlerPriorityRuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandlerPriorityRule_FactoryId ()
    {
        return (EAttribute)handlerPriorityRuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandlerPriorityRule_ConfigurationFilter ()
    {
        return (EAttribute)handlerPriorityRuleEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandlerPriorityRule_Priority ()
    {
        return (EAttribute)handlerPriorityRuleEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandlerPriorityRule_Description ()
    {
        return (EAttribute)handlerPriorityRuleEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMasterHandlerPriorities ()
    {
        return masterHandlerPrioritiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMasterHandlerPriorities_Rules ()
    {
        return (EReference)masterHandlerPrioritiesEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOptions ()
    {
        return optionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOptions_MasterHandlerPriorities ()
    {
        return (EReference)optionsEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUsernamePasswordCredentials ()
    {
        return usernamePasswordCredentialsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUsernamePasswordCredentials_Username ()
    {
        return (EAttribute)usernamePasswordCredentialsEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUsernamePasswordCredentials_Password ()
    {
        return (EAttribute)usernamePasswordCredentialsEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPasswordCredentials ()
    {
        return passwordCredentialsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPasswordCredentials_Password ()
    {
        return (EAttribute)passwordCredentialsEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCredentials ()
    {
        return credentialsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExternalNode ()
    {
        return externalNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getService ()
    {
        return serviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNamedDocumentable ()
    {
        return namedDocumentableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNamedDocumentable_Name ()
    {
        return (EAttribute)namedDocumentableEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getPattern ()
    {
        return patternEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorldFactory getWorldFactory ()
    {
        return (WorldFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if ( isCreated )
            return;
        isCreated = true;

        // Create classes and their features
        worldEClass = createEClass ( WORLD );
        createEReference ( worldEClass, WORLD__NODES );
        createEReference ( worldEClass, WORLD__OPTIONS );

        nodeEClass = createEClass ( NODE );
        createEAttribute ( nodeEClass, NODE__HOST_NAME );
        createEReference ( nodeEClass, NODE__ENDPOINTS );
        createEReference ( nodeEClass, NODE__DEPLOYMENTS );

        applicationNodeEClass = createEClass ( APPLICATION_NODE );
        createEReference ( applicationNodeEClass, APPLICATION_NODE__APPLICATIONS );
        createEReference ( applicationNodeEClass, APPLICATION_NODE__SERVICES );

        documentableEClass = createEClass ( DOCUMENTABLE );
        createEAttribute ( documentableEClass, DOCUMENTABLE__SHORT_DESCRIPTION );

        applicationEClass = createEClass ( APPLICATION );

        driverEClass = createEClass ( DRIVER );
        createEOperation ( driverEClass, DRIVER___GET_ENDPOINTS );

        endpointEClass = createEClass ( ENDPOINT );
        createEReference ( endpointEClass, ENDPOINT__NODE );
        createEAttribute ( endpointEClass, ENDPOINT__PORT_NUMBER );

        execDriverEClass = createEClass ( EXEC_DRIVER );
        createEReference ( execDriverEClass, EXEC_DRIVER__ROOT );

        commonDriverEClass = createEClass ( COMMON_DRIVER );
        createEReference ( commonDriverEClass, COMMON_DRIVER__PASSWORD );
        createEReference ( commonDriverEClass, COMMON_DRIVER__ENDPOINTS );

        handlerPriorityRuleEClass = createEClass ( HANDLER_PRIORITY_RULE );
        createEAttribute ( handlerPriorityRuleEClass, HANDLER_PRIORITY_RULE__ORDER );
        createEAttribute ( handlerPriorityRuleEClass, HANDLER_PRIORITY_RULE__FACTORY_ID );
        createEAttribute ( handlerPriorityRuleEClass, HANDLER_PRIORITY_RULE__CONFIGURATION_FILTER );
        createEAttribute ( handlerPriorityRuleEClass, HANDLER_PRIORITY_RULE__PRIORITY );
        createEAttribute ( handlerPriorityRuleEClass, HANDLER_PRIORITY_RULE__DESCRIPTION );

        masterHandlerPrioritiesEClass = createEClass ( MASTER_HANDLER_PRIORITIES );
        createEReference ( masterHandlerPrioritiesEClass, MASTER_HANDLER_PRIORITIES__RULES );

        optionsEClass = createEClass ( OPTIONS );
        createEReference ( optionsEClass, OPTIONS__MASTER_HANDLER_PRIORITIES );

        usernamePasswordCredentialsEClass = createEClass ( USERNAME_PASSWORD_CREDENTIALS );
        createEAttribute ( usernamePasswordCredentialsEClass, USERNAME_PASSWORD_CREDENTIALS__USERNAME );
        createEAttribute ( usernamePasswordCredentialsEClass, USERNAME_PASSWORD_CREDENTIALS__PASSWORD );

        passwordCredentialsEClass = createEClass ( PASSWORD_CREDENTIALS );
        createEAttribute ( passwordCredentialsEClass, PASSWORD_CREDENTIALS__PASSWORD );

        credentialsEClass = createEClass ( CREDENTIALS );

        externalNodeEClass = createEClass ( EXTERNAL_NODE );

        serviceEClass = createEClass ( SERVICE );

        namedDocumentableEClass = createEClass ( NAMED_DOCUMENTABLE );
        createEAttribute ( namedDocumentableEClass, NAMED_DOCUMENTABLE__NAME );

        // Create data types
        patternEDataType = createEDataType ( PATTERN );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents ()
    {
        if ( isInitialized )
            return;
        isInitialized = true;

        // Initialize package
        setName ( eNAME );
        setNsPrefix ( eNS_PREFIX );
        setNsURI ( eNS_URI );

        // Obtain other dependent packages
        OsgiPackage theOsgiPackage = (OsgiPackage)EPackage.Registry.INSTANCE.getEPackage ( OsgiPackage.eNS_URI );
        DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage ( DeploymentPackage.eNS_URI );
        ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage ( ConfigurationPackage.eNS_URI );

        // Add subpackages
        getESubpackages ().add ( theOsgiPackage );
        getESubpackages ().add ( theDeploymentPackage );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        nodeEClass.getESuperTypes ().add ( this.getNamedDocumentable () );
        applicationNodeEClass.getESuperTypes ().add ( this.getNode () );
        applicationEClass.getESuperTypes ().add ( this.getNamedDocumentable () );
        driverEClass.getESuperTypes ().add ( this.getApplication () );
        endpointEClass.getESuperTypes ().add ( this.getNamedDocumentable () );
        execDriverEClass.getESuperTypes ().add ( this.getCommonDriver () );
        commonDriverEClass.getESuperTypes ().add ( this.getDriver () );
        masterHandlerPrioritiesEClass.getESuperTypes ().add ( this.getNamedDocumentable () );
        usernamePasswordCredentialsEClass.getESuperTypes ().add ( this.getCredentials () );
        passwordCredentialsEClass.getESuperTypes ().add ( this.getCredentials () );
        externalNodeEClass.getESuperTypes ().add ( this.getNode () );
        serviceEClass.getESuperTypes ().add ( this.getNamedDocumentable () );
        namedDocumentableEClass.getESuperTypes ().add ( this.getDocumentable () );

        // Initialize classes, features, and operations; add parameters
        initEClass ( worldEClass, World.class, "World", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getWorld_Nodes (), this.getNode (), null, "nodes", null, 0, -1, World.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEReference ( getWorld_Options (), this.getOptions (), null, "options", null, 0, 1, World.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getNode_HostName (), ecorePackage.getEString (), "hostName", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEReference ( getNode_Endpoints (), this.getEndpoint (), this.getEndpoint_Node (), "endpoints", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEReference ( getNode_Deployments (), theDeploymentPackage.getDeploymentMechanism (), null, "deployments", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( applicationNodeEClass, ApplicationNode.class, "ApplicationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getApplicationNode_Applications (), this.getApplication (), null, "applications", null, 0, -1, ApplicationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEReference ( getApplicationNode_Services (), this.getService (), null, "services", null, 0, -1, ApplicationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( documentableEClass, Documentable.class, "Documentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getDocumentable_ShortDescription (), ecorePackage.getEString (), "shortDescription", null, 0, 1, Documentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( applicationEClass, Application.class, "Application", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        initEClass ( driverEClass, Driver.class, "Driver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        initEOperation ( getDriver__GetEndpoints (), this.getEndpoint (), "getEndpoints", 0, -1, IS_UNIQUE, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getEndpoint_Node (), this.getNode (), this.getNode_Endpoints (), "node", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        getEndpoint_Node ().getEKeys ().add ( this.getNode_HostName () );
        initEAttribute ( getEndpoint_PortNumber (), ecorePackage.getEShort (), "portNumber", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( execDriverEClass, ExecDriver.class, "ExecDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getExecDriver_Root (), theConfigurationPackage.getRootType (), null, "root", null, 0, 1, ExecDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( commonDriverEClass, CommonDriver.class, "CommonDriver", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getCommonDriver_Password (), this.getPasswordCredentials (), null, "password", null, 0, 1, CommonDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEReference ( getCommonDriver_Endpoints (), this.getEndpoint (), null, "endpoints", null, 0, -1, CommonDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        getCommonDriver_Endpoints ().getEKeys ().add ( this.getEndpoint_PortNumber () );

        initEClass ( handlerPriorityRuleEClass, HandlerPriorityRule.class, "HandlerPriorityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getHandlerPriorityRule_Order (), ecorePackage.getEInt (), "order", null, 1, 1, HandlerPriorityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEAttribute ( getHandlerPriorityRule_FactoryId (), ecorePackage.getEString (), "factoryId", null, 0, 1, HandlerPriorityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEAttribute ( getHandlerPriorityRule_ConfigurationFilter (), this.getPattern (), "configurationFilter", null, 0, 1, HandlerPriorityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEAttribute ( getHandlerPriorityRule_Priority (), ecorePackage.getEInt (), "priority", null, 1, 1, HandlerPriorityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEAttribute ( getHandlerPriorityRule_Description (), ecorePackage.getEString (), "description", null, 0, 1, HandlerPriorityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( masterHandlerPrioritiesEClass, MasterHandlerPriorities.class, "MasterHandlerPriorities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getMasterHandlerPriorities_Rules (), this.getHandlerPriorityRule (), null, "rules", null, 0, -1, MasterHandlerPriorities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEReference ( getOptions_MasterHandlerPriorities (), this.getMasterHandlerPriorities (), null, "masterHandlerPriorities", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( usernamePasswordCredentialsEClass, UsernamePasswordCredentials.class, "UsernamePasswordCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getUsernamePasswordCredentials_Username (), ecorePackage.getEString (), "username", null, 1, 1, UsernamePasswordCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$
        initEAttribute ( getUsernamePasswordCredentials_Password (), ecorePackage.getEString (), "password", null, 1, 1, UsernamePasswordCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( passwordCredentialsEClass, PasswordCredentials.class, "PasswordCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getPasswordCredentials_Password (), ecorePackage.getEString (), "password", null, 1, 1, PasswordCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        initEClass ( credentialsEClass, Credentials.class, "Credentials", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        initEClass ( externalNodeEClass, ExternalNode.class, "ExternalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        initEClass ( serviceEClass, Service.class, "Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        initEClass ( namedDocumentableEClass, NamedDocumentable.class, "NamedDocumentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$
        initEAttribute ( getNamedDocumentable_Name (), ecorePackage.getEString (), "name", null, 0, 1, NamedDocumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED ); //$NON-NLS-1$

        // Initialize data types
        initEDataType ( patternEDataType, Pattern.class, "Pattern", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS ); //$NON-NLS-1$

        // Create resource
        createResource ( eNS_URI );
    }

} //ConfigurationPackageImpl
