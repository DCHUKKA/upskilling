package javaupskilling;

public class NarrowingTypeCastingExample {
public static void main(String[] args) 
     {
	double d=33.99;
	//converting double data type to long data type
	long l=(long)d;
	//converting long data type to integer data type
	int i=(int)l;
	
	System.out.println("Before conversion,double value :"+d);
	//fractional part lost
	System.out.println("After conversion,long value :"+l);
	//fractional part lost
	System.out.println("After conversion,int value :"+i);
}
}
