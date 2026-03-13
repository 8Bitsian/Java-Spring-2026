import java.util.Arrays;

public class ArraySearchAndSort {

    public static void main(String[] args) {
        simpleDemo();
    }

    // ----------------------------------------------------
    // SIMPLE DEMO: Shows sorting + searching differences
    // ----------------------------------------------------
    public static void simpleDemo() {
        int[] numbers = {5, 2, 9, 1, 3};
        int[] numbersCopy = numbers.clone(); // copy for Arrays.sort

        // Bubble Sort
        bubbleSort(numbers);
        System.out.println("Bubble Sort:   " + Arrays.toString(numbers));

        // Arrays.sort
        Arrays.sort(numbersCopy);
        System.out.println("Arrays.sort:   " + Arrays.toString(numbersCopy));

        // Searching
        int key = 9;
        int linearResult = linearSearch(numbersCopy, key);
        int binaryResult = binarySearch(numbersCopy, key);

        System.out.println("Linear Search found " + key + " at index: " + linearResult);
        System.out.println("Binary Search found " + key + " at index: " + binaryResult);
    }

    // ----------------------------------------------------
    // LINEAR SEARCH (checks each number one by one)
    // ----------------------------------------------------
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // ----------------------------------------------------
    // BINARY SEARCH (only works on sorted arrays)
    // ----------------------------------------------------
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid; // found it
            }
        }

        return -1; // not found
    }

    // ----------------------------------------------------
    // BUBBLE SORT (slow but easy to understand)
    // ----------------------------------------------------
    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
