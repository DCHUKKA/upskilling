package javaupskilling;

public class PrimeNumber {
public static void main(String[] args) {
	int d=7;
	int c=2,count=0;
	while(c<=d/2) {
		if(d%c==0) {
			count++;
			break;
		}
		c++;
	}
	if(count==0) {
		System.out.println(d+" is a prime");
	}
	else {
		System.out.println(d+" is not a prime");
	}
}
}
