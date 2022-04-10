package JAVA.CODES.CODES.DataStructure.HASHMAP;

/*Highest Frequency Character
Easy  Prev   Next
1. You are given a string str.
2. You are required to find the character with maximum frequency.
Input Format
A string str
Output Format
The character with highest frequency */

import java.io.*;
import java.util.*;

public class MaxFrequenctyChar {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if(map.containsKey(c)){
                int ov=map.get(c);
                int nv=ov+1;
                map.put(c,nv);
            }else{
                map.put(c,1);
            }
        }
        
        char mfc=str.charAt(0);
        for(Character key:map.keySet()){
            if(map.get(key)>map.get(mfc)){
                mfc=key;
            }
        }
        System.out.println(mfc);
        
    }

}