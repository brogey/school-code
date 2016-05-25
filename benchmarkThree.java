import java.util.*;
import java.io.*;
import java.util.Scanner;

public class benchmarkThree {
    public static void main(String[] args)throws Exception {
    	ArrayList<String> backwards=new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        Scanner a;
		FileWriter outFile;
		File filein;
		PrintWriter out;
		String input, filename, filenameTwo, inputTwo, line;
		int y=0, n=0;

		while(true){

			System.out.println("********************************************************");
			System.out.println("Welcome to my File System");
			System.out.println("Options - Enter");
			System.out.println("va to view a file from top to bottom");
			System.out.println("vb to view a file from bottom to top");
			System.out.println("c to copy a file from one source to another");
			System.out.println("a to append new info to a file");
			System.out.println("n to create a new file with info");
			System.out.println("s to search a file for a pattern");
			System.out.println("q to quit the system");
			System.out.println("********************************************************");
			inputTwo=s.nextLine();

			if(inputTwo.equalsIgnoreCase("q")){
				break;
			}

			if(inputTwo.equalsIgnoreCase("va")){
				System.out.print("Enter the file name: ");
				filename=s.nextLine();

				filein=new File(filename+".txt");
				a =new Scanner(filein);

				while(a.hasNextLine()){
					line=a.nextLine();
					System.out.println(line);
				}

				a.close();
			}

			if(inputTwo.equalsIgnoreCase("vb")){
				System.out.print("Enter the file name: ");
				filename=s.nextLine();

				filein=new File(filename+".txt");
				a=new Scanner(filein);

				while(a.hasNextLine()){
					line=a.nextLine();
					backwards.add(line);
				}

				for(int x=backwards.size()-1; x>=0; x--){
					line=backwards.get(x);
					System.out.println(line);
				}

				a.close();
			}

			if(inputTwo.equalsIgnoreCase("c")){
				System.out.print("Enter file to copy from. ");
				filename=s.nextLine();

				filein=new File(filename+".txt");

				System.out.print("Enter file to copy to. ");
				filenameTwo=s.nextLine();

				outFile=new FileWriter(filenameTwo+".txt", false);
				out=new PrintWriter(outFile);
				a=new Scanner(filein);

				while(a.hasNextLine()){
					line=a.nextLine();
					out.println(line);
				}

				a.close();
				out.close();
			}

			if(inputTwo.equalsIgnoreCase("n")){
				System.out.print("Enter file you wish to create. ");
				filename=s.nextLine();

				outFile=new FileWriter(filename+".txt", false);
				out=new PrintWriter(outFile);

				while (true) {
					System.out.print("Enter what you want to add to "+filename+": ");
					input=s.nextLine();

					if (input.equalsIgnoreCase("Quit")) {
						System.out.println("Filewriter ended.");
						break;
					}
					out.println(input);
				}
				out.close();
			}

			if(inputTwo.equalsIgnoreCase("a")){
				System.out.print("Enter file you wish to append to. ");
				filename=s.nextLine();

				outFile=new FileWriter(filename+".txt", true);
				out=new PrintWriter(outFile);

				while (true) {
					System.out.print("Enter what you want to add to "+filename+": ");
					input=s.nextLine();

					if (input.equalsIgnoreCase("Quit")) {
						System.out.println("Filewriter ended.");
						break;
					}
					out.println(input);
				}
				out.close();
			}

			if(inputTwo.equalsIgnoreCase("s")){
				System.out.print("Enter the file you wish to search through. ");
				filename=s.nextLine();

				System.out.print("Enter the pattern of letters you wish to search for. ");
				input=s.nextLine();

				filein=new File(filename+".txt");
				a=new Scanner(filein);

				while(a.hasNextLine()){
					n++;
					line=a.nextLine();

					if(line.indexOf(input)!=-1){
						y++;
						System.out.println("Found on line "+n);
					}
				}

				if(y==0){
					System.out.println("Not found.");
				}

				if(y!=0){
					System.out.println("Found on "+y+" lines.");
				}
				a.close();
			}
		}
    }
}
