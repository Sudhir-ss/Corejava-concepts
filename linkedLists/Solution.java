package linkedLists;

import java.util.Scanner;

public class Solution {

		Node head;
		void add(int data) {
		Node toAdd = new Node(data);
		
		if(head ==null) {
			head = toAdd;
			return;
		 }
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		
		}
		
		void print() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data +" ");
				temp = temp.next;
		      }
		}
			
		
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		Solution myll = new Solution();
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		myll.add(data);
		myll.print();
		
	}
	
}
