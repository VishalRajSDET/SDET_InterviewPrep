package RestAssuredPractice.Interview;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class MultiValueHeadersExample {
    public static void main(String[] args) {
        /**
         * How to send multivalue headers in Rest Assured?
         */

        //There are many ways we ca do that
        /**
         * Use comma-separated values in the header() method if you want to send multiple values for a single header key.
         * Use the headers() method for a list of headers or to send the same header key with multiple values.
         * For dynamic or complex cases, use a Map<String, List<String>>.
         */
        List<String> listOgHeaders=Arrays.asList("value1", "value2", "value3");

        RestAssured.baseURI = "https://your-api-endpoint.com";
        given().header("multivalue header","value1","value2","value3")
                .header("multivalue header",listOgHeaders)// by using list
                .when()
                .get("/user")
                .then()
                .statusCode(200);

    }
}
