// import java.lang.*;
import java.util.*;
import java.util.SortedMap.*;

import java.util.Map.Entry;

// import java.util.Map;
import java.util.HashMap.*;
import java.util.TreeMap.*;
import java.util.Map.Entry.*;
import java.util.Map.*;

import static java.util.Comparator.*;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.*;

class Map2
{
  
  @SuppressWarnings("unchecked")//used for treemap2=(treeMap) treeMap.clone() as this code causesuncgecked error and we have to suppress it
       public static void main(String[] args) 

     {

        Scanner sc = new Scanner(System.in);

        // HashMap <Integer, Integer> LinkeddHashMap=new LinkedHashMap<Integer, Integer>();    

         TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        //  TreeMap<String, Integer> treeMap = new TreeMap<>();


            // Map<Integer, Integer> HashhMap = new LinkedHashMap<Integer, Integer>();
                        
                                treeMap.put(1, 2000);
                                treeMap.put(4, 7000);
                                treeMap.put(2, 30000);
                                treeMap.put(5, 70000);
                                // treeMap.put(3, 4000);
                                treeMap.put(6, 7000);



                                // LinkeddHashMap.put(1, 6000);
                                // LinkeddHashMap.put(3, 4000);
                                // LinkeddHashMap.put(4, 80000);
                                // LinkeddHashMap.put(5, 7000);
                                // LinkeddHashMap.put(2, 30000);
                                // LinkeddHashMap.put(6, 7000);

                                
                                // treeMap.put("1", 2000);
                                // treeMap.put("2", 3000);
                                // treeMap.put("3", 4000);
                                // treeMap.put("4", 5000);
                                // treeMap.put("5", 6000);
                                // treeMap.put("6", 7000);




            // System.out.println("MAP " + LinkeddHashMap);
            System.out.println("MAP " + treeMap);
        //    System.out.println("MAP" + HashhMap);
        

// ===================================================================================================================================


// Functions In Map


        //  int k=treeMap.firstKey();
        //  System.out.println("First Key is "+ treeMap.firstKey());
        //  System.out.println("First key Value is: "+treeMap.get(k) );
        //  treeMap.remove(k);
        //  System.out.println("Last Key is "+ treeMap.lastKey());
        //  System.out.println("Last Key is "+ treeMap.get(treeMap.lastKey()));


        // Note : use  @SuppressWarnings("unchecked")
        // before the main method to supress : Map2.java uses unchecked or unsafe operations.
        //  Recompile with -Xlint:unchecked for details.

                         // TreeMap<Integer, Integer> treeMapclone = new TreeMap<Integer, Integer>();
                        // treeMapclone=(TreeMap)treeMap.clone();
                        //  System.out.println("Cloned map: "+treeMapclone);
     

        //  System.out.println("Value for key 6 exists: "+ treeMap.containsKey(6));
        //  System.out.println("'Value' exists: "+ treeMap.containsValue(7000));


        // NavigableSet nset = treeMap.descendingKeySet();
        // System.out.println("Navigable set values: "+nset);

        // NavigableMap nmap = treeMap.descendingMap();
        // System.out.println("Navigable map values: "+nmap);
                  
        // Set mapset = treeMap.entrySet();
        // System.out.println("Entry set values: "+mapset);

        // System.out.println("First entry is: "+ treeMap.firstEntry());
        // System.out.println("Last entry is: "+ treeMap.lastEntry());

//get key when we have value
        // for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
        //   if (entry.getValue().equals(7000)) {
        //       System.out.println(entry.getKey());
        //   }}


        // System.out.println("Value is: "+ treeMap.floorEntry(3));
        // System.out.println("Value is: "+ treeMap.floorKey(3));
  


        // System.out.println("Value is: "+ treeMap.higherEntry(6));
        // System.out.println("Value is: "+ treeMap.higherKey(5));

        











// ==================================================================================================================================
                sc.close();
  }
}
