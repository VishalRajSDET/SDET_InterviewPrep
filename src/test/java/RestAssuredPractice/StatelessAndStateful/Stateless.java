package RestAssuredPractice.StatelessAndStateful;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Stateless {
    /**
     * Stateless Example (JWT-based)
     *
     * Now, the client brings a “note” each time:
     *
     * Server does not store session info.
     * JWT carries all info, including user ID and roles.
     * Server verifies JWT on every request.
     */
    // Step 1: Login and get JWT
    Response loginResponse = given()
            .contentType("application/json")
            .body("{\"username\":\"user1\", \"password\":\"pass123\"}")
            .post("/login");

    String jwtToken = loginResponse.jsonPath().getString("token"); // JWT received

    // Step 2: Use JWT for subsequent requests
    Response response = (Response) given()
    .contentType("application/json")
    .header("Authorization", "Bearer " + jwtToken) // server verifies token independently
    .get("/user/profile")
    .then()
    .statusCode(200);

}
