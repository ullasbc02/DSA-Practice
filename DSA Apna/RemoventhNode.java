
 //Definition for singly-linked list.
public class RemoventhNode {
    int val;
    RemoventhNode next;
    RemoventhNode() {}
    RemoventhNode(int val) { this.val = val; }
    RemoventhNode(int val, RemoventhNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    
    public RemoventhNode removeNthFromEnd(RemoventhNode head, int n) {
        RemoventhNode dummy = new RemoventhNode(0,head);
        
        RemoventhNode slow=dummy,fast=head;
        RemoventhNode temp = head;
        for(int i=0;i<n;i++){
            fast = temp;
            temp = temp.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}