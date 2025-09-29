package RestAssuredPractice.Interview.ValidatingAPIResponses;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class ComplexJSON {
    public static void main(String[] args) {

        // How do you validate a list of objects in JSON (complex JSON)?
        /**
         * [
         *   { "id": 1, "name": "John" },
         *   { "id": 2, "name": "Jane" }
         * ]
         */

        given()
                .when()
                .get("/users/1")
                .then()
                .body("name",hasItems("John","Jane"));
        /**
         * Explanation:
         * Validates that names in the list include both "John" and "Jane".
         */
//==============================================================================
        //How to validate XML response content?
        /**
         * ✅ Answer:
         * Use .body() and XML path expressions for XML validation.
         */

        /**
         * <user>
         *   <id>1</id>
         *   <name>John</name>
         * </user>
         */

        given()
                .when()
                .get("/user/1")
                .then()
                .body("user.name", equalTo("John"));

    }
}
