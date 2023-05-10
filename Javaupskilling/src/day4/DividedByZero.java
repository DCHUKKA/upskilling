package day4;

public class DividedByZero {
	public static void main(String[] args) {
		int a=10;
		try {
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("we can't divide a number with zero" +e);
		}
	}

}
