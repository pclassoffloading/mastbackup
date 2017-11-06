import java.io.*;
import java.io.File; //boolean createNewFile() This method atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
import java.util.Scanner;
public class input{
File file1;
String filly = "input.txt";

	public input(String testty) throws IOException{

		this.file1 = readFile(testty);
		readEachWord(file1);
	}

	public File readFile(String filly) throws IOException{
		File file1 = new File(filly);
		Scanner fileInput1 = new Scanner(file1);

		readEachLine(file1, fileInput1);
		return file1;
	}

	public void readEachLine(File file1, Scanner fileInput1){
		while (fileInput1.hasNext()){
			//.next();
			String nextLine = fileInput1.nextLine();
			System.out.printf("Line who knows! %s\n", nextLine);
		}
	}

	//TODO: Deliminate using scanner by spaces or tabs...
	//TODO:
	public void readEachWord(File trythis) throws IOException{

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
