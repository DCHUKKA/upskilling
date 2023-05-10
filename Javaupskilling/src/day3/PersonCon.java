package day3;

public class PersonCon {
  private String name;
  private int age;
  
public PersonCon(String name, int age) {
	
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

  public static void main(String[] args) {
	  PersonCon obj=new PersonCon("Suhani",10);
	  System.out.println(obj.getName()+":"+obj.getAge());
  }
}
