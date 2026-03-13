public class ReturnArrayFromMethod {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        for (int n : list1) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] list2 = reverse(list1);
        for (int n : list2) {
            System.out.print(n + " ");
        }
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
