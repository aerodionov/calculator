package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTests {
    private CalculatorService out = new CalculatorServiceImpl();


    public static Stream<Arguments> provideParamForTestPlusCalculator () { //Параметры для проверка модуля суммирования
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(-1,-2,-3),
                Arguments.of(0,-2,-2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamForTestPlusCalculator")
    void plusCalculator(int num1,int num2, int correctOut) {
        Assertions.assertEquals(correctOut,out.plusCalculator(num1,num2));
    }

    public static Stream<Arguments> provideParamForTestMinusCalculator () { //Параметры для проверка модуля вычитания
        return Stream.of(
                Arguments.of(1,2,-1),
                Arguments.of(-1,-2,1),
                Arguments.of(0,-2,2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamForTestMinusCalculator")
    void minusCalculator(int num1,int num2, int correctOut) {
        Assertions.assertEquals(correctOut,out.minusCalculator(num1,num2));
    }

    public static Stream<Arguments> provideParamForTestMultiplyCalculator () { //Параметры для проверка модуля умножения
        return Stream.of(
                Arguments.of(1,2,2),
                Arguments.of(-3,-2,6),
                Arguments.of(0,-2,0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamForTestMultiplyCalculator")
    void multiplyCalculator(int num1,int num2, int correctOut) {
        Assertions.assertEquals(correctOut,out.multiplyCalculator(num1,num2));
    }

    public static Stream<Arguments> provideParamForTestDivideCalculator () { //Параметры для проверка модуля деления
        return Stream.of(
                Arguments.of(6,2,3),
                Arguments.of(3,4,0.75),
                Arguments.of(0,-2,0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamForTestDivideCalculator")
    void divideCalculator(int num1,int num2, double correctOut) {
        Assertions.assertEquals(correctOut,out.divideCalculator(num1,num2));
    }


}