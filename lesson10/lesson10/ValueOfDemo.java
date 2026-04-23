package lesson10;

public class ValueOfDemo {
    public static void main(String[] args) {
        //Integer x2 = new Integer("32");
        Double d = Double.valueOf("12.7");
        Integer i = Integer.valueOf("32");

        System.out.println("Test equality of double : " +  (d == 12.7));
        System.out.println("Test equality of integer : " +  (i == 32));


    }
}
