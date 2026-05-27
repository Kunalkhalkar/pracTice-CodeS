import java.util.*;
import java.io.*;
public class LinkedList22{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Linkedlist ll = new Linkedlist();
		String str;
		while(true){
			System.out.println("Enter the data in Linked List");
			str = br.readLine();
			
			if((str.equalsIgnoreCase("stop"))) break;
			ll.addLast(str);
		}
		
		ll.printList();
		
	}
}

class Linkedlist{
	Node head = null;
	
	//inner class Node
	private class Node{
		String data;
		Node next = null;
		
		Node(String data){
			this.data = data;
		}
	}
	//
	//methods of Linked List.
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	//add last
	public void addLast(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void removeLast(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		if(head.next == null){
			head = null;
			System.out.println("Data Removed from last");
			return;
		}
		
		Node temp = head, secondTemp = null;
		
		while(temp == null){
			secondTemp = temp;
			temp = temp.next;
		}
		
	}
	public void printList(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
