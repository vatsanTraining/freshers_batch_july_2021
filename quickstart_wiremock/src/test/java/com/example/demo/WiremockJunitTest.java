package com.example.demo;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import com.github.tomakehurst.wiremock.client.*;


import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WiremockJunitTest {
	 
	  @Rule
	  public WireMockRule wm = new WireMockRule(wireMockConfig().port(8080));
	 
	  @Test
	  public void assertWiremockSetup() throws IOException {
	    // Arrange - setup wiremock stubs
	    configureStubs();
	 
	    // execute request through the http client
	    OkHttpClient client = new OkHttpClient();
	 
	    Request request = new Request.Builder()
	        .url("http://localhost:8090/book")
	        .get()
	        .build();
	 
	    // Act - call the endpoint
	    Response response = client.newCall(request).execute();
	 
	    // Assert - verify the response
	    assertEquals("Test success!", response.body().string());
	    verify(exactly(1),getRequestedFor(urlEqualTo("/book")));
	 
	  }
	 
	  // configure stubs for wiremock
	  private void configureStubs() {
		  WireMock.configureFor("localhost", 8090);
	    stubFor(get(urlEqualTo("/book"))
	        .willReturn(aResponse().withBody("Test success!")));
	  }
	 
	}