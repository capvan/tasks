//https://stepik.org/lesson/14513/step/7?unit=4147

import java.util.function.DoubleUnaryOperator;

public static double integrate(DoubleUnaryOperator f, double a, double b) {
    return f.applyAsDouble(a);
}

public void main() {
}
