package TEST.FINISHED;
import java.util.Scanner;

class classArrangement {
    static int minSwaps(String s) {
        
        int oneCount = 0, zeroCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'G') oneCount++;
            else zeroCount++;
        }
        
        if(oneCount != zeroCount && Math.abs(oneCount - zeroCount) >1)
            return -1;
        char charCheck = oneCount != zeroCount ? oneCount<zeroCount ? 'G' : 'B' : 'G';
        int swap=0,swap2=0;
        for(int i=1;i<s.length();i+=2)
            if(s.charAt(i) != charCheck)
                swap++;
            else if(oneCount == zeroCount && s.charAt(i)==charCheck) swap2++;
       
        return oneCount != zeroCount ? swap : Math.min(swap2,swap);
        
    }

       public static void main(String[] args) throws Exception {
            Scanner sc= new Scanner(System.in);
            String s = sc.next();
            System.out.println(minSwaps(s));
        }
}