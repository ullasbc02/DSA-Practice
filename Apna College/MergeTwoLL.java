
//Definition for singly-linked list.
public class MergeTwoLL {
   int val;
     MergeTwoLL next;
     MergeTwoLL() {}
     MergeTwoLL(int val) { this.val = val; }
     MergeTwoLL(int val, MergeTwoLL next) { this.val = val; this.next = next; }
}
 

// EXPLANATION

// Maintain a head and a tail pointer on the merged linked list.

// Then choose the head of the merged linked list by comparing the first node of both linked lists.

// For all subsequent nodes in both lists, you choose the smaller current node and link it to the tail of the merged list, and moving the current pointer of that list one step forward.

// You keep doing this while there are some remaining elements in both the lists.

// If there are still some elements in only one of the lists, you link this remaining list to the tail of the merged list.

// Initially, the merged linked list is NULL.

// Compare the value of the first two nodes and make the node with the smaller value the head node of the merged linked list.

// Since it’s the first and only node in the merged list, it will also be the tail.

// Then move head1 one step forward.

    
class Solution {
    public MergeTwoLL mergeTwoLists(MergeTwoLL list1, MergeTwoLL list2) {
        MergeTwoLL head = new MergeTwoLL(0);
        MergeTwoLL handler = head;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                handler.next=list1;
                list1 = list1.next;
            }else{
                handler.next=list2;
                list2 = list2.next;
            }
            handler = handler.next;
        }
        if(list1!=null){
            handler.next=list1;
        }else if(list2!=null){
            handler.next=list2;
        }
        return head.next;
    }
}
