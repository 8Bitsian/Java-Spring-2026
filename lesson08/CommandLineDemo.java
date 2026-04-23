package lesson7;

public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " arguments.");
        System.out.print("The values are : ");
        System.out.print(java.util.Arrays.toString(args));
        System.out.println();
    }
}
