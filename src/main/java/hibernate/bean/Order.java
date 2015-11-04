package hibernate.bean;

import java.util.Date;
import java.util.List;

public class Order {
	
	private int id;
	private Date date;
	private List<OrderProductMap> orderList;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the orderList
	 */
	public List<OrderProductMap> getOrderList() {
		return orderList;
	}
	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(List<OrderProductMap> orderList) {
		this.orderList = orderList;
	}
	
	
	
}
