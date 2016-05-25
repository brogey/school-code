import java.util.Scanner;

public class ctof {
    public static void main(String[] args) {
    	double cel, temp;
    	Scanner s = new Scanner(System.in);
    	System.out.print("Please enter the temperature in Celsius for conversion to Fahrenheit.");
    	cel=s.nextInt();
    	temp=(cel*9/5)+32;
    	System.out.println(cel+" C");
    	System.out.println(temp+" F");

    }
}
