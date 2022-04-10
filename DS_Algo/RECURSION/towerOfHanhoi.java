import java.util.*;
public class towerOfHanhoi {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int disk=sc.nextInt();
        int tower1=sc.nextInt();
        int tower2=sc.nextInt();
        int tower3=sc.nextInt();

        towerOfHanhoi(disk,tower1,tower2,tower3);
    }

    static void towerOfHanhoi(int disk,int A,int B,int c){
        if(disk==0){
            return;
        }

        towerOfHanhoi(disk-1,A,c,B);
        System.out.println("Move disk "+disk+" from "+A+" to "+B);
        towerOfHanhoi(disk-1,c,B,A);
    }
    
}
