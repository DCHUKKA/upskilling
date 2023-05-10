package CustomExceptionDemo;



public class CustomException {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age is not valid to vote");
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(20);
		}
		catch(InvalidAgeException e) {
			System.out.println("caught exception");
			System.out.println("Exception occured"+e);
		}
		

}
}
