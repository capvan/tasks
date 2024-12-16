/*
https://stepik.org/lesson/12760/step/9?unit=3108
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:

воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
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
