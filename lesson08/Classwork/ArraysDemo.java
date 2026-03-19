import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        doSort(new double[] {9.0, -2.5, 17.2, 11.9, 8.8});
        doPartialSort(new char[] {'A', 'a', '1', '6', 'L'});
        doBinarySearch(26, new int[] {33, 26, 4, 11, 50, 66, 23, 47, 8});

        int[] list1 = {9, 2, 14, -1, 3};
        int[] list2 = {9, 2, 14, -1, 3};
        int[] list3 = {8, 2, 10, -1, 12};
        int[] list4 = new int[5];
        int[] list5 = {8, 2, 10, -1, 12};

        isEqual(list1, list2);
        isEqual(list3, list4);

        doFill(5, list4);
        doPartialFill(7, 0, 3, list5);
    }
    public static void doSort(double...doubleList) {
        System.out.println("Before full sort: " + java.util.Arrays.toString(doubleList));
        java.util.Arrays.sort(doubleList);
        System.out.println(" After full sort: " + java.util.Arrays.toString(doubleList) + "\n");
    }

    public static void doPartialSort(char...charList) {
        System.out.println("Before partial sort: " + java.util.Arrays.toString(charList));
        java.util.Arrays.sort(charList, 0, 3);
        System.out.println(" After partial sort: " + java.util.Arrays.toString(charList) + "\n");
    }

    public static void doBinarySearch(int key, int...intList) {
        System.out.println("Before binary search: " + java.util.Arrays.toString(intList));
        java.util.Arrays.sort(intList);
        System.out.println(" After binary search: " +java.util.Arrays.toString(intList));
        System.out.println("The index of the key is: "
                + java.util.Arrays.binarySearch(intList, key) + "\n");
    }

    public static void isEqual(int[] list1, int[] list2) {
        System.out.println("List 1: " + java.util.Arrays.toString(list1));
        System.out.println("List 2: " + java.util.Arrays.toString(list2));
        System.out.println("Arrays equal: " + java.util.Arrays.equals(list1, list2) + "\n");
    }

    public static void doFill(int fillValue, int...intList) {
        System.out.println("Before filling: " + java.util.Arrays.toString(intList));
        java.util.Arrays.fill(intList, fillValue);
        System.out.println(" After filling: " + java.util.Arrays.toString(intList) + "\n");
    }

    public static void doPartialFill(int fillValue, int beginIdx, int endIdx, int...intList) {
        System.out.println("Before partial filling: " + java.util.Arrays.toString(intList));
        java.util.Arrays.fill(intList, beginIdx, endIdx, fillValue);
        System.out.println(" After partial filling: " + java.util.Arrays.toString(intList));
    }
}
