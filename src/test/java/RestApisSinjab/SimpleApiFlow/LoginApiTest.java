package RestApisSinjab.SimpleApiFlow;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginApiTest {

    public static void main(String[] args) throws JSONException {
        // Step 1: Set Base URI
        RestAssured.baseURI = "https://dev.sinjabapps.com";

        // Step 2: Construct the request payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("auth_firebase_token", "eyJhbGciOiJSUzI1NiIsImtpZCI6IjNmZDA3MmRmYTM4MDU2NzlmMTZmZTQxNzM4YzJhM2FkM2Y5MGIyMTQiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vc2V0cG9pbnQtZTkxNzkiLCJhdWQiOiJzZXRwb2ludC1lOTE3OSIsImF1dGhfdGltZSI6MTczMjc3ODc4MCwidXNlcl9pZCI6Ilo0UjhsaVZJWlNTZjBWTzEwdzhqMzJiT0FuRjIiLCJzdWIiOiJaNFI4bGlWSVpTU2YwVk8xMHc4ajMyYk9BbkYyIiwiaWF0IjoxNzMyNzc4NzgyLCJleHAiOjE3MzI3ODIzODIsInBob25lX251bWJlciI6Iis5MjMwODM0NTM1MTQiLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7InBob25lIjpbIis5MjMwODM0NTM1MTQiXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwaG9uZSJ9fQ.EKtR6v8JgtkAumuiEglRNOiQjhowFFlYdh1aS3fyeI3SwW7B1VfLEbE4LgAZLRu3DCL8a8MItB0yrgqwna6kNTefMs9zBeI-dCUvQrKBwNEakXDsEFj-w2sY3OFpr9M857qwgmMAHBgSW9JMXq-vW6E7CFMaNGpaF38ZzYY4-MithqNKSCmraGIFaTyWaDVk1M34SrNbS4cTKeseHD6wHKB32EYvbXpHyz5nRUe6hj5YFFebaujAlNcpSl6yAqyV4WQU-MElmrV9L7dMpMBLnvSeiVH0JB3Rc-BHMsg52QzArfznBGuBBv-gKizEpYVPWixvX6jLWymtmO7gnMaLYQ");
        requestBody.put("name", "UserAlpha");
        requestBody.put("phone", "3083453514");
        requestBody.put("phone_code", "+92");
        requestBody.put("login_type", "phone");
        requestBody.put("device_token", "eGC1hY2GQCicgPFT3je4gN:APA91bFm_O7Vd9SrMfqzEUeJzIg50_eDOdYqn5JqDFTH55H8ZmIRfQY5JkP0_T7IJoWocquxSlC6-7mOw6Ak3p6Tff8hRuBAvvDzUkivRUsUbM41YWgDkuw");

        // Step 3: Send the POST request
        Response response = RestAssured.given()
                .header("Content-Type", "application/json") // Set request header
                .body(requestBody.toString())             // Attach payload
                .when()
                .post("/api/v1/auth/login");              // API endpoint

        // Step 4: Print the response details
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Step 5: Validate the response (example: status code)
        if (response.getStatusCode() == 200) {
            System.out.println("Login API executed successfully.");
        } else {
            System.out.println("Login API failed. Status Code: " + response.getStatusCode());
        }
    }
}
