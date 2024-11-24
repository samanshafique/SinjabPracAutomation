package RestApisSinjab.SimpleApiFlow;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSportsApiTest {

    public static void main(String[] args) {
        // Step 1: Set Base URI
        RestAssured.baseURI = "https://dev.sinjabapps.com";

        // Step 2: Set the endpoint
        String endpoint = "/api/v1/sports?is_from_create_match=false";
        String bearerToken = "d6abb02322f5ef0faf94fa07cb51dabc";
        // Step 3: Send the GET request
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + bearerToken)
                .header("Accept", "application/json")    // Optional: Define the Accept header
                .when()
                .get(endpoint);                       // API endpoint

        // Step 4: Print the response details
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Step 5: Validate the response (example: status code)
        if (response.getStatusCode() == 200) {
            System.out.println("Get Sports API executed successfully.");
        } else {
            System.out.println("Get Sports API failed. Status Code: " + response.getStatusCode());
        }
    }
}
