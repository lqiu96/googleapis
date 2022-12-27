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
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class LanguageServiceClientTest {
  private static MockLanguageService mockLanguageService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private LanguageServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockLanguageService = new MockLanguageService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockLanguageService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    LanguageServiceSettings settings =
        LanguageServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LanguageServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void analyzeSentimentTest() throws Exception {
    AnalyzeSentimentResponse expectedResponse =
        AnalyzeSentimentResponse.newBuilder()
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllSentences(new ArrayList<Sentence>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    AnalyzeSentimentRequest request =
        AnalyzeSentimentRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setEncodingType(EncodingType.forNumber(0))
            .build();

    AnalyzeSentimentResponse actualResponse = client.analyzeSentiment(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSentimentRequest actualRequest = ((AnalyzeSentimentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(request.getEncodingType(), actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSentimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      AnalyzeSentimentRequest request =
          AnalyzeSentimentRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setEncodingType(EncodingType.forNumber(0))
              .build();
      client.analyzeSentiment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitiesTest() throws Exception {
    AnalyzeEntitiesResponse expectedResponse =
        AnalyzeEntitiesResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    AnalyzeEntitiesRequest request =
        AnalyzeEntitiesRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setEncodingType(EncodingType.forNumber(0))
            .build();

    AnalyzeEntitiesResponse actualResponse = client.analyzeEntities(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitiesRequest actualRequest = ((AnalyzeEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(request.getEncodingType(), actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      AnalyzeEntitiesRequest request =
          AnalyzeEntitiesRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setEncodingType(EncodingType.forNumber(0))
              .build();
      client.analyzeEntities(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitySentimentTest() throws Exception {
    AnalyzeEntitySentimentResponse expectedResponse =
        AnalyzeEntitySentimentResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    AnalyzeEntitySentimentRequest request =
        AnalyzeEntitySentimentRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setEncodingType(EncodingType.forNumber(0))
            .build();

    AnalyzeEntitySentimentResponse actualResponse = client.analyzeEntitySentiment(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitySentimentRequest actualRequest =
        ((AnalyzeEntitySentimentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(request.getEncodingType(), actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitySentimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      AnalyzeEntitySentimentRequest request =
          AnalyzeEntitySentimentRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setEncodingType(EncodingType.forNumber(0))
              .build();
      client.analyzeEntitySentiment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeSyntaxTest() throws Exception {
    AnalyzeSyntaxResponse expectedResponse =
        AnalyzeSyntaxResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    AnalyzeSyntaxRequest request =
        AnalyzeSyntaxRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setEncodingType(EncodingType.forNumber(0))
            .build();

    AnalyzeSyntaxResponse actualResponse = client.analyzeSyntax(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSyntaxRequest actualRequest = ((AnalyzeSyntaxRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(request.getEncodingType(), actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSyntaxExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      AnalyzeSyntaxRequest request =
          AnalyzeSyntaxRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setEncodingType(EncodingType.forNumber(0))
              .build();
      client.analyzeSyntax(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void classifyTextTest() throws Exception {
    ClassifyTextResponse expectedResponse =
        ClassifyTextResponse.newBuilder()
            .addAllCategories(new ArrayList<ClassificationCategory>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    ClassifyTextRequest request =
        ClassifyTextRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setClassificationModelOptions(ClassificationModelOptions.newBuilder().build())
            .build();

    ClassifyTextResponse actualResponse = client.classifyText(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ClassifyTextRequest actualRequest = ((ClassifyTextRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(
        request.getClassificationModelOptions(), actualRequest.getClassificationModelOptions());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void classifyTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      ClassifyTextRequest request =
          ClassifyTextRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setClassificationModelOptions(ClassificationModelOptions.newBuilder().build())
              .build();
      client.classifyText(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void annotateTextTest() throws Exception {
    AnnotateTextResponse expectedResponse =
        AnnotateTextResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .addAllEntities(new ArrayList<Entity>())
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllCategories(new ArrayList<ClassificationCategory>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    AnnotateTextRequest request =
        AnnotateTextRequest.newBuilder()
            .setDocument(Document.newBuilder().build())
            .setFeatures(AnnotateTextRequest.Features.newBuilder().build())
            .setEncodingType(EncodingType.forNumber(0))
            .build();

    AnnotateTextResponse actualResponse = client.annotateText(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnnotateTextRequest actualRequest = ((AnnotateTextRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDocument(), actualRequest.getDocument());
    Assert.assertEquals(request.getFeatures(), actualRequest.getFeatures());
    Assert.assertEquals(request.getEncodingType(), actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void annotateTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      AnnotateTextRequest request =
          AnnotateTextRequest.newBuilder()
              .setDocument(Document.newBuilder().build())
              .setFeatures(AnnotateTextRequest.Features.newBuilder().build())
              .setEncodingType(EncodingType.forNumber(0))
              .build();
      client.annotateText(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
