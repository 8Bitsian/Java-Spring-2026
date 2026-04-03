public class TotalArea {
    public static void main(String[] args) {
        Circle[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    private static void printCircleArray(Circle[] circleArray) {
        System.out.printf("\n$-30s%-15s\n", "Radius", "Area");

        for (Circle circle : circleArray) {
            System.out.printf("$-30s%-15s\n", circle.getRadius(), circle.getArea());
        }
        System.out.println("-------------------");
    }

    private static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 10); // Random radius of 0 - 10
        }

        return circleArray;
    }
}
