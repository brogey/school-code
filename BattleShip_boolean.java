/*
Gabriel Eaton
1/12/16 - 1/15/16
*/
import java.util.*;
import java.util.Scanner;

public class BattleShip_boolean {
    public static void main(String[] args) {

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		boolean[] Sea = new boolean[100];

		int x, y, input, num, Count=0;

		for (x=0; x<Sea.length; x++) {
			Sea[x]=false;
		}

		x=0;

		while (x!=5) {
			num=r.nextInt(100);

			if (Sea[num]==false) {
				Sea[num]=true;
				x++;
			}
		}

		y=0;

		System.out.print("Enter attack coordinates (0-99) to attack or -1 to quit: ");

		while (true) {
			System.out.print("Enter attack coordinates: ");
			input=s.nextInt();
			if (input == -1) break;
			if (input < -1 || input > 99) {
				System.out.print("Error. Please enter -1 of 0-99");
				continue;
			}

			if (Sea[input]==true) {
				System.out.println("You sunk one of my ships!");
				y++;
				if (y==5) {
					System.out.println("You sunk all my ship!");
					System.out.println("You won in: " + x + " guesses.");
					break;
				}
			}
		}

	}
}