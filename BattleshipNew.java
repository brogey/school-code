import java.util.*;
import java.util.Scanner;

public class BattleshipNew {
    public static void main(String[] args) {
        boolean[][] Sea = new boolean[10][10];
        int[][] numbers = new int[10][10];
        int x, y, num, numTwo;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for(x=0; x<numbers.length; x++){
			for(y=0; y<numbers[x].length; y++){
				Sea[x][y]=false;
				System.out.print(numbers[x][y]+" ");
			}
			System.out.println("");
		}

		x=0;
		while (x!=5) {
			num=r.nextInt(10);
			numTwo=r.nextInt(10);
			if (Sea[num][numTwo]==false) {
				Sea[num][numTwo]=true;
				x++;
			}
		}

		y=0;
		x=0;
		int count=0, guess=0;
		System.out.print("Enter two attack coordinates (0-9) to attack or -1 to quit: ");

		while (true) {
			System.out.print("Enter first attack coordinate: ");
			x=s.nextInt();
			if (x == -1) break;
			if (x < -1 || x > 99) {
				System.out.print("Error. Please enter -1 of 0-99");
				continue;
			}

			System.out.print("Enter second attack coordinate: ");
			y=s.nextInt();
			if (y == -1) break;
			if (y < -1 || y > 99) {
				System.out.print("Error. Please enter -1 of 0-99");
				continue;
			}

			if (Sea[x][y]==true) {
				System.out.println("You sunk one of my ships!");
				numbers[x][y]=1;
				count++;

				if (count==5) {
					System.out.println("You sunk all my ships63!");
					System.out.println("You won in: " + guess + " wrong guesses.");
					break;
				}
			}

			else{
				System.out.println("Miss!");
				numbers[x][y]=2;
				guess++;
			}

			for(x=0; x<numbers.length; x++){
				for(y=0; y<numbers[x].length; y++){
					System.out.print(numbers[x][y]+" ");
				}
				System.out.println("");
			}
		}
    }
}
