/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 *******************************************************************************/
package org.eclipse.rdf4j.repository.event;

import org.eclipse.rdf4j.repository.RepositoryConnection;

/**
 * @author Herko ter Horst
 */
public interface InterceptingRepositoryConnection extends RepositoryConnection {

	/**
	 * Registers a <var>RepositoryConnectionInterceptor</var> that will receive notifications of operations that are
	 * performed on this connection.
	 */
	void addRepositoryConnectionInterceptor(RepositoryConnectionInterceptor interceptor);

	/**
	 * Removes a registered <var>RepositoryConnectionInterceptor</var> from this connection.
	 */
	void removeRepositoryConnectionInterceptor(RepositoryConnectionInterceptor interceptor);

}
