import Controller.CalculatorWithLogger;
import Model.ComplexNumber;
import Model.CalculatorComplexNumber;
import View.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ComplexNumber num1 = new ComplexNumber(input.add(), input.add());
        ComplexNumber num2 = new ComplexNumber(input.add(), input.add());
        System.out.println("===================");
        ComplexNumber addition = new CalculatorWithLogger(new CalculatorComplexNumber()).sum(num1, num2);
        System.out.println(addition);
        ComplexNumber product = new CalculatorWithLogger(new CalculatorComplexNumber()).multiply(num1, num2);
        System.out.println(product);
        ComplexNumber difference = new CalculatorWithLogger(new CalculatorComplexNumber()).divide(num1, num2);
        System.out.println(difference);
    }
}
