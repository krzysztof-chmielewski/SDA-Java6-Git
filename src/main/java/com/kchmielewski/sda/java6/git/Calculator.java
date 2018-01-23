package com.kchmielewski.sda.java6.git;

public class Calculator {
    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (b == 0f) {
            throw new IllegalArgumentException("Division by 0!");
        }
        return a / b;
    }

    public int raise(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }

        return result;
    }

    public int sum(int a, int rest) {
        int sum = a;
        for (int b : rest) {
            sum += b;
        }

        return sum;
    }
}
