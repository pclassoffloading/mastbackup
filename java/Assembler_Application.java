import java.io.IOException;
import java.util.Scanner;
//import input.*;
//import Assembler_Application
public class Assembler_Application{
int LOCCTR = 0;

	public static void main(String [] args) throws IOException{
		System.out.println("on to the first file.");
		input dragon0 = new input(loc("input.txt"));



	}
	public static String loc(String text){
		return "../ext_files/".concat(text);
	}
}
