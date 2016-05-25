import java.util.Scanner;

public class MyLoop1 {
    public static void main(String[] args) {
    	int amtOfTimes;
    	int x=0;

    	Scanner s = new Scanner(System.in);
		System.out.print("Enter how many times you want the loop to go.");
		amtOfTimes=s.nextInt();

    	while (x<amtOfTimes){
    		System.out.println("I see you.");
			x++;
    	}
    }
}
