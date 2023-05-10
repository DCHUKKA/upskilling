package day5.filenotfound;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
  public static void main(String[] args) {
	  BufferedReader br = null;
	  try {
		  br = new BufferedReader(new FileReader("mypic.jpeg"));
		  String data = null;
		try {
			while((data=br.readLine())!=null) { 
				System.out.println(data);

		}
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
  }catch(FileNotFoundException e) {
	  e.printStackTrace();
  }
}
}
