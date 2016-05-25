import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        Random r = new Random();

		int x, y, z, count, fails=0;
        int[] lockers=new int[12];

        for(x=0; x<lockers.length; x++){
        	if(x%2==0){
        		lockers[x]=r.nextInt(100);;
        	}
        	if(x%2==1){
        		lockers[x]=r.nextInt(100);;
        	}

			System.out.println("Cell: "+x+" Value: "+lockers[x]);
		}

		while(true){
			System.out.print("Please enter a number between 0-99: ");
			y=s.nextInt();
			count=0;

			if(y>99||y<0){
				System.out.println("Error! Please enter another number in the range.");
			}

			if(y<100&&y>-1){
				for(z=0; z<lockers.length; z++){
					if(lockers[z]==y){
						System.out.println("Your number matches a number in the array!");
						count++;
					}
				}

				if(count==0){
					System.out.println("Your number did not match any numbers!");
					fails++;
				}

				if(fails==5){
					System.out.println("Game Over!");
					break;
				}
			}
		}
    }
}
