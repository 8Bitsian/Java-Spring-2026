public class CommandLineDemo {
    public static void main(String[] args) {
        // EX. C:\Users\8bitsian\IdeaProjects\J108_Notes>java CommandLineDemo.java one two three
        //     There are 3 arguments
        //     The values are : [one, two, three]
        System.out.println("There are " + args.length + " arguments.");
        System.out.print("The values are : ");
        System.out.print(java.util.Arrays.toString(args));
        System.out.println();
    }
}
