package org.example.bot;

//https://stepik.org/lesson/12772/step/10?unit=3120

public class GetStackTrace {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        String className = stackTraceElements[2].getClassName();
        String methodName = stackTraceElements[2].getMethodName();

        String message = "";


       return message;
    }
}