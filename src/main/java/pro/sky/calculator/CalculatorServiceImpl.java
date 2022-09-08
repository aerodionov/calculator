package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать  в калькулятор";
    }
    public int plusCalculator(int num1, int num2) {
        return (num1 + num2);
    }
    public int minusCalculator(int num1, int num2) {
        return (num1 - num2);
    }
    public int multiplyCalculator(int num1, int num2) {
        return (num1 * num2);
    }
    public double divideCalculator(int num1, int num2) {
        return (num1 / (double) num2);
    }

}
