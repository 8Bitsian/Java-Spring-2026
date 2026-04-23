package lesson6;

public class Increment {

    static  int y = 9;

    public static void main(String[] args) {

        System.out.println("y = " +  y);
        int x =1;
        System.out.println("Before the call " + x  );
        increment(x);
        System.out.println("After the call " + x);
    }

    private static void increment(int n) {
        n++;
        System.out.println("y = " +  y);
        System.out.println("n inside the method is " + n);
    }
}
