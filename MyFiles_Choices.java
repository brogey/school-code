public class MyFiles_Choices {
	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		FileWriter outFile;
		String input, filename, inputTwo;

		while(true){

			System.out.print("Would you like to create a new file, or append to an old one? (C for create, A for append): ");
			inputTwo=s.nextLine();

			System.out.print("Enter the file name: ");
			filename=s.nextLine();

			if(inputTwo.equalsIgnoreCase("c")){
				outFile = new FileWriter(filename+".txt", false);
				break;
			}

			if(inputTwo.equalsIgnoreCase("a")){
				outFile = new FileWriter(filename+".txt", true);
				break;
			}
		}

		PrintWriter out = new PrintWriter(outFile);

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
}