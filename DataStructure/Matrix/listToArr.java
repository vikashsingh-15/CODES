import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
           
    //    int downToUp = 0, upToDown = 0;
    //     int length = arr.size();
    //     for (int i = 0; i < length; i++) {
    //         upToDown += arr.get(i).get(i);
    //         downToUp += arr.get(length - (i + 1)).get(i);
    //     }
    //     return Math.abs(upToDown - downToUp);
        
        int matrix[][]=new int[arr.size()][arr.size()];

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                matrix[i][j]=arr.get(i).get(j);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        
        return 0;
    }

}

public class listToArr {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
