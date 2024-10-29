package day14_Demo;

public class PrintTable extends Thread{
	private int a;
	private int b;
	private int ans;
	public PrintTable(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public void run() {
		int ans=printTable(a);
		System.out.println("Factorial : "+ans);
		System.out.println("sum  :  "+ans);
	}


	private int printTable(int a2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
          