package lesson4;

import java.util.Scanner;

public class TestReadCharacter {
    public static void main(String[] args) {
        // create input object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of information ");

        //store input in the variable lin
        String line = input.nextLine();

        //retrieve the first character
        char firstChar = line.charAt(0);

        System.out.println("The first character is : " + firstChar);
    }
}
