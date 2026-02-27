public class Increment {
  // Create global variables within the class and outside of the methods
  static int y = 9;
  
  public static void main(String[] args) {
    // Static methods can only read static variables
    System.out.println("y = " + y);

    // Create local variables inside of the methods
    int x = 1;
    System.out.println("Before the call: " + x);
    increment(x);
    System.out.println("After the call: " + x);
  }

  private static void increment(int n) {
    System.out.println("y = " + y);

    n++;
    System.out.println("n inside the method is " + n);
  }
}
