/*******************************************************************************
 * Copyright (c) 2009, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.hd.ui.connection.views;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.scada.core.ui.connection.data.ConnectionHolder;
import org.eclipse.scada.hd.ui.connection.internal.ConnectionWrapper;
import org.eclipse.scada.hd.ui.connection.internal.ItemListWrapper;
import org.eclipse.scada.hd.ui.connection.internal.QueryWrapper;

final class ConnectionObservableFactory implements IObservableFactory
{
    @Override
    public IObservable createObservable ( final Object target )
    {
        if ( target instanceof ConnectionHolder )
        {
            return new ConnectionWrapper ( (ConnectionHolder)target );
        }
        else if ( target instanceof ItemListWrapper )
        {
            return new ItemListObserver ( ( (ItemListWrapper)target ).getConnection () );
        }
        else if ( target instanceof QueryWrapper )
        {
            return ( (QueryWrapper)target ).getQueriesObservable ();
        }

        return null;
    }

}