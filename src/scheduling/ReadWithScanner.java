package scheduling;

import java.io.*;
import java.util.*;

//comment here

public class ReadWithScanner {
	File file;
	String parsed[][];
	String filename;

	public ReadWithScanner(String filename) {
		this.file = new File(filename);
		this.filename = filename;
	}

	public int FileLengthCounter() throws IOException {// Counter for counting
														// the file length
		BufferedReader reader = new BufferedReader(
				new FileReader(this.filename));
		int lines = 0;
		while (reader.readLine() != null)
			lines++;
		reader.close();
		return lines;
	}

	public static void main(String args[]) throws IOException {
		ReadWithScanner reader = new ReadWithScanner("data.txt");
		Scanner input = new Scanner(reader.file);
		int fileLines = reader.FileLengthCounter();
		String field[][] = new String[fileLines][35];		

		// Reading the input file and put the data into class variable
		// parsed[][].
		for (int j = 0; j < fileLines; j++) {
			String str = input.nextLine();
			if(!str.trim().isEmpty()) {
				String[] as = str.split(",");
				for (int i = 0; i < as.length; i++) {
					field[j][i] = as[i];
				}
			}
		}

		input.close();

		reader.parsed = field;

	}
	
	
	
}