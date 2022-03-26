package TEST.FINISHED;
import java.util.Scanner;
class classArrangement2 {
    static int Arrange(String str) {
        int noOfB = 0, noOfG = 0;
        int l=str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'B')
                noOfB++;
            else
                noOfG++;
        }
        if (Math.abs(noOfG - noOfB) > 1){
            return -1;
        }
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

        if (count1 % 2 == 0 && count2 % 2 == 0){
             if(count1 / 2< count2 / 2){
                          return count1 / 2;
                    }       
             else{
                    return count2 / 2;
            }
        }

        else {
            if (count1 % 2 == 0)
                return count1 / 2;
            else
                return count2 / 2;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        System.out.println(Arrange(inputStr));
    }
}