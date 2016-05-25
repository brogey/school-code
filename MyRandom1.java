import java.util.*;

public class MyRandom1 {
    public static void main(String[] args) {
		Random r = new Random();

		int number, numberTwo, numberThree, numberFour, numberFive, numberSix;

		number=r.nextInt(10);

		numberTwo=r.nextInt(10);

		numberThree=r.nextInt(10);

		numberFour=r.nextInt(10);

		numberFive=r.nextInt(10);

		numberSix=r.nextInt(10);

		while(numberTwo==number){
			numberTwo=r.nextInt(10);
		}

		while(numberThree==number || numberThree==numberTwo){
			numberThree=r.nextInt(10);
		}

		while(numberFour==number || numberFour==numberTwo || numberFour==numberThree){
			numberFour=r.nextInt(10);
		}

		while(numberFive==number || numberFive==numberTwo || numberFive==numberThree || numberFive==numberFour){
			numberFive=r.nextInt(10);
		}

		while(numberSix==number || numberSix==numberTwo || numberSix==numberThree || numberSix==numberFour || numberSix==numberFive){
			numberSix=r.nextInt(10);
		}

		System.out.println("Your numbers are: "+number+", "+numberTwo+", "+numberThree+", "+numberFour+", "+numberFive+", "+numberSix);
    }
}
