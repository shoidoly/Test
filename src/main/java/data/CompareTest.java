package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Order 
	//implements Comparable<Order> 
	{
	private int id;
	private int orderCnt;

	public Order(int id, int orderCnt) {
		this.id = id;
		this.orderCnt = orderCnt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}

	public int getOrderCnt() {
		return this.orderCnt;
	}

	public int compareTo(Order order) {
		return order.orderCnt - this.orderCnt;
	}

}

public class CompareTest {
	public static void main(String[] args){
		Order order1 = new Order(1, 5);
		Order order2 = new Order(2, 10);
		Order order3 = new Order(3, 7);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		
//		Collections.sort(orderList);
//
//		for (Order order : orderList){
//			System.out.println("id : " + order.getId() + ", oderCount : " + order.getOrderCnt());
//		}
	}
}