package org.wildfly.test.feature.pack.template.subsystem.sanity;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;
import org.junit.Test;

import static org.junit.Assert.assertNull;


public class SomeTest {

    @Test
    public void shouldNotFindProcessEngineOutOfWildfly() {
        final ProcessEngine defaultProcessEngine = BpmPlatform.getDefaultProcessEngine();
        assertNull(defaultProcessEngine);
    }

}
