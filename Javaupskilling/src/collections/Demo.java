package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
 public static void main(String[] args) {
	 List<Integer> nums = new ArrayList<Integer>();
	 nums.add(1);
	 nums.add(2);
	 nums.add(3);
	 nums.add(4);
	 //System.out.println(nums.indexOf(3));
	// System.out.println(nums.get(0));
	 Iterator<Integer> values=nums.iterator();  
	 while(values.hasNext()){  
	 System.out.println(values.next());  
	 } 
  }
 }

