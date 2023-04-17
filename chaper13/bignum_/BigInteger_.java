package bignum_;

import java.math.BigInteger;

/**
 * @Author: EzioHe
 * @Date: 2023/4/17 0:34
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("2937218642786478262366426");
        BigInteger bigInteger2 = new BigInteger("7238732857238758937579353");
        System.out.println(bigInteger1);
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);
    }
}
