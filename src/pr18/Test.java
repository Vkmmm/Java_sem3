package pr18;
import java.util.Scanner;
import pr18.ex4.Calc;
import pr18.ex4.MinMax;
import pr18.ex5.Matrix;

public class Test {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 10 целых чисел через пробел: ");
        Integer[] integers = new Integer[10];
        for (int i = 0; i < 10; i++) {
            integers[i] = scanner.nextInt();
        }
        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println("Минимальный элемент: " + minmax.findMin());
        System.out.println("Максимальный элемент: " + minmax.findMax());

        System.out.print("Введите число для умножения: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число для умножения: ");
        double number2 = scanner.nextDouble();
        System.out.println("Умножение " + number1 + " на " + number2 + ": " + Calc.multiply(number1, number2));

        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix03 = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];
                matrix02[i][j] = number1;
                matrix03[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);
        Matrix matrix3 = new Matrix(matrix03);

        System.out.println("Результат вычитания матриц:");
        matrix1.subtraction(matrix2, matrix3);
        System.out.println("Матрица 1:");
        System.out.println(matrix1);
        System.out.println("Матрица 2:");
        System.out.println(matrix2);
        System.out.println("Матрица 3 (результат):");
        System.out.println(matrix3);
        System.out.println("Определитель матрицы 3: " + matrix3.det());
    }
}
