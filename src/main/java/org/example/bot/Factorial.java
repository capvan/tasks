
/*

https://stepik.org/lesson/12762/step/8?unit=3110
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал N вычисляется как 1⋅2⋅...⋅N
Поскольку это очень быстро растущая функция, то даже для небольших N
вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
1!=1;
2!= 1 * 2;
3!= 1 * 2 * 3;
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
//    factorial(10);
    System.out.println(factorial(25));
}
