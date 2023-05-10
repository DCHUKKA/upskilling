package day4;

import java.util.Arrays;
import java.util.List;

public class SortingStrings {
	public static void main(String[] args) {
		List<String> myList=Arrays.asList("Tom","Jerry","Doraemon","Little");
		myList.stream().sorted().forEach(n->System.out.println(n));
	}

}
