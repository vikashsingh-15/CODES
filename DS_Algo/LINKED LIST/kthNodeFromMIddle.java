/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class kthNodeFromMIddle {
    public int solve(ListNode A, int B) {

        if(A==null || A.next==null){
            return -1;
        }

        ListNode temp=A;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
            temp=A;

        if((((l/2)+1)-B)<0){
            return -1;
        }     
        for(int i=1;i<(l/2+1)-B;i++){
            temp=temp.next;
            }
        return temp.val;
        }
    }
