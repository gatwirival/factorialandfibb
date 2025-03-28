import java.util.Scanner;

public class fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci: ");
        int fibNumber = scanner.nextInt();
        long startFibonacci = System.nanoTime();
        long fibResult = fibonacci(fibNumber);
        long endFibonacci = System.nanoTime();
        System.out.println("The Fibonacci number " + fibNumber + " is " + fibResult);
        System.out.println("Fibonacci calculation time: " + (endFibonacci - startFibonacci) + " ns");
        scanner.close();
    }
}


