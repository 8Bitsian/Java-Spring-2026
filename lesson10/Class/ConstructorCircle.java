public class ConstructorCircle {
    // Data fields w/primitive data types
    double radius;

    // Constructors (No return type)
    public ConstructorCircle() {
        this(1.0);
        System.out.println();
    }

    public ConstructorCircle(double radius) {
        this.radius = radius;
        System.out.print("\nCreating a circle in the constructor chain...");
    }

    // Methods (Getters and Setter)
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
