package com.one;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


enum ItemType {
	BOOK, VIDEO
}

abstract class Item {
	private int id;
	private String title;
	private Patron borrower; 
	private List<Patron> waitingList = new ArrayList<Patron>();
	
	public Item(int id, String title){
		this.id = id;
		this.title = title;
	}
	
	public int getId(){
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setBorrower(Patron borrower){
		this.borrower = borrower;
	}
	
	public Patron getBorrower(){
		return borrower;
	}
	
	public void addWaitingList(Patron patron){
		for (Patron waitingUser: waitingList){
			if (patron.getId() == waitingUser.getId()) {
				System.out.println("You are aleady on the waiting list.");
				return;
			}
		}
		waitingList.add(patron);
	}
	
	public Patron getFirstWaitingPatron(){
		if (waitingList.size() == 0) return null;
		Patron patron = waitingList.get(0);
		waitingList.remove(0);
		
		return patron;
	}
	
	public abstract ItemType getItemType();
	
}

class Book extends Item {
	public final ItemType itemType = ItemType.BOOK;
	
	public Book(int id,String title){
		super(id,title);
	}

	@Override
	public ItemType getItemType() {
		return itemType;
	}
	
}

class Video extends Item {
	public final ItemType itemType = ItemType.VIDEO;
	
	public Video(int id,String title){
		super(id, title);
	}

	@Override
	public ItemType getItemType() {
		return itemType;
	}
}

class Patron {
	private int id;
	private String name;
	private List<Item> borrowItems = new ArrayList<Item>();
	
	public Patron(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBorrowItemCnt(){
		return borrowItems.size();
	}

	public void addBorrowItem(Item item) {
		borrowItems.add(item);
	}

	public void removeBorrowItems(Item returnItem) {
		for (int i=0; i<borrowItems.size(); i++){
			Item borrowItem = borrowItems.get(i);
			if (borrowItem.getId() == returnItem.getId()) borrowItems.remove(i);
		}
	}
	
}

public class Library {
	
	private Map<Integer, Item> itemMap = new LinkedHashMap<Integer, Item>();
	private Map<Integer, Patron> patronMap = new LinkedHashMap<Integer, Patron>();
	 
	public void addPatron(Patron patron) {
		patronMap.put(patron.getId(), patron);
	}
	
	public Patron findPatronById(int id){
		return patronMap.get(id);
	}
	
	public void addItem(Item item) {
		itemMap.put(item.getId(), item);
	}
	
	public Item findItemById(int id){
		return itemMap.get(id);
	}
	
	public Item findItemByTitle(String title, ItemType itemType){
		for (Map.Entry<Integer, Item> entry: itemMap.entrySet()){
			Item item = entry.getValue();
			if (title.equals(item.getTitle()) && itemType == item.getItemType()) return item;
		}
		return null;
	}
	
	public void checkOut(int patronId, Item borrowItem) {
		Patron patron = patronMap.get(patronId);
		if (patron == null){
			System.out.println("Unregistered user.");
			return;
		} 
		
		if (patron.getBorrowItemCnt() >= 3){
			System.out.println("You, "+patron.getName()+", cannot borrow more than 3 items.");
			return;
		}
		
		Item item = itemMap.get(borrowItem.getId());
		if (item.getBorrower() != null){
			System.out.println("This item, "+item.getTitle()+", has been already borrowed.");
			if (item.getBorrower().getId() == patronId){
				System.out.println("You, "+patron.getName()+", cannot be added to waiting list since you are borrowing the item.");
			} else {
				item.addWaitingList(findPatronById(patronId));
				System.out.println(patron.getName()+" has been added to waiting list on "+item.getTitle()+".");
			}
			
			return;
		}  
		
		item.setBorrower(patron);
		itemMap.put(item.getId(), item);
		patron.addBorrowItem(item);
		patronMap.put(patron.getId(), patron);
		System.out.println("Item, "+borrowItem.getTitle()+", has been borrowed succcessfully by "+patron.getName()+".");
	}
	
	public void returnItemById(int itemId) {
		Item item = findItemById(itemId);
		Patron borrower = item.getBorrower();
		borrower.removeBorrowItems(item);
		item.setBorrower(null);
		itemMap.put(item.getId(), item);
		
		System.out.println("Item, "+item.getTitle()+", has been returned succcessfully by "+borrower.getName()+".");
		
		Patron firstWaitingPatron = item.getFirstWaitingPatron();
		if (firstWaitingPatron != null){
			checkOut(firstWaitingPatron.getId(), findItemByTitle(item.getTitle()
					, item.getItemType()));
		}
		
				
	}
	
	public static void main(String[] args){
		
		Library library = new Library();
		library.addItem(new Book(1, "Book1"));
		library.addItem(new Book(2, "Book2"));
		library.addItem(new Book(3, "Book3"));
		library.addItem(new Book(4, "Book4"));
		library.addItem(new Book(5, "Book5"));
		library.addItem(new Video(6, "Video1"));
		library.addItem(new Video(7, "Video2"));
		library.addItem(new Video(8, "Video3"));
		library.addItem(new Video(9, "Video4"));
		library.addItem(new Video(10, "Video5"));
		
		Patron patron1 = new Patron(1, "patron1");
		Patron patron2 = new Patron(2, "patron2");
		Patron patron3 = new Patron(3, "patron3");
		
		library.addPatron(patron1);
		library.addPatron(patron2);
		library.addPatron(patron3);
		
		library.checkOut(patron1.getId(), library.findItemByTitle("Book1", ItemType.BOOK));
		library.checkOut(patron1.getId(), library.findItemByTitle("Book1", ItemType.BOOK));
		library.checkOut(patron2.getId(), library.findItemByTitle("Book1", ItemType.BOOK));
		library.checkOut(patron1.getId(), library.findItemByTitle("Book2", ItemType.BOOK));
		library.checkOut(patron1.getId(), library.findItemByTitle("Video3", ItemType.VIDEO));
		library.checkOut(patron1.getId(), library.findItemByTitle("Video4", ItemType.VIDEO));
		
		library.returnItemById(1);
		
		
	}

	

}
