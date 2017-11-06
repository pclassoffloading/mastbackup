import java.io.*;
import java.io.File; //boolean createNewFile() This method atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
import java.util.Scanner;
public class input{
	public input(String testty) throws IOException{
		System.out.printf("Assembler communicating with input...  %s\n", testty);
		readfile(testty);
	}

String filly = "input.txt";
	public void readfile(String filly) throws IOException{
		

		File file1 = new File(filly);
		Scanner fileInput1 = new Scanner(file1);
		 while (fileInput1.hasNext()){
			//.next();
			String nextLine = fileInput1.nextLine();
			System.out.printf("Line who knows! %s\n", nextLine);

		}

	}
}
//import java.io.PrintWriter;
//File output = new File("output.txt");
//if (new File("output.txt").isFile()) {
//	System.out.println();
//} else {
//	try {
//		output.createNewFile();
//		PrintWriter printer = new PrintWriter(output);
//		printer.print(
