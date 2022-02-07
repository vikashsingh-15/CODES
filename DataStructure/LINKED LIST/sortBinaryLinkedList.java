public class sortBinaryLinkedList {

    public static class Node {
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int data;

    }

    public static void addLast(int val){
        if(size==0){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            head=temp=tail;
            size++;
        }else{
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            tail.next=temp;
            tail=temp;
            size++;
        }
    }

    public static void addFirst(int val){
        if(size==0){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            head=temp=tail;
            size++;
        }
        else{
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            size++;
        }

    }


    public static void sort(LinkedList list){
        LinkedList temp=new LinkedList();
        Node current=list.head;
        while(current!=null){
            addLast(current.data);
            current=current.next;
        }
        current=temp.head;
        while(current!=null){
            addFirst(current.data);
            current=current.next;
        }
        
    
    
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList ll = new LinkedList();
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);
    }
    
}
