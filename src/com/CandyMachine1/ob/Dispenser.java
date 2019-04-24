package com.CandyMachine1.ob;

//this class is the responsible for storing the number of items of one 
//type of item and the cost of that item. the methods handle tracking the 
//sale of that item
public class Dispenser {
	
	//private to this class dispenser
	private int numberOfItems;
	
	private int cost;
	
	//default constructor to make all instance variable the same
	//can be accessed from other classes in this program
	public Dispenser() {
		numberOfItems = 50;
		cost = 50;
	}
	
	//2 parameter constructor
	//sets noItems and Cost to the specified numbs by user
	public Dispenser(int setNoItems, int setCost) {
		//set the numitems
		if(setNoItems>=0) {
			numberOfItems = setNoItems;
		}else {
			numberOfItems = 50;
		}
		
		//set the cost
		if(setCost>=0) {
			cost = setCost;
		}else {
			cost = 50;
		}
	}
	
	////returns an int
	//shows the num items in dispenser
	public int getCount() {
		return numberOfItems;
	}
	
	
	//show the cost of the item
	public int getProductCost() {
		return cost;
	}
	
	//reduce num items by 1
	public void makeSale() {
		numberOfItems--;
	}
	
}
