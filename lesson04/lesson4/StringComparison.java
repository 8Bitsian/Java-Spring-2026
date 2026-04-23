package lesson4;

public class StringComparison {
    public static void main(String[] args) {
        System.out.println("Starts with \"We\" : " + "Welcome To Java".startsWith("We"));
        System.out.println("Starts with \"we\" : " + "Welcome To Java".startsWith("we"));
        System.out.println("Ends with \"va\" : " + "Welcome To Java".endsWith("va"));
        System.out.println("Start with \"v\" : " + "Welcome To Java".startsWith("v"));
        System.out.println("Contains \"To\" : " + "Welcome To Java".contains("To"));
        System.out.println("Contains \"to\" : " + "Welcome To Java".startsWith("to"));

    }
}
