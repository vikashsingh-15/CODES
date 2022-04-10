public class linkedListImplement {
    class Node{
        int data=0;
        Node next=0;
    }

    class LinkedList{
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
        // if(head==null){
        //     Node temp=new Node();
        //     temp.data=val;
        //     temp.next=null;
        //     head=temp;
        //     tail=temp;
        //     size++;
        // }

        else{
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            size++;
        }

    }


    public static void display(){
        if (head==null){
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println(" ");
    }


    public static void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.printf("%d is removed from the list\n",head.data);
            head=head.next;
        }
    }

    public static void removeLast(){
            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }else{
                NOode temp=new Node();
                temp=head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;
                }
                tail=temp;
                tail.next=null;
                size--;
            }
        }
    
        public static int getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                System.out.printf("%d is the first element of the list\n",head.data);
            }
            return head.data;
        }

        public static int getLast(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                System.out.printf("%d is the first element of the list\n",tail.data);
            }
            return tail.data;
        }

        public static int getAtIndex(int idx){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            if(idx>=size){
                System.out.println("Invalid index");
                return -1;
            }
            else{
                Node temp=new Node();
                temp=head;                   //Node temp=head;
                for(int i=0;i<idx;i++){
                  temp=temp.next;
                }
            }
            return temp.data;
        }


        public static void addAtIdx(int val,int idx){
            if(idx>size){
                System.out.println("Invalid index");
            }
            else if(idx==0){
              addFirst(val);
            }
            else if(idx==size){
                addLast(val);
            }
            else{
                Node temp=new Node();
                temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                Node newNode=new Node();
                newNode.data=val;
                newNode.next=temp.next;
                temp.next=newNode;
                size++;

            }
        }






    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
          System.out.println(temp.data);
        }
        System.out.println(list.size);
    
        if (list.size > 0) {
          System.out.println(list.tail.data);
        } 
      }
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
    
        String str = br.readLine();
        while(str.equals("quit") == false){
          if(str.startsWith("addLast")){
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          } 
          str = br.readLine();
        }
    
        testList(list);
      }
    
}
