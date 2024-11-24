package RestApisSinjab;



import io.restassured.response.Response;
import org.SinjabPracAutomation.RestApisSinjab.BaseApi;
import org.testng.Assert;

public class GetSportsApi extends BaseApi {
    private static final String GET_SPORTS_ENDPOINT = "/api/v1/sports?is_from_create_match=false";

    // Test get sports functionality
    public void testGetSports() {
        // Send GET request
        Response response = sendGetRequest(GET_SPORTS_ENDPOINT,null);

        // Assert response status and validate
        Assert.assertEquals(response.getStatusCode(), 200, "Get Sports API failed!");
        Assert.assertNotNull(response.jsonPath().get("data"), "No sports found");
        System.out.println("Sports Data: " + response.body().asPrettyString());
    }
}
