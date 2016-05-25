import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
    	int x, y;
    	int numOne, numTwo;

    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter how many numbers you wish to go across: ");
    	numOne=s.nextInt();

    	Scanner a = new Scanner(System.in);
		System.out.print("Enter how many numbers you wish to go down: ");
		numTwo=a.nextInt();
        	for(x=1;x<=numOne;x++){
        		for(y=1;y<=numTwo;y++){
        			System.out.print("|"+x+"*"+y+"="+(x*y));
        				if(y<numTwo){
        					System.out.print("");
        				}
        				else{
        					System.out.println(" ");
        					System.out.println("_____________________________________________________________________________________________________________________________________");
        					System.out.println(" ");
        				}
        		}
       		}
    }
}
