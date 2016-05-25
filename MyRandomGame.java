/**************************************************
Gabriel Eaton
12/10/15 through 12/11/15
**************************************************/
//This code is giving me hell.
import java.util.*;
import java.util.Scanner;

public class MyRandomGame {
    public static void main(String[] args) {

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int Number, Guess;
		int Again;
		int RightCount=0;
		int WrongCount=0;

		Number = r.nextInt(10);
		Again=1;

		while (true) {

				System.out.print("Enter number from 0 to and including 9: ");
				Guess=s.nextInt();

				if (Guess == Number) {
					System.out.println("That is correct!");

					RightCount++;

					System.out.println(" ");
					System.out.println("Answer 1 for \"Yes\" or 2 for \"No\" for the next question.");
					System.out.print("Do you want to play again? ");
					Again=s.nextInt();

					if (Again != 1) break;

					Number = r.nextInt(10);
				}

				else {
					System.out.println("That is incorrect.");
					System.out.println("Guess again");
					WrongCount++;
				}

	    } //end of while


		System.out.println("The game is over.");
		if (RightCount==1) {
			System.out.println("You had " + RightCount + " correct guess.");
		}
		else {
			System.out.println("You had " + RightCount + " correct guesses.");
		}
		if (WrongCount==1) {
			System.out.println("You had " + WrongCount + " incorrect guess.");
		}
		else {
			System.out.println("You had " + WrongCount + " incorrect guesses.");
		}

    }
}