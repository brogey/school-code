import java.util.Scanner;

public class NameY {
    public static void main(String[] args) {
    	String nameOne, nameTwo;
    	String subNameOne, subNameTwo;
    	int nameLength, nameLengthTwo;

    	while(true){

    	Scanner a = new Scanner(System.in);
    	System.out.print("Enter Name (Must be less than 4 characters): ");
    	nameOne=a.nextLine();

    	nameLength=nameOne.length();

    	nameLengthTwo=nameLength-1;

    	subNameOne=nameOne.substring(0, nameLengthTwo);

    	subNameTwo=nameOne.substring(nameLengthTwo, nameLength);

    	nameTwo=subNameTwo+subNameOne;
    	if(nameOne.equalsIgnoreCase("done")){
    		break;
    	}
    	if(nameOne.length()>=4){
    		if(nameOne.endsWith("y")){
				System.out.println(nameTwo);
    		}
    		else{
    			System.out.println("No action.");
    		}
    	}

    	else{
    		System.out.println("Name is too short.");
    	}
    	}
    }
}