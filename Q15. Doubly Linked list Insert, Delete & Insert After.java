import java.util.*;
public class LinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		Node prev;
		Node(int d) {
			data = d;
			next = null;
			prev = null;
		}
	}
	public static LinkedList insertBeg(LinkedList list, int data) {
		Node nNode = new Node(data);
		nNode.next = list.head;
		nNode.prev = null;
		if (list.head != null) {
			list.head.prev = nNode;
		}
		list.head = nNode;
		return list;
	}
	public static LinkedList insertEnd(LinkedList list, int data) {
		Node nNode = new Node(data);
		if (list.head == null) {
			nNode.prev = null;
			list.head = nNode;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			nNode.prev = temp;
			temp.next = nNode;
		}
		return list;
	}
	public static LinkedList deleteBeg(LinkedList list) {
		if (list.head != null) {
			list.head = list.head.next;
		} else {
			System.out.println("List is Empty");
		}
		return list;
	}
	public static LinkedList deleteEnd(LinkedList list) {
		if (list.head == null) {
			System.out.println("List is Empty");
		} else {
			Node temp = list.head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
		return list;
	}
	public static void insertAfter(Node pNode, int data) {
		if (pNode == null) {
			System.out.print("Not Possible");
		}
		Node nNode = new Node(data);
		nNode.next = pNode.next;
		pNode.next = nNode;
		nNode.prev = pNode;
		if (nNode.next != null) {
			nNode.next.prev = nNode;
		}
	}
	public static void print(LinkedList list) {
		Node current = list.head;
		System.out.printf("LikedList is:");
		while (current != null) {
			System.out.printf("%d  ", current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insertBeg(list, 2);
		list = insertBeg(list, 3);
		list = insertBeg(list, 4);
		list = insertEnd(list, 5);
		print(list);
	}
}
