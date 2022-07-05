import java.util.*;

public class implement {
  public static class Node {
    int data;
    Node left;
    Node right;
   
    Node(int data,Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }


  public static void main(String[]args) throws Exception{
    // Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
    int []arr = {12,25,37,50,62,75,87};

//Integer array not of int type because we are storing null value too;
//if we dont want to store null then we can take int data type oof Array.

    Node root = construct(arr,0,arr.length-1);
    display(root);
  }


  public static Node construct(int[]arr,int low,int high) {


    if(low>high){
        return null;
    }

      int mid =(low+high)/2;
      int data =arr[mid];
      Node leftChild = construct(arr,low,mid-1);
      Node rightChild=construct(arr,mid+1,high);

      Node node=new Node(data,leftChild,rightChild);
        return node;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }
    String str = " <- " + node.data + " -> ";
    String left = (node.left == null) ? "." :  "" + node.left.data;
    String right = (node.right == null) ? "." : "" + node.right.data;

    str = left + str + right;

    System.out.println(str);

    display(node.left);
    display(node.right);
  }

 
}