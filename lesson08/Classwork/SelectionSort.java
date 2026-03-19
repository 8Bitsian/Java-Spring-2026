public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {-1, -2.5, 0, 3.0, -5.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static void selectionSort(double... list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Find the actual minimum in the rest of the array
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            double temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }
}
