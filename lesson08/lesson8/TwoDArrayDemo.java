package lesson8;

public class TwoDArrayDemo {

    public static void main(String[] args) {
        int [][] matrix = new int [10][10];

        //System.out.println("Matrix length : " + matrix.length);
        //initArray(matrix);
        //printArray(matrix);
        //sumArray(matrix);
        //sumColumn();
        //rowWithMaxValue();
        shuffleMatrix();


        //System.out.println(matrix[4][4]);

    }

    /*
        Loads array with random values from 0 - 99
     */
    public static void initArray(int[][] m){
        for(int row = 0; row < m.length ; row++){
            for(int col = 0; col < m[row].length; col++){
                m[row][col] = (int) (Math.random() * 100);
            }
        }
    }

    // Traverse the array and print its values
    public static void printArray(int[][] m){
        for(int row = 0; row < m.length ; row++){
            for(int col = 0; col < m[row].length; col++){
                System.out.print(m[row][col] + " ");
            }
            //print a new line after each row
            System.out.println();
        }

    }
    // Sum the all values of the array
    public static void sumArray(int[][] m){
        int total = 0;

        for(int row = 0; row < m.length ; row++){
            for(int col = 0; col < m[row].length; col++){
                total += m[row][col];
            }
        }

        System.out.println("Total : " + total);
    }

    //Sum column values in the array
    public static void sumColumn(){
        int[][] array = {
                {6, 4, 9},
                {2, 8, 3},
                {1, 7, 5}
        };

        for(int col = 0; col < array[0].length; col++){
            int total = 0;
            for(int row = 0; row  < array.length; row++){
                total += array[row][col];
            }
            System.out.println("Sum for column " + col + " is " +total);
        }
    }

    //Determines the row with the largest sum
    public static void rowWithMaxValue(){
        int[][] array = {
                {6, 4, 9, 13},
                {2, 8, 3, 14},
                {1, 7, 5, 11}
        };

        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Get sum of the first row in maxRow
        for(int col = 0; col < array[0].length; col++){
            maxRow += array[0][col];
        }

        //now traverse each row and derive a value
        for(int row = 1; row < array.length ; row++){
            int totalOfThisRow = 0;
            for(int col = 0; col < array[row].length; col++){
                totalOfThisRow += array[row][col];
            }

            if(totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }

    //Determines the row with the largest sum
    public static void shuffleMatrix(){
        int[][] matrix = {
                {6, 4, 9, 13},
                {2, 8, 3, 14},
                {1, 7, 5, 11}
        };

        //now traverse each row and derive a value
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }

        printArray(matrix);
    }
}
