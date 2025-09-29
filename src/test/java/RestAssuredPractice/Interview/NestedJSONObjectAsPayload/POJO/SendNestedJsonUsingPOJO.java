package RestAssuredPractice.Interview.NestedJSONObjectAsPayload.POJO;

import static io.restassured.RestAssured.*;

public class SendNestedJsonUsingPOJO {
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

        Address address = new Address();
        address.setCity("New York");
        address.setZip("10001");
        address.setStreet("123 Main St");

        User user = new User();
        user.setName("John");
        user.setEmail("john@example.com");
        user.setAddress(address);

        given()
                .header("key", "value")
                .body(user) // Rest Assured (via Jackson/Gson) serializes POJO to JSON
                .when()
                .post()
                .then()
                .statusCode(201);

        /**
         * 📌 Best for large projects with reusable model classes.
         */

    }
}
