package day4;

class P {   
	String name;
	public void message()
	{
		System.out.println("Display...");
	}
}
class C extends P{
	int age;
	public void message()
	{
		System.out.println("Displaying...");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
P obj=new C();
obj.name="Deepika";
System.out.println(obj.name);
obj.message();
C c = (C)obj;
c.age=20;
System.out.println(c.name);
System.out.println(c.age);

	}

}
