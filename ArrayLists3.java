import java.util.*;

public class ArrayLists3 {
    public static void main(String[] args) {
		ArrayList<String>giants=new ArrayList<String>();
		int s;

		giants.add("Phil Simms");
		giants.add("Mark Bavaro");
		giants.add("George Martin");
		giants.add("Steven Baker");
		giants.add("Harry Carson");
		giants.add("Carl Banks");
		giants.add("Brian Kelly");
		giants.add("Brad Van Pelt");
		giants.add("Gary Reasons");

		System.out.println(giants);

		giants.remove(5);

		System.out.println(giants);

		giants.add(0, "Joe Morris");

		s=giants.size();

		System.out.println("The size is "+s);
		System.out.println(giants);
	}
}