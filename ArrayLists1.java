import java.util.*;

public class ArrayLists1 {
    public static void main(String[] args) {
		ArrayList<String>beatles=new ArrayList<String>();
		int s;

		beatles.add("John Lennon");
		beatles.add("Paul McCartney");
		beatles.add("George Harrison");
		beatles.add("Stu Sutcliffe");
		beatles.add("Pete Best");
		s=beatles.size();
		System.out.println("The size: "+s);

		System.out.println(beatles);

		beatles.remove(3);

		System.out.println(beatles);

		beatles.set(3, "Ringo Starr");

		System.out.println(beatles);

		beatles.add(0, "Billy Preston");

		System.out.println(beatles);
    }
}
