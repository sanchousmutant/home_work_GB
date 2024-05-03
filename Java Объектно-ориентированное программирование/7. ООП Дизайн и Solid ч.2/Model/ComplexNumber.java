package Model;

public class ComplexNumber {

   double real;
   double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + imaginary + "i)";
    }
}
