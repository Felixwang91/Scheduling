package cse487.Scheduler.model.scheduling;

import java.io.*;
import java.util.*;

public class ReadWithScanner {
	File file;
	String parsed[][];

	public ReadWithScanner(String filename) {
		File file = new File(filename);
	}

	public static void main(String args[]) throws IOException {
		ReadWithScanner reader = new ReadWithScanner("/pathOfFile/Filename.text");
		Scanner input = new Scanner(reader.file);
		String field[][] = new String[200][35];
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

		input.close();

		reader.parsed = field;
	}
}