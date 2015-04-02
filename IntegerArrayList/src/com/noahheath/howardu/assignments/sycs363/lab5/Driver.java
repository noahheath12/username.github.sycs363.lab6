package com.noahheath.howardu.assignments.sycs363.lab5;

import static org.junit.Assert.*;

import org.junit.*;

public class Driver {

	@Test
	/**
	 * Tests if the default size for the array is correct
	 */
	public void testIntegerArrayList() {
		IntegerArrayList myTest = new IntegerArrayList();
		assertEquals("Should return 20", 20, myTest.getSize());
	}

	@Test
	/**
	 * Tests if the array sizes match the given size parameter
	 */
	public void testIntegerArrayListInt() {
		IntegerArrayList testOne = new IntegerArrayList(30);
		IntegerArrayList testTwo = new IntegerArrayList(10);
		IntegerArrayList testThree = new IntegerArrayList(25);
		IntegerArrayList testFour = new IntegerArrayList(100);
		
		assertEquals("Should return 30", 30, testOne.getSize());
		assertEquals("Should return 10", 10, testTwo.getSize());
		assertEquals("Should return 25", 25, testThree.getSize());
		assertEquals("Should return 100", 100, testFour.getSize());
	}

	@Test
	/**
	 * Tests whether the value is added to the array and if correct value is returned. 
	 */
	public void testAddAndGetValue() {
		IntegerArrayList myTest = new IntegerArrayList();
		myTest.add(10);
		myTest.add(20);
		myTest.add(4);
		myTest.add(8, 25);
		myTest.add(10, 19);
		myTest.add(19, 39);
		assertEquals("Value should equal 10", 10, myTest.getValue(0));
		assertEquals("Value should equal 20", 20, myTest.getValue(1));
		assertEquals("Value should equal 4", 4, myTest.getValue(2));
		assertEquals("Value should equal 25", 25, myTest.getValue(8));
		assertEquals("Value should equal 19", 19, myTest.getValue(10));
		assertEquals("Value should equal 39", 39, myTest.getValue(19));
	}

	@Test
	/**
	 * Tests whether isEmpty returns the correct value. 
	 */
	public void testIsEmpty() {
		IntegerArrayList myTest = new IntegerArrayList();
		assertTrue("List should be empty", myTest.isEmpty());
		myTest.add(32);
		assertFalse("List should not be empty", myTest.isEmpty());
	}
	
	@Test
	/**
	 * Tests where isFull returns the correct value.
	 */
	public void testIsFull() {
		IntegerArrayList myTest = new IntegerArrayList();
		assertFalse("List should not be full", myTest.isFull());
		for(int i = 0; i < myTest.getSize(); i++) {
			myTest.add(22);
		}
		assertTrue("List should be full", myTest.isFull());
	}
	
	@Test
	/**
	 * Tests whether the index is correct
	 */
	public void testIndexOf()
	{
		IntegerArrayList myTest = new IntegerArrayList();
		myTest.add(10);
		myTest.add(13, 22);
		assertEquals("Index should equal 0", 0, myTest.indexOf(10));
		assertEquals("Index should equal 13", 13, myTest.indexOf(22));
	}

	@Test
	/**
	 * Tests where the value is removed from the array
	 */
	public void testRemove() {
		IntegerArrayList myTest = new IntegerArrayList();
		myTest.add(10);
		myTest.add(11);
		myTest.add(14);
		myTest.add(99);
		myTest.add(14, 34);
		assertEquals("Value should equal 0", 0, myTest.remove(3));
		assertEquals("Value should equal 0", 0, myTest.remove(14));
	}
	
	@Test
	/**
	 * Tests whether the size of the array is increased
	 */
	public void testSizeIncrease() {
		IntegerArrayList myTest = new IntegerArrayList();
		for(int i = 0; i < myTest.getSize(); i++) {
			myTest.add(22);
		}
		myTest.add(11);
		assertEquals("Size should equal 30", 30, myTest.getSize());
		myTest.add(27, 11);
		assertEquals("Value should equal 11", 11, myTest.getValue(27));
	}
	
}
