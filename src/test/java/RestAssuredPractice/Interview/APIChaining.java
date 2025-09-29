package RestAssuredPractice.Interview;

public class APIChaining {

    //How to perform API chaining(Pass value from one API to another API)?

    /**
     * API chaining, or passing data from one API request to another, is a common use case in test automation.
     * You typically need to extract some value from the response of one API call (such as an authentication token, user ID, or order ID),
     * and then use that value in subsequent API calls. Rest Assured makes this process very straightforward with the use of response extraction and variables.
     *
     * Step-by-Step Guide to API Chaining in Rest Assured
     *
     * Let’s break it down with an example:
     *
     * 1. Perform the First API Call and Extract Data
     * The first step is to call the first API, extract the relevant data from the response, and store it in a variable.
     *
     * 2. Use Extracted Data in the Second API Call
     * In the second API, use the data extracted from the first API as part of the request (e.g., pass the token from login to access protected resources).
     */

    /**
     * Summary of Key Concepts:
     *
     * Extract Data from Responses: Use .extract() to capture data from API responses.
     * Pass Data to Next API Call: Store the extracted data in variables and use it in subsequent requests.
     * Authorization Tokens: Often, tokens from one request (e.g., login) are required for authorization in the next request (e.g., fetching data).
     * Chaining with Path Parameters: You can also chain APIs using path parameters (like userId) extracted from the response.
     */

    /**
     Advanced Chaining:

     If the extracted data needs to be used in a more complex context, such as extracting multiple values or chaining multiple requests,
     you can combine assertions and extract other elements, such as response time, status codes, or specific JSON objects.
     */
}
