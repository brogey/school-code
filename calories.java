import java.util.Scanner;

public class calories {
    public static void main(String[] args) {
        double miles, time, weight, height, age, hours, calories, weightkg, heightcm, caloriesburned, bmi;

        Scanner a = new Scanner(System.in);
    	System.out.print("Please enter the miles you have ran. ");
    	miles=a.nextDouble();

    	Scanner b = new Scanner(System.in);
    	System.out.print("Please enter the time it took you to ran. ");
    	time=b.nextDouble();

    	Scanner c = new Scanner(System.in);
    	System.out.print("Please enter your weight in pounds. ");
    	weight=c.nextDouble();

    	Scanner d = new Scanner(System.in);
    	System.out.print("Please enter your height in inches. ");
    	height=d.nextDouble();

    	Scanner e = new Scanner(System.in);
    	System.out.print("Please enter your age. ");
    	age=e.nextDouble();

    	hours=time*1/60;
    	weightkg=weight/2.2046;
    	heightcm=height*2.54;
    	calories=10*weightkg+6.25*heightcm-5*age+5;
    	caloriesburned=miles*(weight*.75);
    	bmi=(weight/(height*height))*703;

    	System.out.println("You ran "+miles/hours+" MPH.");
    	System.out.println("You burend "+caloriesburned+" calories.");
    	System.out.println("Your intake of calories should be "+calories+".");
    	System.out.println("Your BMI is "+bmi+".");
    	if(bmi>30){
    	System.out.println("You are obese. Get help.");
    	}
    	else{
    	System.out.println("You are not obese.");
    	}
    }
}
