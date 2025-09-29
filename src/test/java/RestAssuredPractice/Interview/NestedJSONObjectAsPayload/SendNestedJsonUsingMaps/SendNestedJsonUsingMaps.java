package RestAssuredPractice.Interview.NestedJSONObjectAsPayload.SendNestedJsonUsingMaps;

import io.restassured.RestAssured;

import java.util.*;

import static io.restassured.RestAssured.*;

public class SendNestedJsonUsingMaps {
    public static void main(String[] args) {


        /**
         * {
         *   "name": "John",
         *   "email": "john@example.com",
         *   "address": {
         *     "street": "123 Main St",
         *     "city": "New York",
         *     "zip": "10001"
         *   }
         * }
         */

        /**
         Note: Object in Map<String, Object> means that the values stored in the map can be of any type,
         because Object is the superclass of all classes in Java.
         */

        Map<String, Object> address = new HashMap<>();
        address.put("street", "123 Main St");
        address.put("city", "New York");
        address.put("zip", "10001");

        Map<String, Object> users = new HashMap<>();
        users.put("name", "John");
        users.put("email", "john@example.com");
        users.put("address", users);  // Nested JSON object

        given()
                .header("key", "value")
                .body(users) // Rest Assured automatically converts Map to JSON
                .when()
                .post("https://your-api-endpoint.com/users")
                .then()
                .statusCode(201);

        /**
         * 📌 Clean and manageable, especially for dynamic or large payloads.
         */
    }
}
