package Lab1.ex2;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = { {2, 3, 1}, {7, 1, 6}, {9, 2, 4} };
        int[][] B = { {8, 5, 3}, {3, 9, 2}, {2, 7, 3} };

        // Calculate the sum of A and B
        int[][] sum = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Calculate the product of A and B
        int[][] product = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the results
        System.out.println("Sum of matrices A and B:");
        printMatrix(sum);

        System.out.println("\nProduct of matrices A and B:");
        printMatrix(product);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

