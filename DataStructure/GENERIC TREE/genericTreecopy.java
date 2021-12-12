import java.io.*;
import java.util.*;

// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class genericTree1
{
  public static class Node
   {
    int data; // for storing the data
    LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes
   
    }
 
  
  







  // -----------------------------------------DISPLAY--------------------------------------------------------
  // public static void display(Node node) 
  // {
  //   String str = node.data + "=";
  //   for (Node child : node.children) 
  //   {
  //     str = str + child.data + " , ";
  //   }
  //   str = str + " . ";
  //   System.out.println(str);

  //   for (Node child : node.children) 
  //   {
  //     display(child);
  //   }

  // }



  public static void display2(Node node) 
  {

    System.out.println(node.data);

    for (Node child : node.children) 
    {
     display2(child);
    }

  }




  
  // public static void display2(Node node) 
  // {
  //   for (Node child : node.children) 
  //   {
  //     System.out.println(child.data);
  //   }

  // }

  // --------------------------------------Construct Node----------------------------------------




  public static Node construct (int [] arr) //create node,check root,add child,push, else - pop
  {
    
    Node root = null; // unique node for a tree
    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {

      if(arr[i] != -1) 
      {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() == 0) 
        {
          root = t;
        }
        else {
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

// -------------------------------size--------------------------------------------------------



// public static int size(Node node)
// {
//   int s=0;
//   for(Node child:node.children)
//   {
//     int cs=size(child);
//     s=s+cs;
//   }
//   s=s+1;
//   // System.out.println(s);
//   return s;
// }

// --------------------------------MAXIMUM-------------------------------------------


// public static int maximum(Node node)
// {
//     int max=Integer.MIN_VALUE;
//     for(Node child : node.children)
//     {
//       int cm = maximum(child);

//       max=Math.max(cm, max);

//     }

//     max=Math.max(node.data, max);
//     return max;
// }

// -------------------------------------------------------TRANSVERSAL-----------------------------------------------------------


//way 1
// public static void transverse(Node node)
// {
//   System.out.println("Node pre " + node.data);
//   for(Node child : node.children)
//   {
// System.out.println("Edge pre"+ node.data + " -- " + child.data);
// transverse(child);
// System.out.println("Edge post"+ node.data + " -- " + child.data);

//   }
//   System.out.println("Node post " + node.data);

// }


//way2
// public static void levelOrder(Node node)
// {
//   Queue <Node> q=new ArrayDeque<>();

//   q.add(node);
   
//   while(q.size()> 0)
//   {
//     node = q.remove();
//     System.out.println(node.data +" ");

//     for (Node child : node.children)
//     {
//       q.add(child);
//     }
//   }
//   System.out.println(".");
// }


//way 3

// public static void levelOrderLinwWise(Node node)
// {
//   Queue <Node> q=new ArrayDeque<>();
//   Queue <Node> cq=new ArrayDeque<>();


//   q.add(node);
   
//   while(q.size()> 0)
//   {
//     node = q.remove();
//     System.out.print(node.data +" ");

//     for (Node child : node.children)
//     {
//       cq.add(child);
//     }
//    if (q.size()==0)
//    {
//     q = cq;
//     cq = new ArrayDeque< >();
//     System.out.println();
//    }
//   }

// }


//way 4


// public static void levelOrderLinwWiseZigZag(Node node)
// {
 
//   Stack <Node> st=new Stack<>();
//   Stack <Node> cst=new Stack<>();



//   st.push(node);
//   int level=0;
   
//   while(st.size()> 0)
//   {
//     node = st.pop();
//     System.out.print(node.data +" ");

  
      
//       if(level %2==0)
//       {
//         for (int i=0; i < node.children.size(); i++)
//         {
//           Node child=node.children.get(i);
//           cst.push(child);
//         }
//       }
//       if(level %2!=0)
//       {
//         for (int i=node.children.size()-1; i >=0 ; i--)
//         {
//           Node child=node.children.get(i);

//           cst.push(child);
//         }
      
//     } 
//    if (st.size()==0)
//    {
//     st = cst;
//     cst = new Stack< >();
//     System.out.println();
//     level++;
//    }
//   }
// }











// ----------------------------------------------------------METHODS-------------------------------------------------------------


// public static void preMethods(Node node)
// {

// Node k= node.children.getLast();
// System.out.println("Get Last = "+ k.data );


// }




// --------------------------------------------genreic Tree------------------------------------------------

// public static void mirror (Node node)
// {

//  for(Node child : node.children)
//  {
//   mirror(child);
//  }
// Collections.reverse(node.children);

// }




public static void removalOfLeaf (Node node)
{


  for(int i=node.children.size()-1; i>=0; i--)
  {
    Node child = node.children.get(i);
   if(child.children.size()==0)
   {
         node.children.remove(i);
   }
  }

 for (Node child : node.children)
  {
    removalOfLeaf(child);
  }
 }



























// ------------------------------------------------------------------------------------------------------

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }
    Node root = construct(arr);
    // display(root);
    
    // int sz = size(root);
    // System.out.println("size=" + sz);
    
    // int z = maximum(root);
    // System.out.println("maximum=" + z);
    
    // transverse(root);
    // levelOrder(root);
    // levelOrder(root);
    // levelOrderLinwWise(root);
    // levelOrderLinwWiseZigZag(root);
    // preMethods(root);
    // mirror(root);
    removalOfLeaf(root);







    display2(root);
    


  }
}


















































































































// public static void main(String[] args)
//  {
//   int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
//   Node root = null; // unique node for a tree
//   Stack<Node> st = new Stack<>();
//   for (int i = 0; i < arr.length; i++) {

//     if (arr[i] == -1) 
      //     {
      //       st.pop();
      //     }

//     else {
//       Node t = new Node();
//       t.data = arr[i];

//       if (st.size() > 0) {
//         st.peek().children.add(t);
//       } 
//       else 
//       {
//         root = t;
//       }
//       st.push(t);
//     }
//   }

//   display(root);
// }




