public class StringComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Starts with \"We\" : " + "Welcome to Java".startsWith("We"));
        System.out.println("Starts with \"we\" : " + "Welcome to Java".startsWith("we"));
        System.out.println("Ends with \"va\"   : " + "Welcome to Java".endsWith("va"));
        System.out.println("Ends with \"v\"    : " + "Welcome to Java".endsWith("v"));
        System.out.println("Contains \"To\"    : " + "Welcome to Java".contains("To"));
        System.out.println("Contains \"to\"    : " + "Welcome to Java".contains("to"));
        // String s = "Java is fun!"
    }
}
