import java.util.*;

public class ArrayLists4 {
    public static void main(String[] args) {
		ArrayList<String>company=new ArrayList<String>();
		int s;

		company.add("John Lenox");
		company.add("Paul Mann");
		company.add("George Harris");
		company.add("Pete Beston");
		company.add("Stu Stevens");

		System.out.println(company);

		company.remove(4);
		company.set(3, "Richard Keep");

		System.out.println(company);

		company.add(0, "Billy Bingo");

		s=company.size();
		System.out.println("The size of the company is "+s);
		System.out.println(company);
	}
}-