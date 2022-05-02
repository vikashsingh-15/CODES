import java.util.*;
public class reverseList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<n;i++){
            ListNode newNode=new ListNode(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
        ListNode result=reverseList(head);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }

      public ListNode reverseNode (ListNode head){
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next.next;
        }

        Node temp=head;
        head=tail;
        tail=temp;
    }
    
}
