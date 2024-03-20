import java.util.Scanner;

class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the dimensions of the first matrix (rows columns): ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        
        
        System.out.println("Enter the dimensions of the second matrix (rows columns): ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        
        
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Number of columns in first matrix should be equal to number of rows in second matrix.");
            return;
        }
        
        
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
       
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
