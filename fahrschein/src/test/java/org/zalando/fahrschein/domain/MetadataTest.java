package org.zalando.fahrschein.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.UUID;

public class MetadataTest {

    @Test
    public void shouldHaveCleanStringRepresentation() {
        final String eventType = "TEST-EVENT-TYPE";
        final String eid = "a3e25946-5ae9-3964-91fa-26ecb7588d67";
        final OffsetDateTime occurredAt = OffsetDateTime.now();
        final OffsetDateTime receivedAt = OffsetDateTime.now();
        final String flowId = UUID.randomUUID().toString();

        final Metadata metadata = new Metadata(eventType, eid, occurredAt, receivedAt, flowId, Collections.emptyMap());

        Assert.assertTrue(metadata.toString().contains(metadata.getEventType()));
        Assert.assertTrue(metadata.toString().contains(metadata.getEid()));
        Assert.assertTrue(metadata.toString().contains(metadata.getOccurredAt().toString()));
        Assert.assertTrue(metadata.toString().contains(metadata.getReceivedAt().toString()));
        Assert.assertTrue(metadata.toString().contains(metadata.getFlowId()));
    }
}
