import java.util.Scanner;

public class MyStrings2B {
    public static void main(String[] args){
    	String firstName, lastName;

    	Scanner s = new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstName=s.nextLine();
		System.out.print("Enter last name: ");
		lastName=s.nextLine();

		String name=firstName+" "+lastName;

		if(name.equalsIgnoreCase("bill jones")){
			System.out.println("Yes!");
		}
		else{
			System.out.println("No!");
		}

    }
}