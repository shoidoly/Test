package algorithm;

public class Node {
	
	Node next;
	Object item;
	
	public Node(Object item){
		this.item = item;
	}
	
	public void addToTail(Object item){
		Node node = new Node(item);
		Node head = this;
		while(head.next != null){
			head = head.next;
		}
		head.next = node;
	}

}
