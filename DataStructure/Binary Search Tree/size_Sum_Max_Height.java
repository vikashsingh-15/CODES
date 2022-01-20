import java.util.*;

public class size_Sum_Max_Height {
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

  public static int Size(Node node) {
    // size
    if (node == null) {
      return 0;
    }

    int leftSize = Size(node.left);
    int rightSize = Size(node.right);

    int Totalsize = leftSize + rightSize + 1;

    return Totalsize;
  }

  public static int sum(Node node) {
    // size
    if (node == null) {
      return 0;
    }

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);
    int totalSum = leftSum + rightSum + node.data;
    return totalSum;
  }

  public static int max(Node node) {
    if (node.right != null) {
      return max(node.right);
    } else {
      return node.data;
    }

  }

  public static int min(Node node) {
    if (node.left != null) {
      return max(node.left);
    } else {
      return node.data;
    }

  }

  public static boolean find(Node node, int data) {
    if (node == null) {
      return false;
    }
    if (node.data < data) {
      return find(node.right, data);

    } else if (node.data > data) {
      return find(node.left, data);
    } else {
      return true;
    }

  }


  public static int maxHeight(Node node) {
    if (node == null) {
      return -1; // -1 for edge aand 0 for nodes
    }
    int maxLeftHeight = maxHeight(node.left);
    int maxRightHeight = maxHeight(node.right);
    int MaxHeightTotal = Math.max(maxLeftHeight, maxRightHeight) + 1;
    return MaxHeightTotal;

  }




  public static Node construct(int[] arr, int low, int high) {

    if (low > high) {
      return null;
    }

    int mid = (low + high) / 2;
    int data = arr[mid];
    Node leftChild = construct(arr, low, mid - 1);
    Node rightChild = construct(arr, mid + 1, high);

    Node node = new Node(data, leftChild, rightChild);
    return node;
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

  public static void main(String[] args) throws Exception {
    // Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62,
    // null, 70, null, null, 87, null, null};
    int[] arr = { 12, 25, 37, 50, 62, 75, 87 };

    // Integer array not of int type because we are storing null value too;
    // if we dont want to store null then we can take int data type oof Array.

    Node root = construct(arr, 0, arr.length - 1);

    System.out.println(Size(root));
    System.out.println(sum(root));
    System.out.println(max(root));
    System.out.println(min(root));
    System.out.println(find(root, 62));
    System.out.println(maxHeight(root));


    display(root);

  }

}