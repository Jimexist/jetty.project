//
// ========================================================================
// Copyright (c) 2009 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License v. 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
// which is available at https://www.apache.org/licenses/LICENSE-2.0.
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

module org.eclipse.jetty.alpn.java.client
{
    requires org.slf4j;

    requires transitive org.eclipse.jetty.alpn.client;

    provides org.eclipse.jetty.io.ssl.ALPNProcessor.Client with
        org.eclipse.jetty.alpn.java.client.JDK9ClientALPNProcessor;
}
