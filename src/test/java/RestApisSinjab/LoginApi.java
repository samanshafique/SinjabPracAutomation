package RestApisSinjab;

import io.restassured.response.Response;
import org.SinjabPracAutomation.RestApisSinjab.BaseApi;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

public class LoginApi extends BaseApi {
    private static final String LOGIN_ENDPOINT = "/api/v7/login";

    // Test login functionality
    public void testLogin() throws JSONException {
        // Build the login request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("auth_firebase_token", "eyJhbGciOiJSUzI1NiIsImtpZCI6IjNmZDA3MmRmYTM4MDU2NzlmMTZmZTQxNzM4YzJhM2FkM2Y5MGIyMTQiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vc2V0cG9pbnQtZTkxNzkiLCJhdWQiOiJzZXRwb2ludC1lOTE3OSIsImF1dGhfdGltZSI6MTczMjc3ODc4MCwidXNlcl9pZCI6Ilo0UjhsaVZJWlNTZjBWTzEwdzhqMzJiT0FuRjIiLCJzdWIiOiJaNFI4bGlWSVpTU2YwVk8xMHc4ajMyYk9BbkYyIiwiaWF0IjoxNzMyNzc4NzgyLCJleHAiOjE3MzI3ODIzODIsInBob25lX251bWJlciI6Iis5MjMwODM0NTM1MTQiLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7InBob25lIjpbIis5MjMwODM0NTM1MTQiXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwaG9uZSJ9fQ.EKtR6v8JgtkAumuiEglRNOiQjhowFFlYdh1aS3fyeI3SwW7B1VfLEbE4LgAZLRu3DCL8a8MItB0yrgqwna6kNTefMs9zBeI-dCUvQrKBwNEakXDsEFj-w2sY3OFpr9M857qwgmMAHBgSW9JMXq-vW6E7CFMaNGpaF38ZzYY4-MithqNKSCmraGIFaTyWaDVk1M34SrNbS4cTKeseHD6wHKB32EYvbXpHyz5nRUe6hj5YFFebaujAlNcpSl6yAqyV4WQU-MElmrV9L7dMpMBLnvSeiVH0JB3Rc-BHMsg52QzArfznBGuBBv-gKizEpYVPWixvX6jLWymtmO7gnMaLYQ");
        requestBody.put("name", "UserAlpha");
        requestBody.put("phone", "3083453514");
        requestBody.put("phone_code", "+92");
        requestBody.put("login_type", "phone");
        requestBody.put("device_token", "eGC1hY2GQCicgPFT3je4gN:APA91bFm_O7Vd9SrMfqzEUeJzIg50_eDOdYqn5JqDFTH55H8ZmIRfQY5JkP0_T7IJoWocquxSlC6-7mOw6Ak3p6Tff8hRuBAvvDzUkivRUsUbM41YWgDkuw");

        // Send POST request with necessary headers (e.g., Content-Type, Authorization)
        Response response = sendPostRequest(LOGIN_ENDPOINT, requestBody.toString(), null);

        // Assert response status and validate
        Assert.assertEquals(response.getStatusCode(), 200, "Login failed!");
        System.out.println("Login Successful: " + response.body().asPrettyString());

        // Validate the presence of the 'token' field in the response body
        String token = response.jsonPath().getString("data.token");
        Assert.assertNotNull(token, "Login token is missing in the response!");

        // Optionally, validate other response fields as required, e.g., user data
        Assert.assertNotNull(response.jsonPath().get("data.user"), "User data is missing in the response!");
    }
}
