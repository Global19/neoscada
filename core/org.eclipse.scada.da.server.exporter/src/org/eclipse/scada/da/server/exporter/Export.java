/*******************************************************************************
 * Copyright (c) 2010 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.server.exporter;

import org.eclipse.scada.core.ConnectionInformation;
import org.eclipse.scada.utils.lifecycle.LifecycleAware;

/**
 * A service that can be exported
 * @author Jens Reimann
 *
 */
public interface Export extends LifecycleAware
{
    ConnectionInformation getConnectionInformation ();
}
