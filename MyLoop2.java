import java.util.Scanner;

public class MyLoop2 {
    public static void main(String[] args) {
    	int amtOfTimes;
    	int x=0;

    	Scanner s = new Scanner(System.in);
    	System.out.print("How many times do you wish to preform the even/odd test? ");
    	amtOfTimes=s.nextInt();

    	while (amtOfTimes>x){

    		if (x%2==0){
              System.out.println("Number: "+x+" -> Even");
				x++;
    		}
    		else{
              System.out.println("Number: "+x+" -> Odd");
				x++;
    		}
    	}
    }
}