package day5.threadd;

public class A implements Runnable{
public void run() {
	System.out.println("thread is running");
}
public static void main(String[] args) {
   A obj=new A();
    Thread t=new Thread(obj,"Hello");
       t.start();
   String str = t.getName();
  System.out.println(str);
}
}
