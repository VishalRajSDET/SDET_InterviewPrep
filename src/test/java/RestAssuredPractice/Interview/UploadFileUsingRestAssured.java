package RestAssuredPractice.Interview;

import io.restassured.response.Response;

import java.io.*;
import static io.restassured.RestAssured.*;

public class UploadFileUsingRestAssured {
    public static void main(String[] args) {

        /**
         How to Upload a File Using Rest Assured

         To upload a media file using Rest Assured, I use the .multiPart() method,
         which is designed to send multipart/form-data requests. This is commonly used for file uploads.
         I usually load the file from the local file system and attach it in the request body using multiPart().
         Then I send a POST or PUT request to the file upload endpoint
         */

        File fileToUpload=new File("path/to/your/mediafile.jpg");

        Response response= given()
                .multiPart("file",fileToUpload) //The field name you specify in the .multiPart() method should match the form field
                // that the server is expecting in the request body. It can be file, image, upload, or any other string based on the backend's configuration.
                .header("Authorization","Bearer yourTokenHere")
                .when()
                .post("https://google.com/api/upload")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println("Response :"+response.asPrettyString());

        /**
         * How to Explain in Interview
         * 👉 Breakdown of Key Points You Should Mention:
         * Concept	      What to Say in Interview
         * Method	      "I use multiPart() to upload the file."
         * File object	  "I pass a java.io.File object to the multiPart() method."
         * Form Field	   "I specify the form field name that the backend expects (e.g., file, image, upload)."
         * Authentication	"If the endpoint is secured, I add an Authorization header or token."
         * Response Validation	"I validate the response with .statusCode() and check response body or metadata."
         * Content-Type	      "Rest Assured automatically sets Content-Type: multipart/form-data when using multiPart()."
         */
//================================================================================================================================================================================================
        /**
         * . Follow-Up Questions You Might Get
         * 🔄 Technical Questions:
         * Question	How to Answer
         * Q1: What if you want to send additional form fields along with the file?	  ==> Use .multiPart("fieldName", "fieldValue") for text fields. You can chain multiple multiPart() calls.
         * Q2: How to upload multiple files?	==> Call .multiPart() multiple times with different files and field names.
         * Q3: What if the backend expects Base64 instead of a file?	==> Read file into byte[], encode with Base64, send as JSON string or part of a request body.
         * Q4: What if the server expects the file as raw body, not multipart?	==> Use .body(new File("...")) and set Content-Type manually.
         * Q5: How do you validate the upload?	===> Check the response status code, body message (e.g., "File uploaded successfully"), or download the file and verify its integrity.
         * Q6: How to handle large files?	===> Ensure timeouts and memory limits are set. Upload in chunks if supported by the server.
         */
    }
}
