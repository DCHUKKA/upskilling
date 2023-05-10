package day4;

class Parent{
	void print()
	{
		System.out.println("parent class");
}
}
	class Child extends Parent{
		void print()
		{
			System.out.println("child class");
		}
	}

public class Upcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=(Parent)new Child();
		Parent obj1=(Parent)new Child();
         obj.print();
         obj1.print();
	}	
}
