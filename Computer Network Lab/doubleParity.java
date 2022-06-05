import java.util.*;

public class doubleParity {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        encode();
        decode();
    }

    static void encode() {
        System.out.println("Enter Data To encode");
        String data = sc.next();
        System.out.println("Enter row and column to encode");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int k = 0;
        int matrix[][] = new int[row + 1][col + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = data.charAt(k) - '0';
                k++;
            }
        }

        int countRow = 0;
        int countCol = 0;
        String ans = "";
        for (int i = 0; i < row + 1; i++) {
            countRow = 0;
            for (int j = 0; j < col + 1; j++) {
                if (matrix[i][j] == 1 && j != row) {
                    countRow++;
                }
                if (j == row) {
                    if (countRow % 2 != 0) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                if (matrix[j][i] == 1 && j != col) {
                    countCol++;
                }
                if (j == col) {
                    if (countCol % 2 != 0) {
                        matrix[j][i] = 1;
                    } else {
                        matrix[j][i] = 0;
                    }
                }
            }
            countCol = 0;
        }

        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                System.out.print(matrix[i][j]);
                ans = ans + matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Data To Be Sent to USER : " + ans);

    }

    static void decode() {
        System.out.println("Enter Data To verify");
        String data = sc.next();
        System.out.println("Enter row and column to verify");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int k = 0;
        int matrix[][] = new int[row + 1][col + 1];
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                matrix[i][j] = data.charAt(k) - '0';
                k++;
            }
        }
        int countRow = 0;
        int countCol = 0;
        String ans = "";
        boolean error = false;
        for (int i = 0; i < row + 1; i++) {
            countRow = 0;
            for (int j = 0; j < col + 1; j++) {
                if (matrix[i][j] == 1 && j != row) {
                    countRow++;
                }
                if (j == row) {
                    if (countRow % 2 != 0) {
                        if (matrix[i][j] != 1) {
                            System.out.println("Error Occured in row " + i);
                            error = true;
                        }
                    } else {
                        if (matrix[i][j] != 0) {
                            System.out.println("Error Occured in row " + i);
                            error = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                if (matrix[j][i] == 1 && j != col) {
                    countCol++;
                }
                if (j == col) {
                    if (countCol % 2 != 0) {
                        if (matrix[j][i] != 1) {
                            System.out.println("Error Occured in col " + i);
                            error = true;
                        }
                    } else {
                        if (matrix[j][i] != 0) {
                            System.out.println("Error Occured in col " + i);
                            error = true;
                        }
                    }
                }
            }
            countCol = 0;
        }
        if (error) {
            System.out.println("Data is not correct");
        } else {
            System.out.println("Data is correct");
        }
    }
}
