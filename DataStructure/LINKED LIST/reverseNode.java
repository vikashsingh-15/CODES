public class reverseNode {

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
