package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorService out = new CalculatorServiceImpl();

    @Test
    void plusCalculator() {
        Assertions.assertEquals(4,out.plusCalculator(1,3));
        Assertions.assertEquals(-5,out.plusCalculator(-1,-4));
            }

    @Test
    void minusCalculator() {
        Assertions.assertEquals(5,out.minusCalculator(9,4));
        Assertions.assertEquals(-4,out.minusCalculator(-6,-2));
    }

    @Test
    void multiplyCalculator() {
        Assertions.assertEquals(3,out.multiplyCalculator(1,3));
        Assertions.assertEquals(0,out.multiplyCalculator(-4,0));
    }

    @Test
    void divideCalculator() {
        Assertions.assertEquals(0.75,out.divideCalculator(3,4));
        Assertions.assertEquals(0,out.divideCalculator(0,-4));
    }
    @Test
    void divideCalculatorCheckDivideZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->out.divideCalculator(5,0)
        );
    }

}