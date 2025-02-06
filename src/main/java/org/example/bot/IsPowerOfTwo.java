/*
https://stepik.org/lesson/12760/step/9?unit=3108
 */


/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param 'value' any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */

public static boolean isPowerOfTwo(int value) {
    value = Math.abs(value);
    return Integer.bitCount(value) == 1;
}

public void main() {
    System.out.println(isPowerOfTwo(5));
}
