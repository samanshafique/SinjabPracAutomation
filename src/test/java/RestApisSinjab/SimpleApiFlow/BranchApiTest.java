package RestApisSinjab.SimpleApiFlow;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BranchApiTest {

    public static void main(String[] args) {
        // Base URI for the API
        RestAssured.baseURI = "https://dev.sinjabapps.com/api/v7";

        // Bearer token
        String bearerToken = "d6abb02322f5ef0faf94fa07cb51dabc";

        // Endpoint with parameters
        String endpoint = "/branches/517";

        // Sending the GET request
        Response response = given()
                .header("Authorization", "Bearer " + bearerToken) // Set Authorization Header
                .header("Content-Type", "application/json")       // Set Content-Type Header
                .queryParam("female_only", "false")               // Add query parameter
                .when()
                .get(endpoint)                                   // Send GET request
                .then()
                .statusCode(200)                                 // Assert response status code is 200
                .body("code", equalTo(200))                      // Verify 'code' field in the response
                .body("message", equalTo("Request Successful"))  // Verify 'message' field
                .extract()
                .response();                                     // Extract the response

        // Print the full response
        System.out.println("Response: " + response.asPrettyString());

        // Additional Assertions
        String branchTitle = response.jsonPath().getString("data.branch.title");
        System.out.println("Branch Title: " + branchTitle);
        assert branchTitle.equals("GNK Sports");

        // Verify if packages are present
        int packageCount = response.jsonPath().getList("data.packages").size();
        System.out.println("Number of Packages: " + packageCount);
        assert packageCount > 0;

        // Verify if sports are available
        int sportsCount = response.jsonPath().getList("data.sports").size();
        System.out.println("Number of Sports: " + sportsCount);
        assert sportsCount > 0;
    }
}
