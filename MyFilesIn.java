import java.io.File;
import java.util.Scanner;

public class MyFilesIn {
    public static void main(String[] args)throws Exception {
		File filein = new File("names.txt");
		Scanner s = new Scanner(filein);
		String line;

		while(s.hasNextLine()){
			line=s.nextLine();
			System.out.println(line);
		}

		s.close();

    }
}