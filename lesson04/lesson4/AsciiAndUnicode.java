package lesson4;

public class AsciiAndUnicode {
    public static void main(String[] args) {
        // Demonstrates the assignment of either Unicode value or
        // character value to produce the same results
        char letter = 'A';
        char uniCodeLetter = '\u0041';
        System.out.println("letter : " + letter);
        System.out.println("unicodeLetter : " + uniCodeLetter);
        //Notice the behavior of the prefix operation
        System.out.println(++letter);
        // using unicode escape characters instead of the escape sequence
        System.out.println('\u0022' + "Java is fun " + '\u0022');
    }
}
