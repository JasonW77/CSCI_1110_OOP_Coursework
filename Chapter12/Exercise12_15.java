//Author Jason Waters
//Date 1/8/2020
//CSCI_1110_Exercise_12_15

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Exercise12_15 {
	public static void main(String[] args) throws IOException {
		
		//file creation
		java.io.File file = new java.io.File("Exercise12_15.txt");
			
		//file write
		java.io.PrintWriter output = new java.io.PrintWriter("Exercise12_15.txt");
		
		for (int i = 0; i <= 100; i++) {
			output.print(" " + (int)(Math.random()* 100));
		}
		
		output.close();
		
		Scanner input = new Scanner(file);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//file read
		while (input.hasNext()) {
			list.add(input.nextInt());
		}
		
		input.close();
		
		java.util.Collections.sort(list);
		
		System.out.println(list);
		
	}
}
