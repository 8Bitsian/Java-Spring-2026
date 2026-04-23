package lesson10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumberTest {
    public static void main(String[] args) {
        long longNumber = Long.MAX_VALUE;
        System.out.println(longNumber);
        //System.out.println(longNumber * 2);

        demonstrateBigInteger();

        demonstrateBigDecimal();
    }

    public static void  demonstrateBigInteger(){
        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger  b = new BigInteger("2");
        System.out.println(bigInteger.multiply(b));
    }

    public static void demonstrateBigDecimal(){

        BigDecimal a = BigDecimal.ONE;
        BigDecimal b = new BigDecimal("3");
        //System.out.println(a.divide(b));
        System.out.println(a.divide(b, 10, RoundingMode.HALF_UP));
    }
}