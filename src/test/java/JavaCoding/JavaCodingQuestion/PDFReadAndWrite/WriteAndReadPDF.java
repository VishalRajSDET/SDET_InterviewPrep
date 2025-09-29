package JavaCoding.JavaCodingQuestion.PDFReadAndWrite;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDFormContentStream;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class WriteAndReadPDF {
    public static void main(String[] args) throws IOException {
        /**
         * Key Points ------>
         * PDDocument → Represents the PDF document.
         * PDPage → Represents a single page in PDF.
         * PDPageContentStream → Used for writing text/images to PDF.
         * PDFTextStripper → Reads and extracts text from PDF.
         * Always close your documents (use try-with-resources).
         */

        PDDocument pdDocument=new PDDocument(); // Creates a new PDF document in memory
        PDPage pdPage=new PDPage(); // Creates a blank page
        pdDocument.addPage(pdPage); // Adds the blank page to the PDF document

        // Content stream is used to draw/write text or graphics on the page
        PDPageContentStream pdPageContentStream=new PDPageContentStream(pdDocument,pdPage);

        pdPageContentStream.beginText(); // Begin writing text
        pdPageContentStream.setFont(PDType1Font.HELVETICA_BOLD,14);// Sets font type and size
        pdPageContentStream.newLineAtOffset(100, 700);   // Sets the position (x=100, y=700) for writing
        pdPageContentStream.showText("Hello Vishal, Welcome to PDF Writing in Java!");// The text to write
        pdPageContentStream.endText();// Ends the text writing mode
        pdPageContentStream.close(); // Closes the content stream (important to save changes to the page)

        pdDocument.save("Test.pdf");



       /* PDDocument pdDocument = PDDocument.load(new File("src/test/java/JavaCodingQuestion/PDFReadAndWrite/Test.pdf"));
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        */


    }
}
