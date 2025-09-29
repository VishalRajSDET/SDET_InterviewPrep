package RestAssuredPractice.Interview.ResponseExtractionMethods;

public class ResponseExtraction {
    public static void main(String[] args) {
        /**
         * Explain different ways of extracting a single field from a response body.
         */

        /**
         * "There are multiple ways to extract a single field in Rest Assured, such as using jsonPath(), path(), or deserializing into a POJO.
         * The best choice depends on the response format and the complexity of the response.
         * For simple JSON, jsonPath() or path() is fastest. For structured data, deserialization provides clean access."
         */

        //Note

        /**
         * How to Explain It in an Interview (Verbal Response)
         *
         * "That's a good question. Extracting a field from a response body and validating
         * an API response are related but serve different purposes.
         *
         * When I extract a field, I'm simply retrieving a value from the response — for example,
         * I might extract the user ID or token from the response JSON and store it for use in a later request or for comparison.
         *
         * On the other hand, validating a response means I'm asserting that the API returns
         * what I expect — like checking that the status code is 200, or that a field like name is equal to 'John'.
         *
         * So, extraction is about retrieving data, while validation is about asserting correctness.
         * In real tests, I often do both — extract a value, then use it to validate another API or step."
         */

    }
}
