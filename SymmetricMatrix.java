import java.util.Scanner;
public class SymmetricMatrix 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
System.out.println("\n NAME : JAYAMOL REMESAN \n REG NO :SJC22MCA-2031 \n DATE : 27-03-2023");
System.out.println("-----------OUTPUT---------");
        System.out.print("Enter the number of rows in the matrix: ");
        int numRows = input.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int numCols = input.nextInt();

        
        int[][] matrix = new int[numRows][numCols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        
        boolean isSymmetric = true;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        input.close();
    }
}


