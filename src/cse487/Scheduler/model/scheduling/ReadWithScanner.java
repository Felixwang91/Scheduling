package cse487.Scheduler.model.scheduling;

import java.io.*;
import java.util.*;

public class ReadWithScanner {
	File file;
	String parsed[][];
	String filename;

	public ReadWithScanner(String filename) {
		File file = new File(filename);
		this.filename = filename;
	}
	
	public int FileLengthCounter() throws IOException{//Counter for counting the file length
		BufferedReader reader = new BufferedReader(new FileReader(this.filename));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		return lines;
	}

	public static void main(String args[]) throws IOException {
		ReadWithScanner reader = new ReadWithScanner("/pathOfFile/Filename.text");
		Scanner input = new Scanner(reader.file);
		int fileLines = reader.FileLengthCounter();
		String field[][] = new String[fileLines][35];
		int row = 0, colm = 0;

		//Reading the input file and put the data into class variable parsed[][].
		while (input.hasNext()) {
			String nextToken = input.next();
			if (nextToken != ",")
				break;
			else if (nextToken == "\n") {
				row++;
				colm = 0;
			} else {
				field[row][colm] = nextToken;
				colm++;
			}
		}
		
		//comment
		
		input.close();

		reader.parsed = field;
		
	}

}