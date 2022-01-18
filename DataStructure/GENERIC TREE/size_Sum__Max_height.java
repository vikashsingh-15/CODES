import java.io.*;
import java.util.*;
// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class size_Sum__Max_height {
    public static class Node {
        int data; // for storing the data
        LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes

    }

    public static int size(Node node){

        int size = 0; // for storing the size of the tree
            for(Node child : node.children){
                int childSize=size(child);
                size = size+childSize;
            }
            size=size+1; 
            return size; 
        }


    public static int size2(Node node){
        int size=0;
        if(node==null){
            return 0;
        }
        else{
            for(Node child:node.children){
                size=size+size2(child);
            }
            size=size+1;
            return size;  
        }
     
    }

            public static int sum(Node node){
                int sum=0;
                for(Node child:node.chiildren){
                    sum=sum+sum(child);
                }
                sum=sum+node.data;
                return sum;
            }

            public static int sum2(Node node){
                int sum=0;
                if(node==null){
                    return 0;
                }
                else{
                    for(Node child:node.children){
                        sum=sum+sum2(child);
                    }
                    sum=sum+node.data;
                    return sum;
                }
            }




            public static int maxNode(Node node){

                int max=Integer.MIN_VALUE;

                for(Node child:node.children){
                    int childMax=maxNode(child);
                     max=Math.max(childMax,max);
                }

                max=Math.max(max,node.data);
                return max;
            }

            public static int maxNode2(Node node){
                int max=Integer.MIN_VALUE;
                if(node==null){
                    return max;
                }
                else{
                    for(Node child:node.children){
                        int childMax=maxNode2(child);
                        max=Math.max(childMax,max);
                    }
                    max=Math.max(max,node.data);
                    return max;
                }
            }


            public static int height(Node node){
                int height=-1;// in term of edge -1, In term of node 0
                for(Node child:node.children){
                    int ChildHeight=height(child);
                    height=Math.max(maxChildHeight,height);
                }
                height=height+1;
                return height;
            }


            public static int height2(Node node){
                int height=-1;
                if(node==null){
                    return height;
                }
                else{
                    for(Node child:node.children){
                        int ChildHeight=height2(child);
                        height=Math.max(maxChildHeight,height);
                    }
                    height=height+1;
                    return height;
                }
            }

          





      
    











    // ------------------------------------------------------------------------------------------------------

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());

        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1,
-1, 90, -1, -1, 40, 100, -1, -1, -1 };

        // int[] arr = new int[n];
        // String[] values = br.readLine().split(" ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = Integer.parseInt(values[i]);
        // }
        
        Node root = construct(arr);
        display(root);
        // display2(root);
        // display3(root);

    }





    
    public static Node construct(int[] arr) // create node,check root,add child,push, else - pop
    {

        Node root = null; // unique node for a tree
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != -1) {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() == 0) {
                    root = t;
                } else {
                    st.peek().children.add(t);
                }

                st.push(t);
            }

            else {
                st.pop();
            }

        }

        return root;
    }

    // -----------------------------------------DISPLAY--------------------------------------------------------
    public static void display(Node node)
    {
    String str = node.data + "=";
    for (Node child : node.children)
    {
    str = str + child.data + " , ";
    }
    str = str + " . ";
    System.out.println(str);


    for (Node child : node.children)
    {
    display(child);
    }

    }

    // public static void display2(Node node) {

    //     System.out.println(node.data);

    //     for (Node child : node.children) {
    //         display2(child);
    //     }

    // }

    // public static void display3(Node node) //will display child of a given node only
    // {
    // for (Node child : node.children)
    // {
    // System.out.println(child.data);
    // }

    // }

}

