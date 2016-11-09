package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.IllegalRemoveException;
import it.uniba.tutorial.NegativeNumberException;
import it.uniba.tutorial.Stack;

public class StackTest {
	Stack myStack;
	
	@Before
	public void setUp() throws Exception {
		myStack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addingTheFirstElementHasSizeOne() throws NegativeNumberException{
		myStack.push(3);
		assertEquals(1,myStack.size());
	}
	
	@Test(expected = NegativeNumberException.class)
	public void addNegativeNumberShouldRaiseException() throws NegativeNumberException{
		myStack.push(-1000);
	}
	
	@Test
	public void stackIsNotEmptyAfterAddingOneElement() throws NegativeNumberException{
		myStack.push(42);
		assertFalse(myStack.isEmpty());
	}
	
	@Test
	public void aJustCreatedStackIsEmpty(){
		assertTrue(myStack.isEmpty());
	}
	
	@Test
	public void popRemovesLastElement() throws NegativeNumberException, IllegalRemoveException{
		myStack.push(1);
		myStack.push(10);
		myStack.push(100);
		
		myStack.pop();
		
		assertEquals(2, myStack.size());
	}
	
	@Test (expected = IllegalRemoveException.class)
	public void cannotPopFromAnEmptyStack() throws IllegalRemoveException{
		myStack.pop();
	}
}
