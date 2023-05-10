package LambdaExpressions;

interface Addable{
	public int add(int a, int b);
}


public class LambdaExpressionExample1 {
  public static void main(String[] args) {
	  Addable a1 =(int a,int b)->(a+b);
	  System.out.println(a1.add(100,200));
  }
}
