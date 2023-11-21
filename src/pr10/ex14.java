package pr10;

public class ex14 {
    public static void main (String[] args)
    {
        int n = 1234567564;
        int k = 1000000000;
        System.out.println("Разложение числа " + n + " по цифрам:");
        numbers(n,k);
    }
    static int numbers ( int n, int k)
    {
        if (n == 0)
        {
            return 0;
        }
        else {
            System.out.println(n/k);
            return numbers(n % k, k/10);
        }
    }
}
