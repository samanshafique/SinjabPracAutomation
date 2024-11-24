package RestApisSinjab;



import io.restassured.response.Response;
import org.SinjabPracAutomation.RestApisSinjab.BaseApi;
import org.testng.Assert;

public class BranchApi extends BaseApi {

    private static final String BRANCH_API_URL = "/api/v7/branches/517";  // Correct endpoint for branch details

    public void testBranchDetails() {
        // Send GET request using the inherited method from BaseApi
        Response response = sendGetRequest(BRANCH_API_URL,null);

        // Parse response body
        String branchTitle = response.jsonPath().getString("data.branch.title");  // Assuming it's in 'data.branch.title'
        System.out.println("Branch Title: " + branchTitle); // Log response for debugging
        assert branchTitle.equals("GNK Sports");

        // Verify if packages are present
        int packageCount = response.jsonPath().getList("data.packages").size();
        System.out.println("Number of Packages: " + packageCount);
        assert packageCount > 0;

        // Verify if sports are available
        int sportsCount = response.jsonPath().getList("data.sports").size();
        System.out.println("Number of Sports: " + sportsCount);
        assert sportsCount > 0;

        // Additional Assertions (Optional)
        // Assert other fields in the response as needed
    }
}
