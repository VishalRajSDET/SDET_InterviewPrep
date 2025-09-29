package RestAssuredPractice.Interview;

public class DifferenceBetweenRequestAndResponseSpecification {
    /**
     * Request Specification: Centralizes common configurations for making API requests (e.g., base URI, headers, authentication).
     *
     * Response Specification: Defines the expected response and validations (e.g., status code, content type, response body).
     */

//RequestSpecification
    /**
     * The RequestSpecification is created by calling RestAssured.given() and adding configurations like baseUri, basePath, headers, and authentication.
     * The spec(requestSpec) method is then used in the given() block to apply this configuration to any request you make.
     * This way, you can reuse the request spec across multiple API calls, saving you from repeating the same configurations every time.
     */

    //ResponseSpecification
    /**
     * ResponseSpecification is created using RestAssured.expect(), which specifies what you expect from the response:
     * statusCode(200): The response should return a status code of 200 OK.
     * contentType(ContentType.JSON): The response should be in JSON format.
     * time(lessThan(3000L)): The response time should be less than 3 seconds.
     * body(matchesJsonSchemaInClasspath("user-schema.json")): The response body should match a pre-defined JSON schema.
     * .spec(responseSpec) is used to apply the ResponseSpecification to the request and validate the response.
     */
}
