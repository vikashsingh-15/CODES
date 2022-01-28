package JAVA.CODES.CODES;

import java.util.*;

public class sparseMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("DATA of 1st matrix Enter size of matrix");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] matrix = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size1; k++) {
                    matrix[k][j] = sc.nextInt();
                }
            }
        }

        System.out.println("DATA of 2nd matrix  Enter size of matrix");
        int sizeb1 = sc.nextInt();
        int sizeb2 = sc.nextInt();
        int[][] matrix2 = new int[sizeb1][sizeb2];
        for (int i = 0; i < sizeb1; i++) {
            for (int j = 0; j < sizeb2; j++) {
                for (int k = 0; k < size1; k++) {
                    matrix2[k][j] = sc.nextInt();
                }
            }
        }

        if(isSparseMatrix(matrix) && isSparseMatrix(matrix2))
        {
            System.out.println("Both are sparse matrix");
            multiplySparseMatrix(matrix,matrix2);
        }
        else if(isSparseMatrix(matrix) && !isSparseMatrix(matrix2))
        {
            System.out.println("1st matrix is sparse matrix and 2nd matrix is not sparse matrix");
        }
        else if(!isSparseMatrix(matrix) && isSparseMatrix(matrix2))
        {
            System.out.println("2nd matrix is sparse matrix and 1st matrix is not sparse matrix");
        }
        else
        {
            System.out.println("Both are not sparse matrix");
        }
    }

    static boolean isSparseMatrix(int matrix[][]) {
        int rows = matrix.length;  
        int cols = matrix[0].length;
       int size = rows * cols;  
       int count = 0;
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                if(matrix[i][j] == 0)  
                    count++;  
                }  
            }           
        if(count > (size/2))  
        return true;
            // System.out.println("Given matrix is a sparse matrix");  
        else  
        return false;
            // System.out.println("Given matrix is not a sparse matrix");  
    }  


    static void multiplySparseMatrix(int matrix[][],int matrix2[][]) {
        int rows = matrix.length;  
        int cols = matrix[0].length;
        int rows2 = matrix2.length;  
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows][cols2];
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols2; j++){  
                for(int k = 0; k < cols; k++){  
                    result[i][j] += matrix[i][k] * matrix2[k][j];  
                }  
            }  
        }  
        System.out.println("Resultant matrix is :");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols2; j++){  
                System.out.print(result[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }
  
    }

