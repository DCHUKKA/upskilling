package javaupskilling;

import java.util.Scanner;

public class PosNegZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	 
	if(n>0) {
		System.out.println("Number is positive");
	}
	else if(n<0) {
		System.out.println("Number is Negative");
	}
	else {
		System.out.println("Number is Zero");
		
		
	}
	
}
}
