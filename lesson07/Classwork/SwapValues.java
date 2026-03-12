public class SwapValues {
    public static void main(String[] args) {
        // Declare array
        double[] myList = {8.0, 10.7, 14.5};

        for (int i = 0; i < myList.length - 1; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * myList.length);

            // swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
    }
}
