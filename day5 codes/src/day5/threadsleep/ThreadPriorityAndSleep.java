package day5.threadsleep;


class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
   class B extends Thread{
	   public void run() {
		   for(int i=0;i<5;i++) {
			   System.out.println("Hello");
			  try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
public class ThreadPriorityAndSleep {

	public static void main(String args[])
	{
		A a= new A();
		B b=new B();
		a.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		
	}
}
