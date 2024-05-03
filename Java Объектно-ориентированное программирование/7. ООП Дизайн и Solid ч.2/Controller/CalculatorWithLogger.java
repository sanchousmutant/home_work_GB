package Controller;

import Model.Calculable;
import Model.ComplexNumber;

public class CalculatorWithLogger implements Calculable {
    private Calculable calculable;

    public CalculatorWithLogger(Calculable calculable) {
        this.calculable = calculable;
    }

    @Override
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        System.out.printf("Addition %s and %s is ", num1, num2);
        return  calculable.sum(num1, num2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        System.out.printf("Product %s and %s is ", num1, num2);
        return  calculable.multiply(num1, num2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        System.out.printf("Quotient %s and %s is ", num1, num2);
        return  calculable.divide(num1, num2);
    }
}
