package data;

import java.util.*;

class OrderComparator implements Comparator<Order> {

	public int compare(Order order1, Order order2) {
		return order2.getOrderCnt() - order1.getOrderCnt();
	}
}

public class ComparatorTest {
	public static void main(String[] args){
		Order order1 = new Order(1, 5);
		Order order2 = new Order(2, 10);
		Order order3 = new Order(3, 7);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		
		Collections.sort(orderList, new OrderComparator());

		for (Order order : orderList){
			System.out.println("id : " + order.getId() + ", oderCount : " + order.getOrderCnt());
		}
	}
}