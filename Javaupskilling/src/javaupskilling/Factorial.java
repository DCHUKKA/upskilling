package javaupskilling;

public class Factorial {
 public static void main(String[] args) {
	 int fact=1;
	 int num=5;
	 for(int d=1;d<=num;d++) {
		 fact=fact*d;
	 }
	 System.out.println("Factorial of " +num+ " is :" +fact);
 }
}
