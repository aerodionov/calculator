package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2",required = false) Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Один из параметров не задан, попробуйте ещё раз!";
        }
        return calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2",required = false) Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Один из параметров не задан, попробуйте ещё раз!";
        }
        return calculatorService.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2",required = false) Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Один из параметров не задан, попробуйте ещё раз!";
        }
        return calculatorService.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2",required = false) Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Один из параметров не задан, попробуйте ещё раз!";
        }
        return calculatorService.divideCalculator(num1, num2);
    }

}
