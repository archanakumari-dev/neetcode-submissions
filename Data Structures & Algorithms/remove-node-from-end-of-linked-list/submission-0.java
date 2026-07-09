/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int frontN=count-n+1;
        if(frontN==1){
            head=head.next;
            return head;
        }

        temp=head;
        ListNode prev=null;
        int i=1;

        while(i+1!=frontN){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
        return head;


    }
}
