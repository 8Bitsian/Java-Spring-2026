public class IndexOfExamples {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        // Starts at index of '0' and ends at index ''

        System.out.println("\nExamples of indexOf");
        System.out.println("================================================");
        System.out.println("Index of 'W' is: " + "Welcome to Java".indexOf('W'));
        System.out.println("Index of 'o' is: " + "Welcome to Java".indexOf('o'));
        System.out.println("Index of 'W' is: " + "Welcome to Java".indexOf('W', 5));
        System.out.println("Index of \"come\" is: " + "Welcome to Java".indexOf("come"));
        System.out.println("Index of \"java\" is: " + "Welcome to Java".indexOf("java"));

        System.out.println("\nExamples of lastIndexOf");
        System.out.println("================================================");
        System.out.println("Index of 'W' is: " + "Welcome to Java".lastIndexOf('W'));
        System.out.println("Index of 'o' is: " + "Welcome to Java".lastIndexOf('o'));
        System.out.println("Index of 'W' is: " + "Welcome to Java".lastIndexOf('W', 5));
        System.out.println("Index of \"come\" is: " + "Welcome to Java".lastIndexOf("come"));
        System.out.println("Index of \"java\" is: " + "Welcome to Java".lastIndexOf("java"));
    }
}
