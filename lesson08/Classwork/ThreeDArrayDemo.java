public class ThreeDArrayDemo {
    public static void main(String[] args) {
        // 3D Array : [layers][rows][columns]
        int[][][] numbers = { // [2][2][3]
                {
                        {0, 1, 2},
                        {3, 4, 5}
                },
                {
                        {6, 7, 8},
                        {9, 10, 11}
                }
        };

        // Traverse the 3D array
        for (int layer = 0; layer < numbers.length; layer++) {
            System.out.println("Layer [" + layer + "]");

            for (int row = 0; row < numbers[layer].length; row++) {
                for (int col = 0; col < numbers[layer][row].length; col++) {
                    System.out.println( "numbers[" + layer + "][" + row + "][" + col + "] = "
                            + numbers[layer][row][col]);
                }
            }
            System.out.println();
        }
    }
}
