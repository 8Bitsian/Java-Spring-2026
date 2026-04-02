public class Circle {
    double radius = 1;

    public Circle() {}

    public Circle(double radius) {
        radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double val) {
        radius = val;
    }
}
