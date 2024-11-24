package org.SinjabPracAutomation.RestApisSinjab;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseApi {

    private static final String BASE_URL = "https://dev.sinjabapps.com";
    private static final String TOKEN = "0e66fdba77a00df7713213c80f2035d3";

    // Setup request with authorization and common headers
    public RequestSpecification setupRequest(String lang) {
        RequestSpecification request = RestAssured.given()
                .baseUri(BASE_URL)
                .header("Authorization", "Bearer " + TOKEN)
                .contentType("application/json");

        // Add lang header only if it's not null or empty
        if (lang != null && !lang.isEmpty()) {
            request.header("lang", lang);
        }

        return request;
    }

    // Send GET request with dynamic lang header
    public Response sendGetRequest(String endpoint, String lang) {
        return setupRequest(lang).get(endpoint);
    }

    // Send POST request with body
    public Response sendPostRequest(String endpoint, Object body, String lang) {
        return setupRequest(lang).body(body).post(endpoint);
    }

    // Send PUT request with body
    public Response sendPutRequest(String endpoint, Object body, String lang) {
        return setupRequest(lang).body(body).put(endpoint);
    }

    // Send DELETE request
    public Response sendDeleteRequest(String endpoint, String lang) {
        return setupRequest(lang).delete(endpoint);
    }
}
