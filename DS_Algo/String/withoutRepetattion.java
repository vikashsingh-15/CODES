import java.util.*;
import java.lang.*;

public class withoutRepetattion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // StringwithNORepeatingCharacter(str);
        StringwithNORepeatingCharacter2(str);

    }

    static void StringwithNORepeatingCharacter(String str) {
        int l = str.length();
        int apoint = 0;
        int bpoint = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        while (bpoint < l) {
            if (!set.contains(str.charAt(bpoint))) {
                set.add(str.charAt(bpoint));
                bpoint++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(apoint));
                apoint++;
            }
        }
        System.out.println(max);
        System.out.println(str.substring(apoint, bpoint));

    }


    static void StringwithNORepeatingCharacter2(String str){

        int apoint=0;
        int bpoint=0;
        int max=0;
       HashMap<Character,Integer> map = new HashMap<>();
       while(bpoint < str.length()) {
           char c = str.charAt(bpoint);
           bpoint++;
           map.put(c,map.getOrDefault(c,0) + 1);
           if(map.get(c) == 1){
                max = Math.max(map.size(), max);
            }
                if(map.get(c)==2){
                    while(str.charAt(apoint)!=c){
                        map.remove(str.charAt(apoint));
                        apoint++;
                    }
                    map.put(str.charAt(apoint),map.get(str.charAt(apoint))-1);
                    apoint++;
                }
       }
       System.out.println(max);
       System.out.println(str.substring(apoint,bpoint));






































    //    while(true) {
    //        boolean flag1 = false;
    //        boolean flag2 = false;
    //        while(bpoint<str.length()-1) {
    //            flag1=true;
    //            bpoint++;
    //            map.put(str.charAt(bpoint), map.getOrDefault(str.charAt(bpoint), 0) + 1);
    //         if(map.get(str.charAt(bpoint))==2) {
    //            break;
    //         }else{

    //             max=Math.max(map.size(),max);
    //             // int length=bpoint-apoint+1;
    //             // if(length>max){
    //             //     max=length;
    //             // }
    //         }

    //         while(apoint<bpoint){
    //             flag2=true;
    //             if(map.get(str.charAt(apoint))==1){
    //                 map.remove(str.charAt(apoint));
    //                 apoint++;
    //             }else{
    //                 map.put(str.charAt(apoint), map.get(str.charAt(apoint)-1));
    //                 break;
    //             }
    //         }

          
    //         }

    //         if(flag1==false&&flag2==false){
    //             break;

    //        }
           
    //    }

    //    System.out.println(max);
        
    
    }

}


