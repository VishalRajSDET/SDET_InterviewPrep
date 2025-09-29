package RestAssuredPractice.Interview.NestedJSONObjectAsPayload.SendNestedJsonUsingJSONObject;

import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class SendNestedJsonUsingJSONObject {
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

        JSONObject address = new JSONObject();
        address.put("street", "123 Main St");
        address.put("city", "");
        address.put("zip", "10001");

        JSONObject user = new JSONObject();
        user.put("name", "John");
        user.put("email", "john@example.com");
        user.put("address", address);

        given()
                .header("key", "value")
                .body(user.toString()) // Convert JSONObject to string
                .when()
                .post("https://your-api-endpoint.com/users")
                .then()
                .statusCode(201);

        /**
         * ✅ Good Practices:
         *
         * Always call .toString() on the JSONObject when passing it to .body().
         *
         * Use contentType("application/json") to make sure the server knows you’re sending JSON.
         *
         * You can create arrays with org.json.JSONArray as well if needed.
         */


        /**
         * ➕ Example with JSONArray (Optional Advanced Use)
         *
         * If you need to send a list inside your JSON:
         * JSONArray phoneNumbers = new JSONArray();
         * phoneNumbers.put("123-456-7890");
         * phoneNumbers.put("987-654-3210");
         * user.put("phoneNumbers", phoneNumbers);
         *
         * This will add:
         *
         * "phoneNumbers": ["123-456-7890", "987-654-3210"]
         */
    }
}
