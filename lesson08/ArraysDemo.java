package lesson7;

public class ArraysDemo {
    public static void main(String[] args) {

        //doSort(new double[]{9.0, -2.5, 17.2, 11.9, 8.8});
        //doPartialSort(new char[] {'A', 'a', '1', '6', 'L'});
        //doBinarySearch(26, new int[] {33, 26, 4, 11, 50, 66, 23, 47, 8});

        int[] list1 = {9, 2, 14, -1, 3};
        int[] list2 = {9, 2, 14, -1, 3};
        int[] list3 = {8, 2, 10, -1, 12};
        int[] list4 = new int [5];
        int[] list5 = {8, 2, 10, -1, 12};

        //isEqual(list1, list2);
        //isEqual(list1, list3);

        //doFill(5,list4);
        doPartialFill(7, 0, 3, list5);

    }

    // traditional sort
    public static void doSort(double...doubleList){
        java.util.Arrays.sort(doubleList);
        System.out.println(java.util.Arrays.toString(doubleList));
    }

    // partial sort
    public static void doPartialSort(char...charList){
        java.util.Arrays.sort(charList, 0, 3);
        System.out.println(java.util.Arrays.toString(charList));
    }

    // binary sort
    public static void doBinarySearch(int key, int...intList){
        java.util.Arrays.sort(intList);
        System.out.println(java.util.Arrays.toString(intList));
        System.out.println("Index of the key is : " +
                java.util.Arrays.binarySearch(intList, key));
    }

    //check for array equality
    public static void isEqual(int[] list1, int[] list2){
        System.out.println("Arrays equal : " + java.util.Arrays.equals(list1, list2));
    }

    public static void doFill(int fillValue, int...intList){
        java.util.Arrays.fill(intList, fillValue);
        System.out.println("Fill Results : " + java.util.Arrays.toString(intList));
    }

    public static void doPartialFill(int fillValue, int beginIdx, int endIdx,  int...intList){
        java.util.Arrays.fill(intList, beginIdx, endIdx, fillValue);
        System.out.println("Partial Fill Results :" + java.util.Arrays.toString(intList));
    }


}
