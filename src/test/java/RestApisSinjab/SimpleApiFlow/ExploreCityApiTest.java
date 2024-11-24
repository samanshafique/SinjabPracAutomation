package RestApisSinjab.SimpleApiFlow;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ExploreCityApiTest {

    @Test
    public void testExploreCityAPI() {
        // Base URI for the API
        RestAssured.baseURI = "https://dev.sinjabapps.com";
        String bearerToken = "d6abb02322f5ef0faf94fa07cb51dabc";
        // Send GET request to the endpoint with query parameter
        Response response = given()

                .header("Authorization", "Bearer " + bearerToken)
                .header("lang", "en") // Add query parameter
                .when()
                .get("/api/v1/explore?city_id=65")
                // Endpoint path
                .then()
                .log().all() // Log the response for debugging
                .extract().response(); // Extract response for validation

        // Status Code Assertion
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Status Code Mismatch");

        // Validate Response Content-Type
        String contentType = response.getHeader("Content-Type");
        Assert.assertTrue(contentType.contains("application/json"), "Incorrect Content-Type");

        // Parse and Assert JSON Fields
        String responseBody = response.getBody().asString();
        Assert.assertNotNull(responseBody, "Response body is null");


        // Example: Validate the presence of specific data fields
        Assert.assertNotNull(response.jsonPath().get("data"), "Data field is missing");
    }
}
