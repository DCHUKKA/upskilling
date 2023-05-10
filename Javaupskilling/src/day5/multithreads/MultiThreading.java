package day5.multithreads;

 class MultiThreadingDemo extends Thread {
	public void run()
	{
		System.out.println("Thread:"+Thread.currentThread().getId()+"is running");
	}
 }
	 public class MultiThreading{
		public static void main(String[] args) {
			
			for(int i=1;i<8;i++) {
				MultiThreadingDemo mtd=new MultiThreadingDemo();
				mtd.start();
				MultiThreadingDemo mtd1=new MultiThreadingDemo();
                mtd1.start();
			}
		}
	}

