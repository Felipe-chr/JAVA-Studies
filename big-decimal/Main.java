package bigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("56.893");
        BigDecimal value2 = new BigDecimal("99.237");
        BigDecimal value4 = new BigDecimal("4");
        BigDecimal value3 = new BigDecimal("10");
        System.out.println(value1.multiply(value2));
        System.out.println(value2.divide(value1, 3, RoundingMode.HALF_EVEN));
        System.out.println(value2.sqrt(new MathContext(15)));
        System.out.println(value4.pow(15));
        System.out.println(value3);

    }
}
