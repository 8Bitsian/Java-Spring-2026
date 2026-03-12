public class ShiftValues {
    public static void main(String[] args) {
        // Declare arrays
        double[] myList = {8.0, 10.7, 14.5};
        double temp = myList[0]; // Retain first element

        for (int i = 1; i < myList.length; i++) {
            // Shift elements left
            myList[i - 1] = myList[i];
        }
        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;
    }
}
