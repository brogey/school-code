import java.util.Scanner;
import java.util.*;

public class BattleshipNew {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];

        for(x=0; x<numbers.length; x++){
			System.out.print(x+"->");
			for(y=0; y<numbers[x].length; y++){
				numbers[x][y]=r.nextInt(100)*(int)(Math.sqrt(77));
				System.out.print(numbers[x][y]+" ");
			}
        }
    }
}
