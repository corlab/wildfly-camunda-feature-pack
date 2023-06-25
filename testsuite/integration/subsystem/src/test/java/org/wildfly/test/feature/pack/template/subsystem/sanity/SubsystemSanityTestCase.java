/*
 * Copyright 2019 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.test.feature.pack.template.subsystem.sanity;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;


@RunWith(Arquillian.class)
public class SubsystemSanityTestCase {

    // @Deployment
    // public static WebArchive getDeployment() {
    //     final WebArchive webArchive = ShrinkWrap.create(WebArchive.class, "sanity-test.war")
    //             .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
    //             .addAsWebInfResource(SubsystemSanityTestCase.class.getResource("/jboss-deployment-structure.xml"), "jboss-deployment-structure.xml")
    //             .addPackage(SubsystemSanityTestCase.class.getPackage())
    //             .addAsResource(SubsystemSanityTestCase.class.getResource("/HelloWorld.bpmn"),"HelloWorld.bpmn");
    //     return webArchive;
    // }

    // @Test
    // public void shouldFindProcessEngine() {
    //     final ProcessEngine defaultProcessEngine = BpmPlatform.getDefaultProcessEngine();
    //     assertNotNull(defaultProcessEngine);
    // }

    // @Test
    // public void shouldDeployProcess() {
    //     final ProcessEngine defaultProcessEngine = BpmPlatform.getDefaultProcessEngine();

    //     final org.camunda.bpm.engine.repository.Deployment deployment = defaultProcessEngine.getRepositoryService().createDeployment()
    //             .addInputStream("HelloWorld.bpmn", SubsystemSanityTestCase.class.getResourceAsStream("/HelloWorld.bpmn"))
    //             .deploy();
    //     assertNotNull("deployment", deployment);

    //     final ProcessInstance processInstance = defaultProcessEngine.getRuntimeService().startProcessInstanceByKey("Hello_World");
    //     assertNotNull("processInstance", processInstance);
    // }

}
