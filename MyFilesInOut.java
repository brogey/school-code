import java.io.*;
import java.util.Scanner;

public class MyFilesInOut {
    public static void main(String[] args)throws Exception {
		File fileIn = new File("names.txt");
		FileWriter outFile = new FileWriter("target.txt",false);
		PrintWriter out = new PrintWriter(outFile);

		Scanner s = new Scanner(fileIn);
		String line;

		while(s.hasNextLine()){
			line = s.nextLine();
			out.println(line);
		}

		s.close();
		out.close();
    }
}
