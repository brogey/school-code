import java.util.Scanner;
import java.util.*;

public class myRandString {
    public static void main(String[] args) {
    	int rand, num;
        String str, y="y", ing="ing";

		Random r = new Random();
        Scanner a = new Scanner(System.in);

		System.out.print("Enter String: ");
        str=a.nextLine();

        rand=r.nextInt(str.length());

        char strTwo=str.charAt(rand);

        System.out.println("You entered: "+str);
        System.out.println("Random Character: "+strTwo);

        if(strTwo=='a'||strTwo=='A'){
        	System.out.println(str+y);
        }
        else{
        	System.out.println(str+ing);
        }
    }
}
