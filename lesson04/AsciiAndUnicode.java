public class AsciiAndUnicode {
    public static void main(String[] args) {
        // Demonstrate the assignment of either Unicode value or character value to produce the same result
        char letter = 'A';
        char uniLetter = '\u0041';

        System.out.println("Letter: " + letter);
        System.out.println("Unicode: " + uniLetter);

        // Notice the behavior of the prefix operation
        System.out.println(++letter); // Prints 'B'

        // Using escape characters to print double quotations
        System.out.println("I said\"Java is fun!\"");
    }
}
