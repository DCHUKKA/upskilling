package javaupskilling;

public class FibonnaciSeries {
public static void main(String[] args) {
	int a,b,c,i=1,num=8;
     a=b=1;
	 System.out.print(a+" "+b);
		while(i<num) {
	 c=a+b;
	 System.out.print(" ");
	 System.out.print(c);
	 a=b;
	 b=c;
	 i++;
	 }
 }
}

