import java.io.*;
import java.util.*;
// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class mirrorLinearlization {
    public static class Node {
        int data; // for storing the data
        LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes

    }

public static void mirror(Node node){
    if(node==null)
        return;
    for(Node child:node.children){
        mirror(child);
    }
    Collections.reverse(node.children);
}

public static void mirror2 (Node node){//this dont work properly i guess
    Stack<Node> parentStack = new Stack<>();
    Stack<Node> childStack = new Stack<>();
    parentStack.push(node);
    // int level = 0;
    while (parentStack.size() > 0) {
        node = parentStack.pop();
        System.out.print(node.data + " ");
            for (int i = node.children.size() - 1; i >= 0; i--) {
                Node t = node.children.get(i);
                childStack.push(t);   
        }
        if (parentStack.size() == 0) {
            parentStack = childStack;
            childStack = new Stack<>();
            // level++;
            System.out.println("");
        }
    }
}

public static void linearlization(Node node) {

    if(node == null) {
      return;
    }
    for(Node child : node.children) {
      linearlization(child);
    }
    while(node.children.size()>0){
        Node last=node.children.remove(node.children.size()-1);
        // Node last=node.children.removeLast();
        Node secondlast = node.children.get(node.children.size()-1);
        Node secondLastTail=getTail(secondlast);
        secondLastTail.children.add(last);
    }
  }

  public static Node getTail(Node node) {//part of linearlization
    // if(node.children.size()==0) {
    //   return node;
    // }
    // return getTail(node.children.get(node.children.size()-1));

    // or
    while(node.children.size()==1){
        node=node.children.get(0);
    }
    return node;
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

        // int[] arr = new int[n];
        // String[] values = br.readLine().split(" ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = Integer.parseInt(values[i]);
        // }
        
        Node root = construct(arr);
        // display2(root);
        // display3(root);
        mirror(root);
        display(root);
        System.out.println("Mirror 2");
        mirror2(root);
    }

}

