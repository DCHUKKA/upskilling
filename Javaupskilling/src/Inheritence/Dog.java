package Inheritence;

	class Dog extends Animal {
 		@Override
	public void speak() {
		System.out.println("Woof!");
	}

public static void main(String[] args) {
	Dog dog = new Dog();
	dog.speak();
}
}



