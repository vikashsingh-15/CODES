import java.util.HashMap;
import java.util.Scanner;



public class maxmin{
    public static boolean check(String st){
        HashMap<Character,Integer> hp = new HashMap<>();
        int i = 0;
        while(i < st.length()){
            hp.put(st.charAt(i),hp.getOrDefault(st.charAt(i), 0) + 1);
            i += 1;
        }
        int freq = hp.get(st.charAt(0));
        for(Character key : hp.keySet()){
            if(hp.get(key) != freq) return false;
        }
        return true;
    }
    public static int findmax(int[] a){
        int stable = 0;
        int ustable = 0;
        for(Integer item : a){
            if(check(Integer.toString(item))){
                stable = stable + item;
            }
            else{
                ustable = ustable + item;
            }
        }
        return stable - ustable;
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Sc.nextInt();
        }
        int res = findmax(arr);
        System.out.println(res);
        Sc.close();
    }
}