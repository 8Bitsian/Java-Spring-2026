public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        System.out.println("Matrix length: " + matrix.length);

        initArray(matrix);
        printArray(matrix);
        sumArray(matrix);
        sumColumn();
        rowWithMaxValue();
        shuffleMatrix();
    }

    // Fill the matrix with random numbers 0–99
    public static void initArray(int[][] m) {
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = (int)(Math.random() * 100);
    }

    // Print the matrix
    public static void printArray(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Sum all elements in the matrix
    public static void sumArray(int[][] m) {
        int total = 0;

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                total += m[row][col];
            }
        }

        System.out.println("Total: " + total);
    }

    // Sum each column in a 3×3 matrix
    public static void sumColumn() {
        int[][] array = {
                {6, 4, 9},
                {2, 8, 3},
                {1, 7, 5}
        };

        for (int col = 0; col < array[0].length; col++) {
            int total = 0;
            for (int row = 0; row < array.length; row++) {
                total += array[row][col];
            }
            System.out.println("Sum for column " + col + " is " + total);
        }
    }

    // Find the row with the largest sum
    public static void rowWithMaxValue() {
        int[][] array = {
                {6, 4, 9},
                {2, 8, 3},
                {1, 7, 5}
        };

        int maxRow = 0;
        int maxSum = 0;

        for (int col = 0; col < array[0].length; col++)
            maxSum += array[0][col];

        for (int row = 1; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = row;
            }
        }

        System.out.println("Row with max sum is row " + maxRow + " (sum = " + maxSum + ")");
    }

    // Shuffle the matrix (swap each element with a random element)
    public static void shuffleMatrix() {
        int[][] matrix = {
                {6, 4, 9},
                {2, 8, 3},
                {1, 7, 5}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int randRow = (int)(Math.random() * matrix.length);
                int randCol = (int)(Math.random() * matrix[0].length);

                int temp = matrix[i][j];
                matrix[i][j] = matrix[randRow][randCol];
                matrix[randRow][randCol] = temp;
            }
        }

        System.out.println("Shuffled matrix:");
        printArray(matrix);
    }
}
