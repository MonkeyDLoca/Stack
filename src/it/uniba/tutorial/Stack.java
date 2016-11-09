package it.uniba.tutorial;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> stack;
	
	public Stack(){
		this.stack = new ArrayList<>();
	}
	
	public void push(int x) throws NegativeNumberException{
		if(x<0)
			throw new NegativeNumberException();
		else
			this.stack.add(x);
	}
	public void pop() throws IllegalRemoveException{
		if (this.isEmpty()) throw new IllegalRemoveException();
		this.stack.remove(this.size()-1);
	}
	public int peek(){ return -1;}
	public int size(){ 
		return stack.size();
	}
	public boolean isEmpty() {
		return this.stack.size()==0;
	}
	

}
