package algorithm;

public class Stack {
	
	Node top;
	
	public void push(Object item){
		Node node = new Node(item);
		node.next = top;
		top = node;
	}
	
	public Object pop(){
		if (top != null){
			Object item = top.item;
			top = top.next;
			return item;
		}
		return null;
	}
	
	Object peek(){
		return top.item;
	}

}
