package javaupskilling;

public class SumOfNumInDoWhile {
public static void main(String[] args) {
	int d=1,sum=0;
	int num=15;
	do {
		sum=sum+d;
		d++;
	}
	while(d<=num);
	System.out.println(sum);
}
}