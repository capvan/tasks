package org.example.bot;
//https://stepik.org/lesson/12772/step/10?unit=3120

public class GetStackTrace2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        if (stackTraceElements.length <= 3) {
            return null;
        }

        String className = stackTraceElements[3].getClassName();
        String methodName = stackTraceElements[3].getMethodName();

        return className + "#" + methodName;
    }
}
