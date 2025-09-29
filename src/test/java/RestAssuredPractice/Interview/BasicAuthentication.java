package RestAssuredPractice.Interview;

import static io.restassured.RestAssured.*;

public class BasicAuthentication {
    public static void main(String[] args) {
        //"Can you explain how you handle Basic Authentication in your Rest Assured tests?"

        /**
         * "Basic Authentication is an HTTP mechanism where username and password
         * are sent with every request in the Authorization header encoded in Base64. In Rest Assured,
         * we can implement it directly using .auth().basic(username, password) which automatically encodes and
         * attaches the header. If I want to send credentials proactively without waiting for a 401 challenge,
         * I use .auth().preemptive().basic(). Alternatively, I can also manually construct the Base64 encoded header if needed,
         * though Rest Assured already provides built-in support.
         */

        /**
         * What is Basic Authentication?
         * It’s the simplest form of authentication in HTTP.
         * You send a username and password with each request.
         * The credentials are encoded with Base64 and sent in the Authorization header:
         */

        /**
         * Using .auth().basic(username, password)
         */

        given()
                .auth().basic("admin", "1234")
                .when()
                .get("https://example.com/api/users")
                .then()
                .statusCode(200);
        //Rest Assured automatically encodes admin:1234 into Base64 and sets the Authorization header.
        /**
         * How .basic() works
         *Rest Assured does not send credentials immediately.
         * Instead, it waits for the server’s challenge:
         * Client sends request without Authorization header.
         * Server responds with 401 Unauthorized + WWW-Authenticate: Basic realm="...".
         * Rest Assured resends the request, this time adding:
         */

//======================================================================================================================================
        /**
         * Preemptive Basic Authentication
         *
         * By default, Rest Assured waits until the server challenges with a 401 Unauthorized.
         * If you want to send credentials upfront without waiting, use preemptive:
         */

        given()
                .auth()
                .preemptive()
                .basic("admin", "1234")
                .when()
                .get("https://example.com/api/users")
                .then()
                .statusCode(200);

        /**
         * How .preemptive().basic() works
         Rest Assured immediately sends the credentials in the first request.
         No waiting for a 401 challenge.
         */
        //==================================================================================================================================

        /**
         * What’s the difference between .basic() and .preemptive().basic()?

         👉 You can say:
         "In .basic(), Rest Assured waits until the server challenges with a 401 Unauthorized response
         before resending the request with the Basic Auth header. In .preemptive().basic(),
         credentials are sent proactively in the very first request. Preemptive auth is slightly faster
         since it avoids an extra round trip, but .basic() is more standard if the server is expected to challenge first."
         */

        /**
         * In .basic(), the client doesn’t send credentials in the first request.
         When the server responds with a 401 challenge and a WWW-Authenticate header,
         the Rest Assured client automatically retries the same request but this time includes
         the Authorization: Basic <Base64> header. The client maintains the original request details in memory,
         adds the encoded credentials, and resends it transparently. In .preemptive().basic(),
         this retry step is skipped because the credentials are included proactively in the very first request
         */


        //==================================================================================================================================
        /**
         * Follow-up Questions Interviewer May Ask
         *
         * Q: What’s the difference between .basic() and .preemptive().basic()?
         * .basic() → Sends credentials only after server challenges (401).
         * .preemptive().basic() → Sends credentials immediately with the request.
         *
         * Q: Is Basic Auth secure?
         * Not secure over plain HTTP (credentials easily decoded).
         * Must use HTTPS to encrypt traffic.
         *
         * Q: Have you worked with other auth methods in Rest Assured?
         * Yes, like OAuth2 (.auth().oauth2(token)) and Bearer tokens via .header("Authorization", "Bearer " + token).
         */

    }
}
