package pr22.ex1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

