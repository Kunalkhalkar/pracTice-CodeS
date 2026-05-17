/*
reverse a linked list.
*/
import java.util.*;
import java.io.*;

public class ReverseLinkedList{
	public static void main(String...x) throws Exception{
		
		revLinkedList(head);
	}
	
	public static ListNode revlist(ListNode head){
		if (head == null || head.next == null) return head;
		
		ListNode prev = null, front, temp = head;
		
		while (temp != null){  // further steps are run until the temp reaches to the null
			front = temp.next; //assigning front to the current's next
			temp.next = prev; // rotating the next to the previous.
			prev = temp;  // previous assigned to the current
			temp = front; // temp move forward
		}
		return prev; //returning previous beacause last time when temp is null then prev points to the last node;
	}
}

public class LinkedList{
	LinkedList head = null;
		private class node{
			private
			node(){}
			head = new node();
		}
}