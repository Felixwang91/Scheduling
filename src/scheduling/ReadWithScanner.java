package scheduling;

import java.io.*;
import java.util.*;

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
		int row = 0, colm = 0;

		

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

		/*
		 * while (input.hasNext()) { String nextToken = input.next(); if
		 * (nextToken != ","){ field[row][colm] = nextToken; continue; } else if
		 * (nextToken == ","){ colm++; continue; } else if (nextToken == "\n") {
		 * row++; colm = 0; } }
		 */

		// comment

		input.close();

		reader.parsed = field;

	}

	/*
	 * public String[] ReadHeader(String filepath) throws IOException {
	 * 
	 * String formatedFile; boolean headerFlag=false;
	 * 
	 * ReadWithScanner reader = new ReadWithScanner(filepath); Scanner input =
	 * new Scanner(reader.file);
	 * 
	 * String[] formatedFileContent;//Output string variable int i = 0;
	 * 
	 * while (input.hasNextLine()){ String nextLine = input.nextLine();
	 * if(headerFlag == false){//start to read the header. if(nextLine ==
	 * "************")headerFlag = true; else continue; }
	 * 
	 * else if(headerFlag == true){ if(nextLine == "************")break;//finish
	 * reading the header. } }
	 * 
	 * int row=0, colm=0; int fileLines = reader.FileLengthCounter(); String
	 * field[][] = new String[fileLines][35];
	 * 
	 * while (input.hasNext()) { String nextToken = input.next(); if (nextToken
	 * != ",") continue; else if (nextToken == "\n") { row++; colm = 0; } else {
	 * field[row][colm] = nextToken; colm++; } }
	 * 
	 * 
	 * 
	 * return formatedFileContent; }
	 */

}