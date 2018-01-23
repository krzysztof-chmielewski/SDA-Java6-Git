package com.kchmielewski.sda.java6.git;

public class Calculator {
    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float times(float a, float b) {
        return a * b;
    }

    public float by(float a, float b) {
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
}
