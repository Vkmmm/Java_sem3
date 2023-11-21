package pr10;

public class ex15 {
    public static void main (String[] args)
    {
        int n = 1234567564;
        System.out.println("Разложение числа " + n + " по цифрам справа налево:");
        numbers(n);
    }
    static int numbers ( int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else {
            System.out.println(n % 10);
            return numbers(n / 10 );
        }
    }
}
