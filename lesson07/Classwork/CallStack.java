public class CallStack {
    public static void main(String[] args) {
        int x = 1;             // Declare and initialize x variable
        int[] y = new int[10]; // Create y array
        
        m(x, y);    // Invoke method 'm' w/args x and y

        System.out.println("x is " + x); // Will print 1
        System.out.println("y is " + y); // Will print 5555
    }
    public static void m(int number, int[] numbers) {
        number = 1000;      // Assign a new value to number
        numbers[0] = 5555;  // Assign a new value to numbers[0]
    }
}
