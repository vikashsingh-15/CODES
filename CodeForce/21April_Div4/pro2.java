import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        while(t>=0){
            int n=sc.nextInt();
           int arr[]=new int[n];
              for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                }
                

                if(n<3){
                    System.out.println("-1");
                }
                else{
                    HashMap<Integer, Integer> map = new HashMap<>();
                    for(int i=0;i<n;i++){
                        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                    }

                    for(Integer key:map.keySet()){
                        if(map.get(key)>=3){
                            System.out.println(key);
                        }
                    }
                }

            t--;
        }

    }
    
}
