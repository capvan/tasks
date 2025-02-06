
/*
https://stepik.org/lesson/12759/step/15?unit=3107
 */

import java.math.BigInteger;
import java.util.Arrays;

public void main() {
    flipBit(11, 2);
}
/**
 * Flips one bit of the given <code>value</code>.
 * @param value     any number
 * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
 * @return new value with one bit flipped
 */
public static int flipBit(int value, int bitIndex) {
    String binaryValue = Integer.toBinaryString(value);
    System.out.println(value);
    System.out.println(binaryValue);

    for (int i = 0; i < bitIndex; i++) {

    }
//    char[] a = binaryValue.toCharArray();
//    System.out.println(Arrays.toString(a));
//
//    a[bitIndex]

    return value ^(1 << bitIndex-1);


}

