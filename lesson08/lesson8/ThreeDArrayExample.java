package lesson8;

public class ThreeDArrayExample {

    public static void main(String[] args) {

        // 3D array: [layers][rows][columns]
        int[][][] numbers = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        // Traverse the 3D array
        for (int i = 0; i < numbers.length; i++) { // layers
            System.out.println("Layer " + i + ":");

            for (int j = 0; j < numbers[i].length; j++) { // rows
                for (int k = 0; k < numbers[i][j].length; k++) { // columns
                    System.out.println("numbers[" + i + "][" + j + "][" + k + "] = " + numbers[i][j][k]);
                }
            }

            System.out.println(); // spacing between layers
        }
    }
}
