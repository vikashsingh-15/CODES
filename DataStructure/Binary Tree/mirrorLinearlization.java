import java.util.*;

public class mirrorLinearlization {
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

  public static void mirror(Node node) {
    if (node == null) {
      return;
    }

    mirror(node.left);
    mirror(node.right);

    Node temp = node.left;
    node.left = node.right;
    node.right = temp;
  }

  

  public static void main(String[] args) {
    Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null };
    // Integer array not of int type because we are storing null value too;
    // if we dont want to store null then we can take int data type oof Array.
    Node root = construct(arr);
    // display(root);

    // System.out.println("After Mirror");
    // mirror(root);
    display2(root);
    // linearlization(root);
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
      } else if (top.state == 3) {
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