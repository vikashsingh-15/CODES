import java.util.*;

public class classArrangement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        inputStr = inputStr.toUpperCase();
        System.out.println(Arrange(inputStr));
    }

    
    public static int Arrange(String str) {
        int noOfB = 0, noOfG = 0;
        int l = str.length();
        int ans = 0;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'B')
                noOfB++;
            else
                noOfG++;
        }
        if (Math.abs(noOfG - noOfB) > 1) {
            return -1;
        }
        if (str.length() % 2 == 0) {
            char c = noofB > noofG ? 'B' : 'G';
            for (int i = 0; i < str.length(); i = i + 2) {
                if (str.charAt(i) != c) {
                    ans++;
                }
            }
        } else {
            int bAtEven = 0, gAtEven = 0;
            for (int i = 0; i < str.length(); i = i + 2) {
                if (str.charAt(i) == 'B') {
                    bAtEven++;
                } else {
                    gAtEven++;
                }
            }
            if (bAtEven > gAtEven)
                ans = str.length()/2 - bAtEven;
            else if (gAtEven > bAtEven)
                ans = str.length()/2 - gAtEven;
            else
                ans += bAtEven;

        }
        return ans;

    }
}
