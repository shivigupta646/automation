package CollectionPractice;
import java.awt.Desktop.Action;
import java.util.LinkedList;
public class LinkedListPrac {
	Node head;
	private int size;
	LinkedListPrac(){
		this.size=0;
		
	}
class Node {
	String data;
	Node next;
	
	Node(String data){
		this.data = data;
		this.next = null;
		size++;
	}
}
 
     //add ---first , last
    public void addfirst(String data) {
    	Node newNode = new Node(data);
    	
		if(head == null) {
    		head = newNode;
    		return;
    		
    	}
		newNode.next = head;
		head = newNode;
    }
    
    public void addlast(String data) {
    	Node newNode = new Node(data);
   
		if(head == null) {
    		head = newNode;
    		return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
			}
		currentNode.next = newNode;
    }
    //print
    public void printList() {
    	if(head == null) {
    		System.out.println("List is empty");
    		return;
    	}
    	Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
			}
		System.out.println("NULL");
    
    }
    //delete first
    public void deletefirst() {
    	if(head == null) {
    		System.out.println("the list is empty");
    		return;
    		}
    	size--;
    head = head.next;
    }
    
    //delete last
    public void deletelast() {
    	if(head == null) {
    		System.out.println("the list is empty");
    		return;
    	}
    	size--;
    	if(head.next == null) {
    		head = null;
    		return;
    		
    	}
    	Node secondlast = head;
    	Node lastNode = head.next;
    	while(lastNode.next !=null) {
    		lastNode = lastNode.next;
    		secondlast = secondlast.next;
    		
    	}
    	secondlast.next = null;
    }
    public int getSize() {
    	return size;
    }
	public static void main(String[] args) {
		LinkedListPrac list = new LinkedListPrac();
		 list.addfirst("a");
		 list.addfirst("is");
	   
		 list.printList();
		 
		 list.addlast("list");
		 list.printList();
		 
		 list.addfirst("this");
		 list.printList();
		 
		 list.deletefirst();
		 list.printList();
		 
		 list.deletelast();
		 list.printList();
		 
	 System.out.println(list.getSize());
		list.addfirst("this"); 
		System.out.println(list.getSize()); 
	}

}
