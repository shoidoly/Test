package algorithm;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
	SinglyLinkedList linkedList;
	
	@Before
	public void before(){
		linkedList = new SinglyLinkedList(9);
	}
	
	@Test
	public void addTailTest(){
		linkedList.addTail(5);
		linkedList.addTail(4);
		linkedList.addTail(8);
		linkedList.addTail(10);
		
		System.out.println("length:"+linkedList.length());
		
		while (linkedList != null){
			System.out.println(linkedList.val);
			linkedList = linkedList.next;
		}
	}
	
	@Test
	public void deleteNodeTest(){
		
		linkedList.addTail(5);
		linkedList.addTail(4);
		linkedList.addTail(8);
		linkedList.addTail(10);
		
		SinglyLinkedList ll = linkedList.deleteNode(linkedList, 4);
		
		while (ll != null){
			System.out.println(ll.val);
			ll = ll.next;
		}
		
	}
}