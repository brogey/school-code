import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double cash, hold;
		int dollars;
		int quarters, nickels, dimes, pennies;

		System.out.print("Enter Amount of Cash.");
		cash=s.nextDouble();

		dollars=(int)cash/1;
		System.out.println("Dollars: "+dollars);

		//reduce cash pile
		cash=cash-dollars;
		System.out.println("Amount Left is: "+cash);

		//get quarters
		hold=cash/0.25;
		quarters=(int)hold;
		System.out.println("Quarters: "+quarters);

		//reduce cash pile
		cash=cash-(quarters*0.25);
		System.out.println("Amount left is: "+cash);

		//get dimes
		hold=cash/0.10;
		dimes=(int)hold;
		System.out.println("Dimes: "+dimes);

		//reduced cash pile
		cash=cash-(dimes*0.10);
		System.out.println("Amount Left is: "+cash);

		//get nickels
		hold=cash/0.05;
		nickels=(int)hold;
		System.out.println("Nickels: "+nickels);

		//reduce cash pile
		cash=cash-(nickels*0.05);
		System.out.println("Amount Left is: "+cash);
    }
}
