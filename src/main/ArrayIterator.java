package main;

import java.util.*;

// Implement an Iterator class that iterates over every second element in a array 

public class ArrayIterator<T> implements Iterable<T>{
 
  private ArrayList<T> list = new ArrayList<T>();
  public ArrayIterator(ArrayList<T> list){
	if(list==null || list.isEmpty()) {
		throw new IllegalArgumentException("List is empty or null");
	}
    this.list=list;
  }
  
  public Iterator<T> iterator(){
    return new InnerIterator<T>();
  }
  
  private class InnerIterator<T> implements Iterator<T>{
    int i=0;
    @Override
    public boolean hasNext(){
      if(i>list.size()-1){
        return false;
      }
      return true;
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public T next(){
      if(!hasNext()) {
    	  	throw new NoSuchElementException("No more elements in the list");
      }
      T ans = (T)list.get(i);
      i+=2;
      return ans;
    }
  }
  
  
  public static void main(String[] args){
	  
    ArrayIterator<Integer> list2 = new ArrayIterator<Integer>(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,14,15)));
    ArrayIterator<String> list1=new ArrayIterator<String>(new ArrayList<String>(Arrays.asList("cat","dog","horse","snake","zebra","lion")));
    Iterator<String> it = list1.iterator();
    try {
    		while(it.hasNext()){
    	      System.out.println(it.next());
    	    }
    	    Iterator<Integer> it2 = list2.iterator();
    	    while(it2.hasNext()){
    	      System.out.println(it2.next());
    	    }
    	    System.out.println(it2.next());
    }
    catch(Exception e) {
    		System.out.println("Exception: "+ e.getMessage());
    }
    
  }
}

