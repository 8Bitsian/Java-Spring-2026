package lesson5;

public class LoopAccumulators {
    public static void main(String[] args) {
        //declare and initialize int variables sum and count to 0
        int count = 1, sum = 0;

        // begin while loop
        while (count < 10){
            //System.out.print(count );
            //System.out.print(count == 9 ? " = " : " + ");
            sum = sum + count; //sum+= count;
            count ++;
        }

        //print results to the console
        System.out.println(sum);

    }
}
