package Model;

public interface Calculable {
    ComplexNumber sum(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
