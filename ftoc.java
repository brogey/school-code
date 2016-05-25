import java.util.Scanner;

public class ftoc {
    public static void main(String[] args) {
    	double temp, cel;
    	Scanner s = new Scanner(System.in);
    	System.out.print("Please enter the temperature in Fahrenheit for conversion to Celsius.");
    	temp=s.nextInt();
    	cel=(temp-32)*5/9;
    	System.out.println(temp+" F");
    	System.out.println(cel+" C");
    }
}
