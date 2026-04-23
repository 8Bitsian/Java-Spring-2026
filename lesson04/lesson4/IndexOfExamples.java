package lesson4;

public class IndexOfExamples {
    public static void main(String[] args) {
        System.out.println("Examples of indexOf");
        System.out.println("========================================================");
        System.out.println("Index of 'W' is : " + "Welcome To Java".indexOf('W'));
        System.out.println("Index of 'o' is : " + "Welcome To Java".indexOf('o'));
        System.out.println("Index of 'W' is : " + "Welcome To Java".indexOf('o', 5));
        System.out.println("Index of \"come\" is : " + "Welcome To Java".indexOf("come"));
        System.out.println("Index of \"java\" is : " + "Welcome To Java".indexOf("java" , 5));

        //Examples of lastIndex
        System.out.println("Examples of lastIndexOf");
        System.out.println("========================================================");
        System.out.println("Index of 'W' is : " + "Welcome To Java".lastIndexOf('W'));
        System.out.println("Index of 'o' is : " + "Welcome To Java".lastIndexOf('o'));
        System.out.println("Index of 'W' is : " + "Welcome To Java".lastIndexOf('o', 5));
        System.out.println("Index of \"come\" is : " + "Welcome To Java".lastIndexOf("come"));
        System.out.println("Index of \"java\" is : " + "Welcome To Java".lastIndexOf("java" , 5));
    }
}
