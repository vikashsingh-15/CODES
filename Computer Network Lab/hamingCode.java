import java.util.*;
public class hamingCode {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        encode();
        // decode();
    }
    static void encode(){
        System.out.println("Enter the message to be encoded");
        String message=sc.nextLine();
        int redBits=0;
        while(Math.pow(2,redBits)<message.length()+redBits+1){
            redBits++;
        }
        int totalBits=message.length()+redBits;
        int arr[] = new int[totalBits];
        int k=0;
        
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-0-1 || i==arr.length-1 -1||i==arr.length-3-1 ||i==arr.length-7-1
             || i==arr.length-15-1 || i==arr.length-31-1 || i==arr.length-63-1){
                arr[i]=-1;
            }else{
            arr[i]=message.charAt(k)-'0';
            k++;
            }
        }

        // for(int i=arr.length-1,p=0;i>=0;i--){
       
        //     if(p==0 || p==1||p==3 ||p==7
        //      || p==15 || p==31 || p==63){
        //         arr[i]=-1;
        //     }else{
        //     arr[i]=message.charAt(message.length()-1-k)-'0';
        //     k++;
        //     }
        //     p++;
        // }


        
       





      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }  
    }

    
}
