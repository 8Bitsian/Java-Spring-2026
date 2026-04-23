package lesson4;

public class CastingCharToNumeric {
    public static void main(String[] args) {

        //Casting using hexidecimal
        char ch = (char)0XAB0041 ; // the lower 16-bits hex code 0041 is assigned to the variable
        System.out.println("Character = " + ch);

        ch = (char)65.25;
        System.out.println("Character = " + ch);

        //Casting using floating point values
        int a = (int)'A';
        System.out.println("Character = " + a);

        //byte b ='\uFFF4'; // this will cause a compiler error
        byte b = (byte) '\uFFF4';
        System.out.println("byte : " + b);



    }
}
