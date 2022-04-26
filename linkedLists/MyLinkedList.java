package linkedLists;

public class MyLinkedList<E> {
	
//	Node head;
//	
//	void add(int data) {
//		Node toAdd = new Node(data);
//		if(head == null) {
//			head = toAdd;
//			return;
//		}
//		
//		Node temp = head;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next= toAdd;
//	}
//	
//	void print() {
//		Node temp = head;
//		while(temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//	        }
//	}
//	static class Node{
//		int data; 
//		Node next;
//		
//		public Node(int data) {
//			this.data = data;
//			next = null;
//		}
//	}

	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
		}
	}
	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;	
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp= temp.next;
	    }
	}
	
	public boolean isEmpty() {
		return head == null; 
		
	}
	
	public E getLast() throws  Exception{
		
        Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("cannot remove last element from the empty linked list");
		}
		
		while(temp.next != null) {
			temp=  temp.next;	
			
		}
		return temp.data;
	}

	public E removeLast() throws Exception {
		
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("cannot remove last element from the empty linked list");
		}
		
		if(temp.next == null) {
			
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp=  temp.next;	
			
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
}
