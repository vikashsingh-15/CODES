import java.util.*;
public class pro1 {

//     For Division 1: 1900≤rating
// For Division 2: 1600≤rating≤1899
// For Division 3: 1400≤rating≤1599
// For Division 4:  rating≤1399

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>=0){
            int n=sc.nextInt();
    
            if(n<=1399){
                System.out.println("Division 1");
            }
            else if(n<=1599){
                System.out.println("Division 2");
            }
            else if(n<=1899){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
    
            t--;
        }
        
    }
   
    
}
