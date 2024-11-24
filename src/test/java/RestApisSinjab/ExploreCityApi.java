package RestApisSinjab;

import io.restassured.response.Response;
import org.SinjabPracAutomation.RestApisSinjab.BaseApi;
import org.testng.Assert;

public class ExploreCityApi extends BaseApi {

    // Updated endpoint to match normal test case
    private static final String EXPLORE_CITY_ENDPOINT = "/api/v1/explore?city_id=65";  // Corrected version

    // Test explore city functionality
    public void testExploreCity() {
        // Send GET request using inherited method from BaseApi and include 'lang' header
        Response response = sendGetRequest(EXPLORE_CITY_ENDPOINT, "en");  // Add 'lang' parameter

        // Log the full response (optional for debugging)
        System.out.println("Explore City Data: " + response.body().asPrettyString());

        // Assert response status and validate
        Assert.assertEquals(response.getStatusCode(), 200, "Explore City API failed!");

        // Assert content-type to ensure it's application/json
        String contentType = response.getHeader("Content-Type");
        Assert.assertTrue(contentType.contains("application/json"), "Incorrect Content-Type");

        // Validate response body is not null
        String responseBody = response.getBody().asString();
        Assert.assertNotNull(responseBody, "Response body is null");

        // Validate presence of 'data' field in the response
        Assert.assertNotNull(response.jsonPath().get("data"), "Data field is missing");

    }
}
