public class matrix {
    public static void main(String[] args) {
        int[] A = {3, 4, 1, 8};
        int[] B = {2, 5, 6, 7};
        int[] sum = new int[4];
        int[] difference = new int[4];
        int[] product = new int[4];

        for (int i = 0; i < 4; i++) {
            sum[i] = A[i] + B[i];
            difference[i] = A[i] - B[i];
            product[i] = A[i] * B[i];
        }
        System.out.println("Matrix A: ");
        printMatrix(A);
        System.out.println("Matrix B: ");
        printMatrix(B);
        System.out.println("Sum (A + B): ");
        printMatrix(sum);
        System.out.println("Difference (A - B): ");
        printMatrix(difference);
        System.out.println("Element-wise Product (A * B): ");
        printMatrix(product);
    }
    public static void printMatrix(int[] matrix) {
        for (int num : matrix) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

