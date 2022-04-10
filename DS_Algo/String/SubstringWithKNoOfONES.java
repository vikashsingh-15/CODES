import java.util.*;

public class SubstringWithKNoOfONES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        int count = SubstringWith(str, n);
        if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }

    static int SubstringWith(String s, int K) {
        int N = s.length();
        int res = 0;
        int countOfOne = 0;
        int[] freq = new int[N + 1];
        freq[0] = 1;
        for (int i = 0; i < N; i++) {
            countOfOne += (s.charAt(i) - '0');
            if (countOfOne >= K) {
                res += freq[countOfOne - K];
            }
            freq[countOfOne]++;
        }
        return res;
    }

}
