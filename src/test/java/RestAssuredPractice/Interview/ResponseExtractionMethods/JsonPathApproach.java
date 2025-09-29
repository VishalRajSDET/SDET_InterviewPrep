package RestAssuredPractice.Interview.ResponseExtractionMethods;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class JsonPathApproach {
    public static void main(String[] args) {

        /**
         * {
         *   "id": 101,
         *   "name": "John Doe"
         * }
         */
//==================================================================================================
        String name = given()
                .header("key", "value")
                .when()
                .get("/user/101")
                .then()
                .extract()
                .jsonPath()
                .getString("name");
        System.out.println(name);//John Doe
        /**
         * Explanation:
         *
         * jsonPath() parses the JSON response.
         * getString("name") retrieves the value of the name field.
         * You can also use .getInt(), .getBoolean(), etc., based on the data type.
         */
        //=========================================================================================
        /**
         * ✅ 2. Using path() Method
         * This is a shorthand for extracting fields directly from the response.
         */
        String name1 = given()
                .header("key", "value")
                .when()
                .get("/user/101")
                .then()
                .extract()
                .path("name");
        System.out.println(name1);//John Doe
/**
 * Explanation:
 *
 * path("name") fetches the value directly.
 * Internally, it uses JSONPath or XPath depending on the response format.
 */
//==========================================================================================
        Response response=given()
                .header("key","value")
                .when()
                .get("/user/101")
                .then()
                .extract().response();
        String name2= response.jsonPath().getString("name");
        /**
         * Explanation:
         *
         * Useful when you want to log or reuse the full response later.
         * Gives flexibility for multiple extractions from the same response.
         */
//===========================================================================================

    }
}
