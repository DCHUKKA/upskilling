package javaupskilling;

public class ReversingString {
public static void main(String[] args) {
	String d= "Capgemini";
	for(int c=d.length();c>0;--c) {
		System.out.print(d.charAt(c-1));
	}
}
}
