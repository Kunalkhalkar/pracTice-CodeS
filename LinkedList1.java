/*
Linked List all operations 
*/
import java.util.*;
public class LinkedList1{
	public static void main(String...x) throws Exception{
		LinkedList12 ll = new LinkedList12();
		ll.addFirst("good");
		ll.addFirst("is");
		ll.addLast("person");
		ll.addFirst("kunal");
		ll.printList();
		ll.removeFirst();
		ll.printList();
		ll.removeFirst();
		ll.printList();
		ll.addFirst("kunal");
		ll.addLast("is");
		ll.addLast("good");
		ll.addLast("Programmer");
		
	}
}

public class LinkedList12{
	Node head = null;
		private class Node{
			private String data;
			private Node next;
			
			public Node(String data){
				this.data = data;
				this.next = null;
			}
		}
		
	public void addFirst(String data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		
		node.next = head;
		head = node;
	}
	
	public void addLast(String data){
		Node node = new Node(data); // node 	
		if(head == null){
			head = node; 
			// assigning new node to head
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}
	
	//remove last
	public void removeLast(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		if(head.next == null){
			head = null;
			return;
		}
		
		Node temp = head;
		Node secondTemp = null;
		
		while(temp.next != null){
			secondTemp = temp;
			temp = temp.next;
		}
		secondTemp.next = null;
	}
	
	//remove first
	public void removeFirst(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}
		if(head.next == null){
			head = null;
			return;
		}
		
		head = head.next;
	}
	
	// printing list
	public void printList(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data +" -> ");
			temp= temp.next;
		}
		
		System.out.print("null");
		System.out.println();
	}
}
