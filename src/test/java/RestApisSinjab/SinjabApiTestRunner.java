package RestApisSinjab;

import org.json.JSONException;
import org.testng.annotations.Test;

public class SinjabApiTestRunner {

    // Run Login API test
//    @Test
//    public void testLoginApi() throws JSONException {
//        LoginApi loginApi = new LoginApi();
//        loginApi.testLogin();
//    }

    // Run Branch API test
    @Test
    public void testBranchApi() {
        BranchApi branchApi = new BranchApi();
        branchApi.testBranchDetails();
    }

    // Run Explore City API test
    @Test
    public void testExploreCityApi() {
        ExploreCityApi exploreCityApi = new ExploreCityApi();
        exploreCityApi.testExploreCity();
    }

    // Run Get Clubs API test
    @Test
    public void testGetClubsApi() {
        GetClubsApi getClubsApi = new GetClubsApi();
        getClubsApi.testGetClubs();
    }

    // Run Get Sports API test
    @Test
    public void testGetSportsApi() {
        GetSportsApi getSportsApi = new GetSportsApi();
        getSportsApi.testGetSports();
    }
}
