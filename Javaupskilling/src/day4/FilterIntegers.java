package day4;

import java.util.Arrays;
import java.util.List;

public class FilterIntegers {
	public static void main(String[] args) {
		List <Integer> myList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		myList.stream().filter(i->i%2==1).forEach(n->System.out.println(n));
		
	}
}
