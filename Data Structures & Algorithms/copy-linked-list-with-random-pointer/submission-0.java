/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node temp1=head;
       Node dummy=new Node(101);
       Node temp2=dummy;
       HashMap<Node,Node> map=new HashMap<>();

       while(temp1!=null){
          Node node=new Node(temp1.val);
          temp2.next=node;
          temp2=temp2.next; 
          map.put(temp1,node);
          temp1=temp1.next;
       }

       temp1=head;
       temp2=dummy.next;

       while(temp1!=null){
         Node random1=temp1.random;
         if(random1!=null){
            Node random2=map.get(random1);
            temp2.random=random2;
         }
         temp1=temp1.next;
         temp2=temp2.next;
       }

       Node newHead=dummy.next;

       return newHead;

    }
}
