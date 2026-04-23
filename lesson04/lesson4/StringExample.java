package lesson4;

import java.sql.SQLOutput;

public class StringExample {
    public static void main(String[] args) {
        //Demonstrate some common String methods

        // The compiler will create a string object and
        // assign "I love Java" to variable testString

        String testString = "I love Java";

        System.out.println("String length " + testString.length());
        System.out.println("First character : " + testString.charAt(0));

        //Concatenation
        System.out.println(testString.concat(" very much"));

        //Adding a string and assigning the value
        System.out.println(testString += " too much");

        System.out.println("To uppercase : " + testString.toLowerCase());
        System.out.println("To lowecase : " + testString.toUpperCase());
        System.out.println(" Leading Blanks ".trim());
    }
}
