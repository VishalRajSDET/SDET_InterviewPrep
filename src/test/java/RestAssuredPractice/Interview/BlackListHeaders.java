package RestAssuredPractice.Interview;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BlackListHeaders {

    /**
     * How to mask header information in API testing?
     * <p>
     * In real-world API testing, headers often contain sensitive data like Authorization tokens or API keys. Exposing them in CI/CD logs or reports is a security risk. In Rest Assured,
     * we can use blacklistHeaders() to automatically mask specific headers. I usually configure this once in a base test class, so it applies globally to all requests. For example:
     */

    RestAssuredConfig restAssuredConfig = RestAssured.config().logConfig(LogConfig.logConfig()
            .blacklistHeader("Authorization")
            .blacklistHeader("Cookie")
            .blacklistHeader("x-api-key"));

    Response response = given()
            .header("Authorization", "tk")//token
            .header("x-api-key", "myApiKey987")
            .header("Cookie", "sjbhvx")
            .when()
            .get("/user/1")
            .then()
            .log().all().statusCode(200).extract().response();

//
//     Request method: GET
//Request URI: https://api.example.com/users/1
//Request Headers:
//    Accept=*/*
//    Authorization=***BLACKLISTED ***
//    x-api-key=***BLACKLISTED ***
//
//    Response:
//    Status Code:200
//    Content-Type:application/json


}
