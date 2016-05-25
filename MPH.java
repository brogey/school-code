import java.util.Scanner;

public class MPH {
    public static void main(String[] args) {
		String trip;
		double mpg, miles, gasprice, totalprice;

		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your destination. ");
		trip=s.nextLine();

		Scanner b = new Scanner(System.in);
		System.out.print("Please enter the current gas price. ");
		gasprice=b.nextDouble();

		Scanner c = new Scanner(System.in);
		System.out.print("Please enter your car's MPG. ");
		mpg=c.nextDouble();

		Scanner d = new Scanner(System.in);
		System.out.print("Please enter the total miles you will have to drive. ");
		miles=d.nextDouble();

		totalprice=(miles/mpg)*gasprice;

		System.out.println("Your destination is "+trip+", and the total price of gas will be $"+totalprice+".");
    	}

    }
