package RestAssuredPractice.Interview.NestedJSONObjectAsPayload.UseARawJSONString;

import static io.restassured.RestAssured.*;

public class SendNestedJsonAsRawString {
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

        String payload= "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"email\": \"john@example.com\",\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\",\n" +
                "    \"city\": \"New York\",\n" +
                "    \"zip\": \"10001\"\n" +
                "  }\n" +
                "}\n";

        given()
                .header("key","value")
                .body(payload)
                .when()
                .post("https://your-api-endpoint.com/users")
                .then()
                .statusCode(201);
        /**
         * 📌 This is quick and useful for small payloads, but error-prone for larger or dynamic data.
         */
    }
}
