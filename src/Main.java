import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Name: Nico");
		System.out.println("Class: ICS3U");
		System.out.println("Date: Friday Sept. 25");
		System.out.println("Project Name: Restaurant");
		
		System.out.println("How much cheese burgers would you like for $10 each?");
		int cheeseBurger = in.nextInt();
		in.nextLine();
		
		System.out.println("How much hotdogs would you like for $8 each?");
		int hotDog = in.nextInt();
		in.nextLine();
		
		System.out.println("How much chicken sandwiches would you like for $10 each?");
		int chickenSandwich = in.nextInt();
		in.nextLine();
		
		System.out.println("How much double cheese burgers would you like for $15 each?");
		int doubleCheeseBurger = in.nextInt();
		in.nextLine();
		
		System.out.println("How much french fries would you like for $5 each?");
		int fries = in.nextInt();
		in.nextLine();
		
		int totalPrice = cheeseBurger * 10 + hotDog * 8 + chickenSandwich * 10 + doubleCheeseBurger * 15 + fries * 5;
		
		
		if (totalPrice > 30){
			System.out.println( totalPrice * 0.90 );
		} else if (totalPrice > 50){
			System.out.println( totalPrice * 0.80 );
		} else {
			
		}
	
		
		
	}

}
