public class F {
    private int x = 0;
    private int y = 0; // Class variables

    public F() {}

    public static void main(String[] args) {
        F f = new F();
        f.p();
    }

    public void p() {
        int x = 1;  // Local variables
        System.out.println("x = " + x); // Will print 0 if no matching local variables
        System.out.println("y = " + y);
    }
}
