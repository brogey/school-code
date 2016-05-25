import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args)throws Exception {
		FileWriter outFile = new FileWriter("h:\\info.txt",false);
		PrintWriter out = new PrintWriter(outFile);

		out.println("billy bringus");

		out.close();
    }
}
