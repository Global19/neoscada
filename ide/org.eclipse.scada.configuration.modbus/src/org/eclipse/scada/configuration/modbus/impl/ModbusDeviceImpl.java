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
package org.eclipse.scada.configuration.modbus.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.scada.configuration.infrastructure.impl.DeviceImpl;
import org.eclipse.scada.configuration.memory.TypeSystem;
import org.eclipse.scada.configuration.modbus.ModbusDevice;
import org.eclipse.scada.configuration.modbus.ModbusPackage;
import org.eclipse.scada.configuration.modbus.ModbusSlave;
import org.eclipse.scada.configuration.modbus.ProtocolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.modbus.impl.ModbusDeviceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.modbus.impl.ModbusDeviceImpl#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.modbus.impl.ModbusDeviceImpl#getInterFrameDelay <em>Inter Frame Delay</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.modbus.impl.ModbusDeviceImpl#getSlaves <em>Slaves</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.modbus.impl.ModbusDeviceImpl#getTypeSystem <em>Type System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModbusDeviceImpl extends DeviceImpl implements ModbusDevice
{
    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final short PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected short port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocolType()
     * @generated
     * @ordered
     */
    protected static final ProtocolType PROTOCOL_TYPE_EDEFAULT = ProtocolType.TCP;

    /**
     * The cached value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocolType()
     * @generated
     * @ordered
     */
    protected ProtocolType protocolType = PROTOCOL_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getInterFrameDelay() <em>Inter Frame Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterFrameDelay()
     * @generated
     * @ordered
     */
    protected static final Double INTER_FRAME_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterFrameDelay() <em>Inter Frame Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterFrameDelay()
     * @generated
     * @ordered
     */
    protected Double interFrameDelay = INTER_FRAME_DELAY_EDEFAULT;

    /**
     * The cached value of the '{@link #getSlaves() <em>Slaves</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlaves()
     * @generated
     * @ordered
     */
    protected EList<ModbusSlave> slaves;

    /**
     * The cached value of the '{@link #getTypeSystem() <em>Type System</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeSystem()
     * @generated
     * @ordered
     */
    protected TypeSystem typeSystem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModbusDeviceImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ModbusPackage.Literals.MODBUS_DEVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModbusSlave> getSlaves ()
    {
        if ( slaves == null )
        {
            slaves = new EObjectContainmentEList<ModbusSlave> ( ModbusSlave.class, this, ModbusPackage.MODBUS_DEVICE__SLAVES );
        }
        return slaves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSystem getTypeSystem ()
    {
        if ( typeSystem != null && typeSystem.eIsProxy () )
        {
            InternalEObject oldTypeSystem = (InternalEObject)typeSystem;
            typeSystem = (TypeSystem)eResolveProxy ( oldTypeSystem );
            if ( typeSystem != oldTypeSystem )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM, oldTypeSystem, typeSystem ) );
            }
        }
        return typeSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSystem basicGetTypeSystem ()
    {
        return typeSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeSystem ( TypeSystem newTypeSystem )
    {
        TypeSystem oldTypeSystem = typeSystem;
        typeSystem = newTypeSystem;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM, oldTypeSystem, typeSystem ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public short getPort ()
    {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort ( short newPort )
    {
        short oldPort = port;
        port = newPort;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModbusPackage.MODBUS_DEVICE__PORT, oldPort, port ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolType getProtocolType ()
    {
        return protocolType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocolType ( ProtocolType newProtocolType )
    {
        ProtocolType oldProtocolType = protocolType;
        protocolType = newProtocolType == null ? PROTOCOL_TYPE_EDEFAULT : newProtocolType;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModbusPackage.MODBUS_DEVICE__PROTOCOL_TYPE, oldProtocolType, protocolType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getInterFrameDelay ()
    {
        return interFrameDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterFrameDelay ( Double newInterFrameDelay )
    {
        Double oldInterFrameDelay = interFrameDelay;
        interFrameDelay = newInterFrameDelay;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModbusPackage.MODBUS_DEVICE__INTER_FRAME_DELAY, oldInterFrameDelay, interFrameDelay ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case ModbusPackage.MODBUS_DEVICE__SLAVES:
                return ( (InternalEList<?>)getSlaves () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case ModbusPackage.MODBUS_DEVICE__PORT:
                return getPort ();
            case ModbusPackage.MODBUS_DEVICE__PROTOCOL_TYPE:
                return getProtocolType ();
            case ModbusPackage.MODBUS_DEVICE__INTER_FRAME_DELAY:
                return getInterFrameDelay ();
            case ModbusPackage.MODBUS_DEVICE__SLAVES:
                return getSlaves ();
            case ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM:
                if ( resolve )
                    return getTypeSystem ();
                return basicGetTypeSystem ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case ModbusPackage.MODBUS_DEVICE__PORT:
                setPort ( (Short)newValue );
                return;
            case ModbusPackage.MODBUS_DEVICE__PROTOCOL_TYPE:
                setProtocolType ( (ProtocolType)newValue );
                return;
            case ModbusPackage.MODBUS_DEVICE__INTER_FRAME_DELAY:
                setInterFrameDelay ( (Double)newValue );
                return;
            case ModbusPackage.MODBUS_DEVICE__SLAVES:
                getSlaves ().clear ();
                getSlaves ().addAll ( (Collection<? extends ModbusSlave>)newValue );
                return;
            case ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM:
                setTypeSystem ( (TypeSystem)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case ModbusPackage.MODBUS_DEVICE__PORT:
                setPort ( PORT_EDEFAULT );
                return;
            case ModbusPackage.MODBUS_DEVICE__PROTOCOL_TYPE:
                setProtocolType ( PROTOCOL_TYPE_EDEFAULT );
                return;
            case ModbusPackage.MODBUS_DEVICE__INTER_FRAME_DELAY:
                setInterFrameDelay ( INTER_FRAME_DELAY_EDEFAULT );
                return;
            case ModbusPackage.MODBUS_DEVICE__SLAVES:
                getSlaves ().clear ();
                return;
            case ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM:
                setTypeSystem ( (TypeSystem)null );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case ModbusPackage.MODBUS_DEVICE__PORT:
                return port != PORT_EDEFAULT;
            case ModbusPackage.MODBUS_DEVICE__PROTOCOL_TYPE:
                return protocolType != PROTOCOL_TYPE_EDEFAULT;
            case ModbusPackage.MODBUS_DEVICE__INTER_FRAME_DELAY:
                return INTER_FRAME_DELAY_EDEFAULT == null ? interFrameDelay != null : !INTER_FRAME_DELAY_EDEFAULT.equals ( interFrameDelay );
            case ModbusPackage.MODBUS_DEVICE__SLAVES:
                return slaves != null && !slaves.isEmpty ();
            case ModbusPackage.MODBUS_DEVICE__TYPE_SYSTEM:
                return typeSystem != null;
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (port: " ); //$NON-NLS-1$
        result.append ( port );
        result.append ( ", protocolType: " ); //$NON-NLS-1$
        result.append ( protocolType );
        result.append ( ", interFrameDelay: " ); //$NON-NLS-1$
        result.append ( interFrameDelay );
        result.append ( ')' );
        return result.toString ();
    }

} //ModbusDeviceImpl
