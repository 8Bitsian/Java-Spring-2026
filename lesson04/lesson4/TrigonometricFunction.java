package lesson4;

public class TrigonometricFunction {
    public static void main(String[] args) {

        double ninetyDegrees = Math.toRadians(90.0);
        double oneHundredEightyDegrees = Math.toRadians(180.0);
        double threeSixtyDegrees = Math.toRadians(360);

        // Look at the Math.sin(radians) function
        System.out.println("Sine (0) = " + Math.sin(0));
        System.out.println("Sine (90 degrees) = " + (int) Math.sin(Math.PI /2 ));
        System.out.println("Sine (180 degrees) = " + (int)Math.sin((3 * Math.PI)/2));
        System.out.println("Sine (360 degrees) = " + (int)Math.sin((2 * Math.PI)));

        // Evaluate the Math.cos(Radians) function
        System.out.println("Cosine (0) = " + Math.cos(0.0));
        System.out.println("Cosine (90 degrees) = " + (int) Math.cos(Math.PI /2 ));
        System.out.println("Cosine (180 degrees) = " + (int)Math.cos((3 * Math.PI)/2));
        System.out.println("Cosine (360 degrees) = " + (int)Math.cos((2 * Math.PI)));


        System.out.println("Tangent 45 degrees = " +  Math.tan(Math.PI /4));


    }
}
