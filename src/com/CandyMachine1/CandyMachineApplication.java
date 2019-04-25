

package com.CandyMachine1;
import java.util.*;
import com.CandyMachine1.ob.Dispenser;
import com.CandyMachine1.ob.Register;

public class CandyMachineApplication {
	static Scanner sc = new Scanner(System.in);
	//method to ask the user to select what they would like to buy
	public static void showSelection() {
		System.out.println("Please select the correct number to indicate what you would like to buy:");
		System.out.println("1. Twizzlers");
		System.out.println("2. Butterfinger");
		System.out.println("3. M&Ms");
		System.out.println("4. Hersheys");
		System.out.println("5. Skittles");
		System.out.println("6. exit");
	}
	
	public static void sellProduct(Dispenser dispenser, Register register) {
		
		int coinsNeeded;
		int coinsReceived;
		System.out.println("the count of this candy is "+ dispenser.getCount());
		//check to see if dispenser is empty and return message if it is
		//if not empty decrement number by 1
		if(!(dispenser.getCount() == 0)) {
			
			int price = dispenser.getProductCost();
			//set coins needed to cost of item
			coinsNeeded = price;
		
			//set coins entered to 0
			coinsReceived = 0;
			
			//as user enters coins increment coins entered, and if amount is less 
			//than coins needed show difference for amount needed
			
			while(coinsNeeded>0) {
				
				System.out.println("Please insert " + coinsNeeded + " cents");
				
				coinsReceived = coinsReceived + sc.nextInt();
				
				System.out.println("Received a total of "+ coinsReceived);
				
				coinsNeeded = price - coinsReceived;
			
			}
			
			//add to cashonhand the amount for the product
			register.acceptPayment(coinsReceived);
			
			dispenser.makeSale();		
			
			System.out.println("Collect your item at the bottom and enjoy!");
			System.out.println("Program will run again.");

			System.out.println();
			
		}else {
			System.out.println("This item has run out! Please select another item.");
		}
		
		
		
	}
	
	
	
	//initialize the dispensers needed for the candy app will sell.
	public static void main(String[] args) {
		Dispenser twizzlers = new Dispenser(20, 50);
		Dispenser butterfinger = new Dispenser(30, 40);
		Dispenser mnm = new Dispenser(10, 20);
		Dispenser hersheys = new Dispenser(35, 70);
		Dispenser skittles = new Dispenser(40, 60);
		
		Register cashR = new Register();
		int choice;
		
		showSelection();
		choice = sc.nextInt();
		
		while(choice != 9) {
			switch(choice) {
			case 1:
				sellProduct(twizzlers, cashR);
				break;
			case 2:
				sellProduct(butterfinger, cashR);
				break;
			case 3:
				sellProduct(mnm, cashR);
				break;
			case 4:
				sellProduct(hersheys, cashR);
				break;
			case 5:
				sellProduct(skittles, cashR);
				break;
			default:
				System.out.println("Invalid Selection. Please try again.");
			}
			System.out.println("");
			showSelection();
			choice = sc.nextInt();
		}
		
		
	}

}
