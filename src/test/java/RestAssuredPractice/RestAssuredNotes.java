package RestAssuredPractice;

import com.google.gson.JsonObject;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredNotes {
    public static void main(String[] args) {

        /**
         * When should you use asPrettyString()?
         *
         * ✅ For debugging during development or test failures.
         * ✅ When writing logs to help understand what the API returned.
         * ✅ To inspect large or nested JSON easily.
         * for example we got response and we want see then by using response.asPrettyString() then json response look like this
         * response.asPrettyString() --->Returns JSON as a formatted (pretty-printed) string
         * {
         *     "status": "success",
         *     "message": "User fetched",
         *     "data": {
         *         "user": {
         *             "id": 101,
         *             "name": "Alice",
         *             "roles": [
         *                 "admin",
         *                 "editor"
         *             ]
         *         }
         *     }
         * }
         */

        /**
         * Difference:
         * Method	 --->            Description
         * response.asString() -->	Returns JSON as a plain, unformatted string
         * {"status":"success","message":"User fetched","data":{"user":{"id":101,"name":"Alice","roles":["admin","editor"]}}}
         *
         * response.asPrettyString() --->Returns JSON as a formatted (pretty-printed) string
         */
        String response = "{\n" +
                "  \"status\": \"success\",\n" +
                "  \"data\": {\n" +
                "    \"user\": {\n" +
                "      \"id\": 101,\n" +
                "      \"name\": \"Alice\",\n" +
                "      \"contacts\": [\n" +
                "        {\n" +
                "          \"type\": \"email\",\n" +
                "          \"value\": \"alice@example.com\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"type\": \"phone\",\n" +
                "          \"value\": \"+91-9999999999\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"address\": {\n" +
                "        \"street\": \"123 Main St\",\n" +
                "        \"city\": \"Mumbai\",\n" +
                "        \"country\": \"India\"\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"timestamp\": \"2025-08-19T10:00:00Z\"\n" +
                "}\n";

        JsonPath json = new JsonPath(response);

        System.out.println(json.getString("data.user.name"));
    }
}
