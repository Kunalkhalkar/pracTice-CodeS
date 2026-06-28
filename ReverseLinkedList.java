/*
reverse a linked list.
*/
import java.util.*;
import java.io.*;

public class ReverseLinkedList{
	public static void main(String...x) throws Exception{
		LinkedList1 ll = new LinkedList1();
		ll.addFirst("kunal");
		ll.addFirst("hi,");
		ll.addLast("hello");
		ll.printList();
		ll.revList();
		ll.printList();
	}
	
	
}

public class LinkedList1{
	Node head = null;
		private class Node{ // inner class Node
			private String data;
			private Node next;
			
			Node(String data){ // constructor of node
				this.data = data;
				this.next = null;
			}
		}
	
	//Linked List Methods (addFirst())
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}	
	//addLast();
	public void addLast(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null){ // we traverse through the linked List
			temp = temp.next; //use temp to find last element
		}
		
		temp.next = newNode; // when reached to last then assigned newNode to the temp.next;
	}
	//removeFirst()
	
	public void removeFirst(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		if(head.next == null){
			head = null;
			return;
		}
		
		head = head.next; // deleteding first node
	}
	
	public void removeLast(){
		
		if(head == null){
			System.out.println("the List is empty");
			return;
		}
		
		Node lastTemp = null;
		Node temp = head;
		
		while(temp.next != null){
			lastTemp = temp;
			temp = temp.next;
		}
		lastTemp.next = null;
	}
	//reverse List
	public void revList(){
		if (head == null || head.next == null) return;
		
		Node prev = null, front, temp = head;
		
		while (temp != null){  // further steps are run until the temp reaches to the null
			front = temp.next; //assigning front to the current's next
			temp.next = prev; // rotating the next to the previous.
			prev = temp;  // previous assigned to the current
			temp = front; // temp move forward
		}
		head = prev;
		//return prev; //returning previous beacause last time when temp is null then prev points to the last node;
	}
	
	public void printList(){
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

		
		System.out.print("null");
		System.out.println();
	}

}
