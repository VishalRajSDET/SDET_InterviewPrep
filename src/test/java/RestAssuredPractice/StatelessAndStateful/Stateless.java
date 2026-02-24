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

/**
 * Think of Token-based auth like a Hotel Key Card.
 *
 * How it works:--> The front desk gives you a plastic card. The lock on your room door is "stateless"—it doesn't talk to the front desk.
 * It just checks: "Does this card have the correct magnetic code for Room 202?"
 *
 * The Problem:--> If you lose your key card and a thief picks it up, the thief can open your room.
 * The front desk can't magically stop the card from working because the door lock (the server) doesn't check with the front desk (the database) every time.
 * The card is valid until it expires (checkout time).
 */
