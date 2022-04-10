import java.io.*;
import java.util.*;
// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class findPath {
    public static class Node {
        int data; // for storing the data
        LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes

    }

    
    public static boolean find(Node node, int x) {

        if (node.data == x) {
            // System.out.println("True");
            return true;
        }
        for (Node child : node.children) {
            boolean fi = find(child, x);
            if (fi) {// this if statement is required so that we can terminate the loop as soon as we
                     // get our data as true
                return true;
            }
        }

        return false;
    }



    public static ArrayList<Integer> nodeToRoot(Node node, int x) {
        if (node.data == x) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(node.data);
            return al;
        }
        for (Node child : node.children) {
            ArrayList<Integer> pathTillChild = nodeToRoot(child, x);

            if (pathTillChild.size() > 0) {// this if statement is required so that we can terminate the loop as soon as
                                           // we get our data as true
                pathTillChild.add(node.data);
                return pathTillChild;
            }
        }

        return new ArrayList<>();
    }



    public static int lowestCommonAncestor(Node node, int x, int y) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = nodeToRoot(node, x);// Uses= the concept of node to root function above written.
        list2 = nodeToRoot(node, y);

        // ArrayList<Integer> list1 = nodeToRoot(node, x);
        // ArrayList<Integer> list2 = nodeToRoot(node, y);

        int i = list1.size() - 1;// -1 because we dont need size , we need index of last item
        int j = list2.size() - 1;

        while (i >= 0 && j >= 0 && list1.get(i) == list2.get(j)) {
            i--;// as long as list 1 and list 2 element are same we are decresing the value
            j--;
        }
        i++;// we have to increase by 1 because 1st not match ke just pahele wala element ki
            // common hoga naa
        j++;

        return list1.get(i);
        // return list2.get(j);
    }


    public static int distanceBetweenNode(Node node, int x, int y) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = nodeToRoot(node, x);// Uses= the concept of node to root function above written.
        list2 = nodeToRoot(node, y);

        // ArrayList<Integer> list1 = nodeToRoot(node, x);
        // ArrayList<Integer> list2 = nodeToRoot(node, y);

        int i = list1.size() - 1;// -1 because we dont need size , we need index of last item
        int j = list2.size() - 1;

        while (i >= 0 && j >= 0 && list1.get(i) == list2.get(j)) {
            i--;// as long as list 1 and list 2 element are same we are decresing the value
            j--;
        }
        i++;// we have to increase by 1 because 1st not match ke just pahele wala element ki
            // common hoga naa
        j++;

        return (i + j);
        // return list2.get(j);
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
    public static void display(Node node) {
        String str = node.data + "=";
        for (Node child : node.children) {
            str = str + child.data + " , ";
        }
        str = str + " . ";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }

    }

    // public static void display2(Node node) {

    // System.out.println(node.data);

    // for (Node child : node.children) {
    // display2(child);
    // }

    // }

    // public static void display3(Node node) //will display child of a given node
    // only
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
        // arr[i] = Integer.parseInt(values[i]);
        // }

        Node root = construct(arr);

        // display(root);
        // display2(root);
        // display3(root);

        // System.out.print(find(root ,110));

        // ArrayList <Integer> al = nodeToRoot(root, 110);
        // System.out.println(al);

        // System.out.println(lowestCommonAncestor(root, 70, 110));
        // System.out.println(distanceBetweenNode(root, 70, 110));

    }

}
