package main;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedStack<T> {
	private int N;
	private Node<T> first;
	
	private class Node<T>{
		T item;
		Node<T> next;
		public Node(T item) {
			this.item=item;
		}
	}
	
	public LinkedStack() {
		first=null;
		N=0;
	}
	
	public void push(T item) {
		if(!(item instanceof String || item instanceof Integer)) {
			throw new IllegalArgumentException("Invalid Type");
		}
		Node<T> oldfirst = first;
        first = new Node<T>(item);
        N++;
        first.next = oldfirst;	
	}
	
	/**
     * Removes and returns the item most recently added to this Stack.
     */
    public T pop() throws EmptyStackException{
        /* Removes the first item from the stack and decrements N*/
    		if(first==null) {
    			throw new EmptyStackException();
    		}
    		Node<T> tempFirst = first;
    		first = first.next;
    		N--;
    		return tempFirst.item;
    }
    /** 
     * @return the number of items in the Stack
     */
    public int size() {
        return N;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Integer Stack
			LinkedStack<Integer> stack1 = new LinkedStack<Integer>();
			stack1.push(24);
			stack1.push(25);
			stack1.push(26);
			System.out.println(stack1.size());
			System.out.println(stack1.pop());
			System.out.println(stack1.pop());
			System.out.println(stack1.pop());
			stack1.push(27);
			System.out.println(stack1.pop());
			System.out.println(stack1.size());
						
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
