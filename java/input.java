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

	}

	public void readEachLine(Scanner fileInput1)throws IOException{
		while (fileInput1.hasNext()){
			readEachWord(fileInput1.nextLine());
		}
		fileInput1.close();
	}
	
	public int countFile(Scanner fileInput0){
		int count = 0;
		while (fileInput0.hasNext()){
			fileInput0.nextLine();
			count++;
		}
		return count;
	}

	public void readEachWord(String trythis) throws IOException{
		Scanner s = new Scanner(trythis).useDelimiter("\\s+");
		int num_words = count_words(s);s = new Scanner(trythis).useDelimiter("\\s+");

		build_sourcelines(s, num_words);
	}

	public int count_words(Scanner s){
		int count = 0;
		while (s.hasNext()){
			String word = s.next();
			System.out.printf("Line who knows! WORD %d%s\n", count, word);
			count++;
		}
			count--;
			System.out.printf("Line who knows! WORD %d\n", count);
		return count;
	}

	public void build_sourcelines(Scanner s, int num_words){
		int count = 0;
		while (s.hasNext()){
			String word = s.next();
			count++;
//			System.out.printf("Line who knows! WORD %d is the num of %s\n", num_words, word);
		}
	}

	public void understand_word_number(int t, Scanner s){
		
	}
}
