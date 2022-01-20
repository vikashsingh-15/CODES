import java.io.*;
import java.util.*;
// CUSTOM INPUT
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1 

public class traversal {
    public static class Node {
        int data; // for storing the data
        LinkedList<Node> children = new LinkedList<>(); // for storing the child nodes

    }

    public static void PrePost(Node node) {

        // Euler is on the left to its path of recursion ie PRE ARA = First time meet
        System.out.println("PRE ORDER=" + node.data);
        for (Node child : node.children) {
            // EDGE PRE IS INSIDE LOOP Before function call
            System.out.println("EDGE PRE = " + node.data + "--" + child.data);
            PrePost(child);
            // EDGE PRE IS INSIDE LOOP after function call
            System.out.println("EDGE POST = " + node.data + "--" + child.data);
        }
        // Euler is on the right to its path of recursion ie POST AREA = meet while
        // leaving the node
        System.out.println("POST ORDER=" + node.data);
    }

    public static void LevelWise(Node node) {// remove print add algo
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (queue.size() > 0) {
            node = queue.remove();
            System.out.println(node.data);

            for (Node child : node.children) {
                queue.add(child);
            }
        }
        System.out.println(".");
    }


    public static void levelOrderLineWise(Node node) {
        Queue<Node> parentQueue = new ArrayDeque<>();
        Queue<Node> childQueue = new ArrayDeque<>();
        parentQueue.add(node);
        while (parentQueue.size() > 0) {// remove print add algo
            node = parentQueue.remove();
            System.out.print(node.data+" ");
            for (Node child : node.children) {
                childQueue.add(child);
            }
            if (parentQueue.size() == 0) {
                parentQueue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    public static void zigZag(Node node) {
        Stack<Node> parentStack = new Stack<>();
        Stack<Node> childStack = new Stack<>();
        parentStack.push(node);
        int level = 0;
        while (parentStack.size() > 0) {
            node = parentStack.pop();
            System.out.print(node.data+" ");
            if (level % 2 == 0) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node t = node.children.get(i);
                    childStack.push(t);
                }
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node t = node.children.get(i);
                    childStack.push(t);
                }
            }
            if (parentStack.size() == 0) {
                parentStack = childStack;
                childStack = new Stack<>();
                level++;
                System.out.println("");
            }

        }

    }

    // -------------------------------------------------------------------------------------------------------------
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
            } else {
                st.pop();
            }
        }
        return root;
    }

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
        // PrePost(root);
        // LevelWise(root);
        levelOrderLineWise(root);
        zigZag(root);

    }

}
