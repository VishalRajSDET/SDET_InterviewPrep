package RestAssuredPractice.Interview;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DifferenceBetweenPathAndQueryParam {
    public static void main(String[] args) {
        /**
         * What is the difference between path params and query params and how to use them?
         */

        /**
         * Path params are used to identify resources on the server while query params are used to sort/filter resources.
         * Query params are key-value-like pairs that appear after the question mark in the URL while path params come before the question mark.
         */

        /**
         * When to Use Path Parameters:
         * When you need to identify a specific resource — like a user, product, or post.
         * Path parameters are essential for RESTful APIs because they specify the resource being acted upon.
         * Example: GET /users/{id}, where id is the unique identifier for the user.
         *
         * 2. When to Use Query Parameters:
         * When you want to filter, search, or modify the response data.
         * Query parameters are often optional and used to specify conditions or extra data that’s not required to identify the resource.
         * Example: GET /users?age=25&city=NewYork, where the query parameters help to filter users by age and city.
         */

        //Example 1: Path Param
        given()
                .pathParams("userId", 101) // Replacing {userId} with actual value
                .when()
                .get("/users/{userId}")
                .then()
                .statusCode(200)
                .body("name",equalTo("Vishal"));

        //Example 2: Query Param
        given()
                .queryParam("name","vishal")
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("name",equalTo("vishal"));


        /**
         * Common Mistakes to Avoid:
         *
         * Confusing the Two:
         * Path params identify the resource, while query params modify the response.
         * Forgetting to Encode Query Params:
         * If you have special characters in your query parameters (e.g., spaces, &, =, etc.), ensure that they're URL-encoded.
         * Incorrect Order of Path and Query Params:
         * Path parameters come first in the URL, followed by query parameters.
         * Example: /users/{id}?filter=active
         */

        /**
         * Path Parameters vs. Query Parameters
         *
         * Definition:
         *
         * Path Params: Identify a specific resource in the URL path (e.g., user ID, product ID).
         * Query Params: Provide additional data to modify or filter the resource retrieval (e.g., filtering, sorting).
         *
         * Placement:
         *
         * Path Params: Directly placed in the URL, e.g., /users/{id}.
         * Query Params: Placed after the ? symbol, e.g., /users?id=123&name=John.
         *
         * Mandatory:
         *
         * Path Params: Usually required to identify a resource (e.g., user ID in /users/{id}).
         * Query Params: Typically optional, used for filtering or modifying the data (e.g., age=25).
         *
         * Example:
         *
         * Path Params: /users/123 (Here, 123 is the path parameter that specifies the user ID).
         * Query Params: /users?id=123&name=John (Here, id and name are query parameters used for filtering data).
         *
         * Use Case:
         *
         * Path Params: Used to get or perform actions on specific resources, such as retrieving or updating a specific user's data.
         * Query Params: Used to filter, sort, or search for data within a resource, such as finding users by name or age.
         */
    }
}
