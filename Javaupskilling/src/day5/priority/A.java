package day5.priority;

public class A extends Thread {
	public void run() {
	System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
	}
public static void main(String[] args) {
		A obj =new A();
		obj.setPriority(6);
		 obj.start();
		}

}
