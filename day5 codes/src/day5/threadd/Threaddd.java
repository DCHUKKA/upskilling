package day5.threadd;

public class Threaddd extends Thread {
 
	public void run() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		

	Threaddd td = new Threaddd();
	td.start();
}
}