/* *********************************************
My First Program which reads input from screen.
********************************************* */

import java.util.Scanner;

public class FirstRead {
    public static void main(String[] args) {
    	int age, yearborn;
    	//create a Scanner object
    	Scanner s = new Scanner(System.in);
    	//Prompting user for info...
    	System.out.print("Please Enter Your Age.");
    	age=s.nextInt();
    	yearborn=2015-age;
    	System.out.println("You are: " + age);
    	System.out.println("The year you were born in is: "+yearborn);
  		if(yearborn<1990){
  		System.out.println("Wow! You're pretty old!");
  		}


    }
}