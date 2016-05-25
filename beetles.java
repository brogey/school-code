import java.util.*;
import java.util.Scanner;

public class beetles {
    public static void main(String[] args) {
		ArrayList<String>beatles=new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String band="", answer="";
		int x, y=1;

		beatles.add("John Lennon");
		beatles.add("Paul McCartney");
		beatles.add("George Harrison");
		beatles.add("Ringo Starr");

		while(true){
			System.out.print("Enter a member of the Beatles: ");
			band=s.nextLine();
			y=1;

			for(x=0; x<beatles.size(); x++){
				if(band.equalsIgnoreCase(beatles.get(x))){
					System.out.println("Found entry at index "+x);
					y=2;
				}
			}
				if(y==1){
					System.out.print("Error! Not found! Would you like to add to list? (Yes or No) ");
					answer=s.nextLine();

					if(answer.equalsIgnoreCase("yes")){
						System.out.println("Adding.");
						beatles.add(band);
					}
					if(answer.equalsIgnoreCase("no")){
						System.out.println("Restarting loop.");
					}
				}
		}

    }
}
