import java.util.*;

public class LinkedList22{
	public static void main(String ...x){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data in Linked List");
		
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
}
