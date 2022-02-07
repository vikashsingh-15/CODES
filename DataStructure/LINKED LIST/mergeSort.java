/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class mergeSort {
    public ListNode solve(ListNode A) {
        return sort(A);
    }




    public ListNode midNode(ListNode node){

        if(node==null || node.next==null) {return node;}//base case
        ListNode fast=node;
        ListNode slow=node;
        while(fast.next!=null &&  fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    } 

    public ListNode mergeTwoSortedList(ListNode list1,ListNode list2){
        if(list1==null || list2==null) return list1==null ? list2:list1 ;
        ListNode pointer1=list1;
        ListNode pointer2=list2;
        ListNode ans=new ListNode(-1);
        ListNode prev=ans;
        while(pointer1!=null &&  pointer2!=null){
            if(pointer1.val<=pointer2.val){
                prev.next=pointer1;
                pointer1=pointer1.next;
                prev=prev.next;
            }else{
                prev.next=pointer2;
                pointer2=pointer2.next;
                prev=prev.next;
            }
        }
        if(pointer1!=null){//whiile loop not req because wo list ko prev se jor denghr tba apna kaam ho ghayegha.
             prev.next=pointer1;
        }
         if(pointer2!=null){
             prev.next=pointer2;
        }                              //prev.next=pointer1!=null?pointer1:pointer2            
        return ans.next;

    }


    public ListNode sort(ListNode head){
        if(head==null || head.next==null){
            return head;  
        }
             ListNode mid=midNode(head);
            ListNode newHead=mid.next;
            mid.next=null;

            ListNode l1=sort(head);
            ListNode l2=sort(newHead);

            ListNode sortedList=mergeTwoSortedList(l1,l2);

        return sortedList;
    }

}
