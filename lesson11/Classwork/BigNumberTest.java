import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumberTest {
    public static void main(String[] args) {
        long longNumber = Long.MAX_VALUE;
        System.out.println(longNumber);
        System.out.println(longNumber * 2);

        demoBigInteger();
        demoBigDecimal();
    }

    public static void demoBigInteger() {
        BigInteger bigInt = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger a = new BigInteger("2");
        System.out.println(bigInt.multiply(a));
    }

    public static void demoBigDecimal() {
        BigDecimal b = BigDecimal.ONE;
        BigDecimal c = new BigDecimal("2");
        System.out.println(b.divide(c));
        System.out.println(b.divide(c,10,RoundingMode.HALF_UP));
    }
}
