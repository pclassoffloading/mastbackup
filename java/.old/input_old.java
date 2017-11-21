import java.io.*;
import java.io.File; //boolean createNewFile() This method atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
import java.util.Scanner;
import java.util.StringTokenizer;
public class input{
File file1;
Scanner fileInput0;
String filly = "../ext_files/input.txt";
source_line[] sourcelines;

	public input(String testty) throws IOException{

		this.file1 = new File(filly);
		this.fileInput0 = new Scanner(file1); 
		sourcelines= new source_line[countFile(fileInput0)]; 
		this.fileInput0.close();this.fileInput0 = new Scanner(file1); 
		readEachLine(fileInput0);



		//this.file1 = readFile(testty);
		//this.fileInput0 = new Scanner(file1);
		//int countiy = countFile(fileInput0);
		//sourcelines= new source_line[countiy]; //instantiated sourcelines
		//readEachLine(fileInput1);
		//return file1;
		//ifWeWantedTokenize();
	}

	public File readFile(String filly) throws IOException{
		this.file1 = new File(filly);
		return file1;
	}
	public int countFile(Scanner fileInput0){
		int count = 0;
		while (fileInput0.hasNext()){
			fileInput0.nextLine();
			count++;
		}
		return count;
	}
	public void readEachLine(Scanner fileInput1)throws IOException{
		while (fileInput1.hasNext()){
			readEachWord(fileInput1.nextLine());
//			System.out.println(fileInput1.nextLine());
		}
		fileInput1.close();
	}

	//TODO: Deliminate using scanner by spaces or tabs...
	//TODO:
	public void readEachWord(String trythis) throws IOException{
		Scanner s = new Scanner(trythis).useDelimiter("\\s+");
		count_words(s);
		build_sourcelines(s);


	}
	public void build_sourcelines(Scanner s){
		int count = 0;
		while (s.hasNext()){
		//.next();
			String word = s.next();
		//		System.out.printf("Line who knows! WORD %d%s\n", count, word);
			count++;
			//understand_word_number();
			//.useDelimiter("\\s*fish\\s*");
		}
	}
	public int count_words(Scanner s){
		int count = 0;
		while (s.hasNext()){
			//.next();
			String word = s.next();
			System.out.printf("Line who knows! WORD %d%s\n", count, word);
			count++;
			//.useDelimiter("\\s*fish\\s*");
		}s.reset();return count;
	}
	public void understand_word_number(int t, Scanner s){

	}
}
//	public void ifWeWantedTokenize(){
//		StringTokenizer st = new StringTokenizer("	this 	is a test");
//		int t = 0;
//		 while (st.hasMoreTokens()) {
//			 t++;
//				 System.out.println(st.nextToken());
//				 System.out.println(t);
//		 }
//	}
//}

//import java.io.PrintWriter;
//File output = new File("output.txt");
//if (new File("output.txt").isFile()) {
//	System.out.println();
//} else {
//	try {
//		output.createNewFile();
//		PrintWriter printer = new PrintWriter(output);
//		printer.print(
