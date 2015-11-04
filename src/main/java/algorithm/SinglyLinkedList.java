package algorithm;

public class SinglyLinkedList {
	SinglyLinkedList next = null;
	int val;
	
	public SinglyLinkedList(){
		
	}
	
	public SinglyLinkedList(int val){
		this.val = val;
	}

	public void addTail(int a){
		SinglyLinkedList tail = new SinglyLinkedList(a);
		SinglyLinkedList n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = tail;
	}
	
	public SinglyLinkedList deleteNode(SinglyLinkedList head, int a) {
		SinglyLinkedList n = head;
		if (n.val == a) {
			return head.next;
		}

		while (n.next != null) {
			if (n.next.val == a) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}

		return head;
	}
	
	public int length(){
		SinglyLinkedList n = this;
		int length = 1;
		
		while (n.next != null){
			length += 1;
			n = n.next;
		}
		
		return length;
	}
}