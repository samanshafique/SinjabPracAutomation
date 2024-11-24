package RestApisSinjab;


import io.restassured.response.Response;
import org.SinjabPracAutomation.RestApisSinjab.BaseApi;
import org.testng.Assert;

public class GetClubsApi extends BaseApi {
    private static final String GET_CLUBS_ENDPOINT = "/api/v8/clubs?city_id=65&lang=en";

    // Test get clubs functionality
    public void testGetClubs() {
        // Send GET request
        Response response = sendGetRequest(GET_CLUBS_ENDPOINT,null);

        // Assert response status and validate
        Assert.assertEquals(response.getStatusCode(), 200, "Get Clubs API failed!");
        Assert.assertNotNull(response.jsonPath().get("data"), "No clubs found");
        System.out.println("Clubs Data: " + response.body().asPrettyString());
    }
}
