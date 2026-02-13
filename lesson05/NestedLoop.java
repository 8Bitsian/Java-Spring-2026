public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { // Loop 1 begins (runs 3 times)
            for (int j = 0; j < 3; j++) { // Loop 2 begins (runs 3 times)
                System.out.println("i, j = (" + i + " , " + j + ")"); // the program prints 9 times)
            } // Loop 2 ends
        } // Loop 1 ends
    }
}
