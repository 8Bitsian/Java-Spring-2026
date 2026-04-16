public class StringDemo {
    public static void main(String[] args) {
        String m1 = new String("Java is fun!");
        String m2 = "Java is fun!";
        String m3 = "C++ is fun!";
        
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        
        System.out.println(m1.charAt(0));
        
        System.out.println(m1.substring(5));
        System.out.println(m1.substring(5, m3.length()));
        
        System.out.println(m1.toLowerCase());
    }
}
