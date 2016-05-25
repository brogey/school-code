import java.util.Scanner;

public class algebra {
    public static void main(String[] args) {
        double aTwo, b, c, discriminant, answer, answerTwo, one, two, three;

        Scanner a = new Scanner(System.in);
    	System.out.print("Enter coefficient: ");
    	aTwo=a.nextDouble();

    	System.out.print("Enter coefficient two: ");
    	b=a.nextDouble();

    	System.out.print("Enter constant: ");
    	c=a.nextDouble();

    	one=-b;
    	two=Math.sqrt(Math.pow(b, 2)-4*aTwo*c);
    	three=2*aTwo;

        answer=(one+two)/three;
        answerTwo=(one-two)/three;

        System.out.println("The answers are: "+answerTwo+", "+answer);

        if(two>0){
        	System.out.println("There are two roots.");
        }

        if(two==0){
        	System.out.println("There is one root.");
        }

        else{
        	System.out.println("There are only imaginary roots.");
        }
    }
}
