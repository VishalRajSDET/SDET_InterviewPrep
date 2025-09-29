package JavaCoding.JavaCodingQuestion;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class Test {
    public static void main(String[] args) {
        String s = "Vishal   Raj";
        s = s.replaceAll("\\s", "");
        System.out.println(s);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char currentChar = c[0];
        int count = 1;
        int maxCount = 0;
        char maxfre = currentChar;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == currentChar) {
                count++;
            } else {
                System.out.println("[" + currentChar + " frequency is :" + count + "]");
                if (maxCount < count) {
                    maxCount = count;
                    maxfre = currentChar;
                }
                currentChar = c[i];
                count = 1;
            }
        }
        System.out.println("[" + currentChar + " frequency is :" + count + "]");// for last character
        System.out.println(maxfre + " : " + maxCount);


        Response restAssured=RestAssured.given()
                .auth()
                .basic("","")
                .get();

    }
}
