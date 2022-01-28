import java.io.*;
import java.util.*;
// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class areSimilar {
    public static class Node {
        int data; // for storing the data
        LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes

    }

    public static boolean similar(Node node1, Node node2) {
// if((node==null && node2!=null) || (node1!=null && node2==null)){
//     return false;
// }

 if(node1.children.size()!=node2.children.size()){
     return false;
 }
 for(int i=0;i<node1.children.size();i++){
     Node c1=node1.children.get(i);
     Node c2=node2.children.get(i);
     if(similar(c1,c2)==false)
     {
        return false;
        }
 }
        return true;    
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

    // ------------------------------------------------------------------------------------------------------

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());

        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1,
-1, 90, -1, -1, 40, 100, -1, -1, -1 };
int[] arr2 = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 90, 110, -1, 120, -1,
    -1, 90, -1, -1, 77, 100, -1, -1, -1 };

        // int[] arr = new int[n];
        // String[] values = br.readLine().split(" ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = Integer.parseInt(values[i]);
        // }
        
        Node root = construct(arr);
        Node root2 = construct(arr);
        // display(root);
        // display2(root);
        // display3(root);
        System.out.println(similar(root,root2));

    }

}

