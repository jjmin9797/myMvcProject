package org.example;


import java.util.Arrays;

public enum NewCalculate {
    ADDITION("+") {
        @Override
        public int enumCaculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int enumCaculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    };

    private final String operater;

    NewCalculate(String operater) {
        this.operater = operater;
    }

    public abstract int enumCaculate(final int operand1, final int operand2);

    public static int caculate(int operand1, String operater, int operand2) {
        NewCalculate newCalculate = Arrays.stream(values())
                .filter(v -> v.operater.equals(operater))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아님"));
        return newCalculate.enumCaculate(operand1, operand2);
    }
}
