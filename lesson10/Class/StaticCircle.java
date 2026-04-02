public class StaticCircle {
    // Data fields w/primitive data types
    double radius = 1;
    static int numberOfObjects;

    // Constructors
    public StaticCircle() {
        numberOfObjects++;
    }

    public StaticCircle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    // Methods (Getters & Setters)
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
