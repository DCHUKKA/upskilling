package day4;

 enum Operations{
	ADD,SUBSTRACT,MULTIPLY,DIVISION;

}
public class Calculator {
	public static void main(String[] args) {
		Operations operations;
		operations=Operations.MULTIPLY;
		switch(operations) {



		case ADD:
                System.out.println("Adding");
                break;
		case SUBSTRACT:
		        System.out.println("Subtracting");
		        break;
		case MULTIPLY:
		        System.out.println("Multiplying");
		        break;
		case DIVISION:
		        System.out.println("dividing");
		        break;
		default:
		        System.out.println("Not in the list provided");
		        break;

		}
		
	}
}
