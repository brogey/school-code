import java.util.*;

public class D_Numbers {
    public static void main(String[] args) {
		int[][] numbers = new int[20][10];
		int x, y;

		Random r = new Random();

		for(x=0; x<numbers.length; x++){
			System.out.print(x+"->");
			for(y=0; y<numbers[x].length; y++){
				numbers[x][y]=r.nextInt(100)*(int)(Math.sqrt(77));
				System.out.print(numbers[x][y]+" ");
			}
			System.out.println("");
		}
	}
}