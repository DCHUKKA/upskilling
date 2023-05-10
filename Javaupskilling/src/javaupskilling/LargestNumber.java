package javaupskilling;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
    System.out.println("Enter the third number");
	int c=sc.nextInt();

    if(a>b && a>c) {
	System.out.println("a is largest number");
}
    else if(b>c && b>a) {
    	System.out.println("b is largest number");
    }
        else {
    	System.out.println("c is largest number");
    }
}
}
