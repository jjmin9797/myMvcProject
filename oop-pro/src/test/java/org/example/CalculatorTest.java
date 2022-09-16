package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    //1 + 2 ----> Caluclator
    //  3  <----
    @DisplayName("연산 수행")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void additionTest(int a, String b, int c, int rs) {
        int calculateResult = Calculator.calculate(a, b, c);
        assertThat(calculateResult).isEqualTo(rs);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(5, "-", 2, 3)
        );
    }
}
