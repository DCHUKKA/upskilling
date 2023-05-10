package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map<String,Integer> students = new HashMap();
	students.put("Sushil", 75);
	students.put("Vamshi", 45);
	students.put("Arjun", 28);
    students.put("Pavan", 51);
    students.put("Vamshi", 65);
   // System.out.println(students);
   // System.out.println(students.keySet());
    for(String key : students.keySet()) {
    	System.out.println(key +":"+students.get(key));
    }
}

 }

