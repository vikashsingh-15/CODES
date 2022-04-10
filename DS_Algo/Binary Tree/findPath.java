import java.util.*;

public class findPath {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }




  public static boolean find(Node node, int data){
if(node==null){
    return false;
   }
    if(node.data == data){
        return true;
    }
    boolean filc=(find(node.left,data));
        if(filc){
            return true;
        }
        boolean firc=(find(node.right,data));
        if(firc){
            return true;
        }
   return false;
  }



  // static ArrayList<Integer>path=new ArrayList<>();
  // public static boolean pathToNode(Node node,int data){
  //   if(node==null){
  //       return false;
  //   }
  //       if(node.data == data){
  //           path.add(node.data);
  //           return true;
  //       }  
  //       boolean filc=(find(node.left,data));
  //           if(filc){
  //               path.add(node.data);
  //               return true;
  //           }
        
  //           boolean firc=(find(node.right,data));
  //           if(firc){
  //               path.add(node.data);
  //               return true;
  //           }
  //      return false;
  // }

  public static ArrayList< Integer> nodeToRootPath(Node node, int data) {
    if (node == null) {
      return new ArrayList< >();
    }

    if (node.data == data) {
      ArrayList< Integer> list = new ArrayList< >();
      list.add(node.data);
      return list;
    }

    ArrayList< Integer> llist = nodeToRootPath(node.left, data);
    if (llist.size() > 0) {
      llist.add(node.data);
      return llist;
    }

    ArrayList< Integer> rlist = nodeToRootPath(node.right, data);
    if (rlist.size() > 0) {
      rlist.add(node.data);
      return rlist;
    }
    return new ArrayList< >();
  }





  public static void main(String[] args) {
    Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null };
    // Integer array not of int type because we are storing null value too;
    // if we dont want to store null then we can take int data type oof Array.
    Node root = construct(arr);
    display(root);
    // display2(root);
// System.out.println(find(root,77));
ArrayList <Integer> path=nodeToRootPath(root,87);
System.out.println(path);
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);

    Stack<Pair> st = new Stack<>();
    Pair root_pair = new Pair(root, 1);

    st.push(root_pair);
    int idx = 1;

    while (st.size() > 0) {
      Pair top = st.peek();

      if (top.state == 1) {
        // waiting for left child
        top.state++;
        if (arr[idx] != null) {
          Node lc = new Node(arr[idx], null, null);
          top.node.left = lc;

          Pair lcp = new Pair(lc, 1);
          st.push(lcp);
        }

        else {
          top.node.left = null;
        }

        idx++;
      }

      else if (top.state == 2) {
        // waiting for right child
        top.state++;
        if (arr[idx] != null) {
          Node rc = new Node(arr[idx], null, null);
          top.node.right = rc;

          Pair rcp = new Pair(rc, 1);
          st.push(rcp);
        }
        idx++;
      }

      else if (top.state == 3) {
        st.pop();
      }
    }
    return root;

  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = " <- " + node.data + " -> ";
    String left = (node.left == null) ? "." : "" + node.left.data;
    String right = (node.right == null) ? "." : "" + node.right.data;

    str = left + str + right;

    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static void display2(Node node) {
    if (node == null) {
      return;
    }
    if (node.left != null) {
      System.out.print(node.left.data + " ");
    } else {
      System.out.print(" . ");

    }
    System.out.print(node.data + " ");
    if (node.right != null) {
      System.out.print(node.right.data + "");
    } else {
      System.out.print(" . ");
    }
    System.out.println("");
    display2(node.left);
    display2(node.right);
  }

}