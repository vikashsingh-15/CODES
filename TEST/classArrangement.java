import java.util.*;

public class classArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        inputStr=inputStr.toUpperCase();
        System.out.println(Arrange(inputStr));
    }

    
    public static int Arrange(String str) {

        int noOfBoys = 0, noOfGirls = 0;
        int l = str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'B')
                noOfBoys++;
            else
                noOfGirls++;
        }
        if (Math.abs(noOfGirls - noOfBoys) > 1)
            return -1;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) != 'B')
                    count1++;
            } else {
                if (str.charAt(i) != 'G')
                    count1++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) != 'G')
                    count2++;
            } else {
                if (str.charAt(i) != 'B')
                    count2++;
            }
        }
        if (count1 % 2 == 0 && count2 % 2 == 0) {
            if (count1 / 2 < count2 / 2)
                return count1 / 2;
            else
                return count2 / 2;
        } else {
            if (count1 % 2 == 0)
                return count1 / 2;
            else
                return count2 / 2;
        }
    }

}
