import java.util.*;
class Main {
	public Node head = null;
	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public void insertBeg(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}
	public void insertEnd(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = temp;
		}
	}
	public void checkPalindrome() {
		Node temp = head;
		boolean check = true;
		Stack < Integer > stack = new Stack < Integer > ();
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		while (head != null) {
			int tData = stack.pop();
			if (head.data == tData) {
				check = true;
			} else {
				check = false;
				break;
			}
			head = head.next;
		}
		System.out.println("Is Palindrome : " + check);
	}
	public static void main(String[] args) {
		Main ob = new Main();
		ob.insertBeg(2);
		ob.insertBeg(23);
		ob.insertBeg(20);
		ob.insertBeg(23);
		ob.insertBeg(2);
		ob.display();
		ob.checkPalindrome();
	}
}
