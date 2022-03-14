import java.util.*;
public class countCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
       String str= s.toLowerCase();


        int countArr[]=new int[26];
        for(int i=0;i<str.length();i++){
            countArr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<countArr.length;i++){
            if(countArr[i]!=0){
                System.out.println((char)(i+'a')+" "+countArr[i]);
            }
        }
    }
    
}
