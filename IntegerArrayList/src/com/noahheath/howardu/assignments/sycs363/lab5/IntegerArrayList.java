package com.noahheath.howardu.assignments.sycs363.lab5;

public class IntegerArrayList {
	
	private int length = 0; //keeps track of filled array slots
	private int arraySize = 20; //default array size
	public int[] myArray;
	
	/**
	 * Constructor declares a dynamic array of default size 20.
	 */
	public IntegerArrayList()
	{
		myArray = new int[arraySize];
	}
	
	/**
	 * Constructor declares a dynamic array. The size is determined by the parameter. 
	 * @param size
	 */
	public IntegerArrayList(int size)
	//constructor takes a size and declares a dynamic array
	{
		arraySize = size;
		myArray = new int[arraySize];
	}
	
	/**
	 * Adds the value to the array
	 * @param value
	 */
	public void add(int value)
	{
		if(isFull())
			extend();
		int x = value;
		myArray[length] = x;
		length++;
	}
	
	/**
	 * adds a value at a specified index
	 * @param index
	 * @param value
	 */
	public void add(int index, int value)
	{
		if(index > arraySize)
			System.out.println("Invalid Index");
		else
			myArray[index] = value;
	}
	
	/**
	 * returns the value at a specified index
	 * @param index
	 * @return
	 */
	public int getValue(int index)
	{
		return myArray[index];
	}
	
	/**
	 * returns the size of the array
	 * @return
	 */
	public int getSize()
	{
		return arraySize;
	}
	
	/**
	 * returns the index of a value
	 * @param value
	 * @return
	 */
	public int indexOf(int value)
	{
		for(int z = 0; z <= myArray.length; z++)
		{
			if(myArray[z] == value)
				return z;
			else
				System.out.println("Value is not in list.");
		}
		return -1;
	}
	
	/**
	 * checks if the array is empty
	 * @return True if length = 0.
	 * False if not
	 */
	public boolean isEmpty()
	{
		if(length == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * checks if the array is full
	 * @return True if length >= array size. False if not
	 */
	public boolean isFull()
	{
		if(length == arraySize)
			return true;
		else
			return false;
	}
	
	/**
	 * If the array is full, adds 10 additional spaces;
	 */
	public void extend()
	{
		int[] newArray = new int[myArray.length + 10];
		System.arraycopy(myArray, 0, newArray, 0, myArray.length);
		
		myArray = newArray;
		arraySize = length + 10;
	}
	
	/**
	 * removes a value at a specified index
	 * @param index
	 * @return
	 */
	public int remove(int index)
	{
		if(length == 0)
			return 0;
		else
		{
			myArray[index] = 0;
			int value = myArray[index];
			length--;
			return value;
		}
		
	}
	

}
