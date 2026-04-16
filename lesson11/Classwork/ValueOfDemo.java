public class ValueOfDemo {
    static void main(String[] args) {
        // Integer x2 = new Integer("32");
        Double d = Double.valueOf("17.2");
        Integer i = Integer.valueOf("32");

        System.out.println("Test of equality of double : " + (d == 12.7)); // false
        System.out.println("Test of equality of integer : " + (i == 32));  // true
    }
}
