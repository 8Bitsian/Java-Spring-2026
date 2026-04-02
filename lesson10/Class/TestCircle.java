public class TestCircle {
    public static void main(String[] args) {
        createCircles();
        // testStaticCircles();
        // testConstructorCircle();
    }

    public static void createCircles() {
        // Instantiate new Circle object
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);
        Circle circle3 = new Circle(50);

        // Display the area of each circle
        System.out.println("Area of Circle 1: " + circle1.getArea());
        
        // Change the radius of the second anf third circles and display new ouputs
        System.out.println("Area of Circle 2: " + circle2.getArea());
        circle2 = circle1;
        System.out.println("Area of Circle 2: " + circle2.getArea());

        System.out.println("Area of Circle 3: " + circle3.getArea());
        circle3.radius = 100;
        System.out.println("Area of Circle 3: " + circle3.getArea());
    }

    public static void testStaticCircles() {
        StaticCircle sc1 = new StaticCircle();
        System.out.println("Number of instances: " + sc1.getNumberOfObjects());
        StaticCircle sc2 = new StaticCircle();
        System.out.println("Number of instances: " + sc2.getNumberOfObjects());
    }

    /*
    public static void testConstructorCircle() {
        ConstructorCircle cc1 = new ConstructorCircle();
        System.out.println("Number of instances: " + cc1.getNumberOfObjects());
        ConstructorCircle cc2 = new ConstructorCircle();
        System.out.println("Number of instances: " + cc2.getNumberOfObjects());
    }
    */
}
