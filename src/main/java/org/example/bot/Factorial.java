
/*
https://stepik.org/lesson/12762/step/8?unit=3110
*/

import java.math.BigInteger;

public static BigInteger factorial(int value) {
    //0! = 1;
    BigInteger n = BigInteger.ONE;

    if (value == 0) {
        return BigInteger.ONE;
    }
    for (int i = 1; i <= value; i++) {
         n = n.multiply(BigInteger.valueOf(i));
    }
    return n;
}

public void main() {
    System.out.println(factorial(25));
}
