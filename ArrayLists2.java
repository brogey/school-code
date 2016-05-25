import java.util.*;
import java.util.Scanner;

public class ArrayLists2 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<String>();
        String name="";
        int num;
        Scanner s = new Scanner(System.in);

        while(true){
        	System.out.print("Please enter a name, or enter quit to end the loop. ");
        	name=s.nextLine();

        	if(name.equalsIgnoreCase("quit")){
        		break;
        	}

        	names.add(name);
        }

        System.out.println(names);
        num=names.size();
		System.out.println("The size: "+num);
    }
}
