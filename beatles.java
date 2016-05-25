import java.util.*;
import java.util.Scanner;

public class beatles {
    public static void main(String[] args) {
		ArrayList<String>beatles=new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String band="";
		int x=0;

		beatles.add("John Lennon");
		beatles.add("Paul McCartney");
		beatles.add("George Harrison");
		beatles.add("Ringo Starr");

		while(true){
			System.out.print("Enter a member of the Beatles: ");
			band=s.nextLine();

			if(x<=beatles.size()){
				if(band=beatles.get(x)){
					System.out.println("Found entry at index "+x);
				}
				else{
					x++;
				}
			}
		}

    }
}
