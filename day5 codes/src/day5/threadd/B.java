package day5.threadd;

public class B extends Thread{
public void run() {
	for(int i=1;i<=5;i++) {
     try {
    	 Thread.sleep(500);
     }
catch(Exception e) {
	System.out.println(e);
}
System.out.println("Thread:"+i);
	}
}
      public static void main(String[] args) {
	
	B obj1 = new B();
	obj1.start();
	 
	B obj2 = new B();
	obj2.start();
	
	B obj3 = new B();
	obj3.start();
}
}
