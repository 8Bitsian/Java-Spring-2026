public class CastingCharToNumeric {
    public static void main(String[] args) {
        // Casting using Hexadecimal
        char ch1 = (char)0XAB0041; // The lower 16-bits hex code is 0041 is assigned to the variable
        System.out.println("Character = " + ch1);

        char ch2 = (char)65.25; // Decimal 65 assigned to ch
        System.out.println(ch2); // ch is character A

        // Casting using floating point values
        int a = (int)'A';
        System.out.println("Character = " + a);

        // byte b = '\uFFF4' will cause a compiler error
        byte b = (byte) '\uFFF4';
        System.out.println("Byte: " + b);
    }
}
