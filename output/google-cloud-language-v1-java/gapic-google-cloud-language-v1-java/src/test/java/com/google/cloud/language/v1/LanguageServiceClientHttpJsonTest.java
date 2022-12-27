/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.language.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.cloud.language.v1.stub.HttpJsonLanguageServiceStub;
import java.io.IOException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class LanguageServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static LanguageServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonLanguageServiceStub.getMethodDescriptors(),
            LanguageServiceSettings.getDefaultEndpoint());
    LanguageServiceSettings settings =
        LanguageServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                LanguageServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LanguageServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void analyzeSentimentUnsupportedMethodTest() throws Exception {
    // The analyzeSentiment() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void analyzeEntitiesUnsupportedMethodTest() throws Exception {
    // The analyzeEntities() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void analyzeEntitySentimentUnsupportedMethodTest() throws Exception {
    // The analyzeEntitySentiment() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void analyzeSyntaxUnsupportedMethodTest() throws Exception {
    // The analyzeSyntax() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void classifyTextUnsupportedMethodTest() throws Exception {
    // The classifyText() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void annotateTextUnsupportedMethodTest() throws Exception {
    // The annotateText() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }
}
