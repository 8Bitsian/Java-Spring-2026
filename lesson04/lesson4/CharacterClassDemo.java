package lesson4;

public class CharacterClassDemo {
    public static void main(String[] args) {
        //Demonstrates the convenience methods for the Character class
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
    }
}
