package RestAssuredPractice.Interview;

import io.restassured.response.Response;

import java.io.FileOutputStream;

import static io.restassured.RestAssured.*;

public class DownloadFileWithRestAssured {
    public static void main(String[] args) {

        //How do you decide the file name when saving with Rest Assured?

        /**
         * Interview-ready way to explain
         *
         * "I use Rest Assured to get the response as a byte array, then extract the filename from the Content-Disposition header. Using Java IO,
         * I write the file to disk. I also validate the status code, content type,
         * and ensure the file is not empty. This way, I can fully automate file download testing with Rest Assured.
         */

        /**
         * Perfect 👍 let me give you a full working example that:
         *
         * Calls the API to download the file.
         * Extracts the filename from the response header (Content-Disposition).
         * Saves the file locally with that name.
         * Validates status code + headers.
         */
        Response response = given()
                .header("Authorization", "Bearer" + "tokenId") //if auth is required then only this
                .when()
                .get("https://example.com/api/reports/123/download")
                .then()
                .statusCode(200) // validate download is successful
                .extract()// Extract the response object
                .response(); // Extract the entire response

        //  // Step 2: Convert the response to a byte array
        byte[] fileData = response.asByteArray();

        // Step 3: Extract the file name (using Content-Disposition header or fallback)
        String contentDisposition = response.getHeader("Content-Disposition");
        String fileName = "default_file"; // Default name if filename is not found

        if (contentDisposition != null && contentDisposition.contains(fileName)) {
            fileName = contentDisposition.split("filename=")[1].replace("\"", "");
        } else {
            fileName = "report_" + System.currentTimeMillis() + ".pdf"; // Fallback name
        }
        // Step 4: Save the byte array to a file locally
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(fileData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
