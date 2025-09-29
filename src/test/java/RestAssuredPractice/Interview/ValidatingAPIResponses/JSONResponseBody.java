package RestAssuredPractice.Interview.ValidatingAPIResponses;


import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.testng.AssertJUnit.assertEquals;

public class JSONResponseBody {
    public static void main(String[] args) {

        // How do you validate data using assertions after extracting the response?

        Response response = given()
                .when()
                .get("/user/1");

        String name = response.jsonPath().getString("name");
        String name1 = response.path("name");// both will give same result
        assertEquals("John Doe", name);
        /**
         * Explanation:
         *
         * Gives full control for custom logic or conditional checks.
         */
        //==================================================================================================================================

        //How do you validate the response using soft assertions?
        SoftAssert softAssert = new SoftAssert();

        Response response1 = given().get("/user/1");

        softAssert.assertEquals(response1.jsonPath().getString("name"), "John");
        softAssert.assertEquals(response1.statusCode(), 200);

        softAssert.assertAll();
        /**
         * Explanation:
         *
         * Useful in data-driven tests where you want to collect all failures.
         */

        //==================================================================================================================================
        //How do you validate a field in the JSON response body?

        given()
                .header("key","value")
                .when()
                .get("/user/01")
                .then()
                .body("name", equalTo("Vishal"));
        /**
         * Explanation:
         *
         * "name" is the field to validate.
         * equalTo("John Doe") checks if the value matches.
         * Hamcrest matchers like containsString(), hasSize(), greaterThan() can also be used.
         */
//==================================================================================================================================
        //How do you validate multiple fields in the response body?

        given()
                .header("key","value")
                .when()
                .get("users/02")
                .then()
                .body("name",equalTo("Vishal"))
                .body("id",equalTo(1))
                .body("address",equalTo("Ayodhya"));
        /**
         * Explanation:
         *
         * Allows full validation of multiple fields in one go.
         */
//==================================================================================================================================

        //How do you validate response time of an API?

        given()
                .when()
                .get("/users/22")
                .then()
                .body(lessThan(2000L)); // milliseconds
        /**
         * Explanation:
         * Validates that the API response time is under 2 seconds.
         */
    }
}
