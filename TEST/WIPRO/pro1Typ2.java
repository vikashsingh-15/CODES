import java.util.*;
public class pro1Typ2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sol=Solution(a,b,c);
        System.out.println(sol);
    }

    public static int Solution(int a,int b,int c){
        String ans="";
        int MaXthousand=Math.max(Math.max((a/1000),(b/1000)),c/1000);
        int MinThousand=Math.min(Math.min((a/1000),(b/1000)),c/1000);

        int MaXhundred=Math.max(Math.max((a%1000/100),(b%1000/100)),c%1000/100);
        int Minhundred=Math.min(Math.min((a%1000/100),(b%1000/100)),c%1000/100);

        int MaXten=Math.max(Math.max((a%100/10),(b%100/10)),c%100/10);
        int Minten=Math.min(Math.min((a%100/10),(b%100/10)),c%100/10);

        int MaXone=Math.max(Math.max((a%10),(b%10)),c%10);
        int Minone=Math.min(Math.min((a%10),(b%10)),c%10);
        ans=Integer.toString((MaXthousand-MinThousand))+Integer.toString((MaXhundred-Minhundred))+Integer.toString((MaXten-Minten))+Integer.toString((MaXone-Minone));
        return Integer.valueOf(ans);
    }
    
}
