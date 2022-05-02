import java.util.*;

public class palindromeSubString {//length of longest palindromic substring
    public static int longestPalindrome(String str) {
       
        boolean[][] dp = new boolean[str.length()][str.length()];
        String s="";
        int len = 0;
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp[0].length; i++, j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (g == 0) {
                        dp[i][j] = true;
                       
                    } else if (g == 1) {
                        dp[i][j] = true;
                      
                    } else {
                        if(dp[i+1][j-1]){
                            dp[i][j] = true;
                           
                        }                       
                    }
                }
                // if (g == 0) {
                // dp[i][j] = true;
                // } else if (g == 1) {
                // if (str.charAt(i) == str.charAt(j)) {
                // dp[i][j] = true;
                // } else {
                // dp[i][j] = false;
                // }
                // } else {
                // if (str.charAt(i) == str.charAt(j)) {
                // dp[i][j] = dp[i + 1][j - 1];
                // } else {
                // dp[i][j] = false;
                // }

                if (dp[i][j]) {
                    len = g + 1;
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPalindrome(str));

    }
}
