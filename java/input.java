import java.io.File; //boolean createNewFile() This method atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
import java.io.PrintWriter;



File output = new File("output.txt");
if (new File("output.txt").isFile()) {
	System.out.println();
} else {
	try {
		output.createNewFile();
		PrintWriter printer = new PrintWriter(output);
		printer.print(
