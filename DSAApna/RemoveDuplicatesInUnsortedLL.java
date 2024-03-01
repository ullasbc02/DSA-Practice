package DSAApna;

/* Last node cannot be deleted with this program */

// Java program to implement
// a Singly Linked List

import java.util.HashSet;

public class RemoveDuplicatesInUnsortedLL {

	Node head; // head of list
	// Linked list Node.
	// Node is a static nested class
	// so main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static RemoveDuplicatesInUnsortedLL insert(RemoveDuplicatesInUnsortedLL list,
									int data)
	{
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(RemoveDuplicatesInUnsortedLL list)
	{
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	//Method to delete the Head node
	public static void RemoveDuplicates(Node head){
		
		HashSet<Integer> hash = new HashSet<>();
        Node curr=head, prev=null;
        while(curr!=null) {
            if(hash.contains(curr.data)){
                prev.next=curr.next;
            }else{
                hash.add(curr.data);
                prev=curr;
            }
            curr = curr.next;
        }
	}

	// **************MAIN METHOD**************

	// method to create a Singly linked list with n nodes
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		RemoveDuplicatesInUnsortedLL list = new RemoveDuplicatesInUnsortedLL();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 6);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 8);
		list = insert(list, 3);
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 14);

		// Print the LinkedList
		printList(list);
	
		RemoveDuplicates(list.head);
		printList(list);
	}
}
