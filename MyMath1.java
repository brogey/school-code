import java.util.Scanner;

public class MyMath1 {
    public static void main(String[] args) {
    	double number, answer, answerTwo;

    	Scanner a = new Scanner(System.in);
    	System.out.print("Enter number: ");
    	number=a.nextDouble();

    	answer=Math.sqrt(number);
    	answerTwo=Math.pow(number, 2);

    	System.out.println("The square root is: "+answer);
    	System.out.println("The square is: "+answerTwo);
    }
}
