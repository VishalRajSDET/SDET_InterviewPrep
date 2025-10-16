package RestAssuredPractice.Interview;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DifferenceBetweenRestAPIAndRestAssured {
    public static void main(String[] args) {


        /**
         * 🏢 REST API → The server or application endpoint that provides data.
         * 🧪 Rest Assured → The testing tool that interacts with that API to test its behavior.
         */

        /**
         * REST API (Representational State Transfer API)
         *
         * What it is:
         * A design style or architecture for building web services.
         *
         * Purpose:
         * It defines how two systems communicate over HTTP (like GET, POST, PUT, DELETE).
         *
         * Example:
         * A REST API could be something like:
         * GET https://api.github.com/users/vishalraj
         *
         * This returns user data in JSON format.
         *
         * So basically:
         * ➤ REST API = the service itself (the thing you're testing)
         */


        /**
         * Rest Assured
         *
         * What it is:
         * A Java library used to test REST APIs.
         *
         * Purpose:
         * It helps automate testing of REST APIs easily using simple Java syntax.
         *
         * Example:
         */

        given()
                .header("key","value")
                .when()
                .get("https://api.github.com/users/vishalraj")
                .then()
                .statusCode(200)
                .body("login",equalTo("vishalraj"));
    }
    /**
     * This code uses Rest Assured to test a REST API endpoint.
     *
     * So basically:
     * ➤ Rest Assured = the testing tool used to verify REST APIs
     */
}
