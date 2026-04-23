package lesson4;

public class RoundingFunctions {
    public static final double testValue = 9.99;
    public static void main(String[] args) {
        System.out.println("Value of test value using ceil() function :" + Math.ceil(testValue));
        System.out.println("Value round DOWN to the nearest value " + Math.floor(testValue));
        System.out.println("Value of rint(x) " + Math.rint(2.6));
        System.out.println("Demo using round(x) using a float " + Math.round(.003f));
        System.out.println("Demo using round(x) using a double " + Math.round(0.999));
    }
}
