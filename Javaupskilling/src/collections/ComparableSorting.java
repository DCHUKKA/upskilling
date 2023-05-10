package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Student that) {
		if(this.age > that.age)
		return 1;
		else
			return -1;
	}
	
	
}

public class ComparableSorting {
	public static void main(String[] args) {
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(21,"Sirisha"));
		studs.add(new Student(12,"Anusha"));
		studs.add(new Student(39,"Akanksha"));
		studs.add(new Student(45,"Akshaya"));
		
		Collections.sort(studs);
		for(Student s : studs)
			System.out.println(s);
	}

}
