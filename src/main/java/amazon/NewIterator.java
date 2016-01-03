package amazon;

import java.util.Iterator;

public class NewIterator {
	
	private Iterator<Integer> itr;
	private Resolver resolver;
	
	public NewIterator(Iterator<Integer> itr, Resolver resolver){
		this.itr = itr;
		this.resolver = resolver; 
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasNext(){
		// TO-DO
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer next(){
		// TO-DO
		return null;
	}

}
