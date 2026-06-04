/*
new Linked list
*/

import java.util.*;
public class NewLinkedList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String data");
		String str = sc.next();
	}
}

class LinkedList{
	private Node head = null;
	
	class Node{
		private String data;
		Node next = null;
		
		public Node(String data){
			this.data = data;
		}
	}
	
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
	//new Node
		newNode.next = head;
		head = newNode;
	} 
	//add at last
	public void addLast(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		
		Node temp = head;
	//loops
		
		while(temp.next == null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void deleteFirst(){
		if(head == null){
			System.out.println("The List Is Empty");
			return;
		}
		if(head.next == null){
			head = null;
			System.out.println("The Element is Deleted");
			return;
		}
		
		head = head.next;
	}
}