import java.util.*;
public class matrixInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int row=sc.nextInt();
        int matrix[][] = new int[row][row];

        for(int i=0; i < row; i++){
            String input = sc.next();
            String words[] = input.split(",");
            for(int j=0; j < words.length; j++){
                matrix[i][j] = Integer.parseInt(words[j]);
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
