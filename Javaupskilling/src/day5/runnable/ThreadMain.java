package day5.runnable;
class Sample1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			
			
		}
	}
}
		class Sample2 implements Runnable{
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
				}
			}
			
		}
	public class ThreadMain{
		public static void main(String[] args) {
			Sample1 s1=new Sample1();
			s1.start();
			
			Sample2 s2=new Sample2();
			Thread t=new Thread(s2);
			t.start();
			
			try {
				Thread.sleep(10);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	

   