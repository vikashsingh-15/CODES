// package JAVA.CODECHEF.CodeChefLong;

// import java.lang.*;
import java.util.*;
// import java.util.SortedMap.*;
// import java.util.Map.Entry;
// import java.util.Map;
// import java.util.HashMap.*;
// import java.util.TreeMap.*;
// import java.util.Map.Entry.*;
// import java.util.Map.*;

// import static java.util.Comparator.*;
// import static java.util.Comparator.reverseOrder;
// import static java.util.stream.Collectors.*;

class Map 
{
       public static void main(String[] args) 

     {

        Scanner sc = new Scanner(System.in);

        // HashMap <Integer, Integer> LinkeddHashMap=new LinkedHashMap<Integer, Integer>();    

        //  TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        //  TreeMap<String, Integer> treeMap = new TreeMap<>();


            // Map<Integer, Integer> HashhMap = new LinkedHashMap<Integer, Integer>();
                        
                                // treeMap.put(1, 2000);
                                // treeMap.put(2, 3000);
                                // treeMap.put(3, 4000);
                                // treeMap.put(4, 7000);
                                // treeMap.put(5, 7000);
                                // treeMap.put(6, 7000);



                                // LinkeddHashMap.put(1, 2000);
                                // LinkeddHashMap.put(3, 4000);
                                // LinkeddHashMap.put(4, 7000);
                                // LinkeddHashMap.put(5, 7000);
                                // LinkeddHashMap.put(2, 3000);
                                // LinkeddHashMap.put(6, 7000);

                                
                                // treeMap.put("1", 2000);
                                // treeMap.put("2", 3000);
                                // treeMap.put("3", 4000);
                                // treeMap.put("4", 5000);
                                // treeMap.put("5", 6000);
                                // treeMap.put("6", 7000);




            // System.out.println("MAP " + LinkeddHashMap);
            // System.out.println("MAP " + treeMap);
        //    System.out.println("MAP" + HashhMap);
        


        // System.out.println("Enter key tham value");

                    //   for(int i=0; i<4;i++)
                    //     {
                    //         Integer t=sc.nextInt();
                    //         Integer val=sc.nextInt();

                    //          // linkeddHashMap.put(t,val);
                    //         treeMap.put(t,val);
                    //         // HashhMap.put(t,val);

                    //      }
                                                            
        
                                


               
// ---------------------------------------------------------------------------------------------------------------------------------

// Conversion Of MAPS Starts

            // Map To Array
                        // Object[] objectArray = treeMap.entrySet().toArray();
                        // for (int i = 0; i < objectArray.length; i++)
                        // {
                        //     System.out.println(objectArray[i]);
                        // }




          // get the keys of the `HashMap` returned as an array
                    // Integer[] key = treeMap.keySet().toArray(new Integer[0]);
                    // System.out.println(Arrays.toString(key));
        
                    // for (int i = 0; i < key.length; i++)
                    //     {
                    //         System.out.println(key[i]);
                    //     }


          // get the keys of the `HashMap` returned as an array
                    // Integer[] values = treeMap.values().toArray(new Integer[0]);
                    // System.out.println(Arrays.toString(values));
        
                    // for (int i = 0; i < values.length; i++)
                    //     {
                    //         System.out.println(values[i]);
                    //     }

        


// Conversion Ends





// ----------------------------------------------------------------------------------------------------------------------------------

 // // Removing the first Key Start

               //        int k=treeMap.firstKey();
              //        System.out.println("Last Key is "+ treeMap.firstKey());
              //        System.out.println("Value is: "+treeMap.get(k) );
             //        treeMap.remove(k);
            //       System.out.println("New Tree Map " + treeMap);

// //   Removing the first Key Ends




// ------------------------------------------------------------------------------------------------------------------------------------



     //  // Printing Top n Elements of a Map Start
                                            
                //                            List<Entry<Integer, Integer>> top3 = LinkeddHashMap.entrySet().stream()
                //                            .sorted(comparing(Entry::getKey))
                //                            .limit(3)
                //                            .collect(toList());
                                    
                //                             System.out.println(top3);
                                            


                //     // or Using For Loop

                //                         // for(int i = 0; i <3;i++)
                //                         // {
                //                         //     int k=treeMap.lastKey();
                //                         //     System.out.println(treeMap.get(k));
                //                         //     treeMap.remove(k);

                //                         // }
                                    
                    
    //  // Printing Top n Elements of a Map End


// ------------------------------------------------------------------------------------------------------------------------------------
                //        System.out.println("");
                //       SortedMap<Integer, Integer> maphead = new TreeMap<>();
                //                      maphead = treeMap.tailMap(4);

                // // Getting the map head
                // System.out.println("The headmap is: " + maphead);

                                    // HeadMap End







// ------------------------------------------------------------------------------------------------------------------------------------

                // // Sorting By Keys
    //way1

            //    TreeMap<Integer, Integer> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
                
            //     reverseSortedMap.putAll(LinkeddHashMap);
                        
            //     System.out.println("Reverse Sorted Map   : " + reverseSortedMap);







    //way 2

                                            // LinkedHashMap<Integer,Integer> sorted2 = LinkeddHashMap
                                            // .entrySet().stream()
                                            // .sorted(Entry.comparingByKey(Comparator.reverseOrder()))
                                            // .collect(LinkedHashMap::new,
                                            //         (col, e) -> col.put(e.getKey(), e.getValue()),
                                            //         HashMap::putAll);

                                            // System.out.println("Sorted Map   : " + sorted2);



    //way3
                             
                                    // LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
                                    //         LinkeddHashMap.entrySet()
                                    //         .stream()
                                    //         .sorted(Entry.comparingByKey(Comparator.reverseOrder())) 
                                    //         .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
                        
                                    //           System.out.println("Sorted Map   : " + reverseSortedMap);



//way4                     
                                      

                                    //     Set <Entry <Integer , Integer>> entrySet = LinkeddHashMap.entrySet();
                                    //     List <Entry <Integer , Integer>>list = new ArrayList<>(entrySet);


                                    //     //   Collections.sort(list,(o1, o2) -> o2.getKey().compareTo(o1.getKey()));
                                
                                


                                    //  Collections.sort(list,new Comparator<Entry<Integer, Integer>>() {
                                    //      @Override
                                    //      public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                                    //          return o2.getKey().compareTo(o1.getKey());
                                    //      }
                                    //  });
                                
                                    //              System.out.println(list);
                                            
                                            
                                     //Iterating over array List
                                                //  for(int i=0;i<list.size(); i++)
                                                //  {
                                                //      System.out.println(list.get(i));
                                                //  }

                // // Sorting by Keys Ends


  // -------------------------------------------------------------------------------------------------------------------------------


 //    Sorting By Value

                //for LinkeddHashMap

                //way1
                                //   System.out.println("LinkedHashMpat="+LinkeddHashMap);
                                //             LinkedHashMap<Integer,Integer> sorted2 = LinkeddHashMap
                                //             .entrySet().stream()
                                //             .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                                //             .collect(LinkedHashMap::new,
                                //                     (col, e) -> col.put(e.getKey(), e.getValue()),
                                //                     HashMap::putAll);

                                //             System.out.println("Sorted Map   : " + sorted2);

                //way2
                             
                                    // LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
                                    //         LinkeddHashMap.entrySet()
                                    //         .stream()
                                    //         .sorted(Entry.comparingByValue(Comparator.reverseOrder())) 
                                    //         .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
                        
                                    //           System.out.println("Sorted Map   : " + reverseSortedMap);
              


                        
                //For treeMap

                //way1

                    //    System.out.println("Map="+treeMap);
                    //       LinkedHashMap<Integer,Integer> sorted2 = treeMap
                    //             .entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                    //             .collect(LinkedHashMap::new,
                    //                     (col, e) -> col.put(e.getKey(), e.getValue()),
                    //                     HashMap::putAll);

                    //             System.out.println("Sorted Map   : " + sorted2);



                //way2
                                    // LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
                
                                    // treeMap.entrySet()
                                    //         .stream()
                                    //         .sorted(Entry.comparingByValue(Comparator.reverseOrder())) 
                                    //         .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
                        
                                    //           System.out.println("Sorted Map   : " + reverseSortedMap);



                //way3                       
                                      

                                        // Set <Entry <Integer , Integer>> entrySet = treeMap.entrySet();
                                        // List <Entry <Integer , Integer>>list = new ArrayList<>(entrySet);


                                        //   Collections.sort(list,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));
                                
                                


                                    //  Collections.sort(list,new Comparator<Entry<Integer, Integer>>() {
                                    //      @Override
                                    //      public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                                    //          return o2.getKey().compareTo(o1.getKey());
                                    //      }
                                    //  });
                                
                                                //  System.out.println(list);
                                            
                                            
                                     //Iterating over array List
                                                //  for(int i=0;i<list.size(); i++)
                                                //  {
                                                //      System.out.println(list.get(i));
                                                //  }
                                


// Sort By Values Ascending order


//  way1

                                //   System.out.println("LinkedHashMpat="+LinkeddHashMap);
                                //             LinkedHashMap<Integer,Integer> sorted2 = LinkeddHashMap
                                //             .entrySet().stream()
                                //             .sorted(Entry.comparingByValue(Comparator.naturalOrder()))
                                //             .collect(LinkedHashMap::new,
                                //                     (col, e) -> col.put(e.getKey(), e.getValue()),
                                //                     HashMap::putAll);

                                //             System.out.println("Sorted Map   : " + sorted2);

//way2

                                    // LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
                
                                    // LinkeddHashMap.entrySet()
                                    //         .stream()
                                    //         .sorted(Entry.comparingByValue()) 
                                    //         .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
                        
                                    //           System.out.println("Sorted Map   : " + reverseSortedMap);



  //way3                       
                                      

                                        // Set <Entry <Integer , Integer>> entrySet = LinkeddHashMap.entrySet();
                                        // List <Entry <Integer , Integer>>list = new ArrayList<>(entrySet);


                                        //   Collections.sort(list,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));
                                
                                


                                    //  Collections.sort(list,new Comparator<Entry<Integer, Integer>>() {
                                    //      @Override
                                    //      public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                                    //          return o1.getValue().compareTo(o2.getValue());
                                    //      }
                                    //  });
                                
                                    //              System.out.println(list);
                                            
                                            
                                     //Iterating over array List
                                                //  for(int i=0;i<list.size(); i++)
                                                //  {
                                                //      System.out.println(list.get(i));
                                                //  }



                // Sorting By Value End

                        




 // --------------------------------------------------------------------------------------------------------------------------------




    //Printing Map Start

                    //way 1

                            // treeMap.forEach((k, v) -> System.out.println(k+"="+v));
                                    // Lambada Conversion to print map


                                                // linkeddHashMap.forEach(new BiConsumer<Integer, Integer>() {
                                                //     @Override
                                                //     public void accept(Integer k, Integer v) {
                                                //         System.out.println(k+"="+v);
                                                //     }
                                                // });

                                     // Lambada Conversion to print map Ends


                    //way 2
                                // for (Integer key: treeMap.keySet()){  
                                //     System.out.println(key+ " = " + treeMap.get(key));
                                // } 


                    //way 3
                                // treeMap.entrySet().forEach(entry->{
                                //     System.out.println(entry.getKey() + " = " + entry.getValue());  
                                // });
                       
                    //way 4

                                // System.out.println(Arrays.asList(treeMap));

                    //Way 5
                                //  System.out.println(Collections.singletonList(treeMap));

                  //way 6

                                // for(Integer keys:treeMap.keySet())
                                // System.out.println(keys);

                                // for(Integer valuess:treeMap.values())
                                // System.out.println(valuess);

                //way 7
                                // System.out.println("size = " + treeMap.size());;
                                //    for(int i = 0; i <6;i++)
                                //         {
                                //             int k=treeMap.lastKey();
                                //             System.out.println(treeMap.get(k));
                                //             treeMap.remove(k);

                                //         }

                //way 8

                                 // System.out.println(Arrays.toString(treeMap.entrySet().toArray()));

                //way 9

                // treeMap.entrySet().forEach(System.out::println);
                                



                                //  treeMap.putAll(hm);
                                // System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);

                                //  HashhMap.putAll(hm);
                                // System.out.println("LinkedHashMap to HashMap) " + HashhMap);

                //way10

                            //  set=LinkeddHashMap.entrySet();//Converting to Set so that we can traverse  
                            // Iterator itr=set.iterator();  
                            // while(itr.hasNext()){  
                            //     //Converting to Map.Entry so that we can get key and value separately  
                            //     Entry entry=(Entry)itr.next();  
                            //     System.out.println(entry.getKey()+" "+entry.getValue());  

     //Printing Map Ends





                sc.close();
  }
}
