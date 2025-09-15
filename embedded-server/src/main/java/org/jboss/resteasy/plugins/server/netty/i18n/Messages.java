/*
 * Copyright The RESTEasy Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.jboss.resteasy.plugins.server.netty.i18n;

import java.lang.invoke.MethodHandles;

import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;

@MessageBundle(projectCode = "RESTEASY")
public interface Messages {
    Messages MESSAGES = org.jboss.logging.Messages.getBundle(MethodHandles.lookup(), Messages.class);
    int BASE = 18500;

    @Message(id = BASE + 0, value = "Already committed")
    String alreadyCommitted();

    @Message(id = BASE + 5, value = "Already suspended")
    String alreadySuspended();

    @Message(id = BASE + 10, value = "Chunk size must be at least 1")
    String chunkSizeMustBeAtLeastOne();

    @Message(id = BASE + 12, value = "Exception caught by handler")
    String exceptionCaught();

    @Message(id = BASE + 15, value = "Failed to parse request.")
    String failedToParseRequest();

    @Message(id = BASE + 20, value = "response is committed")
    String responseIsCommitted();

    @Message(id = BASE + 25, value = "Unexpected")
    String unexpected();
}
