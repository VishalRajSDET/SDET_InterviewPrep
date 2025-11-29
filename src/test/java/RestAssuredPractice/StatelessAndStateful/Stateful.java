package RestAssuredPractice.StatelessAndStateful;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Stateful {
    /**
     * Stateful Example (Session-based)
     * Think of it as the waiter remembering you every time:
     * You log in once → server remembers you with a session ID.
     * Every request after wards uses that session ID (cookie) to identify you.
     */
    // Step 1: Login and get session ID
    Response loginResponse = given()
            .contentType("application/json")
            .body("{\"username\":\"user1\", \"password\":\"pass123\"}")
            .post("/login");

    String sessionId = loginResponse.getCookie("JSESSIONID"); // server stores this session

    /**
     * Key takeaway
     *
     * .cookie("JSESSIONID", sessionId) → standard way to send a session cookie.
     * It’s not the same as Authorization header.
     * Server expects it as a cookie (server-side session) and will use it to look up the session
     */
    // Step 2: Use session ID for subsequent requests
    Response userRes = (Response) given()
    .contentType("application/json")
    .cookie("JSESSIONID", sessionId) // server looks up session info
    .get("/user/profile")
    .then()
    .statusCode(200);

    /**
     * Could you send it as a normal header?
     * Yes, but it’s non-standard:
     * given()
     *     .header("Cookie", "JSESSIONID=" + sessionId)
     *     .get("/user/profile");
     * This works because the HTTP protocol allows cookies in the Cookie header.
     * But .cookie() in Rest Assured is cleaner and preferred.
     */

    /**
     * Think of Session-based auth like a Nightclub Guest List.
     *
     * How it works: You tell the bouncer your name. He checks his clipboard (database). If your name is there, you get in.
     * Revocation: If you start a fight, the bouncer crosses your name off the list. The next time you try to enter, you are denied immediately.
     */
}
