import java.util.*;
import java.io.*;
import java.util.Scanner;

public class numberFiles {
    public static void main(String[] args)throws Exception {
        File filein=new File("numbahs.txt");
        FileWriter outFile = new FileWriter("even.txt",false);
        FileWriter outFileTwo = new FileWriter("odd.txt",false);
        PrintWriter out = new PrintWriter(outFile);
        PrintWriter outTwo = new PrintWriter(outFileTwo);
        Scanner s=new Scanner(filein);
        Random r=new Random();
        int num, even=0, odd=0, max=0, min=0, minNum=1, rand;
        double avg, sqrt, pow, sum=0, total=0;

        while(s.hasNextLine()){
			num = s.nextInt();
			total++;
			sum=sum+num;


			if(num%2==0){
				out.println(num);
				even++;
			}

			if(num%2!=0){
				outTwo.println(num);
				odd++;
			}

			if(minNum==1){
				min=num;
				minNum--;
			}

			if(max<num){
				max=num;
			}

			if(min>num){
				min=num;
			}
		}

		avg=sum/total;
		sqrt=Math.sqrt(avg);
		rand=r.nextInt((int)(avg));
		pow=Math.pow(avg, 2);

		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		System.out.println("Even Numbers: "+even);
		System.out.println("Odd Numbers: "+odd);
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
		System.out.println("Square Root of Average: "+sqrt);
		System.out.println("Random Number between 0 and the Average: "+rand);
		System.out.println("Second Power of Average: "+pow);


		s.close();
		out.close();
		outTwo.close();
    }
}
