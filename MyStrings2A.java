import java.util.Scanner;

public class MyStrings2A {
    public static void main(String[] args) {
        String one, two;

        Scanner s = new Scanner(System.in);
		System.out.print("Enter string bingo: ");
		one=s.nextLine();
		System.out.print("Enter string with length of 7: ");
		two=s.nextLine();

		if(one.equals("bingo") && two.length()==7){
				System.out.println("Nice!");
		}
    }
}
