package day3;

public class Person {
   private int age;
   private String name;
 

   public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
public static void main(String[] args) {
	Person obj=new Person();
	obj.setAge(10);
	obj.setName("Suhani");
	System.out.println(obj.getName()+":"+obj.getAge());
}
}