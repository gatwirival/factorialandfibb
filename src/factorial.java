//VALENTINE GATWIRI
//EBS3/58403/22
import java.util.Scanner;

    public class factorial {
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for factorial: ");
            int factNumber = scanner.nextInt();
            long startFactorial = System.nanoTime();
            long factResult = factorial(factNumber);
            long endFactorial = System.nanoTime();
            System.out.println("Factorial of " + factNumber + " is " + factResult);
            System.out.println("Factorial calculation time: " + (endFactorial - startFactorial) + " ns");
            scanner.close();
        }
    }





