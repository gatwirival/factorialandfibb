//VALENTINE GATWIRI
//EBS3/58403/22
import java.util.Scanner;

public class fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci: ");
        int fibNumber = scanner.nextInt();
        long startFibonacci = System.nanoTime();
        long fibResult = fibonacci(fibNumber);
        long endFibonacci = System.nanoTime();
        System.out.println("The  fibonacci number  " + fibNumber + " is " + fibResult);
        System.out.println("Fibonacci calculation time: " + (endFibonacci - startFibonacci) + " ns");
        scanner.close();
    }
}

