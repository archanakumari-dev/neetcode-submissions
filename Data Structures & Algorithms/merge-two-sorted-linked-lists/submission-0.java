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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1==null) return list2;
       if(list2==null) return list1;

       ListNode dummy=new ListNode(101);
       ListNode temp=dummy;

       while(list1!=null && list2!=null){
         int val;
         if(list1.val>=list2.val){
            val=list2.val;
             list2=list2.next;
             
         }else{
            val=list1.val;
            list1=list1.next;
            
         }
         ListNode node=new ListNode(val);
         temp.next=node;
         temp=node;
       } 

       while(list1!=null){
         ListNode node=new ListNode(list1.val);
         temp.next=node;
         temp=node;
         list1=list1.next;
       }

       while(list2!=null){
         ListNode node=new ListNode(list2.val);
         temp.next=node;
         temp=node;
         list2=list2.next;
       }


       return dummy.next;
    }
}