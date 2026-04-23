package lesson6;
/*
    This class sums all values in a range
 */
public class NoMethodClass {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("The sum from 1 to 10 is : " + sum);

        sum = 0;
        for(int i = 20; i <= 37; i++)
            sum += i;
        System.out.println("The sum from 29 to 37 is : " + sum);

        sum = 0;
        for(int i = 35; i <= 49; i++)
            sum += i;
        System.out.println("The sum from 35 to 49 is : " + sum);

    }
}
