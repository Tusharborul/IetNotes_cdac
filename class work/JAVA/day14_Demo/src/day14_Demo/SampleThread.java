package day14_Demo;

public class SampleThread {

	public static void main(String[] args) {
		PrintTable p=new PrintTable(2,5);
		Thread t1=new Thread(p);
		
		PrintTable p1=new PrintTable(8,4);
		Thread t2=new Thread(p1);
		
		
		Thread t3=new Thread(p);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("in Exit");

	}

}
