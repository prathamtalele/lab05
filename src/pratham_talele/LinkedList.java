package pratham_talele;
import java.util.Scanner;
public class LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head;

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int choice = 0;
	    while (choice != 8) {
	        System.out.println("*** MENU ***");
	        System.out.println("1.Insert node in the Beginning ");
	        System.out.println("2.Insert node at the last");
	        System.out.println("3.Insert node at a  particular position");
	        System.out.println("4.Delete node at a particular position");
	        System.out.println("5.Length of Linked List");
	        System.out.println("6.Reverse the Linked List");
	        System.out.println("7.Display the Linked List");
	        System.out.println("8.EXIT");
	        System.out.print("Enter your choice : ");
	        choice = sc.nextInt();
	        switch (choice) {
	        case 1:
	            System.out.print("Enter the data to insert: ");
	            int data1 = sc.nextInt();
	            insertAtPosition(data1);
	            break;
	        case 2:
	            System.out.print("Enter the data to insert: ");
	            int data2 = sc.nextInt();
	            insertAtPosition(data2);
	            break;
	        case 3:
	            System.out.print("Enter the position to insert: ");
	            int pos = sc.nextInt();
	            System.out.print("Enter the data to insert: ");
	            int data3 = sc.nextInt();
	            insertAtPosition(pos);
	            break;
	        case 4:
	            System.out.print("Enter the position to delete: ");
	            int pos1 = sc.nextInt();
	            deleteAtPosition(pos1);
	            break;
	        case 5:
	            int length = getLength();
	            System.out.println("Length of Linked List: " + length);
	            break;
	        case 6:
	            reverseList();
	            break;
	        case 7:
	            displayList();
	            break;
	        case 8:
	            System.out.println("Exiting the program.");
	            break;
	        default:
	            System.out.println("Invalid choice. Please try again.");
	    }

	    sc.close();
	    }
	}

	// Insert a node at a particular position in the list
	public static void insertAtPosition(int pos) {
	    if (pos < 1) {
	        System.out.println("Invalid position. Please try again.");
	        return;
	    }
	    Node newNode = new Node(pos);
	    if (pos == 1) {
	        newNode.next = head;
	        head = newNode;
	    } else {
	        Node prev = head;
	        for (int i = 1; i < pos - 1 && prev != null; i++) {
	            prev = prev.next;
	        }
	        if (prev == null) {
	            System.out.println("Invalid position. Please try again.");
	            return;
	        }
	        newNode.next = prev.next;
	        prev.next = newNode;
	    }
	}
	// to delete NODE
	public static void deleteAtPosition(int pos) {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }
	    if (pos < 1) {
	        System.out.println("Invalid position. Please try again.");
	        return;
	    }
	    if (pos == 1) {
	        head = head.next;
	    } else {
	        Node prev = head;
	        for (int i = 1; i < pos - 1 && prev != null; i++) {
	            prev = prev.next;
	        }
	        if (prev == null || prev.next == null) {
	            System.out.println("Invalid position. Please try again.");
	            return;
	        }
	        prev.next = prev.next.next;
	    }
	    System.out.println("Node at position " + pos + " deleted.");
	}


	
	public static int getLength() {
	    int length = 0;
	    Node current = head;
	    while (current != null) {
	        length++;
	        current = current.next;
	    }
	    return length;
	    
	}
// revers the node

	public static void reverseList() {
	    Node current = head;
	    Node prev = null;

	    while (current != null) {
	        Node next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }

	    head = prev;
	    System.out.println("Linked List reversed successfully.");
	}
   //display the linked list
	
	public static void displayList() {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }
	    Node current = head;
	    System.out.print("List: ");
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	    System.out.println();
	}


}