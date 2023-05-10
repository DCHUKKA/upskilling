package day5.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a String:");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);

		
		String str = bf.readLine();
		System.out.println(str);
		
		
		bf.close();	
	 }
}
