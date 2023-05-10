package day5.throwsException;

public class AgeException extends Exception{
	private String age;

	public AgeException(String age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeException [age=" + age + "]";
	}
	

}
