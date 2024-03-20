import java.util.Scanner;
class Matrixaddition 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the dimensions of the matrices (rows columns): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        System.out.println("Enter the elements of the first matrix:");
        int[][] mat1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        
       
        System.out.println("Enter the elements of the second matrix:");
        int[][] mat2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        
        
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
       
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
