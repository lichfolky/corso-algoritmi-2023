package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRicorsivo(6));
        System.out.println(fibonacciIterativo(6)[6]);
    }

    private static int fibonacciRicorsivo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRicorsivo(n - 1) + fibonacciRicorsivo(n - 2);
    }

    public static int[] fibonacciIterativo(int n) {
        int[] numeriFib = new int[n + 1];
        numeriFib[0] = 0;
        numeriFib[1] = 1;
        for (int i = 2; i < numeriFib.length; i++) {
            numeriFib[i] = numeriFib[i - 1] + numeriFib[i - 2];
        }
        return numeriFib;
    }
}
