import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
	System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
	System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
               }
              }
              System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The result of matrix addition is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }01200000000000000
}

